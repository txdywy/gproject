package com.google.android.finsky.instantapps.install;

import io.reactivex.d;

final class C3520w implements C3437s {
    public final /* synthetic */ d f17763a;

    C3520w(d dVar) {
        this.f17763a = dVar;
    }

    public final void mo3527a() {
        if (!this.f17763a.b()) {
            this.f17763a.da_();
        }
    }

    public final void mo3529b() {
        if (!this.f17763a.b()) {
            this.f17763a.a(new InstallFailure("Install session failed."));
        }
    }

    public final void mo3528a(long j, long j2) {
        this.f17763a.a(new C3513o(j, j2));
    }
}
