package com.google.android.finsky.verifier.impl;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.bb;

final class cg implements C0657w {
    public final /* synthetic */ cf f24535a;

    cg(cf cfVar) {
        this.f24535a = cfVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        Integer num = null;
        bx bxVar = this.f24535a.f24534b;
        if (bxVar.f24510s != null) {
            ForegroundCoordinator.m16015a(bxVar.f24510s);
            bxVar.f24510s = null;
        }
        if (this.f24535a.f24534b.f24489C != null) {
            this.f24535a.f24534b.f24489C.m13367a(new C2474c(2628));
        }
        int a = bf.m22116a(volleyError);
        if (volleyError.f4022b != null) {
            num = Integer.valueOf(volleyError.f4022b.f4166a);
        }
        bb.m21792a(new ch(this, volleyError, a, num), new Void[0]);
    }
}
