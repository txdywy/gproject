package com.google.android.finsky.co;

public final class com.google.android.finsky.co.d implements Runnable
{

    public final com.google.android.finsky.co.j a;
    public final String b;
    public final Exception c;

    d(com.google.android.finsky.co.j p0, String p1, Exception p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void run() {
        com.google.android.finsky.co.a.c(this.a, this.b, this.c);
    }

}
