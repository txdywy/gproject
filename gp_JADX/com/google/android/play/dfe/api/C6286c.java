package com.google.android.play.dfe.api;

import com.android.volley.AuthFailureError;
import com.android.volley.C0690f;
import com.android.volley.VolleyError;
import com.google.android.play.utils.p354b.C6322j;

public final class C6286c extends C0690f {
    public final C6288e f31352e;
    public boolean f31353f;

    public C6286c(C6288e c6288e) {
        super(((Integer) C6322j.f31590d.m28964b()).intValue(), ((Integer) C6322j.f31591e.m28964b()).intValue(), ((Float) C6322j.f31592f.m28964b()).floatValue());
        this.f31352e = c6288e;
    }

    public C6286c(int i, int i2, float f, C6288e c6288e) {
        super(i, i2, f);
        this.f31352e = c6288e;
    }

    public final void mo1078a(VolleyError volleyError) {
        if (volleyError instanceof AuthFailureError) {
            if (this.f31353f) {
                throw volleyError;
            }
            this.f31353f = true;
            this.f31352e.m28847a();
        }
        super.mo1078a(volleyError);
    }
}
