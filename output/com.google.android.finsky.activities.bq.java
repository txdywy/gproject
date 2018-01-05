package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.c.a.l;
import android.support.v4.a.d;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.support.v4.b.a.a;
import android.support.v4.os.a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.actionbuttons.ae;
import com.google.android.finsky.actionbuttons.j;
import com.google.android.finsky.actionbuttons.p;
import com.google.android.finsky.api.c;
import com.google.android.finsky.at.k;
import com.google.android.finsky.av.a;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.b.f;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.m;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ce.a;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.ch;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cx.b;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.a;
import com.google.android.finsky.ds.b;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.s;
import com.google.android.finsky.frameworkviews.t;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.installqueue.p;
import com.google.android.finsky.l.a;
import com.google.android.finsky.l.b;
import com.google.android.finsky.l.j;
import com.google.android.finsky.m;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.packagemanager.f;
import com.google.android.finsky.pagesystem.b;
import com.google.android.finsky.preregistration.g;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.c;
import com.google.android.finsky.utils.k;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.h;
import com.google.android.play.image.w;
import com.google.android.play.utils.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.activities.bq extends com.google.android.finsky.activities.cu implements com.google.android.finsky.cx.f, com.google.android.finsky.dn.e, com.google.android.finsky.installqueue.o, com.google.android.finsky.packagemanager.h, com.google.android.finsky.preregistration.p
{

    public static String p;
    public static boolean q;
    public final com.google.android.finsky.packagemanager.f a;
    public final com.google.android.finsky.installer.k b;
    public final com.google.android.finsky.installqueue.g c;
    public final com.google.android.finsky.l.a d;
    public final com.google.android.finsky.by.c e;
    public final com.google.android.finsky.cx.b f;
    public final com.google.android.finsky.ct.a g;
    public final com.google.android.finsky.b.f h;
    public boolean i;
    public boolean j;
    public boolean k;
    public com.google.android.finsky.cv.a.n l;
    public TextView m;
    public com.google.android.finsky.frameworkviews.s n;
    public com.google.android.finsky.activities.cg o;
    public List r;
    public List s;
    public final com.google.android.finsky.dn.a t;
    public final com.google.android.finsky.by.o u;

    bq(DfeToc p0, Account p1, com.google.android.finsky.packagemanager.f p2, com.google.android.finsky.installer.k p3, com.google.android.finsky.installqueue.g p4, com.google.android.finsky.l.a p5, com.google.android.finsky.by.c p6) {
        com.google.android.finsky.activities.cu(p0, p1);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        this.e = p6;
        this.t = com.google.android.finsky.m.a.l();
        this.f = com.google.android.finsky.m.a.bH();
        this.g = com.google.android.finsky.m.a.H();
        this.h = com.google.android.finsky.m.a.G();
        this.u = com.google.android.finsky.m.a.Y();
        this.o = com.google.android.finsky.activities.cg.a;
        com.google.android.finsky.activities.bq.a(p1);
    }

    private static synchronized void a(Account p0) {
        enter com.google.android.finsky.activities.bq;
        try {
            if (TextUtils.equals(com.google.android.finsky.activities.bq.p, p0.name)) {
            }
            else {
                try {
                    com.google.android.finsky.activities.bq.q = com.google.android.finsky.m.a.j(p0.name).a(12603301);
                    com.google.android.finsky.activities.bq.p = p0.name;
                }
                catch (Throwable ex) {
                    exit com.google.android.finsky.activities.bq;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.activities.bq;
            throw ex;
        }
        exit com.google.android.finsky.activities.bq;
    }

    private final void a(String p0) {
        if (this.D != 0 && this.D.N() != 0 && this.D.N().k.equals(p0)) {
            this.b();
            this.t();
        }
    }

    private static boolean a(com.google.android.finsky.installqueue.p p0) {
        if (com.google.android.finsky.m.a.dj().a(12607073) && p0.d == 196 && com.google.android.finsky.m.a.q().d())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void e(int p0) {
        this.T.a(new com.google.android.finsky.d.o(p0, this.T));
    }

    private final boolean f(String p0) {
        if (com.google.android.finsky.m.a.dj().a(12636357) && this.af != 0 && "com.google.android.instantapps.supervisor".equals(p0) && !android.support.v4.os.a.b())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void h() {
        if (this.i != 0) {
            this.a.b(this);
            this.a.a(this);
            if (this.j == 0) {
                com.google.android.finsky.m.a.bw().a(this);
                com.google.android.finsky.m.a.f().a(this);
                this.f.a(this);
                this.t.a(this);
                this.j = 1;
            }
        }
    }

    private final void s() {
        this.t();
        this.a(1);
    }

    private final void t() {
        v0 = 1;
        v2 = 8;
        if (this.m != 0) {
            if ((TextUtils.isEmpty(this.m.getText())) || this.l == 0)
                this.m.setVisibility(8);
            else {
                v3 = this.c.c(this.l.k);
                if (v3.a == 2 || v3.a == 3 || v3.a == 4)
                    v3 = 1;
                else
                    v3 = 0;
                if (v3 != 0)
                    this.m.setVisibility(8);
                else {
                    v4 = this.d.a(this.l.k);
                    if (v4 != 0)
                        v3 = v4.c;
                    else
                        v3 = 0;
                    if (v4 == 0 || v3 == 0)
                        v0 = 0;
                    if (v0 == 0)
                        v2 = 0;
                    this.m.setVisibility(v2);
                    if (v0 != 0 && new com.google.android.finsky.l.j(com.google.android.finsky.m.a.aN()).a(this.l).a(v3).a() && this.u.a(this.D, this.M, this.e.a(this.C)))
                        this.m.setVisibility(0);
                }
            }
        }
    }

    private final void u() {
        if (this.A.k())
            this.i();
    }

    public final void a() {
        this.a.b(this);
        if (this.j != 0) {
            com.google.android.finsky.m.a.bw().b(this);
            com.google.android.finsky.m.a.f().b(this);
            this.f.b(this);
            this.t.b(this);
            this.j = 0;
        }
        if (this.n != 0 && this.n.d.r != 0)
            this.n.d.r.dismiss();
        this.n = 0;
        super.a();
    }

    protected final void a(int p0) {
        super.a(p0);
        this.H.findViewById(2131755324).setVisibility(4);
        this.s();
    }

    public final void a(int p0, Bundle p1) {
        super.a(p0, p1);
        switch (p0) {
            case 1:
                if (this.b != 0) {
                    this.b.b(p1.getString("package_name"), 0);
                    this.i();
                }
                break;
            case 2:
                break;
            case 3:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(p0);
                FinskyLog.e("Unexpected requestCode %d", v1);
                break;
            case 4:
                this.f.a(this.A, p1.getString("package_name"), p1.getString("account_name"), p1.getBoolean("try_uninstall"));
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(p0);
                FinskyLog.e("Unexpected requestCode %d", v1);
                break;
        }
    }

    public final void a(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.play.image.w p2, com.google.android.finsky.pagesystem.b p3, boolean p4, String p5, String p6, boolean p7, com.google.android.finsky.d.ad p8, com.google.android.finsky.d.w p9) {
        super.a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        this.i = p4;
        this.h();
        this.g.a(p0, 0);
    }

    public final void a(Document p0, Document p1, boolean p2, String p3, boolean p4, Intent p5, View[] p6) {
  0:    super.a(p0, p1, p2, p3, p4, p5, p6);
  7:    this.l = p0.N();
 11:    if (com.google.android.finsky.activities.bq.q == 0) {
 50:        this.h();
 55:        this.r.clear();
 66:        this.r.add(p0.N().k);
 82:        if (com.google.android.finsky.m.a.dj().a(12643667)) {
 84:            v1 = p0.z();
 88:            if (v1 != 0) {
 92:                this.s.clear();
110:                v0 = 0;
111:                while (v0 < v1.d.length) {
121:                    if (com.google.android.finsky.utils.c.a(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.jR.b()), v1.d[v0].c))
127:                        this.s.add(v1.d[v0].c);
130:                    v0 = v0 + 1;
                    }
                }
            }
132:        return;
        }
 15:    if (this.m != 0) goto 154;
 26:    this.m = (TextView)this.c(2131755624);
 36:    v0 = com.google.android.finsky.m.a.d().c(this.D);
 42:    if (this.m == 0) {
 50:        this.h();
 55:        this.r.clear();
 66:        this.r.add(p0.N().k);
 82:        if (com.google.android.finsky.m.a.dj().a(12643667)) {
 84:            v1 = p0.z();
 88:            if (v1 != 0) {
 92:                this.s.clear();
110:                v0 = 0;
111:                while (v0 < v1.d.length) {
121:                    if (com.google.android.finsky.utils.c.a(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.jR.b()), v1.d[v0].c))
127:                        this.s.add(v1.d[v0].c);
130:                    v0 = v0 + 1;
                    }
                }
            }
132:        return;
        }
 48:    if (v0 > 0) goto 133;
 50:    this.h();
 55:    this.r.clear();
 66:    this.r.add(p0.N().k);
 82:    if (com.google.android.finsky.m.a.dj().a(12643667)) {
 84:        v1 = p0.z();
 88:        if (v1 != 0) {
 92:            this.s.clear();
110:            v0 = 0;
111:            while (v0 < v1.d.length) {
121:                if (com.google.android.finsky.utils.c.a(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.jR.b()), v1.d[v0].c))
127:                    this.s.add(v1.d[v0].c);
130:                v0 = v0 + 1;
                }
            }
        }
132:    return;
139:    v0 = com.google.android.finsky.bg.m.a(v0, this.m.getResources());
147:    if (!TextUtils.isEmpty(v0))
151:        this.m.setText(v0);
154:    this.t();
157:    goto 50;
    }

    final void a(PlayActionButtonV2 p0) {
        if (this.n != 0 && this.o != com.google.android.finsky.activities.cg.c) {
            v1 = new int[2];
            p0.getLocationInWindow(v1);
            v1[1] = v1[1] + 4;
            if (v1[0] > 0 && v1[1] > 0)
                v0 = new Rect(v1[0], v1[1], v1[0] + p0.getWidth(), v1[1] + p0.getHeight());
            else
                v0 = 0;
            if (v0 != 0) {
                if (this.o == com.google.android.finsky.activities.cg.b) {
                    this.n.a();
                    this.n.a(v0);
                }
                else
                    p0.postDelayed(new com.google.android.finsky.activities.br(this, v0), (long)p0.getContext().getResources().getInteger(2131820567));
            }
        }
    }

    public final void a(com.google.android.finsky.installqueue.m p0) {
        if (this.D != 0 && ((this.r.contains(p0.a())) || (this.s.contains(p0.a())) || com.google.android.finsky.m.a.dj().a(12625960))) {
            if (p0.g() && this.s.contains(p0.a()))
                this.e();
            this.u();
        }
    }

    final void a(String p0, String p1, boolean p2) {
        if (this.A.B.a("refund_confirm") == 0) {
            v1 = new com.google.android.finsky.at.k();
            v1.a(2131953333).d(2131953511).e(2131952618);
            v2 = new Bundle();
            v2.putString("package_name", p0);
            v2.putString("account_name", p1);
            v2.putBoolean("try_uninstall", p2);
            v1.a(this.A, 4, v2);
            v1.a().a(this.A.B, "refund_confirm");
        }
    }

    public final void a(String p0, boolean p1) {
        if (this.D.N().k.equals(p0)) {
            this.G = 0;
            this.i();
        }
    }

    protected final void a(boolean p0) {
        v13 = (PlayActionButtonV2)this.c(2131755597);
        v14 = (PlayActionButtonV2)this.c(2131755589);
        v15 = (PlayActionButtonV2)this.c(2131755588);
        v16 = (PlayActionButtonV2)this.c(2131755593);
        v5 = (PlayActionButtonV2)this.c(2131755591);
        v17 = (PlayActionButtonV2)this.c(2131755592);
        v18 = (PlayActionButtonV2)this.c(2131755595);
        v19 = (PlayActionButtonV2)this.c(2131755587);
        ((PlayActionButtonV2)this.c(2131755594)).setVisibility(8);
        v16.setVisibility(8);
        v13.setVisibility(8);
        v14.setVisibility(8);
        v15.setVisibility(8);
        v5.setVisibility(8);
        v17.setVisibility(8);
        v18.setVisibility(8);
        v19.setVisibility(8);
        if (this.n != 0 && this.n.d.r != 0)
            this.n.d.r.dismiss();
        if (this.J == 0 && p0 == 0) {
            v21 = this.D.N().k;
            v22 = com.google.android.finsky.m.a.bt().a(v21);
            v4 = 0;
            if (v22.b()) {
                v5.setVisibility(0);
                this.e(215);
                if (v22.q != 0)
                    v4 = 2131952992;
                else
                    v4 = 2131953292;
                v5.a(this.D.a.f, v4, new com.google.android.finsky.activities.by(this, v21, v22, this.u.a(v21)));
                v4 = 1;
            }
            else if (!v22.b() && v22.l != 0) {
                v5.setVisibility(0);
                this.e(216);
                v4 = 1;
                v5.a(this.D.a.f, 2131951956, new com.google.android.finsky.activities.bz(this));
            }
            else if (v22.q != 0) {
                v5.setVisibility(0);
                this.e(214);
                v4 = 1;
                v5.a(this.D.a.f, 2131952992, new com.google.android.finsky.activities.ca(this, v21, v22));
            }
            if (!v22.b(this.D)) {
                if (v22.a(this.D) && this.u.a(this.D, this.M, this.e.a(this.C)) && v22.u == 0 && !this.t.a(this.D)) {
                    v17.setVisibility(0);
                    this.e(217);
                    v17.a(this.D.a.f, 2131953338, this.z.a(this.C, this.D, 1, 0, this.L, 217, 0, this.S));
                    com.google.android.finsky.m.a.d().a(this.D);
                    v7 = v4 + 1;
                }
                else
                    v7 = v4;
            }
            if (v7 < 2) {
                v6 = 0;
                v16.setVisibility(0);
                v5 = -1;
                v4 = 0;
                if (v22.s != 0) {
                    if (v22.t != 0) {
                        v4 = 219;
                        v5 = 2131951948;
                        v6 = new com.google.android.finsky.activities.cb(this);
                    }
                    else {
                        v5 = 2131952690;
                        v6 = this.z.a(this.D, this.C, this.A, this.S);
                    }
                }
                else if (v22.u != 0 && v22.a()) {
                    v4 = 220;
                    v6 = new com.google.android.finsky.activities.cc(this);
                    v5 = 2131952111;
                }
                else
                    v16.setVisibility(8);
                if (v16.getVisibility() == 0) {
                    v7 = v7 + 1;
                    if (v4 != 0)
                        this.e(v4);
                    v16.a(this.D.a.f, v5, v6);
                    if (com.google.android.finsky.m.a.g().c(v21))
                        v16.setEnabled(0);
                }
            }
            v5 = v7;
            if (v22.h == 0 && !this.D.ae() && this.u.a(this.D, this.M, this.e) && !this.t.b(this.D) && !this.t.c(this.D, this.C)) {
                if (this.u.a(this.D, this.C) != 0)
                    v4 = 1;
                else
                    v4 = 0;
                if (com.google.android.finsky.activities.bq.a(this.c.c(v21))) {
                    v15.setVisibility(0);
                    this.e(2917);
                    v15.a(this.D.a.f, this.B.getString(2131951800), new com.google.android.finsky.activities.cd(this, v21));
                    v14.setVisibility(0);
                    this.e(2911);
                    v14.a(this.D.a.f, this.B.getString(2131952071), new com.google.android.finsky.activities.ce(this, v21, (ViewGroup)this.H.findViewById(2131755324)));
                    v5 = v5 + 2;
                }
                else {
                    v13.setVisibility(0);
                    v6 = this.c(v4);
                    this.e(v6);
                    v5 = v5 + 1;
                    this.h.a(v13);
                    v13.a(this.D.a.f, this.b(v4), new com.google.android.finsky.activities.cf(this, v6));
                    com.google.android.finsky.m.a.d().a(this.D);
                    if (com.google.android.finsky.m.a.g().c(v21))
                        v13.setEnabled(0);
                }
            }
            if (v22.h == 0 && !this.D.ae() && this.u.a(this.D, this.M, this.e) && !this.t.b(this.D) && !this.t.c(this.D, this.C) && this.af != 0 && !this.B.getPackageManager().queryIntentActivities(this.af, 131072).isEmpty() && com.google.android.finsky.m.a.dj().a(12636357)) {
                v19.setVisibility(0);
                this.e(2943);
                v5 = v5 + 1;
                v19.setContentDescription(this.B.getString(2131952327));
                v19.a(this.D.a.f, this.B.getString(2131952329), new com.google.android.finsky.activities.bt(this));
                if (com.google.android.finsky.m.a.dj().a(12637101))
                    com.google.android.finsky.actionbuttons.p.a(v19, android.support.v4.a.d.a(this.B, 2130837733));
                if (com.google.android.finsky.m.a.g().c(v21))
                    v19.setEnabled(0);
                else if (!com.google.android.finsky.m.a.dj().a(12637094)) {
                    if (this.n != 0)
                        this.a(v19);
                    else {
                        v4 = com.google.android.finsky.actionbuttons.ae.a(com.google.android.finsky.m.a.dj(), this.B);
                        if (v4 != 0)
                            v19.getViewTreeObserver().addOnGlobalLayoutListener(new com.google.android.finsky.activities.bw(this, v19, v4));
                    }
                }
            }
            if (v5 == 0 && this.D.ae()) {
                v4 = com.google.android.finsky.m.a.f();
                if (v4.a(this.D.a.c, this.N.b())) {
                    this.k = 1;
                    v18.setVisibility(0);
                    this.e(296);
                    v18.a(this.D.a.f, 2131952926, new com.google.android.finsky.activities.bu(this, v4));
                }
                else {
                    this.k = 0;
                    v18.setVisibility(0);
                    this.e(295);
                    v18.a(this.D.a.f, 2131952912, new com.google.android.finsky.activities.bv(this, v4));
                }
            }
            this.q();
            if (this.I.getVisibility() == 0)
                ((TextView)this.H.findViewById(2131755325)).setVisibility(4);
        }
    }

    public final void a(String[] p0) {
    }

    protected final void b() {
  7:    if (this.D.a.f != 3) {
 12:        v1 = new Object[2];
 25:        v1[0] = Integer.valueOf(this.D.a.f);
 30:        v1[1] = this.D;
 32:        FinskyLog.e("Unexpected doc backend %d, %s", v1);
 35:        super.b();
 38:        return;
        }
 45:    v3 = this.D.N().k;
 51:    if (TextUtils.isEmpty(v3))
 38:        return;
 63:    v7 = (ViewGroup)this.H.findViewById(2131755324);
 73:    v1 = (TextView)v7.findViewById(2131755609);
 93:    v4 = (ProgressBar)v7.findViewById(2131755380);
103:    v8 = (ImageView)v7.findViewById(2131755606);
107:    v0 = this.c.c(v3);
113:    switch (v0.a) {
            case 0:
113:            goto 199;
            case 1:
113:            goto 116;
            case 2:
113:            goto 116;
            case 3:
113:            goto 185;
            case 4:
113:            goto 192;
            default:
        }
126:    ((TextView)this.c(2131755365)).setSelected(0);
133:    if (!com.google.android.finsky.activities.bq.a(v0)) goto 205;
142:    v0 = (ViewGroup)this.c(2131755628);
144:    v0.removeAllViews();
162:    this.a(LayoutInflater.from(this.B), v0, this.B.getString(2131952074));
166:    v0.setVisibility(0);
170:    this.a(0);
174:    v7.setVisibility(4);
177:    v0 = 1;
178:    if (v0 == 0)
180:        super.b();
183:    return;
188:    this.a(2131952321);
191:    goto 177;
195:    this.a(2131953336);
198:    goto 177;
200:    v7.setVisibility(4);
203:    v0 = 0;
204:    goto 178;
205:    this.s();
210:    com.google.android.finsky.m.a.bV();
215:    com.google.android.finsky.av.a.a(this.B, v0, v1, (TextView)v7.findViewById(2131755607), v4);
221:    if (v0.a != 1) goto 283;
235:    v1.setText(com.google.android.finsky.m.a.ce().a(this.B));
249:    if (!com.google.android.finsky.m.a.dj().a(12643667)) goto 283;
253:    v6 = this.s.iterator();
261:    if (!v6.hasNext()) goto 283;
277:    switch (this.c.c((String)v6.next()).a) {
            case 1:
277:            goto 420;
            case 2:
277:            goto 420;
            case 3:
277:            goto 420;
            default:
        }
280:    v2 = 0;
281:    if (v2 == 0) goto 257;
283:    v9 = com.google.android.finsky.m.a.dj();
294:    if (v9.a(12641184))
316:        com.google.android.finsky.av.a.a(v0, v7.findViewById(2131755609), v7.findViewById(2131755610), v3, this.b, this.S, this.T);
326:    if (v9.a(12628775)) {
342:        v2 = android.support.v4.b.a.a.e(android.support.c.a.l.a(this.B.getResources(), 2130837796, 0));
357:        android.support.v4.b.a.a.a(v2.mutate(), com.google.android.finsky.bg.h.a(this.B, 3));
369:        ((ImageView)v7.findViewById(2131755612)).setImageDrawable(v2);
380:        v7.findViewById(2131755611).setVisibility(0);
        }
395:    if (v0.a == 2)
397:        v0 = 8;
        else
433:        v0 = 0;
399:    ((TextView)this.c(2131755624)).setVisibility(v0);
407:    v8.setOnClickListener(new com.google.android.finsky.activities.bs(this, v3, v7));
411:    v8.setVisibility(0);
415:    v7.setVisibility(0);
418:    goto 177;
423:    v1.setText(2131952316);
427:    v4.setIndeterminate(1);
430:    v2 = 1;
431:    goto 281;
    }

    public final void b(String p0) {
        if (this.D.N().k.equals(p0)) {
            this.G = 1;
            this.i();
        }
    }

    public final void b(String p0, boolean p1) {
        this.a(p0);
        if (this.f(p0))
            this.u();
    }

    protected final void c() {
        super.c();
        if (this.k != 0)
            ((PlayActionButtonV2)this.c(2131755595)).setActionStyle(2);
    }

    public final void c(String p0) {
        if (this.D != 0 && this.D.ae() && this.D.a.c.equals(p0))
            this.i();
    }

    public final void c(String p0, boolean p1) {
        if (this.f(p0))
            this.u();
    }

    public final void d(String p0) {
        this.a(p0);
    }

    public final void d(String p0, boolean p1) {
        if (this.D != 0 && this.D.a.c.equals(p0))
            this.i();
    }

    final void e() {
        if (this.D != 0) {
            v0 = new ArrayList(this.s.size() + 1);
            v0.add(this.D.cf());
            v0.addAll(this.s);
            this.c.a(v0).a(com.google.android.finsky.z.h.a);
        }
    }

    public final void e(String p0) {
    }

}
