package com.google.android.finsky.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.p;
import android.view.View;
import com.google.android.finsky.at.k;

public final class com.google.android.finsky.activities.bz implements View$OnClickListener
{

    public final com.google.android.finsky.activities.bq a;

    bz(com.google.android.finsky.activities.bq p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        if (this.a.A.B.a("deactivate_dialog") == 0) {
            this.a.d(216);
            v1 = new com.google.android.finsky.at.k();
            v1.a(2131951957).d(2131952688);
            v1.a().a(this.a.A.B, "deactivate_dialog");
        }
    }

}
