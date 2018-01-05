package com.google.android.finsky.appdiscoveryservice;

import android.content.Context;
import android.content.pm.PackageManager;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C1325g implements C0000a {
    public final C0000a f7821a;

    public C1325g(C0000a c0000a) {
        this.f7821a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (PackageManager) C0004c.m7a(((Context) this.f7821a.mo1a()).getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
