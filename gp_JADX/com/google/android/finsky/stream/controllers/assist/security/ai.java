package com.google.android.finsky.stream.controllers.assist.security;

final class ai implements Runnable {
    public final /* synthetic */ ae f21795a;
    public final /* synthetic */ ah f21796b;

    ai(ah ahVar, ae aeVar) {
        this.f21796b = ahVar;
        this.f21795a = aeVar;
    }

    public final void run() {
        if (this.f21796b.f21794b != null) {
            this.f21796b.f21794b.mo4117a(this.f21795a);
        }
    }
}
