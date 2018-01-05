package com.google.android.finsky.application;

import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.notification.C3784h;
import com.google.android.finsky.notification.impl.C3786a;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class dr implements C0000a {
    public final C0000a f8051a;
    public final C0000a f8052b;

    public dr(C0000a c0000a, C0000a c0000a2) {
        this.f8051a = c0000a;
        this.f8052b = c0000a2;
    }

    public final /* synthetic */ Object mo1a() {
        C3667j c3786a = new C3786a((C3784h) this.f8051a.mo1a(), (C3784h) this.f8052b.mo1a());
        c3786a.f19008d.mo3757a(c3786a);
        c3786a.f19009e.mo3757a(c3786a);
        return (C3784h) C0004c.m7a(c3786a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
