package com.google.android.finsky.instantappsquickinstall;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C3605b implements C0657w {
    public final /* synthetic */ InstantAppsInstallDialogActivity f17933a;

    C3605b(InstantAppsInstallDialogActivity instantAppsInstallDialogActivity) {
        this.f17933a = instantAppsInstallDialogActivity;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21660a(volleyError, "Error loading details for package %s", this.f17933a.f17920G.f17930a);
        this.f17933a.finish();
        this.f17933a.f17923J = null;
    }
}
