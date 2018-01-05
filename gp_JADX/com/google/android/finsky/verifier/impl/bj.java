package com.google.android.finsky.verifier.impl;

import android.annotation.TargetApi;
import android.app.backup.BackupManager;
import android.content.ContentResolver;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;

@TargetApi(21)
class bj implements bh {
    public final /* synthetic */ bg f24456a;

    bj(bg bgVar) {
        this.f24456a = bgVar;
    }

    public String mo4347a() {
        return "DeviceWideSystemUserConsent";
    }

    public int mo4349b() {
        int i;
        bg bgVar = this.f24456a;
        boolean z;
        if (VERSION.SDK_INT >= 17) {
            if (Global.getInt(bgVar.f24448b.getContentResolver(), "package_verifier_enable", 1) > 0) {
                i = 1;
            } else {
                z = false;
            }
        } else if (Secure.getInt(bgVar.f24448b.getContentResolver(), "package_verifier_enable", 1) > 0) {
            i = 1;
        } else {
            z = false;
        }
        if (i == 0) {
            mo4348a(-1, null);
        }
        if (!((Boolean) C0955b.bz.m28964b()).booleanValue() || this.f24456a.m22132g()) {
            return 1;
        }
        i = Global.getInt(this.f24456a.f24448b.getContentResolver(), "package_verifier_user_consent", 0);
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        if (!mo4350c() || !this.f24456a.f24451e.m21204a()) {
            return 0;
        }
        mo4348a(1, Boolean.valueOf(false));
        return 1;
    }

    public void mo4348a(int i, Boolean bool) {
        try {
            ContentResolver contentResolver = this.f24456a.f24448b.getContentResolver();
            Global.putInt(contentResolver, "package_verifier_user_consent", i);
            new BackupManager(this.f24456a.f24448b).dataChanged();
            if (Global.getInt(contentResolver, "package_verifier_enable", 1) != 1) {
                Global.putInt(contentResolver, "package_verifier_enable", 1);
            }
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

    public boolean mo4350c() {
        return true;
    }

    public boolean mo4351d() {
        return mo4349b() == 0;
    }

    public void mo4352e() {
        int i;
        try {
            Global.getInt(this.f24456a.f24448b.getContentResolver(), "package_verifier_user_consent");
            i = 1;
        } catch (SettingNotFoundException e) {
            i = 0;
        }
        if (i == 0) {
            mo4348a(0, null);
        }
    }

    public void mo4353f() {
    }

    public final boolean mo4354g() {
        if (Global.getInt(this.f24456a.f24448b.getContentResolver(), "package_verifier_user_consent", 0) > 0) {
            return true;
        }
        return false;
    }
}
