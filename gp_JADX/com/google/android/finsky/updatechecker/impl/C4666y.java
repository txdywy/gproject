package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dv.C2905g;
import com.google.android.finsky.utils.FinskyLog;

final class C4666y implements C1031w {
    public final /* synthetic */ C2905g f24018a;
    public final /* synthetic */ C4665x f24019b;

    C4666y(C4665x c4665x, C2905g c2905g) {
        this.f24019b = c4665x;
        this.f24018a = c2905g;
    }

    public final void m_() {
        if (this.f24019b.f24017c.f24010b.cX().isEmpty()) {
            this.f24019b.f24016b.mo4318a(this.f24018a.f15445f);
            C4664w.m21652a(this.f24019b.f24015a, true);
            return;
        }
        FinskyLog.m21665c("Skipping unauth update check because account is now available.", new Object[0]);
        C4664w.m21652a(this.f24019b.f24015a, false);
    }
}
