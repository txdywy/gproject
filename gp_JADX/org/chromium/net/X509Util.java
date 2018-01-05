package org.chromium.net;

import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;
import org.chromium.base.BuildInfo;
import org.chromium.base.C7888e;

public class X509Util {
    public static CertificateFactory f40596a;
    public static bc f40597b;
    public static ba f40598c;
    public static bc f40599d;
    public static KeyStore f40600e;
    public static KeyStore f40601f;
    public static File f40602g;
    public static Set f40603h;
    public static boolean f40604i;
    public static final Object f40605j = new Object();
    public static boolean f40606k;
    public static final char[] f40607l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private static native void nativeNotifyKeyChainChanged();

    private static native void nativeRecordCertVerifyCapabilitiesHistogram(boolean z);

    static void m37859a() {
        synchronized (f40605j) {
            m37864d();
        }
    }

    private static void m37864d() {
        if (f40596a == null) {
            f40596a = CertificateFactory.getInstance("X.509");
        }
        if (f40597b == null) {
            f40597b = m37858a(null);
        }
        if (!f40604i) {
            try {
                f40601f = KeyStore.getInstance("AndroidCAStore");
                try {
                    f40601f.load(null);
                } catch (IOException e) {
                }
                f40602g = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
            } catch (KeyStoreException e2) {
            }
            if (!f40606k) {
                nativeRecordCertVerifyCapabilitiesHistogram(f40601f != null);
            }
            f40604i = true;
        }
        if (f40603h == null) {
            f40603h = new HashSet();
        }
        if (f40600e == null) {
            f40600e = KeyStore.getInstance(KeyStore.getDefaultType());
            try {
                f40600e.load(null);
            } catch (IOException e3) {
            }
        }
        if (f40599d == null) {
            f40599d = m37858a(f40600e);
        }
        if (!f40606k && f40598c == null) {
            f40598c = new ba();
            IntentFilter intentFilter = new IntentFilter();
            if (BuildInfo.m37784a()) {
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
            } else {
                intentFilter.addAction("android.security.STORAGE_CHANGED");
            }
            C7888e.f40514a.registerReceiver(f40598c, intentFilter);
        }
    }

    private static bc m37858a(KeyStore keyStore) {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(keyStore);
        TrustManager[] trustManagers = instance.getTrustManagers();
        int length = trustManagers.length;
        int i = 0;
        while (i < length) {
            Object obj = trustManagers[i];
            if (obj instanceof X509TrustManager) {
                try {
                    if (VERSION.SDK_INT >= 17) {
                        return new bd((X509TrustManager) obj);
                    }
                    return new bb((X509TrustManager) obj);
                } catch (IllegalArgumentException e) {
                    Log.e("X509Util", "Error creating trust manager (" + obj.getClass().getName() + "): " + e);
                }
            } else {
                i++;
            }
        }
        Log.e("X509Util", "Could not find suitable trust manager");
        return null;
    }

    static void m37861b() {
        f40599d = m37858a(f40600e);
    }

    static void m37863c() {
        synchronized (f40605j) {
            f40597b = null;
            f40603h = null;
            m37864d();
        }
        nativeNotifyKeyChainChanged();
    }

    public static X509Certificate m37856a(byte[] bArr) {
        m37859a();
        return (X509Certificate) f40596a.generateCertificate(new ByteArrayInputStream(bArr));
    }

    private static String m37855a(X500Principal x500Principal) {
        byte[] digest = MessageDigest.getInstance("MD5").digest(x500Principal.getEncoded());
        char[] cArr = new char[8];
        for (int i = 0; i < 4; i++) {
            cArr[i * 2] = f40607l[(digest[3 - i] >> 4) & 15];
            cArr[(i * 2) + 1] = f40607l[digest[3 - i] & 15];
        }
        return new String(cArr);
    }

    private static boolean m37860a(X509Certificate x509Certificate) {
        if (f40601f == null) {
            return false;
        }
        Pair pair = new Pair(x509Certificate.getSubjectX500Principal(), x509Certificate.getPublicKey());
        if (f40603h.contains(pair)) {
            return true;
        }
        String a = m37855a(x509Certificate.getSubjectX500Principal());
        int i = 0;
        while (true) {
            String str = a + '.' + i;
            if (!new File(f40602g, str).exists()) {
                return false;
            }
            Certificate certificate = f40601f.getCertificate("system:" + str);
            if (certificate != null) {
                if (certificate instanceof X509Certificate) {
                    X509Certificate x509Certificate2 = (X509Certificate) certificate;
                    if (x509Certificate.getSubjectX500Principal().equals(x509Certificate2.getSubjectX500Principal()) && x509Certificate.getPublicKey().equals(x509Certificate2.getPublicKey())) {
                        f40603h.add(pair);
                        return true;
                    }
                }
                Log.e("X509Util", "Anchor " + str + " not an X509Certificate: " + certificate.getClass().getName());
            }
            i++;
        }
    }

    private static boolean m37862b(X509Certificate x509Certificate) {
        try {
            List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
            if (extendedKeyUsage == null) {
                return true;
            }
            for (String str : extendedKeyUsage) {
                if (str.equals("1.3.6.1.5.5.7.3.1") || str.equals("2.5.29.37.0") || str.equals("2.16.840.1.113730.4.1")) {
                    return true;
                }
                if (str.equals("1.3.6.1.4.1.311.10.3.3")) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }

    public static AndroidCertVerifyResult m37857a(byte[][] bArr, String str, String str2) {
        if (bArr == null || bArr.length == 0 || bArr[0] == null) {
            throw new IllegalArgumentException("Expected non-null and non-empty certificate chain passed as |certChain|. |certChain|=" + Arrays.deepToString(bArr));
        }
        try {
            m37859a();
            List arrayList = new ArrayList();
            try {
                arrayList.add(m37856a(bArr[0]));
                for (int i = 1; i < bArr.length; i++) {
                    try {
                        arrayList.add(m37856a(bArr[i]));
                    } catch (CertificateException e) {
                        Log.w("X509Util", "intermediate " + i + " failed parsing");
                    }
                }
                X509Certificate[] x509CertificateArr = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                try {
                    x509CertificateArr[0].checkValidity();
                    if (!m37862b(x509CertificateArr[0])) {
                        return new AndroidCertVerifyResult(-6);
                    }
                    synchronized (f40605j) {
                        AndroidCertVerifyResult androidCertVerifyResult;
                        if (f40597b == null) {
                            androidCertVerifyResult = new AndroidCertVerifyResult(-1);
                            return androidCertVerifyResult;
                        }
                        List a;
                        boolean a2;
                        try {
                            a = f40597b.mo6588a(x509CertificateArr, str, str2);
                        } catch (CertificateException e2) {
                            try {
                                a = f40599d.mo6588a(x509CertificateArr, str, str2);
                            } catch (CertificateException e3) {
                                Log.i("X509Util", "Failed to validate the certificate chain, error: " + e2.getMessage());
                                return new AndroidCertVerifyResult(-2);
                            }
                        }
                        if (a.size() > 0) {
                            a2 = m37860a((X509Certificate) a.get(a.size() - 1));
                        } else {
                            a2 = false;
                        }
                        androidCertVerifyResult = new AndroidCertVerifyResult(a2, a);
                        return androidCertVerifyResult;
                    }
                } catch (CertificateExpiredException e4) {
                    return new AndroidCertVerifyResult(-3);
                } catch (CertificateNotYetValidException e5) {
                    return new AndroidCertVerifyResult(-4);
                } catch (CertificateException e6) {
                    return new AndroidCertVerifyResult(-1);
                }
            } catch (CertificateException e7) {
                return new AndroidCertVerifyResult(-5);
            }
        } catch (CertificateException e8) {
            return new AndroidCertVerifyResult(-1);
        }
    }
}
