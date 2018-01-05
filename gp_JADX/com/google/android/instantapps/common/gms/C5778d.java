package com.google.android.instantapps.common.gms;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C5778d implements C0000a {
    public final C0000a f29219a;

    public C5778d(C0000a c0000a) {
        this.f29219a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (Executor) C0004c.m7a((ExecutorService) this.f29219a.mo1a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
