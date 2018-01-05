package com.google.android.finsky.instantappsbackendclient.impl;

import java.util.concurrent.ExecutorService;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C3580g implements C0000a {
    public final C0000a f17879a;

    public C3580g(C0000a c0000a) {
        this.f17879a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (ExecutorService) C0004c.m7a((ExecutorService) this.f17879a.mo1a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
