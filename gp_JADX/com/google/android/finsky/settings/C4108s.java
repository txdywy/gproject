package com.google.android.finsky.settings;

import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1882i;

final class C4108s implements C1882i {
    public final /* synthetic */ SettingsActivity f20534a;

    C4108s(SettingsActivity settingsActivity) {
        this.f20534a = settingsActivity;
    }

    public final void g_() {
    }

    public final void mo2509a(AuthState authState) {
        this.f20534a.startActivityForResult(GaiaAuthActivity.m19034a(this.f20534a, this.f20534a.f20463A, false, authState, null, this.f20534a.f20466D), 37);
    }
}
