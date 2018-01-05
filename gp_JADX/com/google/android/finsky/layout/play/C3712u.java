package com.google.android.finsky.layout.play;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;

final class C3712u implements Runnable {
    public final /* synthetic */ FinskyDrawerLayout f18797a;

    C3712u(FinskyDrawerLayout finskyDrawerLayout) {
        this.f18797a = finskyDrawerLayout;
    }

    public final void run() {
        this.f18797a.m17537b(109);
        String db = C1473m.f7980a.db();
        if (db == null) {
            FinskyLog.m21669e("Redeem chosen with no current account.", new Object[0]);
        } else {
            this.f18797a.f18667P.mo3670a(db, null, this.f18797a.ad);
        }
    }
}
