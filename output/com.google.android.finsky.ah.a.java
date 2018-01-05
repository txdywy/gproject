package com.google.android.finsky.ah;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v4.os.a;

public final synchronized class com.google.android.finsky.ah.a
{

    public static com.google.android.finsky.ah.a a;
    public final Context b;
    public Boolean c;
    public boolean d;

    static {
        com.google.android.finsky.ah.a.a = 0;
    }

    a(Context p0) {
        this.c = 0;
        this.b = p0.getApplicationContext();
    }

    public static synchronized com.google.android.finsky.ah.a a(Context p0) {
        enter com.google.android.finsky.ah.a;
        try {
            if (com.google.android.finsky.ah.a.a == 0)
                com.google.android.finsky.ah.a.a = new com.google.android.finsky.ah.a(p0);
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.ah.a;
            throw ex;
        }
        exit com.google.android.finsky.ah.a;
        return com.google.android.finsky.ah.a.a;
    }

    public final synchronized boolean a() {
        v1 = 0;
        enter this;
        try {
            if (!android.support.v4.os.a.a())
                v0 = 0;
            else {
                try {
                    if (this.c != 0)
                        v0 = this.c.booleanValue();
                    else {
                        if (this.d == 0) {
                            v0 = new IntentFilter();
                            v0.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
                            this.b.registerReceiver(new com.google.android.finsky.ah.b(this), v0);
                            this.d = 1;
                        }
                        if (((ConnectivityManager)this.b.getSystemService("connectivity")).getRestrictBackgroundStatus() == 3)
                            v1 = 1;
                        this.c = Boolean.valueOf(v1);
                        v0 = this.c.booleanValue();
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

}
