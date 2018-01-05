package com.google.android.finsky.wear;

import com.google.android.finsky.utils.FinskyLog;

final class bf implements cj {
    public final /* synthetic */ String f24873a;
    public final /* synthetic */ cc f24874b;
    public final /* synthetic */ ar f24875c;

    bf(ar arVar, String str, cc ccVar) {
        this.f24875c = arVar;
        this.f24873a = str;
        this.f24874b = ccVar;
    }

    public final void mo4393a(boolean z) {
        FinskyLog.m21659a("Completed daily hygiene for node %s", this.f24873a);
        if (z) {
            this.f24875c.f24823g.f24798h.m22552b();
        }
        this.f24875c.m22468a(this.f24873a, this.f24874b);
    }
}
