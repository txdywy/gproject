package org.chromium.net;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

final class ag {
    public final Context f40660a;
    public final Object f40661b;
    public boolean f40662c;
    public boolean f40663d;
    public WifiManager f40664e;

    ag(Context context) {
        this.f40661b = new Object();
        this.f40660a = context;
    }

    ag() {
        this.f40661b = new Object();
        this.f40660a = null;
    }

    final String m37939a() {
        boolean z = true;
        synchronized (this.f40661b) {
            if (this.f40662c) {
                z = this.f40663d;
            } else {
                WifiManager wifiManager;
                if (this.f40660a.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.f40660a.getPackageName()) != 0) {
                    z = false;
                }
                this.f40663d = z;
                if (this.f40663d) {
                    wifiManager = (WifiManager) this.f40660a.getSystemService("wifi");
                } else {
                    wifiManager = null;
                }
                this.f40664e = wifiManager;
                this.f40662c = true;
                z = this.f40663d;
            }
            if (z) {
                WifiInfo b = m37938b();
                String ssid;
                if (b != null) {
                    ssid = b.getSSID();
                    return ssid;
                }
                ssid = "";
                return ssid;
            }
            return AndroidNetworkLibrary.getWifiSSID();
        }
    }

    private final WifiInfo m37938b() {
        try {
            return this.f40664e.getConnectionInfo();
        } catch (NullPointerException e) {
            try {
                return this.f40664e.getConnectionInfo();
            } catch (NullPointerException e2) {
                return null;
            }
        }
    }
}
