package com.google.android.finsky.bc;

import android.app.Activity;
import android.util.SparseArray;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.d;

final class C1590x extends C1585q {
    public final C1588u f8417a;
    public final String f8418b;
    public final C1567a f8419c;
    public final SparseArray f8420d;
    public bd f8421e;
    public d f8422f;
    public bd f8423g;
    public String f8424h;
    public final /* synthetic */ C1589w f8425i;

    public C1590x(C1589w c1589w, Activity activity) {
        this.f8425i = c1589w;
        String stringExtra = activity.getIntent().getStringExtra("accountName");
        if (stringExtra == null) {
            stringExtra = c1589w.f8414c.cZ();
        }
        this.f8418b = stringExtra;
        if (((C1587s) activity).mo3309B()) {
            this.f8419c = new C1567a("pfm", "play");
        } else {
            this.f8419c = new C1567a("pfl", "play");
        }
        this.f8417a = new C1588u(this);
        this.f8417a.f8408c = activity;
        this.f8420d = new SparseArray();
    }

    public final String mo2344a() {
        return this.f8418b;
    }

    public final String mo2345a(int i) {
        String str = (String) this.f8420d.get(i);
        if (str != null) {
            return str;
        }
        FinskyLog.m21662b("Unable to find server text for " + i, new Object[0]);
        return "";
    }

    public final bd mo2346b() {
        return this.f8421e;
    }

    public final d mo2347c() {
        return this.f8422f;
    }

    public final C1588u mo2348d() {
        return this.f8417a;
    }

    public final bd mo2350f() {
        return this.f8423g;
    }

    public final String mo2351g() {
        return this.f8424h;
    }

    public final C1567a mo2349e() {
        return this.f8419c;
    }
}
