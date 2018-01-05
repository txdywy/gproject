package com.google.android.finsky.detailspage;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;

final class bv implements C0657w {
    public final /* synthetic */ bt f14342a;

    bv(bt btVar) {
        this.f14342a = btVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f14342a.t, C1290m.m7702a(this.f14342a.t, volleyError), 0).show();
    }
}
