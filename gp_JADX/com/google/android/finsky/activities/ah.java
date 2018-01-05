package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.squareup.leakcanary.C7582R;

final class ah implements C0657w {
    public final /* synthetic */ C1033t f6446a;

    ah(C1033t c1033t) {
        this.f6446a = c1033t;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f6446a, C7582R.string.debug_play_country_override_update_failed, 1).show();
    }
}
