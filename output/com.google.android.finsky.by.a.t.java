package com.google.android.finsky.by.a;

public final class com.google.android.finsky.by.a.t implements Runnable
{

    public final w[] a;
    public final String b;
    public final com.google.android.finsky.by.a.r c;

    t(com.google.android.finsky.by.a.r p0, w[] p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        v0 = 0;
        while (v0 < this.a.length) {
            if (this.a[v0] != 0)
                this.c.a(this.a[v0], this.b);
            v0 = v0 + 1;
        }
    }

}
