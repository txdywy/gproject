package com.google.android.instantapps.common.gms;

import android.os.Handler;
import android.os.Looper;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C5781g implements C0000a {
    public final /* synthetic */ Object mo1a() {
        return (Handler) C0004c.m7a(new Handler(Looper.getMainLooper()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
