package com.google.android.finsky.actionbuttons;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.c.a.l;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v4.b.a.a;
import android.support.v4.os.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.ap.a;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.as.a;
import com.google.android.finsky.at.k;
import com.google.android.finsky.at.n;
import com.google.android.finsky.av.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bd.a;
import com.google.android.finsky.bg.ai;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.by.a;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.ct.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cx.b;
import com.google.android.finsky.cz.a;
import com.google.android.finsky.cz.b;
import com.google.android.finsky.cz.c;
import com.google.android.finsky.cz.d;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.frameworkviews.s;
import com.google.android.finsky.frameworkviews.t;
import com.google.android.finsky.installer.b.a.e;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.installqueue.m;
import com.google.android.finsky.installqueue.p;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.p.a;
import com.google.android.finsky.p.c;
import com.google.android.finsky.packagemanager.f;
import com.google.android.finsky.preregistration.g;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.actionbuttons.c implements com.google.android.finsky.actionbuttons.ag, com.google.android.finsky.actionbuttons.an, com.google.android.finsky.at.m, com.google.android.finsky.by.d, com.google.android.finsky.cx.f, com.google.android.finsky.cz.d, com.google.android.finsky.dn.e, com.google.android.finsky.installqueue.o, com.google.android.finsky.p.h, com.google.android.finsky.packagemanager.h, com.google.android.finsky.preregistration.p
{

    public boolean A;
    public boolean B;
    public boolean C;
    public List D;
    public int E;
    public int F;
    public List G;
    public Intent H;
    public boolean I;
    public boolean J;
    public boolean K;
    public com.google.android.finsky.p.c L;
    public int M;
    public com.google.android.finsky.frameworkviews.s N;
    public com.google.android.finsky.actionbuttons.g O;
    public com.google.android.finsky.p.a P;
    public final Fragment a;
    public final com.google.android.finsky.d.ad b;
    public final com.google.android.finsky.navigationmanager.a c;
    public final Context d;
    public final String e;
    public final String f;
    public final com.google.android.finsky.d.ad g;
    public final com.google.android.finsky.actionbuttons.j h;
    public final com.google.android.finsky.ba.c i;
    public final com.google.android.finsky.ap.a j;
    public final com.google.android.finsky.installer.k k;
    public final com.google.android.finsky.installqueue.g l;
    public final com.google.android.finsky.by.c m;
    public final com.google.android.finsky.by.o n;
    public final com.google.android.finsky.packagemanager.f o;
    public final com.google.android.finsky.preregistration.g p;
    public final com.google.android.finsky.cx.b q;
    public final com.google.android.finsky.cz.a r;
    public final com.google.android.finsky.dfemodel.ab s;
    public final com.google.android.finsky.bg.k t;
    public Document u;
    public com.google.android.finsky.d.w v;
    public Account w;
    public DetailsSummaryDynamic x;
    public DetailsButtonLayout y;
    public boolean z;

    c(Fragment p0, com.google.android.finsky.d.ad p1, com.google.android.finsky.navigationmanager.a p2, Context p3, String p4, com.google.android.finsky.d.ad p5, int p6, Account p7, int p8, List p9, boolean p10, boolean p11, com.google.android.finsky.actionbuttons.j p12, com.google.android.finsky.ba.c p13, com.google.android.finsky.ap.a p14, com.google.android.finsky.av.a p15, com.google.android.finsky.installer.k p16, com.google.android.finsky.installqueue.g p17, com.google.android.finsky.by.c p18, com.google.android.finsky.by.o p19, com.google.android.finsky.packagemanager.f p20, com.google.android.finsky.ct.a p21, com.google.android.finsky.preregistration.g p22, com.google.android.finsky.cx.b p23, com.google.android.finsky.cz.a p24, com.google.android.finsky.dfemodel.ab p25, boolean p26, com.google.android.finsky.bg.k p27, com.google.android.finsky.p.c p28, com.google.android.finsky.p.a p29) {
        this.F = -1;
        this.G = 0;
        this.M = 1;
        this.c = p2;
        this.d = p3;
        this.a = p0;
        this.b = p1;
        this.e = p4;
        if (p7 != 0)
            this.f = p7.name;
        else
            this.f = 0;
        this.g = p5;
        this.E = p6;
        this.F = p8;
        this.G = p9;
        this.C = p10;
        this.B = p11;
        this.h = p12;
        this.i = p13;
        this.j = p14;
        this.k = p16;
        this.l = p17;
        this.m = p18;
        this.n = p19;
        this.o = p20;
        this.p = p22;
        this.q = p23;
        this.r = p24;
        this.s = p25;
        this.t = p27;
        this.K = p26;
        if (this == 0)
            FinskyLog.e("Trying to register a null Revokelistener.", new Object[0]);
        else if (this.r.b.contains(this))
            FinskyLog.e("Trying to register an already registered RevokeListener.", new Object[0]);
        else
            this.r.b.add(this);
        com.google.android.finsky.at.n.a(this);
        this.m.a(this);
        this.p.a(this);
        this.o.a(this);
        this.O = com.google.android.finsky.actionbuttons.g.a;
        p21.a(p3, 0);
        if (this.i.dj().a(12633045)) {
            this.L = p28;
            this.P = p29;
            this.L.c();
        }
    }

    private final void c(int p0) {
        v0 = (TextView)this.x.findViewById(2131755325);
        this.y.setVisibility(8);
        this.i();
        v0.setVisibility(0);
        v0.setText(this.d.getResources().getString(p0));
        if (this.u.a.f == 3)
            this.x.findViewById(2131755324).setVisibility(4);
    }

    private final void e() {
  0:    this.i();
 16:    if (this.u.a.f == 2)
 26:        this.y.setForceMultiLineLayout(this.h.a());
        else
148:        this.y.setForceMultiLineLayout(0);
 34:    if (this.E == 3)
 52:        this.y.setForceWideLayout(this.t.k(this.d.getResources()));
 59:    this.y.setUseMultiLineLayoutForSingleChild(this.B);
 84:    v7 = this.h.j.b(this.u, this.f);
 92:    switch (this.u.a.f) {
            case 1:
323:            v2 = this.h.a(v7, this.u, this.E);
516:            break;
            case 2:
349:            if (this.h.a())
351:                v1 = com.google.android.finsky.actionbuttons.j.d;
                else
362:                v1 = com.google.android.finsky.actionbuttons.j.c;
353:            v2 = new ArrayList(v1);
357:            this.h.a(v2, this.u, v7, 0);
516:            break;
            case 3:
168:            if (this.h.n.c(this.u.N().k).d == 196) {
172:                v1 = new ArrayList();
180:                v1.add(Integer.valueOf(4));
188:                v1.add(Integer.valueOf(3));
191:                v4 = v1;
                }
                else
298:                v4 = new ArrayList(com.google.android.finsky.actionbuttons.j.b);
193:            if (this.E == 4)
200:                v4.add(Integer.valueOf(2));
209:            if (com.google.android.finsky.as.a.b(this.h.i))
217:                v4.add(Integer.valueOf(24));
220:            this.h.a(v4, this.u, v7, this.H);
225:            v3 = new ArrayList();
229:            v2 = 0;
230:            while (v2 < v4.size()) {
242:                v5 = ((Integer)v4.get(v2)).intValue();
256:                if (com.google.android.finsky.actionbuttons.j.e.containsKey(Integer.valueOf(v5)) && ((Integer)com.google.android.finsky.actionbuttons.j.e.get(Integer.valueOf(v5))).intValue() >= v3.size())
284:                    v3.add(Integer.valueOf(v5));
310:                else if (!com.google.android.finsky.actionbuttons.j.e.containsKey(Integer.valueOf(v5)))
316:                    v3.add(Integer.valueOf(v5));
289:                v2 = v2 + 1;
                }
320:            v2 = v3;
516:            break;
            case 4:
365:            v2 = this.h.a(v7, this.u, this.E);
516:            break;
            case 5:
 99:            v2 = new ArrayList(com.google.android.finsky.actionbuttons.j.a);
103:            this.h.a(v2, this.u, v7, 0);
516:            break;
            case 6:
329:            v2 = this.h.a(v7, this.u, this.E);
338:            v2.remove(Integer.valueOf(4));
516:            break;
            default:
 99:            v2 = new ArrayList(com.google.android.finsky.actionbuttons.j.a);
103:            this.h.a(v2, this.u, v7, 0);
516:            break;
        }
110:    if (this.G != 0 && this.G.size() > 0) {
122:        v1 = 0;
123:        while (v1 < this.G.size()) {
141:            v2.remove(this.G.get(v1));
144:            v1 = v1 + 1;
            }
        }
146:    goto 371;
447:    this.D = this.h.a(v2, this.v, this.a, this.b, this.u, this.g, this.e, this.d, this.c, this.E, this.f, this.F, this.C, this.K, this.H, this, this.M);
450:    v3 = 0;
451:    while (v3 < this.D.size()) {
469:        v1 = (com.google.android.finsky.actionbuttons.a)this.D.get(v3);
473:        if (v1 instanceof com.google.android.finsky.actionbuttons.t)
481:            ((com.google.android.finsky.actionbuttons.t)v1).l = this.z;
489:        else if (v1 instanceof com.google.android.finsky.actionbuttons.ae) {
495:            if (this.h())
501:                ((com.google.android.finsky.actionbuttons.ae)v1).j = this;
            }
485:        v3 = v3 + 1;
        }
512:    this.y.a(v2, this.D);
    }

    private final void f() {
        this.g();
        if (this.y.getVisibility() == 0)
            ((TextView)this.x.findViewById(2131755325)).setVisibility(4);
    }

    private final void f(String p0) {
        if (this.u != 0 && this.u.N() != 0 && this.u.N().k.equals(p0))
            this.b();
    }

    private final void g() {
        com.google.android.finsky.bg.ai.a(this.y, 4);
    }

    private final boolean h() {
        v0 = this.i.dj();
        if (v0.a(12636357) && ((v0.a(12637095)) || (v0.a(12637096)) || (v0.a(12637097)) || (v0.a(12637098)) || (v0.a(12637099)) || v0.a(12637100)))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    private final void i() {
        if (this.N != 0 && this.N.d.r != 0)
            this.N.d.r.dismiss();
    }

    public final void a() {
  3:    v1 = this.u.N();
  7:    if (v1 != 0 && v1.aw_()) {
 17:        this.q.b(this);
 22:        this.l.b(this);
        }
 29:    this.r.b.remove(this);
 34:    com.google.android.finsky.at.n.a.remove(this);
 39:    this.m.b(this);
 44:    this.p.b(this);
 49:    this.o.b(this);
 65:    if (this.i.dj().a(12633045) && this.L != 0 && this.u.a.e == 64 && this.J != 0) {
 87:        this.L.b(this);
 92:        this.L.b();
105:        this.P.a(this.v, this.u.a.D);
110:        this.L.c();
113:        this.J = 0;
        }
115:    this.i();
120:    if (this.D == 0)
154:        return;
122:    v1 = 0;
123:    while (true) {
129:        if (v1 >= this.D.size())
154:            return;
137:        v0 = (com.google.android.finsky.actionbuttons.a)this.D.get(v1);
141:        if (v0 instanceof com.google.android.finsky.actionbuttons.ae)
141:            break;
157:        v1 = v1 + 1;
        }
147:    if (!this.h()) goto 155;
152:    ((com.google.android.finsky.actionbuttons.ae)v0).j = 0;
    }

    public final void a(int p0, Bundle p1) {
        if (this.D != 0) {
            v2 = 0;
            while (v2 < this.D.size()) {
                v0 = (com.google.android.finsky.actionbuttons.a)this.D.get(v2);
                if (p0 == 7 && v0 instanceof com.google.android.finsky.actionbuttons.t) {
                    v0 = (com.google.android.finsky.actionbuttons.t)v0;
                    if (v0.f.a.c.equals(((Document)p1.getParcelable("doc")).a.c)) {
                        if (p0 == 7) {
                            v4 = v0.i.a(p1.getString("ownerAccountName"));
                            v1 = 0;
                            while (v1 < v0.k.b.size()) {
                                ((com.google.android.finsky.cz.d)v0.k.b.get(v1)).a(v0.f.a.c);
                                v1 = v1 + 1;
                            }
                            v4.a(v0.f.a.c, v0.f.d(), new com.google.android.finsky.cz.b(v0.k, v4, new com.google.android.finsky.actionbuttons.v(v0), v0.f.a.c), new com.google.android.finsky.cz.c(v0.k, new com.google.android.finsky.actionbuttons.u(v0), v0.f.a.c));
                        }
                    }
                }
                else if (p0 == 1 && v0 instanceof com.google.android.finsky.actionbuttons.as) {
                    if (((com.google.android.finsky.actionbuttons.as)v0).h.equals(p1.getString("package_name"))) {
                        if (p0 == 1)
                            ((com.google.android.finsky.actionbuttons.as)v0).k.b(p1.getString("package_name"), 0);
                    }
                }
                else if (p0 == 4) {
                    if (v0 instanceof com.google.android.finsky.actionbuttons.am) {
                        if (((com.google.android.finsky.actionbuttons.am)v0).g.equals(p1.getString("package_name"))) {
                            if (p0 == 4)
                                ((com.google.android.finsky.actionbuttons.am)v0).j.a(((com.google.android.finsky.actionbuttons.am)v0).i, p1.getString("package_name"), p1.getString("account_name"), p1.getBoolean("try_uninstall"));
                        }
                    }
                }
                v2 = v2 + 1;
            }
        }
    }

    public final void a(Rect p0, PlayActionButtonV2 p1, String p2) {
        if (this.O != com.google.android.finsky.actionbuttons.g.c) {
            if (this.N == 0) {
                this.N = com.google.android.finsky.actionbuttons.ae.a(p1, p2);
                this.N.a(new com.google.android.finsky.actionbuttons.d(this));
            }
            if (this.O == com.google.android.finsky.actionbuttons.g.b) {
                this.N.a();
                this.N.a(p0);
            }
            else
                p1.postDelayed(new com.google.android.finsky.actionbuttons.e(this, p0), (long)p1.getContext().getResources().getInteger(2131820567));
        }
    }

    public final void a(com.google.android.finsky.by.a p0) {
        this.b();
    }

    public final void a(Document p0, Document p1, com.google.android.finsky.d.w p2, DetailsSummaryDynamic p3) {
        this.a(p0, p1, p2, p3, 0);
    }

    public final void a(Document p0, Document p1, com.google.android.finsky.d.w p2, DetailsSummaryDynamic p3, Intent p4) {
        this.u = p0;
        this.v = p2;
        this.w = this.j.b(p0, this.f);
        this.x = p3;
        this.y = (DetailsButtonLayout)this.x.findViewById(2131755323);
        this.H = p4;
        v0 = this.u.N();
        if (this.I == 0 && v0 != 0 && v0.aw_()) {
            this.q.a(this);
            this.l.a(this);
            this.I = 1;
        }
        if (this.i.dj().a(12633045) && this.L != 0 && this.J == 0 && this.u.a.e == 64) {
            this.L.a(this);
            this.J = 1;
        }
        this.b();
    }

    public final void a(com.google.android.finsky.installqueue.m p0) {
        if (p0.a().equals(this.u.N().k) || this.i.dj().a(12625960)) {
            if (p0.c.d == 2) {
                ((ViewGroup)this.x.findViewById(2131755324)).setVisibility(0);
                this.y.setVisibility(8);
                this.i();
            }
            this.b();
        }
    }

    public final void a(String p0) {
        if (p0.equals(this.u.a.c)) {
            this.z = 1;
            this.b();
        }
    }

    public final void a(String p0, int p1) {
        if (p0.equals(this.u.a.c) && p1 == 1) {
            this.z = 0;
            this.b();
        }
    }

    public final void a(String p0, boolean p1) {
        if (p0.equals(this.u.N().k)) {
            this.A = 0;
            this.b();
        }
    }

    public final void a(String[] p0) {
    }

    public final void ab_() {
    }

    public final void b() {
        if (this.n.a(this.u, this.s.dn(), this.m.a(this.w))) {
            if (this.A != 0)
                this.c(2131952995);
            else {
                if (this.u.a.f == 3) {
                    v3 = this.u.N().k;
                    v7 = (ViewGroup)this.x.findViewById(2131755324);
                    v0 = this.l.c(v3);
                    switch (v0.a) {
                        case 0:
                            v7.setVisibility(4);
                            this.e();
                            this.f();
                            break;
                        case 1:
                            if (this.h.a(v0)) {
                                this.e();
                                v7.setVisibility(4);
                                this.f();
                            }
                            else {
                                v1 = (TextView)v7.findViewById(2131755609);
                                com.google.android.finsky.av.a.a(this.d, v0, v1, (TextView)v7.findViewById(2131755607), (ProgressBar)v7.findViewById(2131755380));
                                if (v0.a == 1)
                                    v1.setText(this.h.a(this.d));
                                v8 = this.i.dj();
                                if (v8.a(12641184))
                                    com.google.android.finsky.av.a.a(v0, v7.findViewById(2131755608), v7.findViewById(2131755610), v3, this.k, this.v, this.g);
                                if (v8.a(12628775)) {
                                    if (this.E == 3) {
                                        v1 = android.support.v4.b.a.a.e(android.support.c.a.l.a(this.d.getResources(), 2130837796, 0));
                                        android.support.v4.b.a.a.a(v1.mutate(), com.google.android.finsky.bg.h.a(this.d, 3));
                                        ((ImageView)v7.findViewById(2131755612)).setImageDrawable(v1);
                                        v7.findViewById(2131755611).setVisibility(0);
                                    }
                                }
                                ((ImageView)v7.findViewById(2131755606)).setOnClickListener(new com.google.android.finsky.actionbuttons.f(this, v3, v7));
                                v7.setVisibility(0);
                                this.y.setVisibility(8);
                                this.i();
                            }
                            break;
                        case 2:
                            if (this.h.a(v0)) {
                                this.e();
                                v7.setVisibility(4);
                                this.f();
                            }
                            else {
                                v1 = (TextView)v7.findViewById(2131755609);
                                com.google.android.finsky.av.a.a(this.d, v0, v1, (TextView)v7.findViewById(2131755607), (ProgressBar)v7.findViewById(2131755380));
                                if (v0.a == 1)
                                    v1.setText(this.h.a(this.d));
                                v8 = this.i.dj();
                                if (v8.a(12641184))
                                    com.google.android.finsky.av.a.a(v0, v7.findViewById(2131755608), v7.findViewById(2131755610), v3, this.k, this.v, this.g);
                                if (v8.a(12628775)) {
                                    if (this.E == 3) {
                                        v1 = android.support.v4.b.a.a.e(android.support.c.a.l.a(this.d.getResources(), 2130837796, 0));
                                        android.support.v4.b.a.a.a(v1.mutate(), com.google.android.finsky.bg.h.a(this.d, 3));
                                        ((ImageView)v7.findViewById(2131755612)).setImageDrawable(v1);
                                        v7.findViewById(2131755611).setVisibility(0);
                                    }
                                }
                                ((ImageView)v7.findViewById(2131755606)).setOnClickListener(new com.google.android.finsky.actionbuttons.f(this, v3, v7));
                                v7.setVisibility(0);
                                this.y.setVisibility(8);
                                this.i();
                            }
                            break;
                        case 3:
                            this.c(2131952321);
                            break;
                        case 4:
                            this.c(2131953336);
                            break;
                        default:
                            if (this.h.a(v0)) {
                                this.e();
                                v7.setVisibility(4);
                                this.f();
                            }
                            else {
                                v1 = (TextView)v7.findViewById(2131755609);
                                com.google.android.finsky.av.a.a(this.d, v0, v1, (TextView)v7.findViewById(2131755607), (ProgressBar)v7.findViewById(2131755380));
                                if (v0.a == 1)
                                    v1.setText(this.h.a(this.d));
                                v8 = this.i.dj();
                                if (v8.a(12641184))
                                    com.google.android.finsky.av.a.a(v0, v7.findViewById(2131755608), v7.findViewById(2131755610), v3, this.k, this.v, this.g);
                                if (v8.a(12628775)) {
                                    if (this.E == 3) {
                                        v1 = android.support.v4.b.a.a.e(android.support.c.a.l.a(this.d.getResources(), 2130837796, 0));
                                        android.support.v4.b.a.a.a(v1.mutate(), com.google.android.finsky.bg.h.a(this.d, 3));
                                        ((ImageView)v7.findViewById(2131755612)).setImageDrawable(v1);
                                        v7.findViewById(2131755611).setVisibility(0);
                                    }
                                }
                                ((ImageView)v7.findViewById(2131755606)).setOnClickListener(new com.google.android.finsky.actionbuttons.f(this, v3, v7));
                                v7.setVisibility(0);
                                this.y.setVisibility(8);
                                this.i();
                            }
                            break;
                    }
                }
                else {
                    this.e();
                    this.g();
                }
                if (this.x.b != 0)
                    this.x.b.a();
            }
        }
    }

    public final void b(int p0) {
        this.M = p0;
        if (p0 == 9) {
            v0 = new com.google.android.finsky.at.k();
            v0.a(com.google.android.finsky.bd.a.al.intValue()).d(2131952688);
            v0.a().a(this.a.B, "sample_error_dialog");
        }
        else
            this.b();
        if (this.P != 0)
            this.P.a(this.v, this.u.a.D);
    }

    public final void b(int p0, Bundle p1) {
    }

    public final void b(String p0) {
        if (p0.equals(this.u.N().k)) {
            this.A = 1;
            this.b();
        }
    }

    public final void b(String p0, boolean p1) {
        this.f(p0);
        if (this.i.dj().a(12636357) && this.H != 0 && "com.google.android.instantapps.supervisor".equals(p0) && !android.support.v4.os.a.b())
            this.b();
    }

    public final void c(String p0) {
        if (this.u != 0 && this.u.ae() && this.u.a.c.equals(p0))
            this.b();
    }

    public final void c(String p0, boolean p1) {
        if (this.i.dj().a(12636357) && this.H != 0 && "com.google.android.instantapps.supervisor".equals(p0) && !android.support.v4.os.a.b())
            this.b();
    }

    public final void d() {
        if (this.i.dj().a(12633045) && this.L != 0 && this.u.a.e == 64 && this.u.bO())
            this.L.a(this.u.bP());
    }

    public final void d(String p0) {
        this.f(p0);
    }

    public final void d(String p0, boolean p1) {
        if (this.u.a.c.equals(p0))
            this.b();
    }

    public final void e(String p0) {
    }

    public final void f_(int p0) {
    }

}
