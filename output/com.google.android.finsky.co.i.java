package com.google.android.finsky.co;

import android.content.pm.PackageStats;

public final class com.google.android.finsky.co.i implements Runnable
{

    public final PackageStats a;
    public final boolean b;
    public final com.google.android.finsky.co.j c;
    public final String d;

    i(PackageStats p0, boolean p1, com.google.android.finsky.co.j p2, String p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final void run() {
        if (this.a == 0 || this.b == 0) {
            if (this.b != 0)
                v0 = 1602;
            else
                v0 = 1601;
            this.c.a(this.d, v0, 0);
        }
        else
            this.c.a(this.a);
    }

}
