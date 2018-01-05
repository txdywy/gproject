package com.google.android.finsky.updatechecker.impl;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C4667z implements C0657w {
    public final /* synthetic */ C4665x f24020a;

    C4667z(C4665x c4665x) {
        this.f24020a = c4665x;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21660a(volleyError, "Update check failed", new Object[0]);
        C4664w.m21652a(this.f24020a.f24015a, false);
    }
}
