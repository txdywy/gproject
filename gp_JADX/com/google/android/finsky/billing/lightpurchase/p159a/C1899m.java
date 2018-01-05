package com.google.android.finsky.billing.lightpurchase.p159a;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.DatePicker;
import com.google.android.finsky.utils.FinskyLog;

final class C1899m implements OnClickListener {
    public final /* synthetic */ OnDateSetListener f9710a;
    public final /* synthetic */ C1898l f9711b;

    C1899m(C1898l c1898l, OnDateSetListener onDateSetListener) {
        this.f9711b = c1898l;
        this.f9710a = onDateSetListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.f9710a != null) {
            DatePicker datePicker = this.f9711b.af.getDatePicker();
            this.f9710a.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
            return;
        }
        FinskyLog.m21669e("No listener found.", new Object[0]);
    }
}
