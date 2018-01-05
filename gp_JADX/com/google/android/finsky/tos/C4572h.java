package com.google.android.finsky.tos;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;

final class C4572h implements C0657w {
    public final /* synthetic */ C2482j f23375a;

    C4572h(C2482j c2482j) {
        this.f23375a = c2482j;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("TU:Error sending TOS acceptance: %s", volleyError);
        this.f23375a.m13319a(new C2474c(946).m13238a((Throwable) volleyError).f13342a, null);
    }
}
