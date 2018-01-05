package com.android.volley;

public final class com.android.volley.i implements Runnable
{

    public final com.android.volley.n a;
    public final com.android.volley.v b;
    public final Runnable c;

    i(com.android.volley.n p0, com.android.volley.v p1, Runnable p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void run() {
        if (this.a.g())
            this.a.b("canceled-at-delivery");
        else {
            if (this.b.a())
                this.a.a(this.b.a);
            else
                this.a.c(this.b.c);
            if (this.b.d != 0)
                this.a.a("intermediate-response");
            else
                this.a.b("done");
            if (this.c != 0)
                this.c.run();
        }
    }

}
