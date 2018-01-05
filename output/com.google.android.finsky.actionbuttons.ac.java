package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public final class com.google.android.finsky.actionbuttons.ac extends com.google.android.finsky.actionbuttons.o implements View$OnClickListener
{

    public final Document f;

    ac(Context p0, int p1, Document p2, com.google.android.finsky.d.ad p3, com.google.android.finsky.d.w p4) {
        com.google.android.finsky.actionbuttons.o(p0, p1, p4, p3);
        this.f = p2;
    }

    public final int a() {
        return 220;
    }

    public final void a(PlayActionButtonV2 p0) {
        p0.a(this.f.a.f, this.a.getResources().getString(2131952111), this);
        p0.setActionStyle(this.b);
        this.b();
    }

    public final void onClick(View p0) {
        this.c();
        this.a.getPackageManager().setApplicationEnabledSetting(this.f.a.c, 1, 0);
    }

}
