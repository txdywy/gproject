package com.google.android.finsky.notification.impl;

import android.graphics.Bitmap;
import android.support.v4.app.cg;
import com.google.android.finsky.notification.C3781e;
import com.google.android.finsky.notification.C3806r;

final class C3808v implements C3806r {
    public final /* synthetic */ cg f19112a;
    public final /* synthetic */ int f19113b;
    public final /* synthetic */ C3781e f19114c;
    public final /* synthetic */ C3803r f19115d;

    C3808v(C3803r c3803r, cg cgVar, int i, C3781e c3781e) {
        this.f19115d = c3803r;
        this.f19112a = cgVar;
        this.f19113b = i;
        this.f19114c = c3781e;
    }

    public final void mo3812a(Bitmap bitmap) {
        if (bitmap != null) {
            this.f19112a.f1504h = bitmap;
        }
        this.f19115d.m18173a(this.f19112a, "1.high-priority-notifications", this.f19113b, this.f19114c);
    }
}
