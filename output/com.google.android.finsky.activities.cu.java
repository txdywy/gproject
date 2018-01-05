package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.a.d;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v4.view.ai;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.widget.TextView;
import com.google.android.finsky.actionbuttons.DetailsButtonLayout;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.actionbuttons.aq;
import com.google.android.finsky.actionbuttons.j;
import com.google.android.finsky.actionbuttons.layout.WishlistPlayActionButton;
import com.google.android.finsky.api.c;
import com.google.android.finsky.at.k;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.by.p;
import com.google.android.finsky.ck.b;
import com.google.android.finsky.cv.a.af;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.co;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.fl;
import com.google.android.finsky.cv.a.g;
import com.google.android.finsky.cv.a.go;
import com.google.android.finsky.cv.a.la;
import com.google.android.finsky.cv.a.lq;
import com.google.android.finsky.cv.a.lw;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.cw.b;
import com.google.android.finsky.cw.c;
import com.google.android.finsky.cw.d;
import com.google.android.finsky.cw.e;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.a;
import com.google.android.finsky.detailscomponents.e;
import com.google.android.finsky.detailscomponents.f;
import com.google.android.finsky.detailscomponents.g;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.layout.DetailsSummary;
import com.google.android.finsky.layout.DetailsSummaryWishlistView;
import com.google.android.finsky.layout.DetailsTitleCreatorBlock;
import com.google.android.finsky.layout.OrsonTitleCreatorBlock;
import com.google.android.finsky.layout.au;
import com.google.android.finsky.layout.v;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.navigationmanager.e;
import com.google.android.finsky.p.a;
import com.google.android.finsky.p.c;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.n;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import java.text.ParseException;
import java.util.List;

protected class com.google.android.finsky.activities.cu implements com.google.android.finsky.actionbuttons.an, com.google.android.finsky.p.h
{

    public com.google.android.finsky.pagesystem.b A;
    public Context B;
    public final Account C;
    public Document D;
    public Document E;
    public View[] F;
    public boolean G;
    public DetailsSummaryDynamic H;
    public ViewGroup I;
    public boolean J;
    public boolean K;
    public String L;
    public DfeToc M;
    public com.google.android.finsky.api.c N;
    public boolean O;
    public String P;
    public boolean Q;
    public int R;
    public com.google.android.finsky.d.w S;
    public com.google.android.finsky.d.ad T;
    public String U;
    public boolean V;
    public boolean W;
    public com.google.android.finsky.cw.d X;
    public com.google.android.finsky.detailscomponents.e Y;
    public com.google.android.finsky.detailscomponents.a Z;
    public com.google.android.finsky.aw.a aa;
    public boolean ab;
    public com.google.android.finsky.p.a ac;
    public View$OnClickListener ad;
    public View$OnClickListener ae;
    public Intent af;
    public com.google.android.finsky.by.o u;
    public final boolean v;
    public com.google.android.finsky.p.c w;
    public com.google.android.play.image.w x;
    public boolean y;
    public com.google.android.finsky.navigationmanager.a z;

    cu(DfeToc p0, Account p1) {
        this.v = com.google.android.finsky.m.a.dj().a(12622545);
        this.R = 1;
        this.C = p1;
        this.M = p0;
        this.N = com.google.android.finsky.m.a.b(p1.name);
        this.X = com.google.android.finsky.m.a.i();
        this.u = com.google.android.finsky.m.a.Y();
        if (com.google.android.finsky.m.a.dj().a(12633045))
            this.w = com.google.android.finsky.m.a.cC();
        this.Y = new com.google.android.finsky.detailscomponents.e(this.C, this.M, this.u, com.google.android.finsky.m.a.ah(), com.google.android.finsky.m.a.aN());
        this.Z = com.google.android.finsky.m.a.ch();
        com.google.android.finsky.m.a.cm();
        this.aa = com.google.android.finsky.m.a.d();
        com.google.android.finsky.m.a.h();
    }

    private final void a(PlayActionButtonV2 p0, com.google.android.finsky.cw.a p1, int p2) {
        v4 = 0;
        p0.setVisibility(0);
        v7 = new com.google.android.finsky.cw.e();
        if (com.google.android.finsky.m.a.av().k(this.B.getResources()))
            this.X.b(p1, p2, this.R, v7);
        else
            this.X.a(p1, p2, this.R, v7);
        if (com.google.android.finsky.actionbuttons.j.a(p1))
            v4 = com.google.android.finsky.actionbuttons.j.a(p1, p2, this.z, this.L, 0, this.B, this.S);
        else if (p1.a == 9)
            v4 = this.b(p1.h, p1.i);
        else if (p1.a == 12)
            v4 = this.a(p1.h, p1.i);
        else if (p1.a == 15)
            v4 = this.a(p1.h);
        else if (p1.a == 21)
            v4 = new com.google.android.finsky.activities.cz(this);
        else {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(p1.a);
            FinskyLog.e("Can't create a click listener for action %d", v1);
        }
        p0.a(p2, v7.a(this.B), v4);
    }

    private final View$OnClickListener b(Document p0, Account p1) {
        return new com.google.android.finsky.activities.cy(this, p0, p1);
    }

    private static void b(LayoutInflater p0, ViewGroup p1, CharSequence p2) {
        v0 = (TextView)p0.inflate(2130968763, p1, 0);
        v0.setText(p2);
        p1.addView(v0);
    }

    protected View$OnClickListener a(Document p0) {
        return 0;
    }

    protected View$OnClickListener a(Document p0, Account p1) {
        return 0;
    }

    public void a() {
        this.y = 1;
        if (this.I != 0) {
            v1 = 0;
            while (v1 < this.I.getChildCount()) {
                v0 = this.I.getChildAt(v1);
                if (v0 instanceof PlayActionButtonV2)
                    ((PlayActionButtonV2)v0).a();
                v1 = v1 + 1;
            }
        }
        if (com.google.android.finsky.m.a.dj().a(12633045) && this.w != 0 && this.D.a.e == 64 && this.ab != 0) {
            this.w.b(this);
            this.w.b();
            this.ac.a(this.S, this.D.a.D);
            this.w.c();
            this.ab = 0;
        }
    }

    protected void a(int p0) {
        v0 = (TextView)this.H.findViewById(2131755325);
        this.I.setVisibility(8);
        v0.setVisibility(0);
        v0.setText(this.B.getResources().getString(p0));
    }

    public void a(int p0, Bundle p1) {
        if (p0 == 7) {
            v0 = (Document)p1.getParcelable("DetailsSummaryViewBinder.doc");
            v1 = p1.getString("DetailsSummaryViewBinder.ownerAccountName");
            if (v0 != 0 && !TextUtils.isEmpty(v1)) {
                v1 = com.google.android.finsky.m.a.b(v1);
                this.Q = 1;
                this.i();
                v1.a(v0.a.c, v0.d(), new com.google.android.finsky.by.p(com.google.android.finsky.m.a.ai(), v1.b(), new com.google.android.finsky.activities.da(this)), new com.google.android.finsky.activities.db(this));
            }
        }
    }

    public void a(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.play.image.w p2, com.google.android.finsky.pagesystem.b p3, boolean p4, String p5, String p6, boolean p7, com.google.android.finsky.d.ad p8, com.google.android.finsky.d.w p9) {
        this.B = p0;
        this.z = p1;
        this.x = p2;
        this.A = p3;
        this.L = p5;
        this.U = p6;
        this.V = p7;
        this.T = p8;
        this.S = p9;
        if (com.google.android.finsky.m.a.dj().a(12633045) && this.w != 0) {
            this.w.c();
            this.ac = com.google.android.finsky.m.a.cD();
        }
    }

    public void a(Bitmap p0) {
        v0 = (PlayCardThumbnail)this.c(2131755632);
        if (v0 != 0)
            ((DocImageView)v0.getImageView()).setImageBitmap(p0);
    }

    protected void a(LayoutInflater p0, ViewGroup p1, CharSequence p2) {
        v0 = (TextView)p0.inflate(2130968765, p1, 0);
        v0.setText(p2);
        v0.setTextColor(com.google.android.finsky.bg.h.a(this.B, this.D.a.f));
        p1.addView(v0);
    }

    public void a(Document p0, Document p1, boolean p2, String p3, boolean p4, Intent p5, View[] p6) {
        this.F = p6;
        this.D = p0;
        this.E = p1;
        this.O = p2;
        this.P = p3;
        this.W = p4;
        this.af = p5;
        if (com.google.android.finsky.m.a.dj().a(12633045) && (this.D.a.e == 64 || this.D.a.e == 5)) {
            if (this.D.a.e == 64) {
                if (this.ad == 0)
                    this.ad = this.m();
                if (this.ab == 0) {
                    this.w.a(this);
                    this.ab = 1;
                }
            }
            if (this.ae == 0)
                this.ae = this.l();
        }
        this.H = (DetailsSummaryDynamic)this.c(2131755322);
        this.I = (ViewGroup)this.c(2131755323);
        this.g();
        this.j();
        if (p2 != 0) {
            this.b();
            this.c();
        }
        else
            this.I.setVisibility(8);
        com.google.android.finsky.bg.ai.a(this.H, 8);
    }

    protected void a(boolean p0) {
        v4 = (PlayActionButtonV2)this.c(2131755594);
        v2 = (PlayActionButtonV2)this.c(2131755597);
        v3 = (PlayActionButtonV2)this.c(2131755596);
        v1 = (PlayActionButtonV2)this.c(2131755593);
        v5 = (PlayActionButtonV2)this.c(2131755590);
        v6 = (PlayActionButtonV2)this.c(com.google.android.finsky.bd.a.A.intValue());
        v7 = (WishlistPlayActionButton)this.c(2131755598);
        v1.setVisibility(8);
        if (v4 != 0)
            v4.setVisibility(8);
        v2.setVisibility(8);
        if (v3 != 0)
            v3.setVisibility(8);
        if (v5 != 0)
            v5.setVisibility(8);
        if (v6 != 0)
            v6.setVisibility(8);
        if (v7 != 0)
            v7.setVisibility(8);
        if (this.J == 0 && p0 == 0 && this.a(v1, v2, v3, v4, v5, v6, v7))
            this.q();
    }

    protected final boolean a(PlayActionButtonV2 p0, PlayActionButtonV2 p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3, PlayActionButtonV2 p4, WishlistPlayActionButton p5) {
        v5 = com.google.android.finsky.m.a.j().a();
        this.X.a(this.C, this.M, 3, this.D, v5);
        v0 = 0;
        v1 = 0;
        v2 = 0;
        while (true) {
            if (v0 >= v5.e) {
                if (!v5.b() && this.D.a.I != 0) {
                    p5.a(this.D, this.z, this.T);
                    v0 = 1;
                }
                else
                    v0 = v5.b();
                return v0;
            }
            if (v1 >= 2)
                break;
            v3 = v5.a(v0);
            if (v3.a == 6 || v3.a == 9) {
                this.a(p0, v3, v5.c);
                v1 = v1 + 1;
            }
            else if (v3.a == 11 || v3.a == 10) {
                this.a(p3, v3, v5.c);
                v1 = v1 + 1;
            }
            else if (v3.a == 21) {
                this.a(p3, v3, v5.c);
                com.google.android.finsky.actionbuttons.aq.a(com.google.android.finsky.m.a.b, p3, this.R);
                v1 = v1 + 1;
            }
            else if (v3.a == 12) {
                this.a(p4, v3, v5.c);
                v1 = v1 + 1;
            }
            else {
                if (v2 == 0)
                    this.a(p1, v3, v5.c);
                else
                    this.a(p2, v3, v5.c);
                v2 = v2 + 1;
                v1 = v1 + 1;
            }
            v0 = v0 + 1;
        }
        v1 = new Object[1];
        v1[0] = Integer.valueOf(2);
        FinskyLog.c("Not supposed to have more than %d actions available", v1);
        if (!v5.b() && this.D.a.I != 0) {
            p5.a(this.D, this.z, this.T);
            v0 = 1;
        }
        else
            v0 = v5.b();
        return v0;
    }

    protected boolean a(PlayActionButtonV2 p0, PlayActionButtonV2 p1, PlayActionButtonV2 p2, PlayActionButtonV2 p3, PlayActionButtonV2 p4, PlayActionButtonV2 p5, WishlistPlayActionButton p6) {
        v11 = com.google.android.finsky.m.a.ah().a(this.C);
        v2 = this.u.a(this.D, this.C);
        if (v2 != 0) {
            if (this.u.c(this.D, v11)) {
                p0.setVisibility(0);
                if (this.Q == 0)
                    v1 = 1;
                else
                    v1 = 0;
                p0.setEnabled(v1);
                p0.a(this.D.a.f, 2131951801, this.b(this.D, v2));
            }
            else {
                p0.setVisibility(0);
                p0.setEnabled(1);
                p0.a(this.D.a.f, com.google.android.finsky.bg.h.e(this.D.a.f), this.z.a(this.D, v2, this.A, this.S));
            }
            v1 = 1;
        }
        else if (!this.u.a(this.D, this.M, v11))
            v1 = 0;
        else {
            v4 = this.D.e(1);
            if (v4 != 0) {
                p1.setVisibility(0);
                if (this.D.ab()) {
                    v5 = new Object[1];
                    v5[0] = v4.g;
                    v7 = 234;
                    v10 = this.B.getString(2131952907, v5);
                }
                else {
                    v7 = this.c(0);
                    v10 = this.b(0);
                }
                p1.a(this.D.a.f, v10, this.z.a(this.C, this.D, v4.p, 0, this.L, v7, 0, this.S));
            }
            if (this.D.ag() && p3 != 0) {
                p3.setVisibility(0);
                if (this.u.a(this.D, v11, 2))
                    v1 = this.z.a(this.D, this.C, this.A, this.S);
                else
                    v1 = this.z.a(this.C, this.D, 2, 0, this.L, 222, 0, this.S);
                p3.a(this.D.a.f, 2131953086, v1);
            }
            v1 = 1;
        }
        return v1;
    }

    protected final String b(boolean p0) {
        if (p0 != 0)
            v0 = this.B.getString(2131952292);
        else if (!this.D.ah()) {
            if (this.D.a.f == 3)
                v0 = this.B.getString(2131952292);
            else if (this.D.a.f == 1)
                v0 = this.B.getString(2131952690);
            else {
                v0 = this.D.e(1);
                if (v0 != 0 && v0.aL_())
                    v0 = v0.g;
                else
                    v0 = "";
            }
        }
        else {
            v0 = this.D.e(1);
            if (v0 != 0 && v0.aL_())
                v0 = v0.g;
            else
                v0 = "";
        }
        return v0;
    }

    protected void b() {
        this.d(this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)));
        this.I.setVisibility(4);
        if (this.J == 0) {
            if (this.G != 0)
                this.a(2131952995);
            else
                this.a(0);
        }
    }

    public final void b(int p0) {
        this.R = p0;
        if (p0 == 9) {
            v0 = new com.google.android.finsky.at.k();
            v0.a(com.google.android.finsky.bd.a.al.intValue()).d(2131952688);
            v0.a().a(this.A.B, "sample_error_dialog");
        }
        else
            this.i();
        if (this.ac != 0)
            this.ac.a(this.S, this.D.a.D);
    }

    protected final int c(boolean p0) {
  0:    v0 = 221;
  2:    if (p0 != 0)
  4:        return v0;
 11:    if (this.D.ah()) goto 34;
 20:    if (this.D.a.f != 3) {
 29:        if (this.D.a.f == 1)
 31:            v0 = 225;
            else
 34:            v0 = 200;
        }
 33:    return v0;
    }

    protected View c(int p0) {
  0:    v0 = 0;
  3:    if (this.F == 0)
  5:        return v0;
 10:    v2 = 0;
 11:    while (true) {
 11:        if (v2 >= this.F.length)
  5:            return v0;
 15:        if (this.F[v2] != 0)
 15:            break;
 27:        v2 = v2 + 1;
        }
 17:    v1 = this.F[v2].findViewById(p0);
 21:    if (v1 == 0) goto 25;
 23:    v0 = v1;
 24:    return v0;
    }

    protected void c() {
        v1 = 0;
        v3 = 2147483647;
        while (v1 < this.I.getChildCount()) {
            v0 = (PlayActionButtonV2)this.I.getChildAt(v1);
            if (v0.getVisibility() == 0) {
                if (v0.getPriority() < v3)
                    v3 = v0.getPriority();
            }
            v1 = v1 + 1;
        }
        v1 = 0;
        while (v1 < this.I.getChildCount()) {
            v0 = (PlayActionButtonV2)this.I.getChildAt(v1);
            if (v0.getVisibility() == 0) {
                if (v0.getPriority() == v3)
                    v0.setActionStyle(0);
                else
                    v0.setActionStyle(2);
            }
            v1 = v1 + 1;
        }
    }

    public final void d() {
        if (com.google.android.finsky.m.a.dj().a(12633045) && this.w != 0 && this.D.a.e == 64 && this.D.bO())
            this.w.a(this.D.bP());
    }

    protected final void d(int p0) {
        this.S.b(new com.google.android.finsky.d.d(this.T).a(p0));
    }

    public void d(boolean p0) {
        if (p0 == 0)
            v0 = 1;
        else
            v0 = 0;
        this.J = v0;
    }

    protected boolean f() {
        return 1;
    }

    protected void g() {
        if (this.I instanceof DetailsButtonLayout) {
            ((DetailsButtonLayout)this.I).setForceMultiLineLayout(0);
            ((DetailsButtonLayout)this.I).setForceWideLayout(com.google.android.finsky.m.a.av().k(this.B.getResources()));
        }
    }

    public void i() {
        if (this.y == 0)
            this.a(this.D, this.E, this.O, this.P, this.W, this.af, this.F);
    }

    protected void j() {
  1:    v6 = 2;
  5:    v5 = 0;
 13:    v0 = (TextView)this.c(2131755365);
 15:    if (v0 != 0) {
 19:        v1 = this.B.getResources();
 29:        if (this.D.a.e == 1) {
 37:            if (this.D.bW()) {
 42:                v3 = new Object[1];
 50:                v3[0] = this.D.a.g;
 56:                v0.setText(v1.getString(2131952096, v3));
                }
451:            else if (this.D.bT()) {
456:                v3 = new Object[1];
464:                v3[0] = this.D.a.g;
470:                v0.setText(v1.getString(2131953223, v3));
                }
                else
481:                v0.setText(this.D.a.g);
            }
486:        else if (this.D.a.e == 5 || this.D.a.e == 64) {
494:            v1 = this.D.bJ();
500:            v2 = this.D.bI();
508:            if (!TextUtils.isEmpty(v1)) {
514:                if (!TextUtils.isEmpty(v2))
558:                    v0.setText((String.valueOf(v1).length() + 1 + String.valueOf(v2).length()) + v1 + "\n" + v2);
                    else
569:                    v0.setText(this.D.a.g);
                }
                else
569:                v0.setText(this.D.a.g);
            }
            else
569:            v0.setText(this.D.a.g);
        }
 72:    v0 = (ViewGroup)this.c(2131755621);
 81:    v1 = (DecoratedTextView)v0.findViewById(2131755622);
 86:    this.c(2131755623);
 96:    v2 = (ViewGroup)this.c(2131755519);
105:    v3 = (PlayTextView)this.c(2131755625);
107:    if (v1 != 0) {
110:        if (this.D.a.e == 3 || this.D.a.e == 2 || this.D.a.e == 4 || this.D.a.e == 5 || this.D.a.e == 64 || this.D.a.e == 30) {
127:            v0.setVisibility(8);
130:            v2.setVisibility(8);
            }
575:        else if (this.D.a.e == 6) {
577:            v0.setVisibility(8);
584:            this.Z.a(this.D, v2);
            }
            else {
589:            v0.setVisibility(0);
598:            v1.setText(com.google.android.finsky.playcard.ac.a(this.D));
605:            this.Z.a(this.D, v1);
612:            this.Z.a(this.D, v2);
615:            if (this.D.a.e == 1 && com.google.android.finsky.m.a.dj().a(12631928)) {
638:                v0 = this.aa.a(this.B, this.D);
646:                if (!TextUtils.isEmpty(v0)) {
648:                    v3.setVisibility(0);
651:                    v3.setText(v0);
                    }
                    else
656:                    v3.setVisibility(8);
                }
                else
661:                v3.setVisibility(8);
            }
        }
144:    com.google.android.finsky.detailscomponents.a.a(this.D, (DecoratedTextView)this.c(2131755626));
147:    this.k();
157:    v0 = (DetailsSummaryWishlistView)this.c(2131755620);
159:    if (v0 != 0) {
163:        if (this.K != 0)
165:            v0.setVisibility(8);
            else
672:            v0.a(this.D, this.z, this.S);
        }
170:    v9 = this.B.getResources();
181:    v0 = (PlayCardThumbnail)this.c(2131755632);
189:    v3 = com.google.android.finsky.m.a.av().k(v9);
193:    switch (this.D.a.e) {
            case 1:
193:            goto 677;
            case 2:
193:            goto 680;
            case 3:
193:            goto 683;
            case 4:
193:            goto 680;
            case 5:
193:            goto 677;
            case 6:
193:            goto 677;
            case 16:
193:            goto 677;
            case 17:
193:            goto 677;
            case 18:
193:            goto 683;
            case 19:
193:            goto 683;
            case 20:
193:            goto 683;
            case 24:
193:            goto 680;
            case 25:
193:            goto 680;
            case 44:
193:            goto 677;
            case 64:
193:            goto 677;
            default:
        }
196:    v2 = 0;
208:    if (this.K == 0 && v2 == 0) {
212:        v0.setVisibility(8);
215:        if (v3 != 0)
217:            v0 = 0;
            else
686:            v0 = 2;
218:        v6 = v0;
        }
        else {
689:        v0.setVisibility(0);
698:        v0.a(this.D.a.f, 0);
701:        v2 = v0.getLayoutParams();
711:        v2.width = com.google.android.finsky.bg.h.e(this.B, this.D.a.e);
719:        v2.height = com.google.android.finsky.bg.h.f(this.B, this.D.a.e);
725:        v0 = (DocImageView)v0.getImageView();
729:        v0.setScaleType(ImageView$ScaleType.FIT_START);
736:        if (com.google.android.finsky.navigationmanager.e.a() && this.U != 0)
744:            android.support.v4.view.ai.a(v0, this.U);
749:        if (this.V == 0)
757:            v0.a(this.D, this.x, DocImageView.a);
762:        v0.setFocusable(this.O);
781:        v0.setContentDescription(com.google.android.finsky.bg.h.a(this.D.a.g, this.D.a.e, v9));
786:        if (this.O != 0) {
793:            v0.setOnClickListener(new com.google.android.finsky.activities.cv(this));
805:            v0.setForeground(android.support.v4.a.d.a(this.B, 2130837953));
            }
808:        if (v3 != 0)
810:            v6 = 0;
817:        else if (com.google.android.finsky.detailscomponents.f.a(this.D.a.e) && com.google.android.finsky.detailscomponents.g.c(this.D, v3) != 0)
827:            v6 = 1;
        }
219:    ((DetailsSummary)this.c(2131755468)).setThumbnailMode(v6);
224:    if (this.K != 0)
444:        return;
233:    v0 = (ViewGroup)this.c(2131755627);
235:    v0.removeAllViews();
240:    v1 = LayoutInflater.from(this.B);
250:    switch (this.D.a.e) {
            case 5:
250:            goto 931;
            case 6:
250:            goto 830;
            case 18:
250:            goto 906;
            case 64:
250:            goto 931;
            default:
        }
257:    if (v0.getChildCount() > 0)
259:        v1 = 0;
        else
950:        v1 = 8;
260:    v0.setVisibility(v1);
270:    v0 = (ViewGroup)this.c(2131755628);
272:    v0.removeAllViews();
277:    v2 = LayoutInflater.from(this.B);
285:    if (this.t_()) {
289:        v1 = this.D.t();
297:        if (!TextUtils.isEmpty(v1))
299:            this.a(v2, v0, v1);
        }
304:    v3 = com.google.android.finsky.m.a.ah();
314:    v6 = this.u.a(this.D, this.C);
318:    if (v6 == 0) {
399:        if (v6 == 0) {
415:            if (this.u.d(this.D, v3.a(this.C)))
426:                this.a(v2, v0, this.B.getString(2131952507));
974:            else if (this.D.a.f != 6 && this.f()) {
998:                v3 = com.google.android.finsky.m.a.X().c(this.D, this.M, v3.a(this.C));
1002:                if (v3 == 0)
1004:                    v1 = 0;
                    else {
1049:                    if (this.D.a.e == 6)
1051:                        v1 = com.google.android.finsky.activities.dc.a(v3);
1094:                    else if (this.D.a.e == 5 && v3.p == 3)
1099:                        v1 = 2131952444;
                        else
1103:                        v1 = 2131952442;
1059:                    v4 = new Object[1];
1061:                    v4[0] = v3.l;
1063:                    v4 = this.B.getString(v1, v4);
1069:                    v1 = new SpannableStringBuilder(v4);
1072:                    v4 = v4.indexOf(v3.l);
1076:                    if (v4 >= 0)
1090:                        v1.setSpan(new StrikethroughSpan(), v4, v3.l.length() + v4, 17);
                    }
1009:                if (!TextUtils.isEmpty(v1) && this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)))
1035:                    this.a(v2, v0, v1);
                }
            }
433:        if (v0.getChildCount() <= 0)
1107:            v5 = 8;
435:        v0.setVisibility(v5);
438:        this.p();
441:        this.o();
444:        return;
        }
322:    v1 = v3.a(this.C);
334:    if (!this.u.c(this.D, v1)) {
399:        if (v6 == 0) {
415:            if (this.u.d(this.D, v3.a(this.C)))
426:                this.a(v2, v0, this.B.getString(2131952507));
974:            else if (this.D.a.f != 6 && this.f()) {
998:                v3 = com.google.android.finsky.m.a.X().c(this.D, this.M, v3.a(this.C));
1002:                if (v3 == 0)
1004:                    v1 = 0;
                    else {
1049:                    if (this.D.a.e == 6)
1051:                        v1 = com.google.android.finsky.activities.dc.a(v3);
1094:                    else if (this.D.a.e == 5 && v3.p == 3)
1099:                        v1 = 2131952444;
                        else
1103:                        v1 = 2131952442;
1059:                    v4 = new Object[1];
1061:                    v4[0] = v3.l;
1063:                    v4 = this.B.getString(v1, v4);
1069:                    v1 = new SpannableStringBuilder(v4);
1072:                    v4 = v4.indexOf(v3.l);
1076:                    if (v4 >= 0)
1090:                        v1.setSpan(new StrikethroughSpan(), v4, v3.l.length() + v4, 17);
                    }
1009:                if (!TextUtils.isEmpty(v1) && this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)))
1035:                    this.a(v2, v0, v1);
                }
            }
433:        if (v0.getChildCount() <= 0)
1107:            v5 = 8;
435:        v0.setVisibility(v5);
438:        this.p();
441:        this.o();
444:        return;
        }
346:    v8 = this.D.e(this.u.b(this.D, v1));
350:    if (v8 == 0) goto 956;
356:    if (v8.f() && v8.x > System.currentTimeMillis())
368:        v1 = 0;
        else
953:        v1 = 1;
369:    if (v1 == 0) goto 956;
378:    v11 = new Object[1];
390:    v11[0] = com.google.android.finsky.m.a.bb().b(v8.y);
392:    v1 = this.B.getString(2131952717, v11);
396:    this.a(v2, v0, v1);
399:    if (v6 == 0) {
415:        if (this.u.d(this.D, v3.a(this.C)))
426:            this.a(v2, v0, this.B.getString(2131952507));
974:        else if (this.D.a.f != 6 && this.f()) {
998:            v3 = com.google.android.finsky.m.a.X().c(this.D, this.M, v3.a(this.C));
1002:            if (v3 == 0)
1004:                v1 = 0;
                else {
1049:                if (this.D.a.e == 6)
1051:                    v1 = com.google.android.finsky.activities.dc.a(v3);
1094:                else if (this.D.a.e == 5 && v3.p == 3)
1099:                    v1 = 2131952444;
                    else
1103:                    v1 = 2131952442;
1059:                v4 = new Object[1];
1061:                v4[0] = v3.l;
1063:                v4 = this.B.getString(v1, v4);
1069:                v1 = new SpannableStringBuilder(v4);
1072:                v4 = v4.indexOf(v3.l);
1076:                if (v4 >= 0)
1090:                    v1.setSpan(new StrikethroughSpan(), v4, v3.l.length() + v4, 17);
                }
1009:            if (!TextUtils.isEmpty(v1) && this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C)))
1035:                this.a(v2, v0, v1);
            }
        }
433:    if (v0.getChildCount() <= 0)
1107:        v5 = 8;
435:    v0.setVisibility(v5);
438:    this.p();
441:    this.o();
444:    return;
677:    v2 = 1;
678:    goto 197;
680:    v2 = v3;
681:    goto 197;
683:    v2 = 0;
684:    goto 197;
832:    v2 = this.D.S();
842:    if (!this.D.ab() && !TextUtils.isEmpty(v2.d))
854:        com.google.android.finsky.activities.cu.b(v1, v0, v2.d);
863:    if (this.D.ar() == 0) {
871:        if (!TextUtils.isEmpty(v2.e))
875:            com.google.android.finsky.activities.cu.b(v1, v0, v2.e);
            else
902:            com.google.android.finsky.activities.cu.b(v1, v0, this.B.getString(2131952624));
        }
884:    if (!TextUtils.isEmpty(v2.c))
888:        com.google.android.finsky.activities.cu.b(v1, v0, v2.c);
891:    goto 253;
908:    if (this.v != 0) {
912:        v2 = this.D.U();
916:        if (v2 != 0 && v2.bK_())
926:            com.google.android.finsky.activities.cu.b(v1, v0, v2.h);
        }
929:    goto 253;
937:    if (this.D.bE())
945:        com.google.android.finsky.activities.cu.b(v1, v0, this.D.bF());
948:    goto 253;
961:    v1 = this.B.getString(2131952718);
965:    goto 396;
    }

    protected final void k() {
  8:    v7 = (DetailsTitleCreatorBlock)this.c(2131755638);
 21:    v8 = (OrsonTitleCreatorBlock)this.c(com.google.android.finsky.bd.a.am.intValue());
 36:    if (com.google.android.finsky.m.a.dj().a(12633045) && this.D.a.e == 64) {
 60:        if (this.D.v())
 70:            v1 = this.D.u().a.g;
            else
190:            v1 = this.D.a.i;
 78:        if (this.D.bM())
 84:            v2 = this.D.bN().b;
            else
193:            v2 = 0;
 98:        if (this.D.bM())
106:            v4 = this.D.bN().e;
            else
195:            v4 = 0;
122:        v0 = new com.google.android.finsky.layout.au(v1, v2, this.D.bR(), v4, this.D.R().c, this.D.ab());
125:        if (v8 != 0) {
133:            v8.a.setText(v0.a);
136:            if (this.ad != 0) {
153:                v8.a.setTextColor(v8.getResources().getColor(com.google.android.finsky.bg.h.a(1)));
159:                v8.a.setClickable(1);
164:                v8.a.setOnClickListener(this.ad);
                }
170:            v8.a.setVisibility(0);
173:            v8.a(v0);
177:            v8.setVisibility(0);
            }
182:        v7.setVisibility(8);
185:        return;
        }
197:    if (v7 == 0) {
240:        v8.setVisibility(8);
243:        return;
        }
211:    v0 = this.D.v();
216:    if (this.D.a.e != 2 && this.D.a.e != 4 && this.D.a.e != 5 && this.D.a.e != 64 && v0 == 0) {
235:        v7.setVisibility(8);
240:        v8.setVisibility(8);
243:        return;
        }
231:    if (this.D.a.e != 1) goto 244;
235:    v7.setVisibility(8);
240:    v8.setVisibility(8);
243:    return;
244:    if (v0 == 0) {
252:        v7.b.setText(this.D.a.i);
259:        v7.a.setVisibility(8);
        }
        else {
403:        v5 = this.D.u();
413:        v7.b.setText(v5.a.g);
417:        v0 = v5.c(0);
421:        if (v0 == 0 || v0.size() == 0)
433:            v7.a.setVisibility(8);
            else {
468:            v0 = (com.google.android.finsky.cv.a.bd)v0.get(0);
482:            com.google.android.finsky.m.a.ar().a(v7.a, v0.f, v0.i);
488:            v7.a.setVisibility(0);
495:            if (com.google.android.finsky.navigationmanager.e.a()) {
499:                v0 = new StringBuilder();
504:                v0.append("transition_generic_circle:");
509:                v0.append(":");
516:                v0.append(v5.a.c);
525:                android.support.v4.view.ai.a(v7.a, v0.toString());
                }
            }
444:        if (!TextUtils.isEmpty(v5.a.w) && this.z != 0) {
449:            v7.setFocusable(1);
458:            v7.setOnClickListener(new com.google.android.finsky.layout.v(v7, this.S, this.T, this.z, v5));
            }
        }
266:    v7.c.setVisibility(8);
270:    if (this.D.a.e == 5 || this.D.a.e == 64 || this.D.a.e == 44) {
281:        if (this.D.a.e == 5) {
287:            if (this.D.M() && this.D.a.s.e != 0)
303:                v0 = this.D.a.s.e.b;
                else
529:                v0 = 0;
            }
            else
532:            v0 = this.D.bH();
309:        if (!TextUtils.isEmpty(v0)) {
314:            v7.c.setVisibility(0);
319:            v7.c.setText(v0);
            }
        }
323:    if (this.D.a.e == 1)
333:        com.google.android.finsky.m.a.ch().a(this.D, v7.b);
337:    if (this.D.a.e == 2) goto 349;
340:    if (this.D.a.e == 4) goto 349;
343:    if (this.D.a.e == 5) goto 349;
347:    if (this.D.a.e != 64) goto 397;
349:    v0 = 0;
351:    if (this.D.a.e == 2 || this.D.a.e == 4)
362:        v0 = this.D.O().c.e;
539:    else if (this.D.a.e == 5 || this.D.a.e == 64)
549:        v0 = this.D.R().c;
368:    if (this.D.ab()) goto 562;
374:    if (TextUtils.isEmpty(v0)) goto 562;
376:    try {
388:        v7.d.setText(com.google.android.finsky.m.a.bb().a(v0));
394:        v7.d.setVisibility(0);
        }
        catch (ParseException ex) {
559:        FinskyLog.a(ex, "Cannot parse ISO 8601 date", new Object[0]);
566:        v7.d.setVisibility(8);
        }
398:    v7.setVisibility(0);
401:    goto 238;
559:    FinskyLog.a(ex, "Cannot parse ISO 8601 date", new Object[0]);
566:    v7.d.setVisibility(8);
569:    goto 397;
    }

    protected final View$OnClickListener l() {
        if (this.D.bK() && !TextUtils.isEmpty(this.D.bL()))
            v0 = new com.google.android.finsky.activities.cw(this);
        else
            v0 = 0;
        return v0;
    }

    protected final View$OnClickListener m() {
        if (this.D.v() && !TextUtils.isEmpty(this.D.u().a.w))
            v0 = new com.google.android.finsky.activities.cx(this);
        else
            v0 = 0;
        return v0;
    }

    public void n() {
        v0 = (PlayCardThumbnail)this.c(2131755632);
        if (v0 != 0)
            ((DocImageView)v0.getImageView()).a(this.D, this.x, DocImageView.a);
        this.V = 0;
    }

    protected final void o() {
        if (com.google.android.finsky.m.a.dj().a(12633045) && (this.D.a.e == 64 || this.D.a.e == 5) && !TextUtils.isEmpty(this.D.bL()) && this.ae != 0) {
            v0 = this.c(2131755629);
            v0.setVisibility(0);
            ((DetailsSummaryExtraLabelsSection)v0).removeAllViews();
            v1 = (TextView)LayoutInflater.from(this.B).inflate(com.google.android.finsky.bd.a.aq.intValue(), (DetailsSummaryExtraLabelsSection)v0, 0);
            ((DetailsSummaryExtraLabelsSection)v0).addView(v1);
            v1.setText(Html.fromHtml(this.D.bL()));
            v1.setClickable(1);
            v1.setOnClickListener(this.ae);
        }
    }

    protected final void p() {
        v3 = 0;
        if (!com.google.android.finsky.m.a.dj().a(12602049))
            v1 = 1;
        else
            v1 = 0;
        v0 = this.c(2131755629);
        if (v0 instanceof PlayTextView) {
            if (this.D.a.e != 1)
                ((PlayTextView)v0).setVisibility(8);
            v5 = this.B.getResources();
            v6 = new StringBuilder();
            v7 = v5.getString(2131951823);
            v8 = this.D.N();
            if (v8 != 0 && v1 != 0 && !TextUtils.isEmpty(v8.j)) {
                v6.append(v8.j);
                v1 = 1;
            }
            else
                v1 = 0;
            if (this.D.m()) {
                if (v1 != 0)
                    v6.append(v7);
                v6.append(this.D.n().c);
                v1 = 1;
            }
            if (this.D.ae()) {
                if (this.u.a(this.D, this.M, com.google.android.finsky.m.a.ah().a(this.C))) {
                    if (v1 != 0)
                        v6.append(v7);
                    v6.append(v5.getString(2131952922));
                }
            }
            else if (v8 != 0) {
                if (v8.d() && !TextUtils.isEmpty(v8.x)) {
                    if (v1 != 0)
                        v6.append(v7);
                    v6.append(v8.x);
                    v1 = 1;
                }
                if (v8.t != 0) {
                    if (v1 != 0)
                        v6.append(v7);
                    v6.append(v5.getString(2131952286));
                }
            }
            v1 = v6.toString();
            if (TextUtils.isEmpty(v1))
                v3 = 8;
            ((PlayTextView)v0).setVisibility(v3);
            ((PlayTextView)v0).setText(v1);
            if (!this.B.getResources().getBoolean(2131492899))
                ((PlayTextView)v0).setGravity(8388613);
        }
        else if (this.D.a.e != 1)
            ((DetailsSummaryExtraLabelsSection)v0).setVisibility(8);
        else
            this.Y.a((DetailsSummaryExtraLabelsSection)v0, this.D, v1);
    }

    protected void q() {
        com.google.android.finsky.bg.ai.a(this.I, 4);
    }

    public void r() {
        this.K = 1;
    }

    protected boolean t_() {
        if (this.u.a(this.D, this.C) == 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
