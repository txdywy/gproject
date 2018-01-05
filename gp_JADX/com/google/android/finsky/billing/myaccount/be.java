package com.google.android.finsky.billing.myaccount;

import android.support.design.widget.Snackbar;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.squareup.leakcanary.C7582R;

final class be implements C0657w {
    public final /* synthetic */ ba f10246a;

    be(ba baVar) {
        this.f10246a = baVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f10246a.f746R != null) {
            Snackbar.m499a(this.f10246a.f746R, (int) C7582R.string.generic_error, 0).m493a();
        }
    }
}
