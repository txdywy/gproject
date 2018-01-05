package com.google.android.finsky.verifier.impl;

import android.content.ContentResolver;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import com.google.android.finsky.utils.FinskyLog;

final class bn extends bm {
    public final /* synthetic */ bg f24461a;

    bn(bg bgVar) {
        this.f24461a = bgVar;
        super(bgVar);
    }

    public final String mo4347a() {
        return "PreferenceConsentWithExport";
    }

    public final void mo4348a(int i, Boolean bool) {
        super.mo4348a(i, bool);
        try {
            ContentResolver contentResolver = this.f24461a.f24448b.getContentResolver();
            Secure.putInt(contentResolver, "package_verifier_user_consent", i);
            if (bool != null) {
                int i2;
                String str = "upload_apk_enable";
                if (bool.booleanValue()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                Global.putInt(contentResolver, str, i2);
            }
        } catch (SecurityException e) {
            FinskyLog.m21667d("Error while setting consent: %s", e);
        }
    }

    public final boolean mo4350c() {
        return true;
    }
}
