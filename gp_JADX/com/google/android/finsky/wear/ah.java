package com.google.android.finsky.wear;

import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.wearable.C5619g;

final class ah implements C1643x {
    public final /* synthetic */ ag f24787a;

    ah(ag agVar) {
        this.f24787a = agVar;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C5619g c5619g = (C5619g) c4980w;
        synchronized (this.f24787a) {
            this.f24787a.m22439a(c5619g);
            c5619g.mo4500a();
            for (Runnable runnable : this.f24787a.f24786i) {
                if (runnable != null) {
                    this.f24787a.f24785h.post(runnable);
                }
            }
            this.f24787a.f24786i.clear();
            this.f24787a.f24786i = null;
            this.f24787a.f24784g = true;
        }
    }
}
