package com.google.android.finsky.p167r.p231a;

import android.os.Build.VERSION;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3961b;
import com.google.android.finsky.utils.C4680k;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class C3956e implements C2176c {
    public final C1461c f19966a;
    public Set f19967b;

    public C3956e(C1461c c1461c) {
        this.f19966a = c1461c;
    }

    public final void mo2769a(C3961b c3961b) {
        if (VERSION.SDK_INT < 21 || !this.f19966a.dj().mo2294a(12618805) || c3961b.f19984b == null) {
            return;
        }
        if (!c3961b.f19984b.f11422g || c3961b.f19984b.f11423h) {
            String str = c3961b.f19983a.m14625N().f13171k;
            if (this.f19966a.dj().mo2294a(12623394) || m18658a().contains(str)) {
                c3961b.f19988f.m16795b();
            }
        }
    }

    private final synchronized Set m18658a() {
        if (this.f19967b == null) {
            this.f19967b = new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.gZ.m28964b())));
        }
        return this.f19967b;
    }
}
