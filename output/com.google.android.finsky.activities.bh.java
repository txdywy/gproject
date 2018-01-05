package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import com.google.android.finsky.notification.c;

public final class com.google.android.finsky.activities.bh implements RadioGroup$OnCheckedChangeListener
{

    public final com.google.android.finsky.activities.bc a;

    bh(com.google.android.finsky.activities.bc p0) {
        this.a = p0;
    }

    public final void onCheckedChanged(RadioGroup p0, int p1) {
        if (p1 == 2131756801) {
            this.a.a.b(86400000);
            this.a.a("Reschedule deadline default");
        }
        else if (p1 == 2131756802) {
            this.a.a.b(5000);
            this.a.a("Reschedule deadline 5s");
        }
        else
            this.a.a("Unknown reschedule deadline");
    }

}
