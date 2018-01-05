package com.google.android.finsky.application;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.gms.GmsConnection;
import p000c.p001a.C0000a;
import p002a.p003a.C0003b;
import p002a.p003a.C0004c;

public final class C1477do implements C0000a {
    public final C0000a f8047a;
    public final C0000a f8048b;

    public C1477do(C0000a c0000a, C0000a c0000a2) {
        this.f8047a = c0000a;
        this.f8048b = c0000a2;
    }

    public final /* synthetic */ Object mo1a() {
        return (C5785k) C0004c.m7a(new C5785k(AsyncTask.THREAD_POOL_EXECUTOR, new GmsConnection((Context) this.f8047a.mo1a(), C0003b.m4b(this.f8048b))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
