package com.google.android.wallet.instrumentmanager.ui.p390a;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.google.a.a.a.a.b.a.a.c.b.a.p;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6496d;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.ui.card.C6649a;
import com.google.android.wallet.ui.card.C6652j;
import com.google.android.wallet.ui.common.au;

public final class C6650a extends C6649a implements C6494b, C6496d {
    public final void mo5470a(Activity activity) {
        super.mo5470a(activity);
        this.ay = this;
        this.az = this;
    }

    protected final C6652j ab() {
        p pVar = (p) this.aD;
        int i = this.bc;
        LogContext as = as();
        Fragment c6653b = new C6653b();
        c6653b.f(au.m29850a(i, pVar, as));
        return c6653b;
    }

    public final void mo5561a(C6504m c6504m, int i) {
        C6567a.m29805a(c6504m, -1, i);
    }

    public final void mo5560a(C6504m c6504m) {
        C6567a.m29805a(c6504m, 1636, 1622);
    }

    public final void mo5478b(C6504m c6504m) {
        C6567a.m29804a(c6504m, -1);
    }

    public final void mo5481c(C6504m c6504m) {
        C6567a.m29804a(c6504m, 1636);
    }
}
