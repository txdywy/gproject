package com.google.android.gms.peerdownloadmanager.comms.p294a;

import android.net.wifi.WifiManager;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.comms.p294a.p295a.C5396b;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

public final class C5406i {
    public static final long f28030a = TimeUnit.SECONDS.toMillis(5);

    public static InetAddress m26185a() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            int i = 0;
            while (networkInterfaces.hasMoreElements()) {
                Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                int i2 = i;
                while (inetAddresses.hasMoreElements()) {
                    int i3 = i2 + 1;
                    InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                    String valueOf = String.valueOf(inetAddress);
                    Log.v("PDMUtils", new StringBuilder(String.valueOf(valueOf).length() + 24).append("localIpAddress: address ").append(valueOf).toString());
                    String hostAddress = inetAddress.getHostAddress();
                    if (!inetAddress.isLoopbackAddress()) {
                        if ((!hostAddress.contains(":") ? 1 : null) != null) {
                            String valueOf2 = String.valueOf(inetAddress);
                            Log.v("PDMUtils", new StringBuilder(String.valueOf(valueOf2).length() + 24).append("localInetAddress: found ").append(valueOf2).toString());
                            return inetAddress;
                        }
                    }
                    i2 = i3;
                }
                i = i2;
            }
            Log.v("PDMUtils", "localIpAddress: looked at " + i + " interfaces, couldn't find one that qualified");
            return null;
        } catch (Throwable e) {
            Log.d("PDMUtils", "localIpAddress: failed", e);
            return null;
        }
    }

    public static Object m26183a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IOException("proto stream ended prematurely");
    }

    public static String m26184a(String str) {
        if (str == null || !str.contains(".")) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = str.split("\\.+");
        for (int i = 0; i < split.length; i++) {
            if (i < split.length - 1) {
                stringBuilder.append(split[i], 0, split[i].offsetByCodePoints(0, 1)).append(".");
            } else {
                stringBuilder.append(split[i]);
            }
        }
        return stringBuilder.toString();
    }

    private static synchronized void m26187a(WifiManager wifiManager, boolean z, C5396b c5396b) {
        synchronized (C5406i.class) {
            long a = c5396b.mo4983a() + f28030a;
            wifiManager.setWifiEnabled(z);
            while (wifiManager.isWifiEnabled() != z && c5396b.mo4983a() < a) {
                c5396b.mo4984b();
            }
            if (wifiManager.isWifiEnabled() != z) {
                throw new IOException("unable to change the wifi enabled state to " + z);
            }
        }
    }

    public static void m26186a(WifiManager wifiManager, C5396b c5396b) {
        C5406i.m26187a(wifiManager, true, c5396b);
    }

    public static void m26188b(WifiManager wifiManager, C5396b c5396b) {
        C5406i.m26187a(wifiManager, false, c5396b);
    }
}
