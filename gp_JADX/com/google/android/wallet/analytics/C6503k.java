package com.google.android.wallet.analytics;

final class C6503k implements Runnable {
    public final /* synthetic */ C6504m f32559a;
    public final /* synthetic */ C6502j f32560b;

    C6503k(C6502j c6502j, C6504m c6504m) {
        this.f32560b = c6502j;
        this.f32559a = c6504m;
    }

    public final void run() {
        if (!this.f32560b.f32557b) {
            this.f32560b.f32557b = true;
            this.f32560b.f32558c.mo5478b(this.f32559a);
        }
    }
}
