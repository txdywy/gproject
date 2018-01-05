package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.aa;
import android.support.design.widget.ai;
import android.support.design.widget.aq;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v7.b.a.b;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.n;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.e;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.i;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.activities.fa extends android.support.design.widget.ai implements com.google.android.finsky.d.ad
{

    public static final long ak;
    public com.google.android.finsky.ba.c af;
    public com.google.android.finsky.accounts.c ag;
    public com.google.android.finsky.d.a ah;
    public com.google.android.finsky.bg.l ai;
    public com.google.android.finsky.bg.k aj;
    public final com.google.wireless.android.a.a.a.a.ce al;
    public String am;
    public PlayActionButtonV2 an;
    public Context ao;
    public com.google.android.finsky.d.w ap;
    public com.google.android.finsky.navigationmanager.a aq;
    public android.support.design.widget.aa ar;

    static {
        com.google.android.finsky.activities.fa.ak = TimeUnit.DAYS.toMillis(168);
    }

    fa() {
        android.support.design.widget.ai();
        this.al = com.google.android.finsky.d.j.a(2934);
        this.ar = new com.google.android.finsky.activities.fc(this);
    }

    public static boolean W() {
        if (((Long)com.google.android.finsky.aa.a.bk.a()).longValue() > com.google.android.finsky.utils.i.a())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void b(View p0) {
        ((FifeImageView)p0.findViewById(com.google.android.finsky.bd.a.T.intValue())).setImageDrawable(android.support.v7.b.a.b.b(this.ao, com.google.android.finsky.bd.a.R.intValue()));
        ((LinearLayout)p0.findViewById(com.google.android.finsky.bd.a.V.intValue())).setVisibility(0);
    }

    public final Dialog a(Bundle p0) {
        v0 = super.a(p0);
        v0.setOnShowListener(new com.google.android.finsky.activities.fb(v0));
        return v0;
    }

    public final void a(Dialog p0, int p1) {
        v1 = 0;
        super.a(p0, p1);
        v4 = View.inflate(this.g(), com.google.android.finsky.bd.a.Q.intValue(), 0);
        p0.setContentView(v4);
        this.ao = this.g();
        this.aq = ((com.google.android.finsky.pagesystem.e)this.h()).y_();
        v0 = ((android.support.design.widget.aq)((View)v4.getParent()).getLayoutParams()).a;
        if (v0 != 0 && v0 instanceof BottomSheetBehavior)
            ((BottomSheetBehavior)v0).t = this.ar;
        ((Button)v4.findViewById(2131755404)).setOnClickListener(new com.google.android.finsky.activities.fd(this));
        v0 = this.ao.getResources().getConfiguration();
        if (v0.orientation == 2)
            v4.setMinimumWidth(com.google.android.finsky.bg.k.a(360, this.ao.getResources()));
        if (this.af.dj().a(12623744)) {
            if (v0.orientation == 2 && (v0.screenLayout & 15) < 4)
                this.b(v4);
            else {
                v5 = new com.google.android.finsky.cv.a.bd();
                v5.f = (String)com.google.android.finsky.aa.b.ef.b();
                v5.b = v5.b | 16;
                v5.i = 1;
                if (v5.f != 0) {
                    this.ai.a((FifeImageView)v4.findViewById(com.google.android.finsky.bd.a.X.intValue()), v5, -1);
                    ((FifeImageView)v4.findViewById(com.google.android.finsky.bd.a.U.intValue())).setImageDrawable(android.support.v7.b.a.b.b(this.ao, com.google.android.finsky.bd.a.S.intValue()));
                    ((FrameLayout)v4.findViewById(com.google.android.finsky.bd.a.W.intValue())).setVisibility(0);
                    v1 = 1;
                }
                else {
                    this.a(0);
                    v1 = 1;
                }
            }
        }
        else {
            this.b(v4);
            v1 = 2;
        }
        this.an = (PlayActionButtonV2)v4.findViewById(2131755405);
        this.an.a(2, this.ao.getString(com.google.android.finsky.bd.a.Y.intValue()), new com.google.android.finsky.activities.fe(this, v1));
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this, p0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        ((com.google.android.finsky.n)com.google.android.finsky.providers.d.a(com.google.android.finsky.n)).a(this);
        this.am = this.ag.cZ();
        if (p0 != 0)
            this.ap = this.ah.a(p0);
        else {
            this.ap = this.ah.a(this.q);
            this.ap.a(new com.google.android.finsky.d.p().b(this));
        }
    }

    public final void e(Bundle p0) {
        super.e(p0);
        this.ap.a(p0);
    }

    public final com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.al;
    }

}
