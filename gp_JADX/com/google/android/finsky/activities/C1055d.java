package com.google.android.finsky.activities;

import android.content.Intent;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.utils.FinskyLog;

final class C1055d implements C1054h {
    public final /* synthetic */ boolean[] f6652a;
    public final /* synthetic */ boolean f6653b;
    public final /* synthetic */ C1036b f6654c;

    C1055d(C1036b c1036b, boolean[] zArr, boolean z) {
        this.f6654c = c1036b;
        this.f6652a = zArr;
        this.f6653b = z;
    }

    public final void P_() {
        this.f6652a[0] = false;
        this.f6654c.f6317D.m15191b((C1054h) this);
        if (this.f6654c.f6318E.mo1194a(this.f6654c.m6071q())) {
            this.f6654c.m6067g(this.f6653b);
            return;
        }
        Intent intent;
        C1036b c1036b = this.f6654c;
        if (this.f6653b) {
            intent = this.f6654c.getIntent();
        } else {
            intent = null;
        }
        c1036b.m6056a(null, intent, false, "account_switched");
    }

    public final void ce_() {
        this.f6652a[0] = false;
        this.f6654c.f6317D.m15191b((C1054h) this);
        FinskyLog.m21665c("User settings failed to load, continuing start anyways.", new Object[0]);
        this.f6654c.m6067g(this.f6653b);
    }
}
