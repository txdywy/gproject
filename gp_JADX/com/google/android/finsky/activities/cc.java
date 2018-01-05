package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;

final class cc implements OnClickListener {
    public final /* synthetic */ bq f6593a;

    cc(bq bqVar) {
        this.f6593a = bqVar;
    }

    public final void onClick(View view) {
        this.f6593a.m6350d(220);
        this.f6593a.B.getPackageManager().setApplicationEnabledSetting(this.f6593a.D.f14885a.f12096c, 1, 0);
    }
}
