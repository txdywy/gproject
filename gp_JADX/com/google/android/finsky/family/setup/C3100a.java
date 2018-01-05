package com.google.android.finsky.family.setup;

import android.support.v4.app.aw;
import com.google.android.finsky.bc.C1573p;

final class C3100a implements Runnable {
    public final /* synthetic */ C1573p f16042a;
    public final /* synthetic */ boolean f16043b;
    public final /* synthetic */ FamilySetupActivity f16044c;

    C3100a(FamilySetupActivity familySetupActivity, C1573p c1573p, boolean z) {
        this.f16044c = familySetupActivity;
        this.f16042a = c1573p;
        this.f16043b = z;
    }

    public final void run() {
        aw b = this.f16044c.H_().mo284a().mo331b(16908290, this.f16042a);
        if (this.f16043b) {
            b.mo330a(null);
        }
        b.mo334c();
    }
}
