package com.google.android.finsky.billing.lightpurchase.a;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog$OnDateSetListener;
import android.app.Dialog;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v4.app.u;
import java.util.Calendar;

public final class com.google.android.finsky.billing.lightpurchase.a.l extends android.support.v4.app.p
{

    public DatePickerDialog af;

    l() {
        android.support.v4.app.p();
    }

    public final Dialog a(Bundle p0) {
        if (this.r instanceof DatePickerDialog$OnDateSetListener)
            v6 = (DatePickerDialog$OnDateSetListener)this.r;
        else {
            v0 = this.h();
            if (v0 instanceof DatePickerDialog$OnDateSetListener)
                v6 = (DatePickerDialog$OnDateSetListener)v0;
            else
                v6 = 0;
        }
        if (Build$VERSION.SDK_INT >= 16)
            v2 = 0;
        else
            v2 = v6;
        if (p0 == 0) {
            v5 = (Calendar)this.q.getSerializable("DatePickerDialogFragment.calendar");
            this.af = new DatePickerDialog(this.h(), v2, v5.get(1), v5.get(2), v5.get(5));
        }
        else {
            this.af = new DatePickerDialog(this.h(), v2, 0, 0, 0);
            this.af.onRestoreInstanceState(p0.getBundle("DatePickerDialogFragment.calendar"));
        }
        if (Build$VERSION.SDK_INT >= 16) {
            this.af.setButton(-1, this.h().getString(17039370), new com.google.android.finsky.billing.lightpurchase.a.m(this, v6));
            this.af.setButton(-2, this.h().getString(17039360), new com.google.android.finsky.billing.lightpurchase.a.n());
        }
        return this.af;
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putBundle("DatePickerDialogFragment.calendar", this.af.onSaveInstanceState());
    }

}
