package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4641e;
import com.google.android.finsky.updatechecker.C4642f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.List;

public final class C4664w implements C4641e {
    public final C3646a f24009a;
    public final C0988c f24010b;
    public final C1461c f24011c;
    public final C2320a f24012d;
    public final C1506e f24013e;
    public final C2906h f24014f;

    public C4664w(C3646a c3646a, C0988c c0988c, C1461c c1461c, C2320a c2320a, C1506e c1506e, C2906h c2906h) {
        this.f24009a = c3646a;
        this.f24010b = c0988c;
        this.f24011c = c1461c;
        this.f24012d = c2320a;
        this.f24013e = c1506e;
        this.f24014f = c2906h;
    }

    public final void mo4313a(C2239c c2239c, List list, C4642f c4642f) {
        boolean z;
        if (!this.f24013e.m8838a()) {
            FinskyLog.m21659a("Skipping update checks as the store is not valid.", new Object[0]);
            C4664w.m21652a(c2239c, false);
            z = false;
        } else if (this.f24009a.f18022b.m11208b()) {
            z = true;
        } else {
            FinskyLog.m21669e("Require loaded app states to perform update check.", new Object[0]);
            C4664w.m21652a(c2239c, false);
            z = false;
        }
        if (z) {
            bb.m21792a(new C4665x(this, c2239c, c4642f), new Void[0]);
        }
    }

    static void m21652a(C2239c c2239c, boolean z) {
        if (c2239c != null) {
            c2239c.mo2827a(z);
        }
    }
}
