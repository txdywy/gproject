package com.google.android.finsky.activities;

import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

final class C1135z implements C0657w {
    public final /* synthetic */ C1033t f7091a;

    C1135z(C1033t c1033t) {
        this.f7091a = c1033t;
    }

    public final void mo1062a(VolleyError volleyError) {
        Toast.makeText(this.f7091a, this.f7091a.getString(C7582R.string.debug_play_country_override_failure), 1).show();
        FinskyLog.m21667d("%s Volley error message: %s", r0, volleyError.getMessage());
    }
}
