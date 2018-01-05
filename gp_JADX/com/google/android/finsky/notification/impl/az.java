package com.google.android.finsky.notification.impl;

import android.accounts.Account;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0987b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.notification.C3667j;
import com.google.android.finsky.notification.C3780d;
import com.google.android.finsky.notification.C3784h;
import com.google.wireless.android.finsky.dfe.j.a.e;
import java.util.HashSet;
import java.util.Set;

public final class az implements C0987b, C3780d, C3784h {
    public final C1461c f19039b;
    public final Set f19040c = new HashSet();
    public String f19041d;

    public az(C1461c c1461c, C0988c c0988c, C0986a c0986a) {
        this.f19039b = c1461c;
        this.f19041d = c0988c.cZ();
        c0986a.mo1192a((C0987b) this);
    }

    public final boolean mo3762a(e eVar, String str) {
        if (!this.f19039b.dj().mo2294a(12637790) || !this.f19039b.dj().mo2294a(12641819)) {
            return false;
        }
        if (!((eVar.a & 1) != 0)) {
            return false;
        }
        int intValue = ((Integer) C0954a.bF.m5777b(str).m5760a()).intValue();
        int i = eVar.b;
        if (intValue != i) {
            C0954a.bF.m5777b(str).m5763a(Integer.valueOf(i));
            if (str.equals(this.f19041d)) {
                m18120b();
            }
        }
        return true;
    }

    public final void mo3757a(C3667j c3667j) {
        this.f19040c.add(c3667j);
    }

    public final void mo3758b(C3667j c3667j) {
        this.f19040c.remove(c3667j);
    }

    public final int mo3756a() {
        return ((Integer) C0954a.bF.m5777b(this.f19041d).m5760a()).intValue();
    }

    public final void mo2020a(Account account) {
        if (account != null) {
            int a = mo3756a();
            this.f19041d = account.name;
            if (a != mo3756a()) {
                m18120b();
            }
        }
    }

    private final void m18120b() {
        int a = mo3756a();
        for (C3667j a2 : this.f19040c) {
            a2.mo3577a(a);
        }
    }
}
