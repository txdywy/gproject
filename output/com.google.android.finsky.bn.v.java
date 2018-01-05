package com.google.android.finsky.bn;

public final class com.google.android.finsky.bn.v implements Runnable
{

    public final String a;
    public final String b;
    public final com.google.android.finsky.bn.h c;

    v(com.google.android.finsky.bn.h p0, String p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.b.e(this.a, this.b);
    }

}
