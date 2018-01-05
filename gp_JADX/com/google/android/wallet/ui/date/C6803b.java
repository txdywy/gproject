package com.google.android.wallet.ui.date;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.p;
import android.widget.DatePicker;
import com.google.a.a.a.a.a.b.d;
import com.google.android.wallet.common.util.ParcelableProto;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class C6803b extends p {
    public OnDateSetListener af;

    public final Dialog m30950a(Bundle bundle) {
        int i;
        int i2;
        int i3;
        Calendar gregorianCalendar = new GregorianCalendar();
        d dVar = (d) ParcelableProto.m29887a(this.q, "initialDate");
        d dVar2 = (d) ParcelableProto.m29887a(this.q, "minDate");
        d dVar3 = (d) ParcelableProto.m29887a(this.q, "maxDate");
        if (dVar != null) {
            i = dVar.a;
            i2 = dVar.b - 1;
            i3 = dVar.c;
        } else {
            Calendar instance = GregorianCalendar.getInstance();
            i = instance.get(1);
            i2 = instance.get(2);
            i3 = instance.get(5);
            if (dVar2 != null) {
                gregorianCalendar.set(dVar2.a, dVar2.b - 1, dVar2.c);
                if (instance.compareTo(gregorianCalendar) < 0) {
                    i = gregorianCalendar.get(1);
                    i2 = gregorianCalendar.get(2);
                    i3 = gregorianCalendar.get(5);
                }
            }
            if (dVar3 != null) {
                gregorianCalendar.set(dVar3.a, dVar3.b - 1, dVar3.c);
                if (instance.compareTo(gregorianCalendar) > 0) {
                    i = gregorianCalendar.get(1);
                    i2 = gregorianCalendar.get(2);
                    i3 = gregorianCalendar.get(5);
                }
            }
        }
        Dialog datePickerDialog = new DatePickerDialog(h(), this.af, i, i2, i3);
        DatePicker datePicker = datePickerDialog.getDatePicker();
        if (dVar2 != null) {
            gregorianCalendar.set(dVar2.a - 1, dVar2.b - 1, dVar2.c);
            datePicker.setMinDate(gregorianCalendar.getTimeInMillis());
            gregorianCalendar.set(dVar2.a, dVar2.b - 1, dVar2.c);
            datePicker.setMinDate(gregorianCalendar.getTimeInMillis());
        }
        if (dVar3 != null) {
            gregorianCalendar.set(dVar3.a + 1, dVar3.b - 1, dVar3.c);
            datePicker.setMaxDate(gregorianCalendar.getTimeInMillis());
            gregorianCalendar.set(dVar3.a, dVar3.b - 1, dVar3.c);
            datePicker.setMaxDate(gregorianCalendar.getTimeInMillis());
        }
        return datePickerDialog;
    }
}
