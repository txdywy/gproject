package com.google.android.finsky.instantapps.p216c;

import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.gms.GmsConnection;
import java.util.concurrent.Executor;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C3417g implements C0000a {
    public final C0000a f17496a;
    public final C0000a f17497b;

    public C3417g(C0000a c0000a, C0000a c0000a2) {
        this.f17496a = c0000a;
        this.f17497b = c0000a2;
    }

    public final /* synthetic */ Object mo1a() {
        return (C5785k) C0004c.m7a(new C5785k((Executor) this.f17496a.mo1a(), (GmsConnection) this.f17497b.mo1a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
