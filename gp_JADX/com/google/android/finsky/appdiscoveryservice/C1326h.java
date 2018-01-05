package com.google.android.finsky.appdiscoveryservice;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C1326h implements C0000a {
    public final C0000a f7822a;

    public C1326h(C0000a c0000a) {
        this.f7822a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (UsageStatsManager) C0004c.m7a((UsageStatsManager) ((Context) this.f7822a.mo1a()).getSystemService("usagestats"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
