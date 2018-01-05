package com.google.android.finsky.bb.a;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.bb.a;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.bb.d;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.l;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.finsky.dfe.h.a.j;
import com.google.wireless.android.finsky.dfe.h.a.o;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.bb.a.a implements com.google.android.finsky.bb.b, com.google.android.finsky.dx.h
{

    public final Context a;
    public final com.google.android.finsky.dx.a b;
    public final com.google.android.finsky.ba.c c;
    public final com.google.android.finsky.dfemodel.ab d;
    public final com.google.android.finsky.accounts.c e;
    public final com.google.android.finsky.by.c f;
    public final com.google.android.finsky.api.h g;
    public final com.google.android.finsky.by.l h;
    public final com.google.android.finsky.by.o i;
    public Map j;
    public com.google.android.finsky.bb.a.e k;

    a(Context p0, com.google.android.finsky.dx.a p1, com.google.android.finsky.ba.c p2, com.google.android.finsky.dfemodel.ab p3, com.google.android.finsky.accounts.c p4, com.google.android.finsky.by.c p5, com.google.android.finsky.api.h p6, com.google.android.finsky.by.l p7, com.google.android.finsky.by.o p8) {
        this.j = new HashMap();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
        this.f = p5;
        this.g = p6;
        this.h = p7;
        this.i = p8;
        this.b.a(this);
    }

    private final com.google.android.finsky.bb.a.e g() {
        if (this.k == 0)
            this.k = new com.google.android.finsky.bb.a.e(this.f, this.g, this.e, this, this.h, this.i);
        return this.k;
    }

    public final void P_() {
        this.j.clear();
    }

    public final com.google.android.finsky.bb.a a(Context p0, Document p1) {
        v1 = this.g();
        v0 = v1.d.cY();
        if (v0 != 0) {
            v3 = v1.e.a(v0.name);
            v2 = v1.g.b(p1.d(), v1.b.a(v0));
            v4 = v3.a(p1.a.f);
            v5 = v3.g();
            v3 = v3.b();
            if (v3 == 0) {
                v0 = 0;
                return v0;
            }
            if (v4 == 0) {
                v0 = 0;
                return v0;
            }
            if (v2 == 0) {
                v0 = 0;
                return v0;
            }
            v0 = v1.e.a(v0.name);
            v7 = v0.l();
            if (v3.b == 1 || v7 != 0) {
                if (!TextUtils.isEmpty(v2.r)) {
                    v1 = v1.e.c().a(v2.r);
                    if (v1 == 0)
                        v3 = p0.getString(2131952186);
                    else {
                        v4 = new Object[1];
                        v4[0] = v1.d.g;
                        v3 = p0.getString(2131952187, v4);
                    }
                    v0 = new com.google.android.finsky.bb.a(p1, v2, v3, 0, 1, 0);
                    return v0;
                }
                if (v2.s == 1 || p1.a.H != 0) {
                    v4 = 1;
                    v6 = v1.e.a(com.google.android.finsky.aa.a.aC);
                    if (v7 == 0) {
                        if (v4 != 1 || v5 != 0)
                            v0 = new com.google.android.finsky.bb.a(p1, v2, p0.getString(2131952188), v4, v2.q, v6);
                        else
                            v0 = 0;
                        return v0;
                    }
                    if (v2.t <= v3.d) {
                        if (v4 != 1 || v5 != 0)
                            v0 = new com.google.android.finsky.bb.a(p1, v2, p0.getString(2131952188), v4, v2.q, v6);
                        else
                            v0 = 0;
                        return v0;
                    }
                    if (!v0.m()) {
                        v4 = 2;
                        v6 = 0;
                        if (v4 != 1 || v5 != 0)
                            v0 = new com.google.android.finsky.bb.a(p1, v2, p0.getString(2131952188), v4, v2.q, v6);
                        else
                            v0 = 0;
                        return v0;
                    }
                }
            }
        }
        v0 = 0;
        return v0;
    }

    public final com.google.android.finsky.bb.c a(String p0) {
        if (!this.j.containsKey(p0))
            this.j.put(p0, new com.google.android.finsky.bb.a.d(this.b, this.c, p0));
        return (com.google.android.finsky.bb.c)this.j.get(p0);
    }

    public final void a(Intent p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.finsky.d.w p2) {
        new Handler().post(new com.google.android.finsky.bb.a.b(this, p0, p1, p2));
    }

    public final void a(Fragment p0, com.google.android.finsky.bb.a p1, boolean p2) {
        v1 = this.g();
        v2 = v1.d.cY();
        if (v2 != 0) {
            p1.e = p2;
            v4 = new com.google.android.finsky.bb.a.f(v1, p0, v2, p1);
            v1.c.a(v2.name).a(p1.a.a.c, p1.b.m, p2, v4, v4);
        }
    }

    public final void a(com.google.android.finsky.bb.d p0) {
        this.g().a.add(p0);
    }

    public final boolean a(com.google.android.finsky.aa.n p0) {
        v0 = (Integer)p0.a();
        if (v0.intValue() < 3) {
            p0.a(Integer.valueOf(v0.intValue() + 1));
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

    public final void b(com.google.android.finsky.aa.n p0) {
        p0.a(Integer.valueOf(3));
    }

    public final void b(com.google.android.finsky.bb.d p0) {
        this.g().a.remove(p0);
    }

    public final com.google.android.finsky.bb.c c() {
        return this.a(this.e.cZ());
    }

    public final void ce_() {
    }

    public final boolean d() {
        if (!this.e().isEmpty())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final List e() {
        return com.google.android.finsky.bb.a.c.a(this.a, this.c());
    }

    public final boolean f() {
  4:    v3 = this.c();
 23:    v0 = v3.b();
 27:    if (v0 != 0 && v3.c() != 0 && v0.b == 1)
 39:        v0 = 1;
        else
 84:        v0 = 0;
 40:    if (v0 != 0) goto 48;
 46:    if (v3.k() && com.google.android.finsky.bb.a.c.a(this.a, v3).contains(Integer.valueOf(3)) && ((Integer)com.google.android.finsky.aa.a.aF.b(v3.a()).a()).intValue() < ((Integer)com.google.android.finsky.aa.b.fa.b()).intValue())
 82:        v0 = 1;
        else
 86:        v0 = 0;
 83:    return v0;
    }

}
