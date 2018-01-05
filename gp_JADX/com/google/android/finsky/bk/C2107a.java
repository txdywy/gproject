package com.google.android.finsky.bk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.finsky.download.C2106x;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2845h;
import com.google.android.finsky.utils.FinskyLog;

abstract class C2107a implements C2106x {
    public final ConnectivityManager f10712a;
    public final WifiManager f10713b;
    public final Handler f10714c;
    public long f10715d;
    public long f10716e;
    public C2109c f10717f;
    public C2839b f10718g;

    C2107a(Context context, Handler handler) {
        this.f10712a = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10713b = (WifiManager) context.getSystemService("wifi");
        this.f10714c = handler;
        m11000a();
    }

    public void mo2646h(C2839b c2839b) {
    }

    public void mo2645g(C2839b c2839b) {
        m11000a();
    }

    protected final void m11000a() {
        this.f10715d = -1;
        this.f10716e = -1;
        this.f10717f = null;
        this.f10718g = null;
    }

    public void mo2644f(C2839b c2839b) {
        m11000a();
    }

    public void mo2642b(C2839b c2839b, int i) {
        m11000a();
    }

    public void mo2643b(C2839b c2839b, C2845h c2845h) {
        double d = ((double) c2845h.f15277b) / ((double) c2845h.f15278c);
        if (!(this.f10718g == null || this.f10718g.equals(c2839b))) {
            m11000a();
        }
        if (this.f10718g == null && d >= 0.2d && d < 0.9d) {
            this.f10718g = c2839b;
            this.f10715d = c2845h.f15277b;
            this.f10716e = SystemClock.uptimeMillis();
            this.f10714c.post(new C2108b(this, c2839b));
        }
    }

    protected final C2109c m11001b() {
        StrictMode.noteSlowCall("DownloadNetworkQualityListener.getCurrentNetworkState");
        C2109c c2109c = new C2109c();
        c2109c.f10721a = this.f10712a.getActiveNetworkInfo();
        if (c2109c.f10721a != null && 1 == c2109c.f10721a.getType()) {
            c2109c.f10722b = this.f10713b.getConnectionInfo();
        }
        return c2109c;
    }

    protected static boolean m10999a(C2109c c2109c, C2109c c2109c2) {
        if (c2109c == null || c2109c2 == null || c2109c.f10721a == null || c2109c2.f10721a == null) {
            FinskyLog.m21665c("Missing start or end network state", new Object[0]);
            return false;
        } else if (c2109c.f10721a.getType() != c2109c2.f10721a.getType()) {
            FinskyLog.m21659a("Network type has changed (%d to %d)", Integer.valueOf(c2109c.f10721a.getType()), Integer.valueOf(c2109c2.f10721a.getType()));
            return false;
        } else {
            switch (c2109c.f10721a.getType()) {
                case 0:
                    boolean z = c2109c.f10721a.getSubtype() == c2109c2.f10721a.getSubtype();
                    if (!z) {
                        FinskyLog.m21659a("Network subtype has changed (%d to %d)", Integer.valueOf(c2109c.f10721a.getSubtype()), Integer.valueOf(c2109c2.f10721a.getSubtype()));
                    }
                    return z;
                case 1:
                    if (c2109c.f10722b != null && c2109c2.f10722b != null && c2109c.f10722b.getSSID().equals(c2109c2.f10722b.getSSID())) {
                        return true;
                    }
                    FinskyLog.m21659a("Wifi network changed", new Object[0]);
                    return false;
                default:
                    return true;
            }
        }
    }
}
