package com.google.android.finsky.p167r.p231a;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.p167r.C3961b;

public final class C3953b implements C2176c {
    public final C1461c f19959a;
    public final C3960a f19960b;

    public C3953b(C1461c c1461c, C3960a c3960a) {
        this.f19959a = c1461c;
        this.f19960b = c3960a;
    }

    public final void mo2769a(C3961b c3961b) {
        c3961b.f19989g |= 351;
        if (!this.f19959a.dj().mo2294a(12616260)) {
            c3961b.f19989g |= 32;
        }
        if (((Boolean) C0955b.du.m28964b()).booleanValue()) {
            c3961b.f19989g |= 128;
        }
        if (this.f19959a.dj().mo2294a(12643667)) {
            c3961b.f19989g |= 512;
        }
        if (this.f19960b.m18669b()) {
            c3961b.f19988f.m16793a(2);
        }
        if (((Boolean) C0968o.f5932i.m5760a()).booleanValue()) {
            c3961b.f19987e.m16809a(C3367k.f17267a);
        } else {
            c3961b.f19987e.m16809a(C3367k.f17268b);
        }
        c3961b.f19987e.m16810a("auto_update");
        c3961b.f19991i = 3;
        c3961b.f19987e.m16814b(3);
        c3961b.f19992j = 0;
    }
}
