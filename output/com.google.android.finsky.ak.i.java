package com.google.android.finsky.ak;

public final class com.google.android.finsky.ak.i implements Callable
{

    public final com.google.android.finsky.ak.q a;
    public final String b;
    public final String c;
    public final com.google.android.finsky.ak.h d;

    i(com.google.android.finsky.ak.h p0, com.google.android.finsky.ak.q p1, String p2, String p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final Object call() {
        return this.d.b(this.a, this.b, this.c);
    }

}
