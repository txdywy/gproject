package com.google.android.wallet.common.p367c.p368a;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.f;

public final class C6569b extends f {
    public final C6568a f32692e;
    public boolean f32693f;

    public C6569b(int i, C6568a c6568a) {
        super(i, 1, 1.0f);
        this.f32692e = c6568a;
    }

    public final void m29811a(VolleyError volleyError) {
        if (!(volleyError instanceof AuthFailureError)) {
            throw volleyError;
        } else if (((AuthFailureError) volleyError).a != null || this.f32693f) {
            throw volleyError;
        } else {
            this.f32693f = true;
            this.f32692e.m29809a();
            super.a(volleyError);
        }
    }
}
