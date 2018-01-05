package com.google.android.finsky.adapters;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.r;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.finsky.stream.base.playcluster.h;
import com.google.android.finsky.y.a;
import com.google.android.play.image.w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.d;

public final class com.google.android.finsky.adapters.c implements com.google.android.finsky.stream.base.playcluster.a
{

    public final Document a;
    public final int b;
    public final com.google.android.finsky.dfemodel.j c;
    public final PlayCardClusterViewV2 d;
    public final Context e;
    public final com.google.android.finsky.y.a f;
    public final com.google.android.play.image.w g;
    public final com.google.android.finsky.navigationmanager.a h;
    public final com.google.android.finsky.d.w i;
    public final com.google.android.finsky.playcard.ab j;

    c(Document p0, int p1, com.google.android.finsky.dfemodel.j p2, PlayCardClusterViewV2 p3, Context p4, com.google.android.finsky.y.a p5, com.google.android.finsky.navigationmanager.a p6, com.google.android.finsky.playcard.ab p7, com.google.android.finsky.d.w p8) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.h = p6;
        this.j = p7;
        this.i = p8;
        this.g = com.google.android.finsky.m.a.be();
    }

    public final int a(int p0) {
        return this.b;
    }

    public final int a(View p0) {
        return ((com.google.android.play.layout.d)p0).getThumbnail().getChildAt(0).getHeight();
    }

    public final com.google.android.play.image.x a(int p0, int p1, int p2, com.google.android.play.image.y p3, int[] p4) {
        com.google.android.finsky.m.a.bR();
        return com.google.android.finsky.bg.af.a(this.e, (Document)this.c.a(p0, 0), this.g, p1, p2, p3, p4);
    }

    public final String a() {
        return this.a.a.c;
    }

    public final void a(View p0, int p1) {
        ((com.google.android.play.layout.d)p0).setThumbnailAspectRatio(this.b(p1));
        v3 = (Document)this.c.a(p1, 1);
        if (v3 == 0)
            ((com.google.android.play.layout.d)p0).b();
        else {
            v4 = v3.be();
            v8 = this.j;
            if (v4 != 0 && v8 != 0 && this.f.a(v3.a.c))
                v7 = 1;
            else
                v7 = 0;
            if (v4 == 0)
                v8 = 0;
            com.google.android.finsky.m.a.cr().a((com.google.android.play.layout.d)p0, v3, p1, this.a.a.c, this.h, v7, v8, this.d.getParentOfChildren(), 0, 1, v3.aZ(), this.i, 0);
        }
    }

    public final float b(int p0) {
        v0 = (Document)this.c.a(p0, 0);
        if (v0 == 0)
            v0 = -1082130432;
        else
            v0 = com.google.android.finsky.bg.r.a(v0.a.e);
        return v0;
    }

    public final int b(View p0) {
        return ((com.google.android.play.layout.d)p0).getThumbnail().getChildAt(0).getWidth();
    }

    public final boolean b() {
        if (!this.c.h() && this.c.t != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final float c(View p0) {
        v0 = (Document)((com.google.android.play.layout.d)p0).getData();
        if (v0 == 0)
            v0 = -1082130432;
        else
            v0 = com.google.android.finsky.bg.r.a(v0.a.e);
        return v0;
    }

    public final int c() {
        return this.c.m();
    }

}
