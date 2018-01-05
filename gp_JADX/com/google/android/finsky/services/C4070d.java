package com.google.android.finsky.services;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C4070d implements C0657w {
    public final /* synthetic */ GmsCoreUpdateService f20436a;

    C4070d(GmsCoreUpdateService gmsCoreUpdateService) {
        this.f20436a = gmsCoreUpdateService;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21660a(volleyError, "Error while getting bulk details.", new Object[0]);
        this.f20436a.stopSelf();
    }
}
