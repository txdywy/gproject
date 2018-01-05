package com.google.android.finsky.instantapps.install;

import java.util.concurrent.ExecutorService;
import p000c.p001a.C0000a;

public final class C3521x implements C0000a {
    public final C0000a f17764a;
    public final C0000a f17765b;
    public final C0000a f17766c;
    public final C0000a f17767d;

    public C3521x(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4) {
        this.f17764a = c0000a;
        this.f17765b = c0000a2;
        this.f17766c = c0000a3;
        this.f17767d = c0000a4;
    }

    public final /* synthetic */ Object mo1a() {
        ExecutorService executorService = (ExecutorService) this.f17764a.mo1a();
        C3499a c3499a = (C3499a) this.f17765b.mo1a();
        this.f17766c.mo1a();
        return new C3517t(executorService, c3499a, (C3510l) this.f17767d.mo1a());
    }
}
