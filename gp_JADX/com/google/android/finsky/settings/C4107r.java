package com.google.android.finsky.settings;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.billing.legacyauth.AuthState;
import com.google.android.finsky.billing.legacyauth.C1882i;

final class C4107r implements C1882i {
    public final /* synthetic */ int f20531a;
    public final /* synthetic */ int f20532b;
    public final /* synthetic */ SettingsActivity f20533c;

    C4107r(SettingsActivity settingsActivity, int i, int i2) {
        this.f20533c = settingsActivity;
        this.f20531a = i;
        this.f20532b = i2;
    }

    public final void g_() {
    }

    public final void mo2509a(AuthState authState) {
        Context context = this.f20533c;
        int i = this.f20531a;
        int i2 = this.f20532b;
        boolean z = i2 != 2;
        Bundle bundle = new Bundle();
        bundle.putInt("purchase-auth-previous", i);
        bundle.putInt("purchase-auth-new", i2);
        context.startActivityForResult(GaiaAuthActivity.m19034a(context, context.f20463A, z, authState, bundle, context.f20466D), 32);
    }
}
