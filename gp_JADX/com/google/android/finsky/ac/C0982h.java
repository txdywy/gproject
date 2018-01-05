package com.google.android.finsky.ac;

import com.google.android.finsky.by.C0981m;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.utils.FinskyLog;

public final /* synthetic */ class C0982h implements C0981m {
    public final C0977e f5964a;

    public C0982h(C0977e c0977e) {
        this.f5964a = c0977e;
    }

    public final void mo1173a(String str) {
        C0977e c0977e = this.f5964a;
        if (C2229h.f11120a.equals(str)) {
            FinskyLog.m21659a("App library has changed, requesting content sync.", new Object[0]);
            c0977e.m5816a();
        }
    }
}
