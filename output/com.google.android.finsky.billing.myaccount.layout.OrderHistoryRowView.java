package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.billing.myaccount.s;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.fz;
import com.google.android.finsky.cv.a.ho;
import com.google.android.finsky.cv.a.m;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.a;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.n;
import com.google.android.play.image.w;

protected class OrderHistoryRowView extends com.google.android.finsky.billing.myaccount.layout.a
{

    public com.google.android.finsky.utils.n p;
    public boolean q;
    public boolean r;
    public TextView s;
    public TextView t;
    public TextView u;
    public TextView v;
    public PlayActionButtonV2 w;
    public PlayActionButtonV2 x;
    public com.google.android.finsky.d.ad y;

    OrderHistoryRowView(Context p0) {
        OrderHistoryRowView(p0, 0);
    }

    OrderHistoryRowView(Context p0, AttributeSet p1) {
        com.google.android.finsky.billing.myaccount.layout.a(p0, p1, 2602);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
    }

    private final boolean c() {
        if (this.y != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void a(Document p0, com.google.android.play.image.w p1, boolean p2, com.google.android.finsky.billing.myaccount.layout.e p3, com.google.android.finsky.navigationmanager.a p4, com.google.android.finsky.f.a p5, com.google.android.finsky.d.ad p6, com.google.android.finsky.d.w p7) {
        super.a(p0, p0.a.g, p1, p2, p4, p6, p7);
        if (p0.a.v != 0 && p0.a.v.y != 0)
            v0 = p0.a.v.y;
        else
            v0 = 0;
        if (v0.a & 1)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            this.s.setText(this.p.a(v0.b));
            this.s.setVisibility(0);
        }
        else
            this.s.setVisibility(4);
        if (v0.f != 0 && v0.f.aL_()) {
            this.t.setText(v0.f.g);
            this.t.setVisibility(0);
        }
        else
            this.s.setVisibility(4);
        if (v0.a & 8)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            this.u.setText(v0.g);
            this.u.setVisibility(0);
        }
        else
            this.u.setVisibility(4);
        if (v0.a & 4)
            v1 = 1;
        else
            v1 = 0;
        this.q = v1;
        if (this.q != 0) {
            this.v.setText(Html.fromHtml(v0.d));
            this.v.setMovementMethod(LinkMovementMethod.getInstance());
            if (p2 != 0)
                v0 = 0;
            else
                v0 = 8;
            this.v.setVisibility(v0);
        }
        else
            this.v.setVisibility(8);
        this.r = com.google.android.finsky.navigationmanager.e.a(p0);
        if (this.r != 0) {
            if (p0.aQ())
                v0 = p0.aP().b;
            else
                v0 = this.getResources().getString(2131953382);
            this.w.a(10, v0, this);
            if (p2 != 0)
                v0 = 0;
            else
                v0 = 8;
            this.w.setVisibility(v0);
        }
        else
            this.w.setVisibility(8);
        this.y = 0;
        if (p0.a.e == 1 && p5.q != 0) {
            this.y = new com.google.android.finsky.d.o(2603, p0.a.D, this);
            this.x.a(10, 2131952992, new com.google.android.finsky.billing.myaccount.layout.d(this, p7, p3, p0, p5));
        }
        if (this.c() && p2 != 0) {
            this.x.setVisibility(0);
            this.a(this.y);
        }
        else
            this.x.setVisibility(8);
        this.a();
    }

    public void onAnimationEnd(Animation p0) {
        if (p0 == this.d) {
            if (this.q != 0)
                OrderHistoryRowView.a(this.v);
            if (this.r != 0)
                OrderHistoryRowView.a(this.w);
            if (this.c()) {
                OrderHistoryRowView.a(this.x);
                this.a(this.y);
            }
        }
    }

    public void onAnimationStart(Animation p0) {
        if (p0 == this.e) {
            this.v.setVisibility(8);
            this.w.setVisibility(8);
            this.x.setVisibility(8);
        }
    }

    public void onClick(View p0) {
        if (this.f.aQ())
            v0 = 5550;
        else
            v0 = 2605;
        this.i.a(this.f, new com.google.android.finsky.d.o(v0, this), this.getThumbnailCover(), this.j);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.s = (TextView)this.findViewById(2131756323);
        this.t = (TextView)this.findViewById(2131755851);
        this.u = (TextView)this.findViewById(2131756068);
        this.v = (TextView)this.findViewById(2131756156);
        this.w = (PlayActionButtonV2)this.findViewById(2131755942);
        this.x = (PlayActionButtonV2)this.findViewById(2131756324);
    }

}
