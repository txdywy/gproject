package com.google.android.finsky.api.p125a;

import com.android.volley.AuthFailureError;
import com.android.volley.C0689z;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1285f;

public final class da implements C0689z {
    public final C1251b f7563a;
    public final int f7564b;
    public boolean f7565c;

    da(int i, C1251b c1251b) {
        this.f7564b = i;
        this.f7563a = c1251b;
    }

    public final int mo1077a() {
        return this.f7565c ? ((Integer) C1285f.f7615l.m28964b()).intValue() : this.f7564b;
    }

    public final int mo1079b() {
        return this.f7565c ? 1 : 0;
    }

    public final void mo1078a(VolleyError volleyError) {
        if (this.f7565c) {
            throw volleyError;
        }
        if (volleyError instanceof AuthFailureError) {
            this.f7563a.m7291c();
        }
        this.f7565c = true;
    }
}
