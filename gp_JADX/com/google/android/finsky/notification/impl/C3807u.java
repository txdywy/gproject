package com.google.android.finsky.notification.impl;

import android.graphics.Bitmap;
import android.support.v4.app.cg;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3806r;

final class C3807u implements C3806r {
    public final /* synthetic */ cg f19107a;
    public final /* synthetic */ String f19108b;
    public final /* synthetic */ int f19109c;
    public final /* synthetic */ C3781e f19110d;
    public final /* synthetic */ C3803r f19111e;

    C3807u(C3803r c3803r, cg cgVar, String str, int i, C3781e c3781e) {
        this.f19111e = c3803r;
        this.f19107a = cgVar;
        this.f19108b = str;
        this.f19109c = i;
        this.f19110d = c3781e;
    }

    public final void mo3812a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f19107a.f1504h = bitmap;
        }
        this.f19111e.m18173a(this.f19107a, this.f19108b, this.f19109c, this.f19110d);
    }
}
