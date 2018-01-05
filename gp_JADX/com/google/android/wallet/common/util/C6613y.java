package com.google.android.wallet.common.util;

final class C6613y implements Runnable {
    public final /* synthetic */ int f32782a;
    public final /* synthetic */ C6611w f32783b;

    C6613y(C6611w c6611w, int i) {
        this.f32783b = c6611w;
        this.f32782a = i;
    }

    public final void run() {
        if (this.f32783b.f32780b != null) {
            this.f32783b.f32780b.mo5542a(this.f32782a);
        }
    }
}
