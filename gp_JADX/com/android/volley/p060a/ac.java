package com.android.volley.p060a;

import com.android.volley.VolleyError;

final class ac implements C0658x {
    public final /* synthetic */ boolean f4051a;
    public final /* synthetic */ ab f4052b;

    ac(ab abVar, boolean z) {
        this.f4052b = abVar;
        this.f4051a = z;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f4052b.f4048c != 0) {
            this.f4052b.setImageResource(this.f4052b.f4048c);
        }
    }

    public final void mo1063a(C0681w c0681w, boolean z) {
        if (z && this.f4051a) {
            this.f4052b.post(new ad(this, c0681w));
        } else if (c0681w.f4111a != null) {
            this.f4052b.setImageBitmap(c0681w.f4111a);
        } else if (this.f4052b.f4047b != 0) {
            this.f4052b.setImageResource(this.f4052b.f4047b);
        }
    }
}
