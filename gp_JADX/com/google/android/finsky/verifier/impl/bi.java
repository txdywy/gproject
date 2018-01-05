package com.google.android.finsky.verifier.impl;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;

@TargetApi(21)
final class bi extends bj {
    public final /* synthetic */ bg f24457a;

    bi(bg bgVar) {
        this.f24457a = bgVar;
        super(bgVar);
    }

    public final String mo4347a() {
        return "DeviceWideSecondaryUserConsent";
    }

    public final int mo4349b() {
        if (!((Boolean) C0955b.bz.m28964b()).booleanValue() || this.f24457a.m22132g()) {
            return 1;
        }
        bg bgVar = this.f24457a;
        int i = VERSION.SDK_INT >= 17 ? Global.getInt(bgVar.f24448b.getContentResolver(), "package_verifier_enable", 1) > 0 ? 1 : 0 : Secure.getInt(bgVar.f24448b.getContentResolver(), "package_verifier_enable", 1) > 0 ? 1 : 0;
        if (i == 0) {
            return -1;
        }
        i = Global.getInt(this.f24457a.f24448b.getContentResolver(), "package_verifier_user_consent", 0);
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }

    public final void mo4348a(int i, Boolean bool) {
        FinskyLog.m21667d("Attempting to set verify apps consent in a secondary user profile", new Object[0]);
    }

    public final boolean mo4350c() {
        return false;
    }

    public final boolean mo4351d() {
        return false;
    }

    public final void mo4352e() {
    }

    public final void mo4353f() {
    }
}
