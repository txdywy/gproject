package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v4.view.av;
import android.support.v4.view.ay;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.ah;
import com.google.android.finsky.bg.r;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.layout.play.PlayHighlightsBannerItemView;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.google.android.finsky.stream.base.playcluster.h;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;

public final class com.google.android.finsky.adapters.n implements com.google.android.finsky.stream.base.playcluster.a
{

    public final Document a;
    public final com.google.android.finsky.dfemodel.j b;
    public final PlayCardClusterViewV2 c;
    public final int d;
    public final int e;
    public final Context f;
    public final com.google.android.play.image.w g;
    public final com.google.android.finsky.navigationmanager.a h;
    public final com.google.android.finsky.d.w i;
    public com.google.android.finsky.adapters.p j;

    n(Context p0, com.google.android.play.image.w p1, com.google.android.finsky.navigationmanager.a p2, Document p3, com.google.android.finsky.dfemodel.j p4, PlayCardClusterViewV2 p5, com.google.android.finsky.d.w p6) {
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.f = p0;
        this.g = p1;
        this.h = p2;
        this.i = p6;
        v0 = p0.getResources();
        this.d = v0.getDimensionPixelSize(2131624589);
        this.e = v0.getDimensionPixelSize(2131624588);
    }

    public final int a(int p0) {
        return 2130969271;
    }

    public final int a(View p0) {
        return this.e;
    }

    public final com.google.android.play.image.x a(int p0, int p1, int p2, com.google.android.play.image.y p3, int[] p4) {
        com.google.android.finsky.m.a.bR();
        return com.google.android.finsky.bg.af.a(this.f, (Document)this.b.a(p0, 0), this.g, p1, p2, p3, p4);
    }

    public final String a() {
        return this.a.a.c;
    }

    public final void a(View p0, int p1) {
        p0 = (PlayHighlightsBannerItemView)p0;
        v0 = (Document)this.b.a(p1, 1);
        if (p0.b != 0)
            p0.b.setText(v0.a.g);
        if (p0.c != 0)
            p0.c.setText(v0.a.h);
        if (p0.e != 0) {
            if (TextUtils.isEmpty(v0.a.g) && TextUtils.isEmpty(v0.a.h))
                v1 = 8;
            else
                v1 = 0;
            p0.e.setVisibility(v1);
        }
        p0.i = this.h;
        p0.f = v0;
        p0.j = this.i;
        p0.g.setOnLoadedListener(p0);
        p0.l = new com.google.android.finsky.adapters.o(this);
        p0.g.a(v0, this.g, PlayHighlightsBannerItemView.a);
        if (!p0.g.c())
            com.google.android.finsky.bg.ah.a(p0.d, 0);
        if (com.google.android.finsky.navigationmanager.e.a()) {
            if (PlayHighlightsBannerItemView.s == 0)
                PlayHighlightsBannerItemView.b();
            PlayHighlightsBannerItemView.s.setLength(26);
            PlayHighlightsBannerItemView.s.append(v0.a.c);
            PlayHighlightsBannerItemView.s.append(58);
            PlayHighlightsBannerItemView.s.append(this.a.a.c);
            android.support.v4.view.ai.a(p0.g, PlayHighlightsBannerItemView.s.toString());
            android.support.v4.view.av.a.a(p0);
        }
        p0.setOnClickListener(p0.i.a(p0, p0.f));
        com.google.android.finsky.d.j.a(p0.q, v0.a.D);
        p0.r = this.c.getParentOfChildren();
        p0.getParentNode().a(p0);
        v1 = p0.getContext().getString(2131951881);
        p0.setContentDescription((String.valueOf(v1).length() + 2 + String.valueOf(v0.a.g).length() + String.valueOf(v0.a.h).length()) + v1 + "\n" + v0.a.g + "\n" + v0.a.h);
        p0.k.setVisibility(0);
        v6 = new Object[2];
        v6[0] = Integer.valueOf(p1 + 1);
        v6[1] = Integer.valueOf(this.b.m());
        p0.k.setText(p0.getResources().getString(2131952265, v6));
    }

    public final float b(int p0) {
        return com.google.android.finsky.bg.r.a(((Document)this.b.a(p0, 0)).a.e);
    }

    public final int b(View p0) {
        return this.d;
    }

    public final boolean b() {
        return this.b.t;
    }

    public final float c(View p0) {
        return (float)this.e / (float)this.d;
    }

    public final int c() {
        return this.b.m();
    }

}
