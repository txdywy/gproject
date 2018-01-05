package com.google.android.instantapps.common.gms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C5777c implements C0000a {
    public final /* synthetic */ Object mo1a() {
        return (ExecutorService) C0004c.m7a(Executors.newCachedThreadPool(am.m27176a("bg-", 10)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
