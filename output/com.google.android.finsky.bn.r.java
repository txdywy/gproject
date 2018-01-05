package com.google.android.finsky.bn;

public final class com.google.android.finsky.bn.r implements Runnable
{

    public final String a;
    public final int b;
    public final com.google.android.finsky.bn.h c;

    r(com.google.android.finsky.bn.h p0, String p1, int p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.b.e(this.a, this.b);
    }

}
