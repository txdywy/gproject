package com.google.android.finsky.layout.play;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;

final class C3697f implements Runnable {
    public final /* synthetic */ FinskyDrawerLayout f18778a;

    C3697f(FinskyDrawerLayout finskyDrawerLayout) {
        this.f18778a = finskyDrawerLayout;
    }

    public final void run() {
        this.f18778a.m17537b(109);
        String db = C1473m.f7980a.db();
        if (db == null) {
            FinskyLog.m21669e("Redeem chosen with no current account.", new Object[0]);
        } else {
            this.f18778a.f18667P.mo3670a(db, null, this.f18778a.ad);
        }
    }
}
