package com.google.android.finsky.installer.p207a;

import com.google.android.finsky.utils.bb;

final class ad implements C3279g {
    public final /* synthetic */ C3301s f16863a;

    ad(C3301s c3301s) {
        this.f16863a = c3301s;
    }

    public final void mo3403a() {
        this.f16863a.m16607a(true);
    }

    public final void mo3404a(Runnable runnable) {
        bb.m21791a();
        if (this.f16863a.f17096z == null) {
            this.f16863a.f17077g.post(runnable);
        } else {
            this.f16863a.f17092v.add(runnable);
        }
    }
}
