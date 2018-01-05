package com.google.android.finsky.billing.lightpurchase.a;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog$OnDateSetListener;
import android.content.DialogInterface;
import android.widget.DatePicker;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.a.m implements DialogInterface$OnClickListener
{

    public final DatePickerDialog$OnDateSetListener a;
    public final com.google.android.finsky.billing.lightpurchase.a.l b;

    m(com.google.android.finsky.billing.lightpurchase.a.l p0, DatePickerDialog$OnDateSetListener p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(DialogInterface p0, int p1) {
        if (this.a != 0) {
            v0 = this.b.af.getDatePicker();
            this.a.onDateSet(v0, v0.getYear(), v0.getMonth(), v0.getDayOfMonth());
        }
        else
            FinskyLog.e("No listener found.", new Object[0]);
    }

}
