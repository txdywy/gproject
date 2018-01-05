package com.google.android.finsky.by.p132a;

import com.google.wireless.android.finsky.b.w;

final class C2221t implements Runnable {
    public final /* synthetic */ w[] f11085a;
    public final /* synthetic */ String f11086b;
    public final /* synthetic */ C2219r f11087c;

    C2221t(C2219r c2219r, w[] wVarArr, String str) {
        this.f11087c = c2219r;
        this.f11085a = wVarArr;
        this.f11086b = str;
    }

    public final void run() {
        for (w wVar : this.f11085a) {
            if (wVar != null) {
                this.f11087c.m11629a(wVar, this.f11086b);
            }
        }
    }
}
