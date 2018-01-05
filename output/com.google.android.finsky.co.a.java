package com.google.android.finsky.co;

import android.content.Context;
import android.content.pm.PackageStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.os.a;
import com.google.android.finsky.utils.e;
import java.util.UUID;

public final class com.google.android.finsky.co.a
{

    public static final UUID a;
    public final Context b;
    public final Object c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final Method h;
    public final boolean i;
    public final Handler j;
    public Handler k;

    static {
        com.google.android.finsky.co.a.a = UUID.fromString("41217664-9172-527a-b3d5-edabb50a7d69");
    }

    a(Context p0) {
        new com.google.android.finsky.co.k();
        com.google.android.finsky.co.a(p0, 0);
    }

    a(Context p0, byte p1) {
        v0 = 1;
        this.b = p0.getApplicationContext();
        this.j = new Handler(Looper.getMainLooper());
        if (android.support.v4.os.a.b()) {
            this.c = p0.getSystemService("storagestats");
            if (this.c == 0)
                this.d = 0;
            else
                this.d = com.google.android.finsky.co.k.a(this.c);
            this.e = com.google.android.finsky.co.k.a("getAppBytes");
            this.f = com.google.android.finsky.co.k.a("getDataBytes");
            this.g = com.google.android.finsky.co.k.a("getCacheBytes");
            if (this.c == 0 || this.d == 0 || this.e == 0 || this.f == 0 || this.g == 0)
                v0 = 0;
            this.i = v0;
            this.h = 0;
        }
        else {
            this.h = com.google.android.finsky.co.k.a(p0);
            if (this.h == 0)
                v0 = 0;
            this.i = v0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }
    }

    static final void a(com.google.android.finsky.co.j p0, PackageStats p1) {
        p0.a(p1);
    }

    static final void a(com.google.android.finsky.co.j p0, String p1) {
        p0.a(p1, 1602, 0);
    }

    static final void a(com.google.android.finsky.co.j p0, String p1, Exception p2) {
        p0.a(p1, 1601, p2);
    }

    static final void b(com.google.android.finsky.co.j p0, String p1, Exception p2) {
        p0.a(p1, 1601, p2);
    }

    static final void c(com.google.android.finsky.co.j p0, String p1, Exception p2) {
        p0.a(p1, 1601, p2);
    }

    public final void a(String p0, com.google.android.finsky.co.j p1) {
        if (this.i == 0)
            p1.a(p0, 1600, 0);
        if (android.support.v4.os.a.b()) {
            if (this.k == 0) {
                v0 = com.google.android.finsky.utils.e.a("Package size fetching thread");
                v0.start();
                this.k = new Handler(v0.getLooper());
            }
            this.k.post(new com.google.android.finsky.co.b(this, p0, p1));
        }
        else {
            try {
                v3 = new Object[2];
                v3[0] = p0;
                v3[1] = new com.google.android.finsky.co.h(this, p1, p0);
                this.h.invoke(this.b.getPackageManager(), v3);
            }
            catch (Exception ex) {
                this.j.post(new com.google.android.finsky.co.c(p1, p0, ex));
            }
        }
    }

}
