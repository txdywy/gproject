package com.google.android.finsky.bc;

public final class com.google.android.finsky.bc.h implements com.android.volley.x
{

    public final int a;
    public final com.google.android.finsky.bc.g b;

    h(com.google.android.finsky.bc.g p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        this.b.h = this.b.h + 1;
        if (this.b.h == this.a)
            this.b.al.e();
    }

}
