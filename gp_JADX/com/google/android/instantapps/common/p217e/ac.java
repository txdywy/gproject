package com.google.android.instantapps.common.p217e;

import java.util.concurrent.TimeUnit;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class ac implements C0000a {
    public final C0000a f29036a;

    public ac(C0000a c0000a) {
        this.f29036a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (bf) C0004c.m7a(((bg) this.f29036a.mo1a()).m27118a("Logging__").m27115a("log_flush_schedule_seconds", TimeUnit.MINUTES.toSeconds(20)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
