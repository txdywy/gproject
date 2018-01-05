package com.google.android.finsky.layout.play;

import com.google.wireless.android.finsky.dfe.nano.gj;
import com.squareup.haha.perflib.HprofParser;

final class C3694c implements Runnable {
    public final /* synthetic */ gj f18773a;
    public final /* synthetic */ boolean f18774b;
    public final /* synthetic */ FinskyDrawerLayout f18775c;

    C3694c(FinskyDrawerLayout finskyDrawerLayout, gj gjVar, boolean z) {
        this.f18775c = finskyDrawerLayout;
        this.f18773a = gjVar;
        this.f18774b = z;
    }

    public final void run() {
        int i;
        FinskyDrawerLayout finskyDrawerLayout = this.f18775c;
        switch (this.f18773a.c) {
            case 1:
                i = 136;
                break;
            case 2:
                i = 134;
                break;
            case 4:
                i = 135;
                break;
            case 6:
                i = HprofParser.ROOT_INTERNED_STRING;
                break;
            default:
                i = 132;
                break;
        }
        finskyDrawerLayout.m17537b(i);
        this.f18775c.f18667P.mo3721x();
        if (this.f18774b) {
            this.f18775c.f18667P.mo3648a(this.f18775c.f18673V, this.f18773a.e, this.f18773a.c, this.f18775c.ad);
        } else {
            this.f18775c.f18667P.mo3693b(this.f18773a.e, this.f18773a.d, this.f18773a.c, this.f18775c.f18673V, this.f18775c.ad);
        }
    }
}
