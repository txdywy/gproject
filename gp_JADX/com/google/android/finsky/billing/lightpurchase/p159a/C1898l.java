package com.google.android.finsky.billing.lightpurchase.p159a;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v4.app.C0254u;
import android.support.v4.app.Fragment;
import java.util.Calendar;

public final class C1898l extends C0141p {
    public DatePickerDialog af;

    public final Dialog mo143a(Bundle bundle) {
        OnDateSetListener onDateSetListener;
        OnDateSetListener onDateSetListener2;
        Fragment fragment = this.f761r;
        if (fragment instanceof OnDateSetListener) {
            onDateSetListener = (OnDateSetListener) fragment;
        } else {
            C0254u h = m603h();
            onDateSetListener = h instanceof OnDateSetListener ? (OnDateSetListener) h : null;
        }
        if (VERSION.SDK_INT >= 16) {
            onDateSetListener2 = null;
        } else {
            onDateSetListener2 = onDateSetListener;
        }
        if (bundle == null) {
            Calendar calendar = (Calendar) this.f760q.getSerializable("DatePickerDialogFragment.calendar");
            this.af = new DatePickerDialog(m603h(), onDateSetListener2, calendar.get(1), calendar.get(2), calendar.get(5));
        } else {
            this.af = new DatePickerDialog(m603h(), onDateSetListener2, 0, 0, 0);
            this.af.onRestoreInstanceState(bundle.getBundle("DatePickerDialogFragment.calendar"));
        }
        if (VERSION.SDK_INT >= 16) {
            this.af.setButton(-1, m603h().getString(17039370), new C1899m(this, onDateSetListener));
            this.af.setButton(-2, m603h().getString(17039360), new C1900n());
        }
        return this.af;
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBundle("DatePickerDialogFragment.calendar", this.af.onSaveInstanceState());
    }
}
