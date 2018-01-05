package com.google.android.finsky.application;

import com.android.volley.a.y;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.api.u;
import com.google.android.finsky.cg.c;
import com.google.android.play.image.m;

public final class com.google.android.finsky.application.ag implements com.google.android.play.image.n
{

    public final com.google.android.finsky.application.d a;
    public final com.google.android.finsky.cg.c b;

    ag(com.google.android.finsky.application.d p0, com.google.android.finsky.cg.c p1) {
        this.a = p0;
        this.b = p1;
    }

    public final com.android.volley.a.y a(com.google.android.play.image.m p0, com.android.volley.x p1, com.android.volley.w p2) {
        return new com.google.android.finsky.api.u(this.a.dc(), this.b, p0, p1, p2);
    }

}
