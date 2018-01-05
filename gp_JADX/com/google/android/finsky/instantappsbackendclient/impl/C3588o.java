package com.google.android.finsky.instantappsbackendclient.impl;

import android.content.Context;
import android.content.res.Resources;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C3588o implements C0000a {
    public final C0000a f17891a;

    public C3588o(C0000a c0000a) {
        this.f17891a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (Resources) C0004c.m7a(((Context) this.f17891a.mo1a()).getResources(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
