package com.google.android.finsky.stream.controllers.p145d;

import android.content.Context;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.at.C1507b;
import com.google.android.finsky.at.C1510d;

final class C4370d implements C0657w {
    public final /* synthetic */ C1510d f22168a;
    public final /* synthetic */ C4367a f22169b;

    C4370d(C4367a c4367a, C1510d c1510d) {
        this.f22169b = c4367a;
        this.f22168a = c1510d;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f22168a.m610k()) {
            this.f22168a.m626a(false);
            Context h = this.f22168a.m603h();
            if (h != null) {
                C1507b.m8844a(this.f22168a.f730B, null, null, C1290m.m7702a(h, volleyError), this.f22169b.ai, 0);
            }
        }
    }
}
