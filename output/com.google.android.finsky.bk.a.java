package com.google.android.finsky.bk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.finsky.download.b;
import com.google.android.finsky.download.h;
import com.google.android.finsky.utils.FinskyLog;

public class com.google.android.finsky.bk.a implements com.google.android.finsky.download.x
{

    public final ConnectivityManager a;
    public final WifiManager b;
    public final Handler c;
    public long d;
    public long e;
    public com.google.android.finsky.bk.c f;
    public com.google.android.finsky.download.b g;

    a(Context p0, Handler p1) {
        this.a = (ConnectivityManager)p0.getSystemService("connectivity");
        this.b = (WifiManager)p0.getSystemService("wifi");
        this.c = p1;
        this.a();
    }

    protected static boolean a(com.google.android.finsky.bk.c p0, com.google.android.finsky.bk.c p1) {
        v0 = 0;
        if (p0 == 0) {
            FinskyLog.c("Missing start or end network state", new Object[0]);
            return v0;
        }
        if (p1 == 0) {
            FinskyLog.c("Missing start or end network state", new Object[0]);
            return v0;
        }
        if (p0.a == 0) {
            FinskyLog.c("Missing start or end network state", new Object[0]);
            return v0;
        }
        if (p1.a == 0) {
            FinskyLog.c("Missing start or end network state", new Object[0]);
            return v0;
        }
        if (p0.a.getType() != p1.a.getType()) {
            v3 = new Object[2];
            v3[0] = Integer.valueOf(p0.a.getType());
            v3[1] = Integer.valueOf(p1.a.getType());
            FinskyLog.a("Network type has changed (%d to %d)", v3);
            return v0;
        }
        switch (p0.a.getType()) {
            case 0:
                if (p0.a.getSubtype() == p1.a.getSubtype())
                    v1 = 1;
                else
                    v1 = 0;
                if (v1 == 0) {
                    v4 = new Object[2];
                    v4[0] = Integer.valueOf(p0.a.getSubtype());
                    v4[1] = Integer.valueOf(p1.a.getSubtype());
                    FinskyLog.a("Network subtype has changed (%d to %d)", v4);
                }
                v0 = v1;
                break;
            case 1:
                if (p0.b == 0 || p1.b == 0 || !p0.b.getSSID().equals(p1.b.getSSID()))
                    FinskyLog.a("Wifi network changed", new Object[0]);
                else
                    v0 = 1;
                break;
            default:
                v0 = 1;
                break;
        }
    }

    protected final void a() {
        this.d = -1;
        this.e = -1;
        this.f = 0;
        this.g = 0;
    }

    protected final com.google.android.finsky.bk.c b() {
        StrictMode.noteSlowCall("DownloadNetworkQualityListener.getCurrentNetworkState");
        v0 = new com.google.android.finsky.bk.c();
        v0.a = this.a.getActiveNetworkInfo();
        if (v0.a != 0 && 1 == v0.a.getType())
            v0.b = this.b.getConnectionInfo();
        return v0;
    }

    public void b(com.google.android.finsky.download.b p0, int p1) {
        this.a();
    }

    public void b(com.google.android.finsky.download.b p0, com.google.android.finsky.download.h p1) {
        if (this.g != 0 && !this.g.equals(p0))
            this.a();
        if (this.g == 0 && (double)p1.b / (double)p1.c >= 4596373779694328218 && (double)p1.b / (double)p1.c < 4606281698874543309) {
            this.g = p0;
            this.d = p1.b;
            this.e = SystemClock.uptimeMillis();
            this.c.post(new com.google.android.finsky.bk.b(this, p0));
        }
    }

    public void f(com.google.android.finsky.download.b p0) {
        this.a();
    }

    public void g(com.google.android.finsky.download.b p0) {
        this.a();
    }

    public void h(com.google.android.finsky.download.b p0) {
    }

}
