package com.google.android.finsky.instantapps.p212d;

import android.content.Context;
import android.content.SharedPreferences;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class af implements C0000a {
    public final C0000a f17511a;

    public af(C0000a c0000a) {
        this.f17511a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (SharedPreferences) C0004c.m7a(((Context) this.f17511a.mo1a()).getSharedPreferences("instantAppLaunchPreferences", 0), "Cannot return null from a non-@Nullable @Provides method");
    }
}
