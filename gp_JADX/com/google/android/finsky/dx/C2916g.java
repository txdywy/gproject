package com.google.android.finsky.dx;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C2916g implements C0657w {
    public final /* synthetic */ C0657w f15485a;

    C2916g(C0657w c0657w) {
        this.f15485a = c0657w;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Failed to write user settings: %s", volleyError.toString());
        if (this.f15485a != null) {
            this.f15485a.mo1062a(volleyError);
        }
    }
}
