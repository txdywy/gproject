package com.google.android.finsky.application;

import android.content.Context;
import android.telephony.TelephonyManager;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class gq implements C0000a {
    public final C0000a f8130a;

    public gq(C0000a c0000a) {
        this.f8130a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (TelephonyManager) C0004c.m7a((TelephonyManager) ((Context) this.f8130a.mo1a()).getSystemService("phone"), "Cannot return null from a non-@Nullable @Provides method");
    }
}
