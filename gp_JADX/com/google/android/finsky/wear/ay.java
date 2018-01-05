package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

final class ay implements cc {
    public final /* synthetic */ ar f24849a;

    ay(ar arVar) {
        this.f24849a = arVar;
    }

    public final void mo4389a() {
        FinskyLog.m21659a("Stopping WearSupport for Hygiene.", new Object[0]);
        this.f24849a.f24823g.m22455a((Object) this);
    }

    public final void mo4390b() {
        if (this.f24849a.f24822f != null && !this.f24849a.f24822f.isEmpty()) {
            return;
        }
        if (this.f24849a.f24823g.f24798h == null || this.f24849a.f24823g.f24798h.m22551a()) {
            mo4389a();
        }
    }

    public final void mo4391c() {
        mo4390b();
    }

    public final void mo4392d() {
        mo4390b();
    }
}
