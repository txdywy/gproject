package com.google.android.finsky.detailspage;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1290m;

final class bx implements C0657w {
    public final /* synthetic */ bt f14344a;

    bx(bt btVar) {
        this.f14344a = btVar;
    }

    public final void mo1062a(VolleyError volleyError) {
        ((by) this.f14344a.b).f14349e = this.f14344a.f14330i;
        ((by) this.f14344a.b).f14347c = this.f14344a.f14331j;
        ((by) this.f14344a.b).f14348d = this.f14344a.f14332k;
        this.f14344a.m14001a(true);
        Toast.makeText(this.f14344a.t, C1290m.m7702a(this.f14344a.t, volleyError), 0).show();
    }
}
