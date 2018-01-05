package com.google.android.finsky.billing.lightpurchase.a;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public final class com.google.android.finsky.billing.lightpurchase.a.c implements RadioGroup$OnCheckedChangeListener
{

    public final com.google.android.finsky.billing.lightpurchase.a.a a;

    c(com.google.android.finsky.billing.lightpurchase.a.a p0) {
        this.a = p0;
    }

    public final void onCheckedChanged(RadioGroup p0, int p1) {
        if (this.a.al != 0 && p1 != -1 && ((RadioButton)this.a.ak.findViewById(p1)).isChecked()) {
            this.a.al.setChecked(0);
            this.a.am.setEnabled(0);
        }
    }

}
