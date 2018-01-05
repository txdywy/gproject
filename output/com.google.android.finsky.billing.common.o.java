package com.google.android.finsky.billing.common;

import android.text.TextUtils;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.v;
import com.google.wireless.android.finsky.dfe.nano.ez;

public final class com.google.android.finsky.billing.common.o
{

    public com.google.android.finsky.cv.a.ax a;
    public String b;
    public Document c;
    public int d;
    public String e;
    public com.google.android.finsky.dfemodel.v f;
    public int g;
    public String h;
    public String i;
    public String j;
    public com.google.wireless.android.finsky.dfe.nano.ez k;
    public String l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public byte[] r;
    public boolean s;
    public boolean t;
    public boolean u;
    public String v;

    o() {
    }

    public final PurchaseParams a() {
        return new PurchaseParams(this);
    }

    public final com.google.android.finsky.billing.common.o a(int p0) {
        this.b();
        this.g = p0;
        this.k.a = this.k.a | 4;
        this.k.d = p0;
        return this;
    }

    public final com.google.android.finsky.billing.common.o a(int p0, String p1, String p2, int p3) {
        this.g = p0;
        this.h = p1;
        this.i = p2;
        this.n = p3;
        return this;
    }

    public final com.google.android.finsky.billing.common.o a(PurchaseParams p0) {
        this.a = p0.a;
        this.b = p0.b;
        this.c = p0.c;
        this.d = p0.d;
        this.e = p0.e;
        this.f = p0.f;
        this.g = p0.g;
        this.h = p0.h;
        this.i = p0.i;
        this.j = p0.m;
        this.k = p0.n;
        this.l = p0.k;
        this.m = p0.l;
        this.n = p0.j;
        this.o = p0.o;
        this.p = p0.s;
        this.q = p0.t;
        this.r = p0.u;
        this.s = p0.v;
        this.t = p0.p;
        this.u = p0.q;
        this.v = p0.r;
        return this;
    }

    public final com.google.android.finsky.billing.common.o a(Document p0) {
        this.a = p0.d();
        this.b = p0.a.c;
        this.c = p0;
        return this;
    }

    public final com.google.android.finsky.billing.common.o a(String p0) {
        this.b();
        if (!TextUtils.isEmpty(p0)) {
            if (p0 == 0)
                throw new NullPointerException();
            this.k.a = this.k.a | 2;
            this.k.c = p0;
        }
        return this;
    }

    public final com.google.android.finsky.billing.common.o a(boolean p0) {
        this.b();
        this.k.a = this.k.a | 128;
        this.k.k = p0;
        return this;
    }

    public final com.google.android.finsky.billing.common.o b(int p0) {
        this.b();
        if (p0 != 0) {
            this.k.i = p0;
            this.k.a = this.k.a | 32;
        }
        return this;
    }

    public final com.google.android.finsky.billing.common.o b(String p0) {
        this.b();
        if (!TextUtils.isEmpty(p0)) {
            if (p0 == 0)
                throw new NullPointerException();
            this.k.a = this.k.a | 8;
            this.k.e = p0;
        }
        return this;
    }

    public final com.google.android.finsky.billing.common.o b(boolean p0) {
        this.b();
        this.k.a = this.k.a | 256;
        this.k.l = p0;
        return this;
    }

    public final void b() {
        if (this.k == 0)
            this.k = new com.google.wireless.android.finsky.dfe.nano.ez();
    }

    public final com.google.android.finsky.billing.common.o c(String p0) {
        this.b();
        if (p0 == 0)
            p0 = "";
        if (p0 == 0)
            throw new NullPointerException();
        this.k.a = this.k.a | 64;
        this.k.j = p0;
        return this;
    }

}
