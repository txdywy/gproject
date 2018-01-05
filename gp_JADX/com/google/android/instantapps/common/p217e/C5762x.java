package com.google.android.instantapps.common.p217e;

import java.util.concurrent.TimeUnit;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C5762x implements C0000a {
    public final C0000a f29166a;

    public C5762x(C0000a c0000a) {
        this.f29166a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (bf) C0004c.m7a(((bg) this.f29166a.mo1a()).m27118a("InstantApps__").m27115a("garbage_collection_cutoff_millis", TimeUnit.DAYS.toMillis(7)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
