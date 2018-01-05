package com.google.android.finsky.bh;

public final class com.google.android.finsky.bh.c implements Runnable
{

    public final com.google.android.finsky.bh.i a;
    public final boolean b;

    c(com.google.android.finsky.bh.i p0, boolean p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.a(this.b);
    }

}
