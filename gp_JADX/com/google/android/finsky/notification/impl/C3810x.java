package com.google.android.finsky.notification.impl;

import android.graphics.Bitmap;
import android.support.v4.app.cg;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3806r;

final class C3810x implements C3806r {
    public final /* synthetic */ cg f19121a;
    public final /* synthetic */ String f19122b;
    public final /* synthetic */ int f19123c;
    public final /* synthetic */ C3781e f19124d;
    public final /* synthetic */ C3803r f19125e;

    C3810x(C3803r c3803r, cg cgVar, String str, int i, C3781e c3781e) {
        this.f19125e = c3803r;
        this.f19121a = cgVar;
        this.f19122b = str;
        this.f19123c = i;
        this.f19124d = c3781e;
    }

    public final void mo3812a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f19121a.f1504h = bitmap;
        }
        this.f19125e.m18173a(this.f19121a, this.f19122b, this.f19123c, this.f19124d);
    }
}
