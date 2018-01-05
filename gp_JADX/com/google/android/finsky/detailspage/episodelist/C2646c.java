package com.google.android.finsky.detailspage.episodelist;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;

final class C2646c implements C0657w {
    public final /* synthetic */ C2644a f14523a;

    C2646c(C2644a c2644a) {
        this.f14523a = c2644a;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f14523a.f14515j = true;
        this.f14523a.f14514i = false;
        this.f14523a.m14292a(true);
        Toast.makeText(this.f14523a.t, C1290m.m7702a(this.f14523a.t, volleyError), 0).show();
    }
}
