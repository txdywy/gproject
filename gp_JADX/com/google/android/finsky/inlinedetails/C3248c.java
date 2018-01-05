package com.google.android.finsky.inlinedetails;

final class C3248c implements Runnable {
    public final /* synthetic */ C3247b f16751a;

    C3248c(C3247b c3247b) {
        this.f16751a = c3247b;
    }

    public final void run() {
        super.mo3397a();
        if (!this.f16751a.f16749a) {
            this.f16751a.f16749a = true;
            this.f16751a.f.getViewTreeObserver().addOnPreDrawListener(this.f16751a);
        }
        this.f16751a.f16750b = true;
    }
}
