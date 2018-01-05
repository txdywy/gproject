package com.google.android.finsky.application;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.notification.C3784h;
import com.google.android.finsky.notification.impl.az;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class gh implements C0000a {
    public final C0000a f8121a;

    public gh(C0000a c0000a) {
        this.f8121a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        Object obj = (az) this.f8121a.mo1a();
        if (!C1473m.f7980a.dj().mo2294a(12637790)) {
            obj = C3784h.f19003a;
        }
        return (C3784h) C0004c.m7a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
