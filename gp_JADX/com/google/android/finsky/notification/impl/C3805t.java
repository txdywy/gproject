package com.google.android.finsky.notification.impl;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C3805t implements C0657w {
    public static final C0657w f19106a = new C3805t();

    private C3805t() {
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Failed to mark notifications as read: %s", volleyError);
    }
}
