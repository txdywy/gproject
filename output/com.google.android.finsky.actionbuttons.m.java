package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cw.a;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.actionbuttons.m implements View$OnClickListener
{

    public final com.google.android.finsky.cw.a a;
    public final Context b;

    m(com.google.android.finsky.cw.a p0, Context p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void onClick(View p0) {
        this.b.getPackageManager().setApplicationEnabledSetting(this.a.h.a.c, 1, 0);
    }

}
