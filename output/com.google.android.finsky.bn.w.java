package com.google.android.finsky.bn;

public final class com.google.android.finsky.bn.w implements Runnable
{

    public final String a;
    public final byte[] b;
    public final com.google.android.finsky.bn.h c;

    w(com.google.android.finsky.bn.h p0, String p1, byte[] p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.b.a(this.a, this.b);
    }

}
