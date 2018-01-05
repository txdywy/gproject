package com.google.android.finsky.cx;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final class C2463e implements C0657w {
    public final /* synthetic */ C0657w f13285a;
    public final /* synthetic */ String f13286b;
    public final /* synthetic */ C2460b f13287c;

    C2463e(C2460b c2460b, C0657w c0657w, String str) {
        this.f13287c = c2460b;
        this.f13285a = c0657w;
        this.f13286b = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f13285a.mo1062a(volleyError);
        C2460b c2460b = this.f13287c;
        String str = this.f13286b;
        for (int i = 0; i < c2460b.f13277a.size(); i++) {
            ((C1000f) c2460b.f13277a.get(i)).mo1208a(str, false);
        }
    }
}
