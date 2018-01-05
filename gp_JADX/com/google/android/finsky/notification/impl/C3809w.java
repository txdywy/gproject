package com.google.android.finsky.notification.impl;

import android.graphics.Bitmap;
import android.support.v4.app.cg;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3806r;

final class C3809w implements C3806r {
    public final /* synthetic */ cg f19116a;
    public final /* synthetic */ String f19117b;
    public final /* synthetic */ int f19118c;
    public final /* synthetic */ C3781e f19119d;
    public final /* synthetic */ C3803r f19120e;

    C3809w(C3803r c3803r, cg cgVar, String str, int i, C3781e c3781e) {
        this.f19120e = c3803r;
        this.f19116a = cgVar;
        this.f19117b = str;
        this.f19118c = i;
        this.f19119d = c3781e;
    }

    public final void mo3812a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f19116a.f1504h = bitmap;
        }
        this.f19120e.m18173a(this.f19116a, this.f19117b, this.f19118c, this.f19119d);
    }
}
