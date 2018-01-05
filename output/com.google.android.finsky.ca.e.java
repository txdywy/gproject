package com.google.android.finsky.ca;

public final class com.google.android.finsky.ca.e implements Runnable
{

    public final dj[] a;
    public final String b;
    public final Runnable c;
    public final com.google.android.finsky.ca.c d;

    e(com.google.android.finsky.ca.c p0, dj[] p1, String p2, Runnable p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        this.d.b(this.a, this.b, this.c);
    }

}
