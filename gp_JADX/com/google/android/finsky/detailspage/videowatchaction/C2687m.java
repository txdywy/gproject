package com.google.android.finsky.detailspage.videowatchaction;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;

final class C2687m implements C0657w {
    public final /* synthetic */ String f14813a;
    public final /* synthetic */ boolean f14814b;
    public final /* synthetic */ C2683i f14815c;

    C2687m(C2683i c2683i, String str, boolean z) {
        this.f14815c = c2683i;
        this.f14813a = str;
        this.f14814b = z;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f14815c.f14804i.remove(this.f14813a);
        this.f14815c.m14525b();
        if (this.f14814b) {
            Toast.makeText(this.f14815c.f14798c, C1290m.m7702a(this.f14815c.f14798c, volleyError), 0).show();
        }
    }
}
