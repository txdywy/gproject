package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.utils.FinskyLog;

final class C4645c implements C1031w {
    public final /* synthetic */ C4644b f23944a;

    C4645c(C4644b c4644b) {
        this.f23944a = c4644b;
    }

    public final void m_() {
        if (this.f23944a.f23943e.f23867a.mo2817b() != this.f23944a.f23940b) {
            FinskyLog.m21665c("Skipping update check because account hash changed.", new Object[0]);
            C4643a.m21605a(this.f23944a.f23941c, false);
            return;
        }
        this.f23944a.f23942d.mo4318a(this.f23944a.f23943e.f23875i.f15421r);
        C4643a.m21605a(this.f23944a.f23941c, true);
    }
}
