package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import com.google.android.finsky.notification.c;

public final class com.google.android.finsky.activities.bf implements RadioGroup$OnCheckedChangeListener
{

    public final com.google.android.finsky.activities.bc a;

    bf(com.google.android.finsky.activities.bc p0) {
        this.a = p0;
    }

    public final void onCheckedChanged(RadioGroup p0, int p1) {
        if (p1 == 2131756794) {
            this.a.a.a(0);
            this.a.a("Use machine learning model");
        }
        else if (p1 == 2131756795) {
            this.a.a.a(1);
            this.a.a("Always delay");
        }
        else if (p1 == 2131756796) {
            this.a.a.a(2);
            this.a.a("Never delay");
        }
        else
            this.a.a("Unknown delay decision");
    }

}
