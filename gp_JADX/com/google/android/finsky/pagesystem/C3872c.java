package com.google.android.finsky.pagesystem;

final class C3872c implements Runnable {
    public final /* synthetic */ ContentFrame f19278a;
    public final /* synthetic */ C1045b f19279b;

    C3872c(C1045b c1045b, ContentFrame contentFrame) {
        this.f19279b = c1045b;
        this.f19278a = contentFrame;
    }

    public final void run() {
        if (this.f19279b.bt != null) {
            this.f19278a.addView(this.f19279b.bt);
        }
    }
}
