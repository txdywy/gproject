package com.google.android.instantapps.common.loading.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class C5827m implements OnClickListener {
    public final /* synthetic */ C5822h f29295a;

    C5827m(C5822h c5822h) {
        this.f29295a = c5822h;
    }

    public final void onClick(View view) {
        this.f29295a.a.mo3495l();
        this.f29295a.aM.mo5136a(104);
        this.f29295a.aC.m26968a("IASupervisor.LoadingScreenFragment.confirmButton");
        this.f29295a.am.setVisibility(4);
        this.f29295a.ax = 3;
        this.f29295a.ad();
        if (this.f29295a.aB == 3) {
            this.f29295a.ae();
            return;
        }
        this.f29295a.af();
        this.f29295a.ab();
    }
}
