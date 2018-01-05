package com.google.android.finsky.activities;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import java.util.List;

public final class com.google.android.finsky.activities.bt implements View$OnClickListener
{

    public final com.google.android.finsky.activities.bq a;

    bt(com.google.android.finsky.activities.bq p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.d(2943);
        if (!this.a.B.getPackageManager().queryIntentActivities(this.a.af, 131072).isEmpty())
            this.a.B.startActivity(this.a.af);
    }

}
