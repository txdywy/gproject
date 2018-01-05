package com.google.android.finsky.billing.b;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.o;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dialogbuilder.d;
import com.google.android.wallet.common.util.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cf;
import com.google.wireless.android.a.a.a.a.z;
import com.google.wireless.android.finsky.dfe.c.a.co;
import com.google.wireless.android.finsky.dfe.c.a.cp;
import com.google.wireless.android.finsky.dfe.c.a.ea;
import com.google.wireless.android.finsky.dfe.c.a.ee;

public final class com.google.android.finsky.billing.b.d extends com.google.android.finsky.dialogbuilder.d implements com.google.android.finsky.billing.a.d
{

    public final PurchaseParams a;
    public final boolean b;
    public final Activity c;

    d(com.google.android.finsky.d.w p0, PurchaseParams p1, int p2, boolean p3, Activity p4) {
        if (p3 != 0 && p1 != 0)
            v0 = p1.u;
        else
            v0 = 0;
        com.google.android.finsky.dialogbuilder.d(p0, p2, v0);
        this.a = p1;
        this.b = p3;
        this.c = p4;
    }

    private final void a(int p0, boolean p1, int p2, String p3) {
        v0 = this.d(p0).a(p1).a(p2);
        if (!TextUtils.isEmpty(p3))
            v0.b(p3);
        this.f.a(v0.a, 0);
    }

    protected final com.google.android.finsky.d.c a(int p0, com.google.wireless.android.finsky.dfe.c.a.cp p1) {
        v0 = this.d(p0);
        if (p1 != 0) {
            if (p1.b != 0)
                v0.a(p1.b);
            if (p1.d())
                v0.a(p1.c);
            if (p1.e())
                v0.b(p1.d);
        }
        return v0;
    }

    public final void a() {
        this.f.a(this.d(2030).a, 0);
    }

    public final void a(int p0) {
        this.a(2035, 0, p0, 0);
    }

    protected final void a(com.google.android.finsky.d.ad p0, com.google.wireless.android.finsky.dfe.c.a.cp p1) {
        if (p0.getPlayStoreUiElement().e == 0)
            p0.getPlayStoreUiElement().e = new com.google.wireless.android.a.a.a.a.cf();
        if (this.a != 0) {
            if (this.a.b != 0)
                p0.getPlayStoreUiElement().e.a(this.a.b);
            if (this.a.a())
                p0.getPlayStoreUiElement().e.a(this.a.d);
            if (this.b != 0)
                ((com.google.android.finsky.d.o)p0).a(this.a.u);
        }
        if (p1 != 0) {
            if (p1.d())
                p0.getPlayStoreUiElement().e.a(p1.c);
            if (p1.e())
                p0.getPlayStoreUiElement().e.a(p1.d);
            if (this.b != 0) {
                if (p1.a & 4)
                    v0 = 1;
                else
                    v0 = 0;
                if (v0 != 0)
                    ((com.google.android.finsky.d.o)p0).a(p1.e);
            }
        }
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.co p0) {
        if (p0 != 0) {
            v0 = this.a(p0.b, p0.e);
            if (p0.d())
                v0.d(p0.d);
            this.f.a(v0.a, 0);
        }
    }

    public final void a(com.google.wireless.android.finsky.dfe.c.a.co p0, com.google.wireless.android.finsky.dfe.c.a.ee p1, long p2, long p4) {
        if (p0 != 0) {
            v0 = this.a(p0.c, p0.e).a(p1.c).a(p1.b).a(p2).b(p4);
            if (p0.d())
                v0.d(p0.d);
            if (p0.f != 0) {
                v1 = com.google.android.wallet.common.util.a.a(this.c);
                if (!TextUtils.isEmpty(v1))
                    v0.c(v1);
            }
            this.f.a(v0.a, 0);
        }
    }

    public final void a(String p0) {
        this.a(2031, 0, 6, p0);
    }

    public final void a(boolean p0, com.google.wireless.android.finsky.dfe.c.a.ea p1, boolean p2) {
        if (p2 != 0)
            v0 = 3;
        else if (p1 != 0 && p1.c != 0)
            v0 = 2;
        else
            v0 = 1;
        v1 = new com.google.wireless.android.a.a.a.a.z();
        v1.a(v0);
        if (p1 != 0 && p1.d())
            v1.d();
        this.f.a(this.d(508).a(p0).a(v1).a, 0);
    }

    public final void b() {
        this.a(2035, 1, 0, 0);
    }

    public final void b(int p0) {
        this.a(2031, 0, p0, 0);
    }

    public final void c() {
        this.a(2031, 1, 0, 0);
    }

    public final void c(int p0) {
        this.a(2036, 0, p0, 0);
    }

    protected final com.google.android.finsky.d.c d(int p0) {
        v0 = new com.google.android.finsky.d.c(p0);
        if (this.a != 0)
            v0.a(this.a.b).a(this.a.a).b(this.a.d);
        return v0;
    }

    public final void d() {
        this.a(2036, 1, 0, 0);
    }

    public final void e() {
        this.f.a(this.d(2033).a, 0);
    }

    public final void f() {
        this.f.a(this.d(2034).a, 0);
    }

}
