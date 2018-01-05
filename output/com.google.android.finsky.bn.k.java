package com.google.android.finsky.bn;

public final class com.google.android.finsky.bn.k implements Runnable
{

    public final String a;
    public final long b;
    public final com.google.android.finsky.bn.h c;

    k(com.google.android.finsky.bn.h p0, String p1, long p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.b.a(this.a, this.b);
    }

}
