package com.google.android.instantapps.common.p217e;

import java.util.concurrent.TimeUnit;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class ab implements C0000a {
    public final C0000a f29035a;

    public ab(C0000a c0000a) {
        this.f29035a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (bf) C0004c.m7a(((bg) this.f29035a.mo1a()).m27118a("InstantApps__").m27115a("launch_failure_snooze_duration_ms", TimeUnit.SECONDS.toMillis(15)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
