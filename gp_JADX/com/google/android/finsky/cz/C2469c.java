package com.google.android.finsky.cz;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;

public final class C2469c implements C0657w {
    public final /* synthetic */ C0657w f13301a;
    public final /* synthetic */ String f13302b;
    public final /* synthetic */ int f13303c = 1;
    public final /* synthetic */ C2467a f13304d;

    public C2469c(C2467a c2467a, C0657w c0657w, String str) {
        this.f13304d = c2467a;
        this.f13301a = c0657w;
        this.f13302b = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        if (this.f13301a != null) {
            this.f13301a.mo1062a(volleyError);
        }
        C2467a c2467a = this.f13304d;
        String str = this.f13302b;
        int i = this.f13303c;
        for (int i2 = 0; i2 < c2467a.f13295b.size(); i2++) {
            ((C1001d) c2467a.f13295b.get(i2)).mo1207a(str, i);
        }
    }
}
