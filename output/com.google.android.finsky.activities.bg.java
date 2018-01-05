package com.google.android.finsky.activities;

import android.widget.RadioGroup;
import com.google.android.finsky.notification.c;

public final class com.google.android.finsky.activities.bg implements RadioGroup$OnCheckedChangeListener
{

    public final com.google.android.finsky.activities.bc a;

    bg(com.google.android.finsky.activities.bc p0) {
        this.a = p0;
    }

    public final void onCheckedChanged(RadioGroup p0, int p1) {
        if (p1 == 2131756798) {
            this.a.a.a(43200000);
            this.a.a("Expiration default");
        }
        else if (p1 == 2131756799) {
            this.a.a.a(15000);
            this.a.a("Expiration 15s");
        }
        else
            this.a.a("Unknown expiration length");
    }

}
