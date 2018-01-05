package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.ga;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.play.image.w;

protected class RewardRowView extends com.google.android.finsky.billing.myaccount.layout.a
{

    public boolean p;
    public boolean q;
    public boolean r;
    public TextView s;
    public TextView t;
    public TextView u;
    public PlayActionButtonV2 v;

    RewardRowView(Context p0) {
        RewardRowView(p0, 0);
    }

    RewardRowView(Context p0, AttributeSet p1) {
        com.google.android.finsky.billing.myaccount.layout.a(p0, p1, 2662);
    }

    public final void a(Document p0, com.google.android.play.image.w p1, boolean p2, DfeToc p3, com.google.android.finsky.navigationmanager.a p4, com.google.android.finsky.d.ad p5, com.google.android.finsky.d.w p6) {
        super.a(p0, p0.a.g, p1, p2, p4, p5, p6);
        v3 = p0.aH();
        if (v3.a & 2)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            this.s.setText(v3.c);
            this.s.setVisibility(0);
        }
        else
            this.s.setVisibility(8);
        if (p0.a.b & 512)
            v0 = 1;
        else
            v0 = 0;
        this.p = v0;
        if (this.p != 0) {
            this.t.setText(p0.a.l);
            this.t.setMovementMethod(LinkMovementMethod.getInstance());
            if (p2 != 0)
                v0 = 0;
            else
                v0 = 8;
            this.t.setVisibility(v0);
        }
        else
            this.t.setVisibility(8);
        if (v3.a & 8)
            v0 = 1;
        else
            v0 = 0;
        this.q = v0;
        if (this.q != 0) {
            this.u.setText(v3.g);
            this.u.setMovementMethod(LinkMovementMethod.getInstance());
            if (p2 != 0)
                v0 = 0;
            else
                v0 = 8;
            this.u.setVisibility(v0);
        }
        else
            this.u.setVisibility(8);
        if (v3.a & 4)
            v0 = 1;
        else
            v0 = 0;
        this.r = v0;
        if (this.r != 0) {
            this.v.a(10, v3.d, new com.google.android.finsky.billing.myaccount.layout.f(this, p6, v3, p4, p3, p0));
            if (p2 != 0)
                v0 = 0;
            else
                v0 = 8;
            this.v.setVisibility(v0);
        }
        else
            this.v.setVisibility(8);
        this.a();
    }

    public void onAnimationEnd(Animation p0) {
        if (p0 == this.d) {
            if (this.p != 0)
                RewardRowView.a(this.t);
            if (this.q != 0)
                RewardRowView.a(this.u);
            if (this.r != 0)
                RewardRowView.a(this.v);
        }
    }

    public void onAnimationStart(Animation p0) {
        if (p0 == this.e) {
            this.t.setVisibility(8);
            this.u.setVisibility(8);
            this.v.setVisibility(8);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.s = (TextView)this.findViewById(2131756657);
        this.t = (TextView)this.findViewById(2131756537);
        this.u = (TextView)this.findViewById(2131756658);
        this.v = (PlayActionButtonV2)this.findViewById(2131756659);
    }

}
