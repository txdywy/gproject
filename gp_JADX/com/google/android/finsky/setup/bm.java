package com.google.android.finsky.setup;

final class bm implements Runnable {
    public final /* synthetic */ bl f20875a;

    bm(bl blVar) {
        this.f20875a = blVar;
    }

    public final void run() {
        if (this.f20875a.m19286c()) {
            if (this.f20875a.f20872a != null) {
                String str = this.f20875a.f20872a;
                PackageSetupStatus b = this.f20875a.f20874c.f20606r.mo3981b(str);
                if (b != null && b.f20546a.f20895i) {
                    this.f20875a.m19282a(3, str);
                    return;
                }
            }
            this.f20875a.m19282a(2, null);
            return;
        }
        this.f20875a.m19282a(1, null);
    }
}
