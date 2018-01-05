package com.google.android.finsky.activities;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.activities.cc implements View$OnClickListener
{

    public final com.google.android.finsky.activities.bq a;

    cc(com.google.android.finsky.activities.bq p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.d(220);
        this.a.B.getPackageManager().setApplicationEnabledSetting(this.a.D.a.c, 1, 0);
    }

}
