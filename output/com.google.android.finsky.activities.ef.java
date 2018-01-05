package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.l;
import com.google.android.finsky.at.k;
import com.google.android.finsky.av.a;
import com.google.android.finsky.av.d;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.jf;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.detailscomponents.a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.j;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.l;
import com.google.android.finsky.dfemodel.w;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.frameworkviews.DecoratedTextView;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.b.a.e;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.installqueue.p;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.pagesystem.j;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.h;
import com.google.android.play.image.FifeImageView;

public final class com.google.android.finsky.activities.ef extends com.google.android.finsky.activities.bp implements View$OnClickListener, com.google.android.finsky.d.ah, com.google.android.finsky.installqueue.o
{

    public int aA;
    public boolean aB;
    public boolean aC;
    public boolean aD;
    public boolean aE;
    public com.google.android.finsky.av.d aF;
    public Intent aG;
    public boolean aH;
    public long af;
    public com.google.android.finsky.m ag;
    public com.google.android.finsky.installqueue.g ah;
    public com.google.android.finsky.cv.a.jf ai;
    public com.google.android.finsky.dfemodel.j aj;
    public final com.google.android.finsky.dfemodel.w ak;
    public ViewGroup al;
    public TextView am;
    public ViewGroup an;
    public DecoratedTextView ao;
    public ViewGroup ap;
    public ViewGroup aq;
    public ViewGroup ar;
    public ViewGroup as;
    public TextView at;
    public TextView au;
    public ProgressBar av;
    public ImageView aw;
    public TextView ax;
    public TextView ay;
    public DocImageView az;
    public final Handler i;

    ef() {
        com.google.android.finsky.activities.bp();
        this.ak = new com.google.android.finsky.activities.eg(this);
        this.i = new Handler(Looper.getMainLooper());
        this.af = com.google.android.finsky.d.j.j();
        this.ag = com.google.android.finsky.m.a;
        this.ah = this.ag.bw();
    }

    public static com.google.android.finsky.activities.ef a(com.google.android.finsky.m p0, Document p1, String p2, com.google.android.finsky.d.w p3, Intent p4) {
        if (com.google.android.finsky.m.a.dj().a(12622681))
            v0 = com.google.android.finsky.api.l.b(p1.a.c);
        else
            v0 = com.google.android.finsky.api.l.a(p1.a.c);
        v1 = new com.google.android.finsky.activities.ef();
        v1.a(p0.dn(), v0);
        v1.c(p2);
        v1.a("finsky.DetailsDataBasedFragment.document", p1);
        v1.a(p3);
        v1.a("InlineAppPostPurchaseFragment.relaunchInitialDialogIntent", p4);
        return v1;
    }

    private final void aj() {
        this.aq.setVisibility(0);
        v10 = this.a.N().k;
        v1 = this.ah.c(v10);
        switch (v1.a) {
            case 0:
                this.ax.setVisibility(4);
                this.as.setVisibility(4);
                v0 = (PlayActionButtonV2)this.ar.findViewById(2131755593);
                v2 = com.google.android.finsky.m.a.bt().a(this.a.N().k);
                if (v2.s != 0 && v2.t == 0) {
                    v0.a(this.a.a.f, 2131952690, this.bp.a(this.a, this.bo.b(), this, this.bw));
                    v0.setActionStyle(0);
                    v0.setVisibility(0);
                }
                else {
                    v0.setVisibility(8);
                    if (v2.h == 0)
                        this.f(2131952242);
                    else
                        this.f(2131951700);
                }
                com.google.android.finsky.bg.ai.a(this.ar, 4);
                break;
            case 1:
                this.ar.setVisibility(4);
                this.ax.setVisibility(4);
                com.google.android.finsky.m.a.bV();
                com.google.android.finsky.av.a.a(this.bn, v1, this.at, this.au, this.av, this.aF);
                if (this.aD != 0)
                    com.google.android.finsky.av.a.a(v1, this.b(2131755608), this.b(2131755610), v10, com.google.android.finsky.m.a.o(), this.bw, this.getParentNode());
                this.aw.setOnClickListener(this);
                if (v1.a == 1)
                    this.at.setText(2131952075);
                this.as.setVisibility(0);
                if (this.aC != 0) {
                    if (com.google.android.finsky.av.a.a(v1) && com.google.android.finsky.av.a.b(v1) >= 100)
                        v0 = 1;
                    else
                        v0 = 0;
                    this.aE = v0;
                    if (this.aE != 0)
                        this.ap();
                }
                break;
            case 2:
                this.ar.setVisibility(4);
                this.ax.setVisibility(4);
                com.google.android.finsky.m.a.bV();
                com.google.android.finsky.av.a.a(this.bn, v1, this.at, this.au, this.av, this.aF);
                if (this.aD != 0)
                    com.google.android.finsky.av.a.a(v1, this.b(2131755608), this.b(2131755610), v10, com.google.android.finsky.m.a.o(), this.bw, this.getParentNode());
                this.aw.setOnClickListener(this);
                if (v1.a == 1)
                    this.at.setText(2131952075);
                this.as.setVisibility(0);
                if (this.aC != 0) {
                    if (com.google.android.finsky.av.a.a(v1) && com.google.android.finsky.av.a.b(v1) >= 100)
                        v0 = 1;
                    else
                        v0 = 0;
                    this.aE = v0;
                    if (this.aE != 0)
                        this.ap();
                }
                break;
            case 3:
                this.f(2131952321);
                break;
            case 4:
                this.f(2131953336);
                break;
            default:
                this.ar.setVisibility(4);
                this.ax.setVisibility(4);
                com.google.android.finsky.m.a.bV();
                com.google.android.finsky.av.a.a(this.bn, v1, this.at, this.au, this.av, this.aF);
                if (this.aD != 0)
                    com.google.android.finsky.av.a.a(v1, this.b(2131755608), this.b(2131755610), v10, com.google.android.finsky.m.a.o(), this.bw, this.getParentNode());
                this.aw.setOnClickListener(this);
                if (v1.a == 1)
                    this.at.setText(2131952075);
                this.as.setVisibility(0);
                if (this.aC != 0) {
                    if (com.google.android.finsky.av.a.a(v1) && com.google.android.finsky.av.a.b(v1) >= 100)
                        v0 = 1;
                    else
                        v0 = 0;
                    this.aE = v0;
                    if (this.aE != 0)
                        this.ap();
                }
                break;
        }
    }

    private final void ao() {
        this.bw.b(new com.google.android.finsky.d.d(this).a(2917));
        this.ah.a(this.a.N().k).a(com.google.android.finsky.z.h.a);
        this.as.setVisibility(4);
    }

    private final void ap() {
        if (this.cM_())
            this.aH = 1;
        else {
            v0 = this.B.a("cancel_confirmation");
            if (v0 != 0)
                this.B.a().a(v0).c();
        }
    }

    private final void f(int p0) {
        this.ar.setVisibility(4);
        this.as.setVisibility(4);
        this.ax.setText(this.bn.getResources().getString(p0));
        this.ax.setVisibility(0);
    }

    protected final boolean X() {
        return 1;
    }

    protected final int Z() {
        return 2130969001;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        this.al = (ViewGroup)this.b(2131756074);
        this.am = (TextView)this.al.findViewById(2131755365);
        this.az = (DocImageView)this.al.findViewById(2131755366);
        this.an = (ViewGroup)this.b(2131755621);
        this.ao = (DecoratedTextView)this.an.findViewById(2131755622);
        this.ap = (ViewGroup)this.b(2131756073);
        this.aq = (ViewGroup)this.b(2131755322);
        this.ar = (ViewGroup)this.aq.findViewById(2131755323);
        this.as = (ViewGroup)this.aq.findViewById(2131755324);
        this.at = (TextView)this.as.findViewById(2131755609);
        this.au = (TextView)this.as.findViewById(2131755607);
        this.av = (ProgressBar)this.as.findViewById(2131755380);
        this.aw = (ImageView)this.as.findViewById(2131755606);
        this.ax = (TextView)this.aq.findViewById(2131755325);
        this.ay = (TextView)this.b(2131756076);
        this.aA = this.i().getDimensionPixelSize(2131624630);
        v2 = com.google.android.finsky.m.a.dj();
        if (!v2.a(12640210))
            v0 = 1;
        else
            v0 = 0;
        this.aB = v0;
        this.aC = v2.a(12642300);
        if (v2.a(12642398))
            v0 = new com.google.android.finsky.av.d();
        else
            v0 = 0;
        this.aF = v0;
        this.aD = v2.a(12641184);
        com.google.android.finsky.m.a.bw().a(this);
        return super.a(p0, p1, p2);
    }

    public final void a(int p0, Bundle p1) {
        super.a(p0, p1);
        if (this.aC != 0 && p0 == 1)
            this.ao();
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        com.google.android.finsky.d.j.a(this.i, this.af, this, p0, this.bw);
    }

    public final void a(com.google.android.finsky.installqueue.m p0) {
 16:    if (p0.a().equals(this.a.N().k)) goto 19;
 18:    return;
 23:    switch (p0.c.d) {
            case 2:
 23:            goto 30;
            case 3:
 23:            goto 26;
            case 4:
 23:            goto 57;
            default:
        }
 26:    this.aj();
 29:    goto 18;
 32:    if (this.aG != 0) {
 38:        this.bw.a(this.aG);
 43:        this.a(this.aG);
 47:        this.aG = 0;
        }
 53:    this.h().finish();
 56:    goto 18;
 59:    if (this.aC != 0)
 61:        this.ap();
 64:    goto 26;
    }

    final View b(int p0) {
        return this.bt.findViewById(p0);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.aG = (Intent)this.q.getParcelable("InlineAppPostPurchaseFragment.relaunchInitialDialogIntent");
    }

    public final void d() {
        com.google.android.finsky.m.a.bw().b(this);
        if (this.aj != 0)
            this.aj.b(this.ak);
        super.d();
    }

    protected final void j_() {
        this.ap.setVisibility(0);
        this.am.setText(this.a.a.g);
        this.ao.setText(this.a.a.i);
        this.az.setScaleType(ImageView$ScaleType.FIT_START);
        v3 = this.az.getLayoutParams();
        v3.width = this.aA;
        v3.height = this.aA;
        com.google.android.finsky.m.a.bR();
        v3 = com.google.android.finsky.bg.af.a(this.a, this.aA, this.aA, DocImageView.a);
        this.az.a(v3.f, v3.i, this.bD);
        this.az.setFocusable(0);
        this.az.setContentDescription(com.google.android.finsky.bg.h.a(this.a.a.g, this.a.a.e, this.i()));
        v0 = (ViewGroup)this.R.findViewById(2131755519);
        if (v0 != 0)
            com.google.android.finsky.m.a.ch().a(this.a, v0);
        this.aj();
        if (this.l_() && this.ai == 0) {
            this.ai = this.a.q();
            if (this.ai != 0) {
                com.google.android.finsky.m.a.aO();
                this.aj = com.google.android.finsky.dfemodel.l.a(this.bo, this.ai.e, 0, 1);
                this.aj.a(this.ak);
                this.aj.n();
            }
        }
        if (this.aB != 0) {
            this.ay.setText(this.c(2131951948).toUpperCase());
            this.ay.setVisibility(0);
            this.ay.setOnClickListener(this);
        }
        else
            this.ay.setVisibility(8);
    }

    protected final int k_() {
        return 5401;
    }

    public final void m() {
        com.google.android.finsky.d.j.a(this.i, this.af, this, this.bw);
    }

    public final void o_() {
        this.af = com.google.android.finsky.d.j.j();
    }

    public final void onClick(View p0) {
        if (p0 == this.ay && this.aB != 0) {
            this.bw.b(new com.google.android.finsky.d.d(this).a(5403));
            this.h().finish();
        }
        else if (p0 == this.aw) {
            if (this.aC == 0)
                this.ao();
            else if (this.aE == 0) {
                v3 = new Object[1];
                v3[0] = this.a.a.g;
                this.B.a().a(new com.google.android.finsky.at.k().a(this.i().getString(2131952290, v3)).d(2131952289).e(2131952288).a(this, 1, 0).a(), "cancel_confirmation").c();
            }
        }
    }

    public final void u() {
        super.u();
        if (this.aH != 0) {
            this.aH = 0;
            this.ap();
        }
    }

}
