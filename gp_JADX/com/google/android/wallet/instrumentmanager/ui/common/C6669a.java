package com.google.android.wallet.instrumentmanager.ui.common;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.google.a.a.a.a.b.a.a.f.i;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.ui.common.br;

public final class C6669a extends br implements C6494b {
    public static C6669a m30205a(i iVar, int i, LogContext logContext) {
        Fragment c6669a = new C6669a();
        c6669a.f(br.m30191c(iVar, i, logContext));
        return c6669a;
    }

    public final void mo5470a(Activity activity) {
        super.mo5470a(activity);
        this.af = this;
    }

    public final void mo5561a(C6504m c6504m, int i) {
        C6567a.m29805a(c6504m, -1, i);
    }

    public final void mo5560a(C6504m c6504m) {
        C6567a.m29805a(c6504m, 1636, 1622);
    }
}
