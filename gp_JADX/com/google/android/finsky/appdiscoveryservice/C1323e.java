package com.google.android.finsky.appdiscoveryservice;

import android.content.Context;
import android.content.SharedPreferences;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C1323e implements C0000a {
    public final C0000a f7820a;

    public C1323e(C0000a c0000a) {
        this.f7820a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (SharedPreferences) C0004c.m7a(((Context) this.f7820a.mo1a()).getSharedPreferences("InstantAppsStatsPreference", 0), "Cannot return null from a non-@Nullable @Provides method");
    }
}
