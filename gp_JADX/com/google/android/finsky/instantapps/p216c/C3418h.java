package com.google.android.finsky.instantapps.p216c;

import android.content.Context;
import com.google.android.instantapps.common.gms.GmsConnection;
import p000c.p001a.C0000a;
import p002a.p003a.C0003b;
import p002a.p003a.C0004c;

public final class C3418h implements C0000a {
    public final C0000a f17498a;
    public final C0000a f17499b;

    public C3418h(C0000a c0000a, C0000a c0000a2) {
        this.f17498a = c0000a;
        this.f17499b = c0000a2;
    }

    public final /* synthetic */ Object mo1a() {
        return (GmsConnection) C0004c.m7a(new GmsConnection((Context) this.f17498a.mo1a(), C0003b.m4b(this.f17499b)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
