package com.google.android.finsky.verifier.impl;

import android.app.backup.BackupManager;
import android.content.ComponentName;
import android.content.Intent;
import android.provider.Settings.Secure;

final class bq extends bp {
    public final /* synthetic */ bg f24464a;

    bq(bg bgVar) {
        this.f24464a = bgVar;
        super(bgVar);
    }

    public final String mo4347a() {
        return "SecureSettingsConsentPreKK";
    }

    public final void mo4348a(int i, Boolean bool) {
        boolean z = true;
        if (i != 0 || bool != null || Secure.getInt(this.f24464a.f24448b.getContentResolver(), "package_verifier_user_consent", 0) != 0) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.security.settings.UpdateConsentReceiver"));
            String str = "consent";
            if (i != 1) {
                z = false;
            }
            intent.putExtra(str, z);
            if (bool != null) {
                intent.putExtra("upload_consent", bool.booleanValue());
            }
            this.f24464a.f24448b.sendBroadcast(intent);
            new BackupManager(this.f24464a.f24448b).dataChanged();
        }
    }

    public final boolean mo4350c() {
        return true;
    }
}
