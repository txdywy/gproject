package com.google.android.finsky.activities;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.actionbuttons.DetailsSummaryDynamic;
import com.google.android.finsky.actionbuttons.c;
import com.google.android.finsky.actionbuttons.j;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.m;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.n;
import com.google.android.finsky.cx.b;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dn.a;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
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
import com.google.android.play.image.w;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.activities.ch extends com.google.android.finsky.activities.dc implements com.google.android.finsky.cx.f, com.google.android.finsky.installqueue.o, com.google.android.finsky.packagemanager.h, com.google.android.finsky.preregistration.p
{

    public static String i;
    public static boolean j;
    public final com.google.android.finsky.installqueue.g b;
    public final com.google.android.finsky.l.a c;
    public final com.google.android.finsky.by.c d;
    public boolean e;
    public boolean f;
    public com.google.android.finsky.cv.a.n g;
    public final com.google.android.finsky.packagemanager.f g_;
    public TextView h;
    public List k;
    public final com.google.android.finsky.dn.a l;
    public final com.google.android.finsky.by.o u;

    ch(DfeToc p0, Account p1, com.google.android.finsky.packagemanager.f p2, com.google.android.finsky.installqueue.g p3, com.google.android.finsky.l.a p4, com.google.android.finsky.by.c p5) {
        com.google.android.finsky.activities.dc(p0, p1);
        this.k = new ArrayList();
        this.g_ = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        com.google.android.finsky.activities.ch.a(p1);
        this.l = com.google.android.finsky.m.a.l();
        this.u = com.google.android.finsky.m.a.Y();
    }

    private static synchronized void a(Account p0) {
        enter com.google.android.finsky.activities.ch;
        try {
            if (TextUtils.equals(com.google.android.finsky.activities.ch.i, p0.name)) {
            }
            else {
                try {
                    com.google.android.finsky.activities.ch.j = com.google.android.finsky.m.a.j(p0.name).a(12603301);
                    com.google.android.finsky.activities.ch.i = p0.name;
                }
                catch (Throwable ex) {
                    exit com.google.android.finsky.activities.ch;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.activities.ch;
            throw ex;
        }
        exit com.google.android.finsky.activities.ch;
    }

    private final void f(String p0) {
        if (this.D != 0 && this.D.N() != 0 && this.D.N().k.equals(p0)) {
            this.b();
            this.u();
        }
    }

    private final void s() {
        if (this.e != 0) {
            this.g_.b(this);
            this.g_.a(this);
            if (this.f == 0) {
                com.google.android.finsky.m.a.bw().a(this);
                com.google.android.finsky.m.a.f().a(this);
                com.google.android.finsky.m.a.bH().a(this);
                this.f = 1;
            }
        }
    }

    private final void t() {
        this.u();
        this.a(1);
    }

    private final void u() {
        v0 = 1;
        v2 = 8;
        if (this.h != 0) {
            if ((TextUtils.isEmpty(this.h.getText())) || this.g == 0)
                this.h.setVisibility(8);
            else {
                v3 = this.b.c(this.g.k);
                if (v3.a == 2 || v3.a == 3 || v3.a == 4)
                    v3 = 1;
                else
                    v3 = 0;
                if (v3 != 0)
                    this.h.setVisibility(8);
                else {
                    v4 = this.c.a(this.g.k);
                    if (v4 != 0)
                        v3 = v4.c;
                    else
                        v3 = 0;
                    if (v4 == 0 || v3 == 0)
                        v0 = 0;
                    if (v0 == 0)
                        v2 = 0;
                    this.h.setVisibility(v2);
                    if (v0 != 0 && new com.google.android.finsky.l.j(com.google.android.finsky.m.a.aN()).a(this.g).a(v3).a() && this.u.a(this.D, this.M, this.d.a(this.C)))
                        this.h.setVisibility(0);
                }
            }
        }
    }

    public final void a() {
        this.g_.b(this);
        if (this.f != 0) {
            com.google.android.finsky.m.a.bw().b(this);
            com.google.android.finsky.m.a.f().b(this);
            com.google.android.finsky.m.a.bH().b(this);
            this.f = 0;
        }
        super.a();
    }

    protected final void a(int p0) {
        super.a(p0);
        this.H.findViewById(2131755324).setVisibility(4);
        this.t();
    }

    public final void a(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.play.image.w p2, com.google.android.finsky.pagesystem.b p3, boolean p4, String p5, String p6, boolean p7, com.google.android.finsky.d.ad p8, com.google.android.finsky.d.w p9) {
        super.a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
        this.e = p4;
        this.s();
    }

    public final void a(Document p0, Document p1, boolean p2, String p3, boolean p4, Intent p5, View[] p6) {
  0:    super.a(p0, p1, p2, p3, p4, p5, p6);
  7:    this.g = p0.N();
 11:    if (com.google.android.finsky.activities.ch.j == 0) {
 50:        this.s();
 55:        this.k.clear();
 66:        this.k.add(p0.N().k);
 69:        return;
        }
 15:    if (this.h != 0) goto 91;
 26:    this.h = (TextView)this.c(2131755624);
 36:    v0 = com.google.android.finsky.m.a.d().c(this.D);
 42:    if (this.h == 0) {
 50:        this.s();
 55:        this.k.clear();
 66:        this.k.add(p0.N().k);
 69:        return;
        }
 48:    if (v0 > 0) goto 70;
 50:    this.s();
 55:    this.k.clear();
 66:    this.k.add(p0.N().k);
 69:    return;
 76:    v0 = com.google.android.finsky.bg.m.a(v0, this.h.getResources());
 84:    if (!TextUtils.isEmpty(v0))
 88:        this.h.setText(v0);
 91:    this.u();
 94:    goto 50;
    }

    public final void a(com.google.android.finsky.installqueue.m p0) {
        if (this.D != 0 && ((this.k.contains(p0.a())) || com.google.android.finsky.m.a.dj().a(12625960)) && this.A.k())
            this.i();
    }

    public final void a(String p0, boolean p1) {
        if (this.D.N().k.equals(p0)) {
            this.G = 0;
            this.i();
        }
    }

    protected final void a(boolean p0) {
        this.I.setVisibility(8);
        if (this.J == 0 && p0 == 0) {
            v0 = this.D.N().k;
            v1 = com.google.android.finsky.m.a.bt().a(v0);
            if (((v1.b(this.D)) || v1.a(this.D)) && this.u.a(this.D, this.M, this.d.a(this.C)) && v1.u == 0 && !this.l.a(this.D))
                com.google.android.finsky.m.a.d().a(this.D);
            if (v1.h == 0 && !this.D.ae() && this.u.a(this.D, this.M, this.d) && !this.l.b(this.D) && !this.l.c(this.D, this.C) && !com.google.android.finsky.m.a.ce().a(this.b.c(v0)))
                com.google.android.finsky.m.a.d().a(this.D);
            this.m.a(this.D, this.E, this.A.bw, this.H, this.af);
            this.q();
            if (this.I.getVisibility() == 0)
                ((TextView)this.H.findViewById(2131755325)).setVisibility(4);
        }
    }

    public final void a(String[] p0) {
    }

    protected final void b() {
  9:    if (this.D.a.f == 3) goto 39;
 14:    v2 = new Object[2];
 26:    v2[0] = Integer.valueOf(this.D.a.f);
 30:    v2[1] = this.D;
 32:    FinskyLog.e("Unexpected doc backend %d, %s", v2);
 35:    super.b();
 38:    return;
 45:    v2 = this.D.N().k;
 51:    if (TextUtils.isEmpty(v2))
 38:        return;
 62:    v0 = (ViewGroup)this.H.findViewById(2131755324);
 67:    v0.findViewById(2131755609);
 73:    v0.findViewById(2131755607);
 79:    v0.findViewById(2131755380);
 85:    v0.findViewById(2131755606);
 90:    v2 = this.b.c(v2);
 96:    switch (v2.a) {
            case 0:
 96:            goto 180;
            case 1:
 96:            goto 99;
            case 2:
 96:            goto 99;
            case 3:
 96:            goto 166;
            case 4:
 96:            goto 173;
            default:
        }
108:    ((TextView)this.c(2131755365)).setSelected(0);
121:    if (com.google.android.finsky.m.a.ce().a(v2)) {
130:        v0 = (ViewGroup)this.c(2131755628);
132:        v0.removeAllViews();
150:        this.a(LayoutInflater.from(this.B), v0, this.B.getString(2131952074));
153:        v0.setVisibility(0);
156:        this.a(0);
        }
        else {
186:        this.t();
203:        this.m.a(this.D, this.E, this.A.bw, this.H, this.af);
        }
159:    v0 = 1;
160:    if (v0 == 0)
162:        super.b();
165:    goto 38;
169:    this.a(2131952321);
172:    goto 159;
176:    this.a(2131953336);
179:    goto 159;
181:    v0.setVisibility(4);
184:    v0 = 0;
185:    goto 160;
    }

    public final void b(String p0) {
        if (this.D.N().k.equals(p0)) {
            this.G = 1;
            this.i();
        }
    }

    public final void b(String p0, boolean p1) {
        this.f(p0);
    }

    public final void c(String p0) {
        if (this.D != 0 && this.D.ae() && this.D.a.c.equals(p0))
            this.i();
    }

    public final void c(String p0, boolean p1) {
    }

    public final void d(String p0) {
        this.f(p0);
    }

    public final void e(String p0) {
    }

}
