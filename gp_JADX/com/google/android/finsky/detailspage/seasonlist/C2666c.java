package com.google.android.finsky.detailspage.seasonlist;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;

final class C2666c implements C0657w {
    public final /* synthetic */ C2664a f14741a;

    C2666c(C2664a c2664a) {
        this.f14741a = c2664a;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f14741a.t, C1290m.m7702a(this.f14741a.t, volleyError), 0).show();
    }
}
