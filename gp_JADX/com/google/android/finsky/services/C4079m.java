package com.google.android.finsky.services;

import com.android.vending.licensing.C0645a;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final class C4079m implements C0657w {
    public final /* synthetic */ C0645a f20440a;

    C4079m(C0645a c0645a) {
        this.f20440a = c0645a;
    }

    public final void mo1062a(VolleyError volleyError) {
        LicensingService.m18993a(this.f20440a, 257, null, null);
    }
}
