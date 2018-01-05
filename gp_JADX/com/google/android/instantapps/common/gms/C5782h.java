package com.google.android.instantapps.common.gms;

import android.content.pm.PackageManager;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C5782h implements C0000a {
    public final C5775a f29220a;
    public final C0000a f29221b;

    public C5782h(C5775a c5775a, C0000a c0000a) {
        this.f29220a = c5775a;
        this.f29221b = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        C5775a c5775a = this.f29220a;
        this.f29221b.mo1a();
        return (PackageManager) C0004c.m7a(c5775a.f29187a.getPackageManager(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
