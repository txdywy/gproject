package com.google.android.finsky.bc;

import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;

public final class com.google.android.finsky.bc.i implements com.android.volley.x
{

    public final int a;
    public final com.google.android.finsky.bc.g b;

    i(com.google.android.finsky.bc.g p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        v1 = new com.google.android.finsky.d.c(537);
        v1.b(Integer.valueOf(1));
        this.b.c.dc().a(v1.a, 0);
        this.b.h = this.b.h + 1;
        if (this.b.h == this.a)
            this.b.al.e();
    }

}
