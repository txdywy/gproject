package com.google.android.finsky.ah;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v4.os.C0327a;

public final class C1186a {
    public static C1186a f7260a = null;
    public final Context f7261b;
    public Boolean f7262c = null;
    public boolean f7263d;

    public static synchronized C1186a m7138a(Context context) {
        C1186a c1186a;
        synchronized (C1186a.class) {
            if (f7260a == null) {
                f7260a = new C1186a(context);
            }
            c1186a = f7260a;
        }
        return c1186a;
    }

    private C1186a(Context context) {
        this.f7261b = context.getApplicationContext();
    }

    public final synchronized boolean m7139a() {
        boolean z;
        boolean z2 = false;
        synchronized (this) {
            if (!C0327a.m1721a()) {
                z = false;
            } else if (this.f7262c != null) {
                z = this.f7262c.booleanValue();
            } else {
                if (!this.f7263d) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
                    this.f7261b.registerReceiver(new C1187b(this), intentFilter);
                    this.f7263d = true;
                }
                if (((ConnectivityManager) this.f7261b.getSystemService("connectivity")).getRestrictBackgroundStatus() == 3) {
                    z2 = true;
                }
                this.f7262c = Boolean.valueOf(z2);
                z = this.f7262c.booleanValue();
            }
        }
        return z;
    }
}
