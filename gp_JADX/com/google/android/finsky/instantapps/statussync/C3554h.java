package com.google.android.finsky.instantapps.statussync;

import android.content.Context;
import android.content.SharedPreferences;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C3554h implements C0000a {
    public final C0000a f17819a;

    public C3554h(C0000a c0000a) {
        this.f17819a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (SharedPreferences) C0004c.m7a(((Context) this.f17819a.mo1a()).getSharedPreferences("instantapps.UserPrefsUpdater", 0), "Cannot return null from a non-@Nullable @Provides method");
    }
}
