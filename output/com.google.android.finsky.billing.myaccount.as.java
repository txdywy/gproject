package com.google.android.finsky.billing.myaccount;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dx.a;

public final class com.google.android.finsky.billing.myaccount.as implements CompoundButton$OnCheckedChangeListener
{

    public final String a;
    public final SwitchCompat b;
    public final View c;
    public final com.google.android.finsky.billing.myaccount.an d;

    as(com.google.android.finsky.billing.myaccount.an p0, String p1, SwitchCompat p2, View p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onCheckedChanged(CompoundButton p0, boolean p1) {
        if (p1 != 0)
            v0 = 2690;
        else
            v0 = 2691;
        this.d.j.b(new com.google.android.finsky.d.d(this.d.l).a(v0));
        this.d.g.a(this.a, p1, new com.google.android.finsky.billing.myaccount.at(this, p1));
    }

}
