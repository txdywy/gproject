package com.google.android.finsky.packagemanager.impl;

import com.google.android.finsky.packagemanager.C3850d;
import com.google.android.finsky.utils.FinskyLog;

final class C3859h implements C3850d {
    public final /* synthetic */ C3858g f19258a;

    C3859h(C3858g c3858g) {
        this.f19258a = c3858g;
    }

    public final void mo3826a(String str, int i) {
        this.f19258a.f19256k.mo2856b(this.f19258a.f19251f);
        try {
            FinskyLog.m21659a("Package install status for %s is %d", this.f19258a.f19251f, Integer.valueOf(i));
            if (i == 1) {
                this.f19258a.f19254i.post(new C3860i(this));
            } else {
                this.f19258a.f19254i.post(new C3861j(this, i));
            }
        } catch (Throwable e) {
            this.f19258a.f19254i.post(new C3862k(this, e));
            FinskyLog.m21663b(e, "Package install observer exception", new Object[0]);
        }
    }
}
