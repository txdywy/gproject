package org.chromium.net;

import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.os.Build.VERSION;
import android.security.KeyChain;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URLConnection;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.util.Enumeration;
import java.util.List;
import org.chromium.base.C7888e;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.CalledByNativeUnchecked;

class AndroidNetworkLibrary {
    AndroidNetworkLibrary() {
    }

    @CalledByNative
    public static boolean storeKeyPair(byte[] bArr, byte[] bArr2) {
        try {
            Intent createInstallIntent = KeyChain.createInstallIntent();
            createInstallIntent.putExtra("PKEY", bArr2);
            createInstallIntent.putExtra("KEY", bArr);
            createInstallIntent.addFlags(268435456);
            C7888e.f40514a.startActivity(createInstallIntent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.w("AndroidNetworkLibrary", "could not store key pair: " + e);
            return false;
        }
    }

    @CalledByNative
    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo." + str);
    }

    @CalledByNative
    public static boolean haveOnlyLoopbackAddresses() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) networkInterfaces.nextElement();
                try {
                    if (networkInterface.isUp() && !networkInterface.isLoopback()) {
                        return false;
                    }
                } catch (SocketException e) {
                }
            }
            return true;
        } catch (Exception e2) {
            Log.w("AndroidNetworkLibrary", "could not get network interfaces: " + e2);
            return false;
        }
    }

    @CalledByNative
    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.m37857a(bArr, str, str2);
        } catch (KeyStoreException e) {
            return new AndroidCertVerifyResult(-1);
        } catch (NoSuchAlgorithmException e2) {
            return new AndroidCertVerifyResult(-1);
        } catch (IllegalArgumentException e3) {
            return new AndroidCertVerifyResult(-1);
        }
    }

    @CalledByNativeUnchecked
    public static void addTestRootCertificate(byte[] bArr) {
        X509Util.m37859a();
        Certificate a = X509Util.m37856a(bArr);
        synchronized (X509Util.f40605j) {
            X509Util.f40600e.setCertificateEntry("root_cert_" + Integer.toString(X509Util.f40600e.size()), a);
            X509Util.m37861b();
        }
    }

    @CalledByNativeUnchecked
    public static void clearTestRootCertificates() {
        X509Util.m37859a();
        synchronized (X509Util.f40605j) {
            try {
                X509Util.f40600e.load(null);
                X509Util.m37861b();
            } catch (IOException e) {
            }
        }
    }

    @CalledByNative
    private static String getNetworkCountryIso() {
        TelephonyManager telephonyManager = (TelephonyManager) C7888e.f40514a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkCountryIso();
    }

    @CalledByNative
    private static String getNetworkOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) C7888e.f40514a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getNetworkOperator();
    }

    @CalledByNative
    private static String getSimOperator() {
        TelephonyManager telephonyManager = (TelephonyManager) C7888e.f40514a.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        return telephonyManager.getSimOperator();
    }

    @CalledByNative
    private static boolean getIsRoaming() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C7888e.f40514a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    @TargetApi(23)
    @CalledByNative
    private static boolean getIsCaptivePortal() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C7888e.f40514a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(17);
    }

    @CalledByNative
    public static String getWifiSSID() {
        Intent registerReceiver = C7888e.f40514a.registerReceiver(null, new IntentFilter("android.net.wifi.STATE_CHANGE"));
        if (registerReceiver != null) {
            WifiInfo wifiInfo = (WifiInfo) registerReceiver.getParcelableExtra("wifiInfo");
            if (wifiInfo != null) {
                String ssid = wifiInfo.getSSID();
                if (ssid != null) {
                    return ssid;
                }
            }
        }
        return "";
    }

    @TargetApi(24)
    @CalledByNative
    private static boolean isCleartextPermitted(String str) {
        if (VERSION.SDK_INT < 23) {
            return true;
        }
        NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
        if (VERSION.SDK_INT >= 24) {
            return instance.isCleartextTrafficPermitted(str);
        }
        return instance.isCleartextTrafficPermitted();
    }

    @TargetApi(23)
    @CalledByNative
    private static byte[][] getDnsServers() {
        int i = 0;
        ConnectivityManager connectivityManager = (ConnectivityManager) C7888e.f40514a.getSystemService("connectivity");
        if (connectivityManager == null) {
            return (byte[][]) Array.newInstance(Byte.TYPE, new int[]{0, 0});
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return (byte[][]) Array.newInstance(Byte.TYPE, new int[]{0, 0});
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            return (byte[][]) Array.newInstance(Byte.TYPE, new int[]{0, 0});
        }
        List dnsServers = linkProperties.getDnsServers();
        byte[][] bArr = new byte[dnsServers.size()][];
        while (i < dnsServers.size()) {
            bArr[i] = ((InetAddress) dnsServers.get(i)).getAddress();
            i++;
        }
        return bArr;
    }
}
