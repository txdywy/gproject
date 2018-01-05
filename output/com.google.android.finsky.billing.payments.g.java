package com.google.android.finsky.billing.payments;

import android.text.TextUtils;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.w;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.analytics.a.a;
import com.google.android.wallet.analytics.n;
import com.google.android.wallet.common.pub.a.a.a;
import com.google.android.wallet.common.pub.a.a.b;
import com.google.wireless.android.a.a.a.a.af;
import com.google.wireless.android.a.a.a.a.bo;
import com.google.wireless.android.a.a.a.a.bp;
import com.google.wireless.android.a.a.a.a.bu;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cw;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.billing.payments.g implements com.google.android.wallet.common.pub.a.b
{

    public final com.google.android.finsky.d.ad a;
    public final com.google.android.finsky.d.w b;

    g(com.google.android.finsky.d.ad p0, com.google.android.finsky.d.w p1) {
        this.a = p0;
        this.b = p1;
        if (p0 == 0)
            throw new IllegalArgumentException("node cannot be null");
    }

    private final com.google.wireless.android.a.a.a.a.ce a(com.google.android.wallet.analytics.n p0) {
        v2 = com.google.android.finsky.billing.payments.g.b(p0);
        if (p0.c != 0 && !p0.c.isEmpty()) {
            v3 = p0.c.size();
            v2.f = new ce[v3];
            v1 = 0;
            while (v1 < v3) {
                v2.f[v1] = this.a((com.google.android.wallet.analytics.n)p0.c.get(v1));
                v1 = v1 + 1;
            }
        }
        return v2;
    }

    private static com.google.wireless.android.a.a.a.a.ce b(com.google.android.wallet.analytics.n p0) {
        v0 = com.google.android.finsky.d.j.a(p0.a);
        if (p0.b != 0 && p0.b.length > 0)
            v0.a(p0.b);
        return v0;
    }

    public final void a(com.google.android.wallet.analytics.a.a p0) {
        v1 = new com.google.android.finsky.d.c(p0.a).a(p0.e).b(p0.d).a(p0.b).c(p0.f);
        if (p0.g > 0)
            v1.c(p0.g);
        if (p0.k != 0 && p0.k.length > 0)
            v1.a(p0.k);
        if (p0.h != 0) {
            v3 = new com.google.wireless.android.a.a.a.a.af();
            v3.a = v3.a | 1;
            v3.b = p0.h.a;
            v3.c = p0.h.b;
            v3.a = v3.a | 2;
            v3.a = v3.a | 4;
            v3.d = p0.h.c;
            v3.a = v3.a | 8;
            v3.e = p0.h.d;
            v3.a = v3.a | 16;
            v3.f = p0.h.e;
            v3.a = v3.a | 32;
            v3.g = p0.h.f;
            v3.h = p0.h.g;
            v3.a = v3.a | 64;
            v3.a = v3.a | 128;
            v3.i = p0.h.h;
            v3.a = v3.a | 256;
            v3.j = p0.h.i;
            v3.a = v3.a | 512;
            v3.k = p0.h.j;
            v3.a = v3.a | 1024;
            v3.l = p0.h.k;
            v3.m = p0.h.l;
            v3.a = v3.a | 2048;
            v3.a = v3.a | 4096;
            v3.n = p0.h.m;
            v3.a = v3.a | 8192;
            v3.o = p0.h.n;
            v3.a = v3.a | 16384;
            v3.p = p0.h.o;
            v3.a = v3.a | 32768;
            v3.q = p0.h.p;
            v3.a = v3.a | 65536;
            v3.r = p0.h.q;
            v3.a = v3.a | 131072;
            v3.s = p0.h.r;
            v3.a = v3.a | 262144;
            v3.t = p0.h.s;
            v3.a = v3.a | 524288;
            v3.u = p0.h.u;
            v3.v = p0.h.t;
            v3.a = v3.a | 1048576;
            v3.w = p0.h.v;
            v3.a = v3.a | 2097152;
            v3.x = p0.h.w;
            v3.a = v3.a | 4194304;
            v3.a = v3.a | 8388608;
            v3.y = p0.h.x;
            v3.a = v3.a | 16777216;
            v3.z = p0.h.y;
            v1.a.B = v3;
        }
        if (p0.j != 0) {
            v3 = new com.google.wireless.android.a.a.a.a.cw();
            if (p0.j.a == 0)
                throw new NullPointerException();
            v3.a = v3.a | 1;
            v3.b = p0.j.a;
            v3.a = v3.a | 2;
            v3.c = p0.j.b;
            v3.a = v3.a | 4;
            v3.d = p0.j.c;
            v3.a = v3.a | 16;
            v3.f = p0.j.d;
            if (p0.j.e == 0)
                throw new NullPointerException();
            v3.a = v3.a | 32;
            v3.g = p0.j.e;
            v3.a = v3.a | 64;
            v3.h = p0.j.f;
            v3.a = v3.a | 128;
            v3.i = p0.j.g;
            v3.a = v3.a | 256;
            v3.j = p0.j.h;
            v3.a = v3.a | 512;
            v3.k = p0.j.i;
            v3.a = v3.a | 1024;
            v3.l = p0.j.j;
            v1.a.D = v3;
        }
        if (p0.i != 0)
            v1.a.ae = p0.i;
        if (!TextUtils.isEmpty(p0.c))
            v1.a.c(p0.c);
        this.b.a(v1.a, 0);
    }

    public final void a(com.google.android.wallet.common.pub.a.a.a p0) {
        v3 = p0.a.size();
        if (v3 == 0)
            throw new IllegalArgumentException("Click path must have at least one item");
        v4 = new ArrayList(v3 + 1);
        v1 = 0;
        while (v1 < v3) {
            v4.add(com.google.android.finsky.billing.payments.g.b((com.google.android.wallet.analytics.n)p0.a.get(v1)));
            v1 = v1 + 1;
        }
        v0 = this.a;
        while (true) {
            v4.add(com.google.android.finsky.d.j.a(v0.getPlayStoreUiElement()));
            v0 = v0.getParentNode();
            if (v0 == 0) {
                v1 = com.google.android.finsky.d.j.f();
                v1.a = (ce[])v4.toArray(new ce[v4.size()]);
                this.b.a(v1, 0);
                return;
            }
        }
    }

    public final void a(com.google.android.wallet.common.pub.a.a.b p0) {
        v1 = new ArrayList();
        v0 = this.a;
        while (v0 != 0) {
            v1.add(v0.getPlayStoreUiElement());
            v0 = v0.getParentNode();
        }
        v1 = com.google.android.finsky.d.j.a(v1);
        v0 = v1;
        while (v0.f != 0 && v0.f.length != 0)
            v0 = v0.f[0];
        if (v0.c != this.a.getPlayStoreUiElement().c)
            throw new IllegalStateException(53 + "Unexpected types in tree: " + v0.c + " and " + this.a.getPlayStoreUiElement().c);
        v4 = new ce[1];
        v4[0] = this.a(p0.a);
        v0.f = v4;
        v0 = com.google.android.finsky.d.j.g();
        v0.b = v1;
        this.b.a(v0, 0);
    }

}
