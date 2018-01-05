package com.google.android.finsky.detailsmodules.modules.subscriptions;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C2615f implements C0657w {
    public static final C0657w f13880a = new C2615f();

    private C2615f() {
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Could not retrieve subscription docs: %s", volleyError);
    }
}
