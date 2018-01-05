package com.google.android.finsky.api;

import com.android.volley.r;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.cg.c;
import com.google.android.finsky.d.j;
import com.google.android.play.image.ag;
import com.google.android.play.image.ap;
import com.google.android.play.image.by;

protected final class com.google.android.finsky.api.r extends com.google.android.play.image.ag
{

    public final com.google.android.finsky.d.j a;
    public com.google.android.finsky.cg.c b;

    r(com.google.android.finsky.d.j p0, com.google.android.finsky.cg.c p1, com.android.volley.r p2, int p3, int p4, com.google.android.play.image.by p5) {
        com.google.android.play.image.ag(p2, p3, p4, p5);
        this.a = p0;
        this.b = p1;
    }

    protected final com.google.android.play.image.ap a(String p0, int p1, int p2, int p3, com.android.volley.x p4, com.android.volley.w p5) {
        return new com.google.android.finsky.api.s(this.a, this.b, p0, p4, p1, p2, p3, p5);
    }

}
