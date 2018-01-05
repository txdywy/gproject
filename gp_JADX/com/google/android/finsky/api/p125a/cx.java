package com.google.android.finsky.api.p125a;

import com.android.volley.AuthFailureError;
import com.android.volley.C0690f;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1285f;

public final class cx extends C0690f {
    public final C1251b f7521e;
    public boolean f7522f;

    public cx(int i, C1251b c1251b) {
        super(i, ((Integer) C1285f.f7608e.m28964b()).intValue(), ((Float) C1285f.f7609f.m28964b()).floatValue());
        this.f7521e = c1251b;
    }

    public cx(int i, int i2, float f, C1251b c1251b) {
        super(i, i2, f);
        this.f7521e = c1251b;
    }

    public final void mo1078a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (this.f7522f) {
                throw volleyError;
            }
            this.f7522f = true;
            this.f7521e.m7291c();
        }
        super.mo1078a(volleyError);
    }
}
