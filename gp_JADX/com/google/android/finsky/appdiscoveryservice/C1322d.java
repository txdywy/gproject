package com.google.android.finsky.appdiscoveryservice;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C1322d implements C0000a {
    public final /* synthetic */ Object mo1a() {
        return (Executor) C0004c.m7a(Executors.newCachedThreadPool(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
