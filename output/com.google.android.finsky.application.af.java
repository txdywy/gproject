package com.google.android.finsky.application;

import com.android.volley.w;
import com.google.android.finsky.api.t;
import com.google.android.finsky.cg.c;
import com.google.android.finsky.m;
import com.google.android.play.image.bt;
import com.google.android.play.image.bu;
import com.google.android.play.image.by;
import com.google.android.play.image.m;
import com.google.android.play.image.o;
import com.google.android.play.image.q;

public final class com.google.android.finsky.application.af implements com.google.android.play.image.l
{

    public final com.google.android.finsky.application.d a;
    public final com.google.android.finsky.cg.c b;

    af(com.google.android.finsky.application.d p0, com.google.android.finsky.cg.c p1) {
        this.a = p0;
        this.b = p1;
    }

    public final com.google.android.play.image.bt a(com.google.android.play.image.m p0, com.android.volley.w p1, com.google.android.play.image.o p2, com.google.android.play.image.q p3, com.google.android.play.image.by p4, com.google.android.play.image.bu p5) {
        if (this.a == 0)
            throw 0;
        return new com.google.android.finsky.api.t(this.a.b, this.a.dc(), this.a, this.b, p0, p1, p2, p3, p4, p5);
    }

}
