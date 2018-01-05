package com.google.android.finsky.notification.impl;

import android.graphics.Bitmap;
import android.support.v4.app.cg;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3806r;

final class C3811y implements C3806r {
    public final /* synthetic */ cg f19126a;
    public final /* synthetic */ C3781e f19127b;
    public final /* synthetic */ int f19128c;
    public final /* synthetic */ C3803r f19129d;

    C3811y(C3803r c3803r, cg cgVar, C3781e c3781e, int i) {
        this.f19129d = c3803r;
        this.f19126a = cgVar;
        this.f19127b = c3781e;
        this.f19128c = i;
    }

    public final void mo3812a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f19126a.f1504h = bitmap;
        }
        Object obj = (this.f19127b.f18987a.f18994f == null || this.f19127b.f18987a.f18994f.f19141b == null) ? null : 1;
        this.f19129d.m18173a(this.f19126a, obj != null ? null : "2.account-alerts-notifications", this.f19128c, this.f19127b);
    }
}
