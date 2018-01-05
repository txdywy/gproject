package com.google.android.instantapps.common;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public final class C5774g {
    public final PackageManager f29179a;

    public C5774g(PackageManager packageManager) {
        this.f29179a = packageManager;
    }

    public final boolean m27162a() {
        try {
            this.f29179a.getPackageInfo("com.google.android.instantapps.devman", 0);
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
