package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.dv.C2899a;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4641e;
import com.google.android.finsky.updatechecker.C4642f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.List;

public final class C4643a implements C4641e {
    public final C2206c f23867a;
    public final C3646a f23868b;
    public final C0988c f23869c;
    public final C1461c f23870d;
    public final C2906h f23871e;
    public final C2885b f23872f;
    public final C1506e f23873g;
    public final C1627b f23874h;
    public C2899a f23875i;

    public C4643a(C2206c c2206c, C3646a c3646a, C0988c c0988c, C1461c c1461c, C2906h c2906h, C2885b c2885b, C1506e c1506e, C1627b c1627b) {
        this.f23867a = c2206c;
        this.f23868b = c3646a;
        this.f23869c = c0988c;
        this.f23870d = c1461c;
        this.f23871e = c2906h;
        this.f23873g = c1506e;
        this.f23872f = c2885b;
        this.f23874h = c1627b;
    }

    public final void mo4313a(C2239c c2239c, List list, C4642f c4642f) {
        boolean z;
        if (!this.f23873g.m8838a()) {
            FinskyLog.m21659a("Skipping update checks because the store is invalid.", new Object[0]);
            C4643a.m21605a(c2239c, false);
            z = false;
        } else if (this.f23869c.cY() == null) {
            C4643a.m21605a(c2239c, true);
            z = false;
        } else if (!this.f23868b.f18022b.m11208b()) {
            FinskyLog.m21669e("Require loaded app states to perform update check.", new Object[0]);
            C4643a.m21605a(c2239c, false);
            z = false;
        } else if (this.f23867a.mo2816a()) {
            C1627b c1627b = this.f23874h;
            z = !c1627b.m9313c() ? true : c1627b.f8549g.getCount() <= 0;
            if (z) {
                z = true;
            } else {
                FinskyLog.m21669e("Require initialized Gearhead monitor to perform update check.", new Object[0]);
                C4643a.m21605a(c2239c, false);
                z = false;
            }
        } else {
            FinskyLog.m21669e("Require loaded libraries to perform update check.", new Object[0]);
            C4643a.m21605a(c2239c, false);
            z = false;
        }
        if (z) {
            bb.m21792a(new C4644b(this, list, this.f23867a.mo2817b(), c2239c, c4642f), list);
        }
    }

    static void m21605a(C2239c c2239c, boolean z) {
        if (c2239c != null) {
            c2239c.mo2827a(z);
        }
    }
}
