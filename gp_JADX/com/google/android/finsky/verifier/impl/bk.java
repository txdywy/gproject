package com.google.android.finsky.verifier.impl;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.provider.Settings.Global;
import com.google.android.finsky.utils.FinskyLog;

@TargetApi(18)
final class bk implements bh {
    public final /* synthetic */ bg f24458a;

    bk(bg bgVar) {
        this.f24458a = bgVar;
    }

    public final String mo4347a() {
        return "GooglerConsent";
    }

    public final int mo4349b() {
        return 1;
    }

    public final boolean mo4350c() {
        return true;
    }

    public final void mo4348a(int i, Boolean bool) {
        if (bool != null) {
            try {
                int i2;
                ContentResolver contentResolver = this.f24458a.f24448b.getContentResolver();
                String str = "upload_apk_enable";
                if (bool.booleanValue()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                Global.putInt(contentResolver, str, i2);
            } catch (SecurityException e) {
                FinskyLog.m21667d("Error while setting consent: %s", e);
            }
        }
    }

    public final boolean mo4351d() {
        return false;
    }

    public final void mo4352e() {
    }

    public final void mo4353f() {
    }

    public final boolean mo4354g() {
        return false;
    }
}
