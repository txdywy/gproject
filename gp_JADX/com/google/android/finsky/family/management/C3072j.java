package com.google.android.finsky.family.management;

import android.support.design.widget.Snackbar;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.squareup.leakcanary.C7582R;

final class C3072j implements C0657w {
    public final /* synthetic */ C3070h f15978a;

    C3072j(C3070h c3070h) {
        this.f15978a = c3070h;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f15978a.m610k() && this.f15978a.at()) {
            this.f15978a.aj = -1;
            CharSequence string = this.f15978a.m603h().getString(C7582R.string.family_purchase_setting_save_failed, new Object[]{C1290m.m7702a(this.f15978a.m603h(), volleyError)});
            if (this.f15978a.bt != null) {
                Snackbar.m500a(this.f15978a.bt, string, 0).m493a();
            }
            this.f15978a.cg_();
            this.f15978a.m15784a(true);
        }
    }
}
