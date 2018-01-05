package com.google.android.finsky.api;

import com.android.volley.n;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.m;
import com.google.android.play.image.bf;
import com.google.android.play.image.k;
import com.google.android.play.image.m;
import com.google.i.a.a;

public final class com.google.android.finsky.api.q extends com.google.android.play.image.k
{

    public final String w;
    public final int x;
    public final int y;

    q(com.google.android.play.image.m p0, com.android.volley.x p1, com.android.volley.w p2) {
        com.google.android.play.image.k(p0, p1, p2);
        this.w = p0.a;
        this.x = p0.d;
        this.y = p0.e;
    }

    public final String e() {
        if ((this.d().equals(this.w)) || (!com.google.android.finsky.m.a.dj().a(12630075)) || !com.google.i.a.a.a(this.w))
            v0 = super.e();
        else
            v0 = com.google.android.play.image.bf.a(this.w, this.x, this.y, -1);
        return v0;
    }

}
