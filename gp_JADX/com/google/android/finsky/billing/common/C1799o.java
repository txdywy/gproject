package com.google.android.finsky.billing.common;

import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.nano.ez;

public final class C1799o {
    public ax f9330a;
    public String f9331b;
    public Document f9332c;
    public int f9333d;
    public String f9334e;
    public C2731v f9335f;
    public int f9336g;
    public String f9337h;
    public String f9338i;
    public String f9339j;
    public ez f9340k;
    public String f9341l;
    public int f9342m;
    public int f9343n;
    public boolean f9344o;
    public boolean f9345p;
    public int f9346q;
    public byte[] f9347r;
    public boolean f9348s;
    public boolean f9349t;
    public boolean f9350u;
    public String f9351v;

    public final C1799o m9789a(PurchaseParams purchaseParams) {
        this.f9330a = purchaseParams.f9285a;
        this.f9331b = purchaseParams.f9286b;
        this.f9332c = purchaseParams.f9287c;
        this.f9333d = purchaseParams.f9288d;
        this.f9334e = purchaseParams.f9289e;
        this.f9335f = purchaseParams.f9290f;
        this.f9336g = purchaseParams.f9291g;
        this.f9337h = purchaseParams.f9292h;
        this.f9338i = purchaseParams.f9293i;
        this.f9339j = purchaseParams.f9297m;
        this.f9340k = purchaseParams.f9298n;
        this.f9341l = purchaseParams.f9295k;
        this.f9342m = purchaseParams.f9296l;
        this.f9343n = purchaseParams.f9294j;
        this.f9344o = purchaseParams.f9299o;
        this.f9345p = purchaseParams.f9303s;
        this.f9346q = purchaseParams.f9304t;
        this.f9347r = purchaseParams.f9305u;
        this.f9348s = purchaseParams.f9306v;
        this.f9349t = purchaseParams.f9300p;
        this.f9350u = purchaseParams.f9301q;
        this.f9351v = purchaseParams.f9302r;
        return this;
    }

    public final C1799o m9790a(Document document) {
        this.f9330a = document.m14646d();
        this.f9331b = document.f14885a.f12096c;
        this.f9332c = document;
        return this;
    }

    public final C1799o m9788a(int i, String str, String str2, int i2) {
        this.f9336g = i;
        this.f9337h = str;
        this.f9338i = str2;
        this.f9343n = i2;
        return this;
    }

    public final C1799o m9791a(String str) {
        m9796b();
        if (!TextUtils.isEmpty(str)) {
            ez ezVar = this.f9340k;
            if (str == null) {
                throw new NullPointerException();
            }
            ezVar.a |= 2;
            ezVar.c = str;
        }
        return this;
    }

    public final C1799o m9787a(int i) {
        m9796b();
        this.f9336g = i;
        ez ezVar = this.f9340k;
        ezVar.a |= 4;
        ezVar.d = i;
        return this;
    }

    public final C1799o m9794b(String str) {
        m9796b();
        if (!TextUtils.isEmpty(str)) {
            ez ezVar = this.f9340k;
            if (str == null) {
                throw new NullPointerException();
            }
            ezVar.a |= 8;
            ezVar.e = str;
        }
        return this;
    }

    public final C1799o m9793b(int i) {
        m9796b();
        if (i != 0) {
            ez ezVar = this.f9340k;
            ezVar.i = i;
            ezVar.a |= 32;
        }
        return this;
    }

    public final C1799o m9797c(String str) {
        m9796b();
        if (str == null) {
            str = "";
        }
        ez ezVar = this.f9340k;
        if (str == null) {
            throw new NullPointerException();
        }
        ezVar.a |= 64;
        ezVar.j = str;
        return this;
    }

    public final C1799o m9792a(boolean z) {
        m9796b();
        ez ezVar = this.f9340k;
        ezVar.a |= 128;
        ezVar.k = z;
        return this;
    }

    public final C1799o m9795b(boolean z) {
        m9796b();
        ez ezVar = this.f9340k;
        ezVar.a |= 256;
        ezVar.l = z;
        return this;
    }

    public final PurchaseParams m9786a() {
        return new PurchaseParams(this);
    }

    public final void m9796b() {
        if (this.f9340k == null) {
            this.f9340k = new ez();
        }
    }
}
