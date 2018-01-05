package com.google.android.finsky.verifier.impl;

import android.content.SharedPreferences.Editor;
import java.io.File;

final class bo extends bm {
    public final /* synthetic */ bg f24462a;

    bo(bg bgVar) {
        this.f24462a = bgVar;
        super(bgVar);
    }

    public final String mo4347a() {
        return "PreferenceConsentWithExportPreKK";
    }

    public final void mo4348a(int i, Boolean bool) {
        boolean z = true;
        super.mo4348a(i, bool);
        Editor edit = this.f24462a.f24448b.getSharedPreferences("package_verifer_public_preferences", 1).edit();
        String str = "accepted-anti-malware-consent";
        if (i != 1) {
            z = false;
        }
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final boolean mo4350c() {
        return false;
    }

    public final void mo4353f() {
        super.mo4353f();
        new File(new File(this.f24462a.f24448b.getApplicationInfo().dataDir, "shared_prefs"), "package_verifer_public_preferences.xml").delete();
    }
}
