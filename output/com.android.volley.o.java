package com.android.volley;

public final class com.android.volley.o implements Runnable
{

    public final String a;
    public final long b;
    public final com.android.volley.n c;

    o(com.android.volley.n p0, String p1, long p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        this.c.a.a(this.a, this.b);
        this.c.a.a(this.toString());
    }

}
