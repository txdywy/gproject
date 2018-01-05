package com.google.android.finsky.billing.myaccount;

import android.support.design.widget.Snackbar;
import android.support.design.widget.g;
import android.support.v7.widget.SwitchCompat;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.myaccount.at implements com.android.volley.w
{

    public final boolean a;
    public final com.google.android.finsky.billing.myaccount.as b;

    at(com.google.android.finsky.billing.myaccount.as p0, boolean p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(VolleyError p0) {
        if (this.a == 0)
            v0 = 1;
        else
            v0 = 0;
        this.b.b.setChecked(v0);
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.d("Error writing opt-in value: %s", v1);
        Snackbar.a(this.b.c, 2131952241, 0).a();
    }

}
