package com.google.android.finsky.adapters;

import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.g;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.layout.play.PlayCategoryCircleItemView;
import com.google.android.finsky.m;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.a;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.wireless.android.finsky.dfe.nano.ag;

public final class com.google.android.finsky.adapters.g implements com.google.android.finsky.stream.base.playcluster.a
{

    public com.google.android.finsky.d.ad a;
    public final com.google.android.finsky.adapters.e b;

    g(com.google.android.finsky.adapters.e p0) {
        this.b = p0;
    }

    public final int a(int p0) {
        return 2130969244;
    }

    public final int a(View p0) {
        return ((PlayCategoryCircleItemView)p0).getIconWidth();
    }

    public final com.google.android.play.image.x a(int p0, int p1, int p2, com.google.android.play.image.y p3, int[] p4) {
        com.google.android.finsky.m.a.bR();
        return com.google.android.finsky.bg.af.a(this.b.n, this.b.j[p0].d, this.b.h, p1, p2, p3);
    }

    public final String a() {
        return "category_quick_links";
    }

    public final void a(View p0, int p1) {
        p0 = (PlayCategoryCircleItemView)p0;
        if (p1 < this.b.j.length) {
            p0.f = this.b.j[p1].c;
            p0.g = this.b.j[p1].g;
            p0.h = this.b.j[p1].e;
            p0.i = this.b.d;
            p0.j = this.b.g;
            p0.c = com.google.android.finsky.bg.h.a(p0.getContext(), this.b.j[p1].g);
            if (p0.b != 0 && this.b.j[p1].d != 0)
                com.google.android.finsky.m.a.ar().a(p0.b, this.b.j[p1].d.f, this.b.j[p1].d.i);
            p0.a.setText(p0.f);
            p0.setContentDescription(p0.f);
            com.google.android.finsky.d.j.a(p0.getPlayStoreUiElement(), this.b.j[p1].i);
            p0.k = this.a;
            p0.l = this.b.A;
            p0.getParentNode().a(p0);
            p0.c = com.google.android.finsky.bg.g.a(this.b.j[p1].d, p0.c);
            p0.b.setBitmapTransformation(com.google.android.play.image.a.a(p0.getResources(), p0.c));
        }
    }

    public final float b(int p0) {
        return 1065353216;
    }

    public final int b(View p0) {
        return ((PlayCategoryCircleItemView)p0).getIconWidth();
    }

    public final boolean b() {
        return 0;
    }

    public final float c(View p0) {
        return 1065353216;
    }

    public final int c() {
        return this.b.j.length;
    }

}
