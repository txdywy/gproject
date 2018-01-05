package com.google.android.finsky.p167r.p231a;

import android.content.Context;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3961b;

public final class C3954c implements C2176c {
    public final Context f19961a;
    public final C1461c f19962b;

    public C3954c(Context context, C1461c c1461c) {
        this.f19961a = context;
        this.f19962b = c1461c;
    }

    public final void mo2769a(C3961b c3961b) {
        Object obj = (C1503a.m8831b(this.f19961a) && "com.google.android.wearable.app".equals(c3961b.f19983a.cf())) ? 1 : null;
        if (obj != null) {
            c3961b.f19994l |= 1;
            if (this.f19962b.dj().mo2294a(12643667)) {
                c3961b.f19989g &= -513;
            }
            c3961b.f19991i = 2;
            c3961b.f19987e.m16814b(2);
            c3961b.f19992j = -1000;
        }
    }
}
