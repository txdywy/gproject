package com.google.android.finsky.bn;

public final class com.google.android.finsky.bn.j implements Runnable
{

    public final String a;
    public final int b;
    public final String c;
    public final com.google.android.finsky.bn.h d;

    j(com.google.android.finsky.bn.h p0, String p1, int p2, String p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        this.d.b.a(this.a, this.b, this.c);
    }

}
