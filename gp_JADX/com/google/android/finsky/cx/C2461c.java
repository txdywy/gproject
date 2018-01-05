package com.google.android.finsky.cx;

import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.at.C1508k;
import com.squareup.leakcanary.C7582R;

final class C2461c implements C0657w {
    public final /* synthetic */ Fragment f13281a;

    C2461c(Fragment fragment) {
        this.f13281a = fragment;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f13281a.f730B != null && this.f13281a.m612l()) {
            ab abVar = this.f13281a.f730B;
            C1508k c1508k = new C1508k();
            c1508k.m8848a((int) C7582R.string.uninstall_refund_fail_body).m8860d((int) C7582R.string.ok);
            c1508k.mo2272a().m625a(abVar, "refund_failure");
        }
    }
}
