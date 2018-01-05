package com.google.android.finsky.activities;

import android.support.v4.app.Fragment;
import com.google.android.finsky.cf.p116a.C1064e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class ev implements C1064e {
    public final /* synthetic */ MainActivity f6773a;

    ev(MainActivity mainActivity) {
        this.f6773a = mainActivity;
    }

    public final void mo1359a() {
        ad adVar;
        C2495w c2495w = this.f6773a.f6316C;
        C2488p c2488p = new C2488p();
        Fragment k = this.f6773a.f6361G.mo3709k();
        if (k instanceof ad) {
            adVar = (ad) k;
        } else {
            adVar = null;
        }
        c2495w.m13370a(c2488p.m13342a(adVar).m13340a(2961));
    }

    public final void mo1360b() {
        this.f6773a.f6316C.m13379b(new C2475d(new C2473o(2961)).m13256a(2962));
    }
}
