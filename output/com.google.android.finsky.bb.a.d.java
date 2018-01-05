package com.google.android.finsky.bb.a;

import android.text.TextUtils;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cv.a.co;
import com.google.android.finsky.cv.a.cp;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.lh;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.g;
import com.google.wireless.android.finsky.dfe.h.a.j;
import com.google.wireless.android.finsky.dfe.h.a.o;
import com.google.wireless.android.finsky.dfe.nano.cn;
import com.google.wireless.android.finsky.dfe.nano.gy;

public final class com.google.android.finsky.bb.a.d implements com.google.android.finsky.bb.c
{

    public final com.google.android.finsky.dx.a a;
    public final com.google.android.finsky.ba.c b;
    public final String c;
    public final com.google.wireless.android.finsky.dfe.h.a.j d;
    public final com.google.wireless.android.finsky.dfe.h.a.o e;

    d(com.google.android.finsky.dx.a p0, com.google.android.finsky.ba.c p1, String p2) {
  3:    this.a = p0;
  5:    this.b = p1;
  7:    this.c = p2;
 11:    if (this.c == 0) goto 34;
 17:    v0 = this.a.b(this.c);
 21:    if (v0 == 0) goto 34;
 23:    v0 = v0.c;
 25:    this.d = v0;
 31:    this.e = this.q();
 33:    return;
 34:    v0 = 0;
 35:    goto 25;
    }

    private final com.google.wireless.android.finsky.dfe.h.a.o q() {
        if (this.d != 0 && this.d.c != 0 && this.d.c.a != 0) {
            v1 = 0;
            while (v1 < this.d.c.a.length) {
                v0 = this.d.c.a[v1];
                if (v0.d != 0) {
                    if (v0.d.s != 0) {
                        if (v0.d.s.l != 0) {
                            if (v0.d.s.l.b != 0)
                                return v0;
                        }
                    }
                }
                v1 = v1 + 1;
            }
        }
        v0 = 0;
        return v0;
    }

    public final com.google.wireless.android.finsky.dfe.h.a.o a(String p0) {
        if (this.d()) {
            v1 = 0;
            while (v1 < this.d.c.a.length) {
                v0 = this.d.c.a[v1];
                if (p0.equals(v0.d.d))
                    return v0;
                v1 = v1 + 1;
            }
        }
        v0 = 0;
        return v0;
    }

    public final String a() {
        return this.c;
    }

    public final boolean a(int p0) {
        v0 = this.b.j(this.c);
        switch (p0) {
            case 1:
                v0 = v0.a(12604245);
                break;
            case 2:
                v0 = 0;
                break;
            case 3:
                v0 = v0.a(12604244);
                break;
            case 4:
                v0 = v0.a(12604246);
                break;
            default:
                v0 = 0;
                break;
        }
        return v0;
    }

    public final com.google.wireless.android.finsky.dfe.h.a.j b() {
        return this.d;
    }

    public final void b(String p0) {
        if (TextUtils.isEmpty(this.c))
            FinskyLog.e("AccountName should never be null to save consistency token.", new Object[0]);
        else if (!TextUtils.isEmpty(p0)) {
            v0 = new com.google.android.finsky.cv.a.lh();
            v0.b = v0.b | 1;
            v0.c = "X-DFE-Family-Consistency-Token";
            v0.a(p0);
            com.google.android.finsky.dx.a.a(this.c, v0);
        }
    }

    public final com.google.wireless.android.finsky.dfe.h.a.o c() {
        return this.e;
    }

    public final boolean d() {
        if (this.e != 0)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean e() {
        if (this.e != 0 && this.e.c == 5)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean f() {
        v0 = 0;
        if (!this.d())
            return v0;
        v1 = 0;
        while (true) {
            if (v1 >= this.d.c.a.length)
                return v0;
            if (this.d.c.a[v1].c == 5)
                break;
            v1 = v1 + 1;
        }
        v0 = 1;
        return v0;
    }

    public final boolean g() {
        v0 = this.a.b(this.c);
        if (v0 != 0 && v0.e != 0)
            v0 = "1".equals(v0.e.b);
        else
            v0 = 0;
        return v0;
    }

    public final boolean h() {
        v0 = 1;
        if (this.e == 0 || this.e.c != 1)
            v0 = 0;
        return v0;
    }

    public final boolean i() {
        v0 = 1;
        if (this.e == 0 || this.e.c != 1 && this.e.c != 4)
            v0 = 0;
        return v0;
    }

    public final boolean j() {
        return this.b.j(this.c).a(12603772);
    }

    public final boolean k() {
        return this.b.j(this.c).a(12613100);
    }

    public final boolean l() {
        v0 = 1;
        if (this.d == 0 || this.d.b != 2 || this.d.e != 1)
            v0 = 0;
        return v0;
    }

    public final boolean m() {
        if (this.d == 0)
            v0 = 1;
        else if (((Long)com.google.android.finsky.aa.a.aE.b(this.c).a()).longValue() >= this.d.d)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final boolean n() {
        if (this.d != 0 && this.l() && !this.m())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void o() {
        if (this.d == 0)
            FinskyLog.e("No family info while dismissing paused edu card.", new Object[0]);
        else
            com.google.android.finsky.aa.a.aE.b(this.c).a(Long.valueOf(this.d.d));
    }

    public final String p() {
        if (this.d == 0)
            v0 = "Null familyInfo";
        else
            v0 = 55 + "Family status: " + this.d.b + "\nInactive Reason: " + this.d.e;
        return (String.valueOf(v0).length() + 49) + v0 + "\nTos Accepted: " + this.g() + "\nOnboarding Experiment: " + this.j();
    }

}
