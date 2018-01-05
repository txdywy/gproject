package com.google.android.finsky.billing.myaccount;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.SwitchCompat;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class at implements C0657w {
    public final /* synthetic */ boolean f10222a;
    public final /* synthetic */ as f10223b;

    at(as asVar, boolean z) {
        this.f10223b = asVar;
        this.f10222a = z;
    }

    public final void mo1062a(VolleyError volleyError) {
        boolean z;
        SwitchCompat switchCompat = this.f10223b.f10219b;
        if (this.f10222a) {
            z = false;
        } else {
            z = true;
        }
        switchCompat.setChecked(z);
        FinskyLog.m21667d("Error writing opt-in value: %s", volleyError);
        Snackbar.m499a(this.f10223b.f10220c, (int) C7582R.string.generic_error, 0).m493a();
    }
}
