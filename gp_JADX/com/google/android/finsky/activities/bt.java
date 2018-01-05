package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;

final class bt implements OnClickListener {
    public final /* synthetic */ bq f6574a;

    bt(bq bqVar) {
        this.f6574a = bqVar;
    }

    public final void onClick(View view) {
        this.f6574a.m6350d(2943);
        if (!this.f6574a.B.getPackageManager().queryIntentActivities(this.f6574a.af, 131072).isEmpty()) {
            this.f6574a.B.startActivity(this.f6574a.af);
        }
    }
}
