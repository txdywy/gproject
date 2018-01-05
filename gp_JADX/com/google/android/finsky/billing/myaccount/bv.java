package com.google.android.finsky.billing.myaccount;

import android.support.v4.app.Fragment;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.p111d.C2495w;

final class bv implements C0657w {
    public final C2495w f10278a;
    public final /* synthetic */ bu f10279b;

    public bv(bu buVar, C2495w c2495w) {
        this.f10279b = buVar;
        this.f10278a = c2495w;
    }

    public final void mo1062a(VolleyError volleyError) {
        Fragment fragment = this.f10279b;
        bu.m10621a(1, volleyError, this.f10278a);
        fragment.f10276b = C1290m.m7702a(fragment.m603h(), volleyError);
        fragment.m6758b(3, 0);
    }
}
