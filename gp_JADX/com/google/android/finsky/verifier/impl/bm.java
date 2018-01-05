package com.google.android.finsky.verifier.impl;

import android.app.backup.BackupManager;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;

class bm implements bh {
    public final /* synthetic */ bg f24460a;

    bm(bg bgVar) {
        this.f24460a = bgVar;
    }

    public String mo4347a() {
        return "PreferenceConsent";
    }

    public final int mo4349b() {
        int i;
        bg bgVar = this.f24460a;
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
            return -1;
        }
        if (((Boolean) C0954a.f5812H.m5760a()).booleanValue() || this.f24460a.m22131f()) {
            return 1;
        }
        if (!mo4350c() || !this.f24460a.f24451e.m21204a()) {
            return 0;
        }
        mo4348a(1, Boolean.valueOf(false));
        return 1;
    }

    public void mo4348a(int i, Boolean bool) {
        boolean z = true;
        C0957n c0957n = C0954a.f5812H;
        if (i != 1) {
            z = false;
        }
        c0957n.m5763a(Boolean.valueOf(z));
        new BackupManager(this.f24460a.f24448b).dataChanged();
    }

    public boolean mo4350c() {
        return false;
    }

    public final boolean mo4351d() {
        return mo4349b() != 1;
    }

    public final void mo4352e() {
    }

    public void mo4353f() {
        C0954a.f5812H.m5765c();
    }

    public final boolean mo4354g() {
        return ((Boolean) C0954a.f5812H.m5760a()).booleanValue();
    }
}
