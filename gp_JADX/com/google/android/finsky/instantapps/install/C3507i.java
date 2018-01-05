package com.google.android.finsky.instantapps.install;

import android.content.pm.PackageInstaller.SessionCallback;
import android.content.pm.PackageManager;

final class C3507i extends SessionCallback {
    public final /* synthetic */ int f17736a;
    public final /* synthetic */ String f17737b;
    public final /* synthetic */ C3506h f17738c;

    C3507i(C3506h c3506h, int i, String str) {
        this.f17738c = c3506h;
        this.f17736a = i;
        this.f17737b = str;
    }

    public final void onCreated(int i) {
        String str = "onCreated";
        String valueOf = String.valueOf(Integer.toString(i));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
    }

    public final void onBadgingChanged(int i) {
        String str = "onBadgingChanged";
        String valueOf = String.valueOf(Integer.toString(i));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
    }

    public final void onActiveChanged(int i, boolean z) {
        String str = "onActiveChanged";
        String valueOf = String.valueOf(Integer.toString(i));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
    }

    public final void onProgressChanged(int i, float f) {
        String str = "onProgressChanged";
        String valueOf = String.valueOf(Integer.toString(i));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
    }

    public final void onFinished(int i, boolean z) {
        String str = "onFinished";
        String valueOf = String.valueOf(Integer.toString(i));
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (this.f17736a == i) {
            PackageManager packageManager = this.f17738c.f17731a.getPackageManager();
            if (z && packageManager.getInstallerPackageName(this.f17737b) == null) {
                packageManager.setInstallerPackageName(this.f17737b, this.f17738c.f17731a.getPackageName());
            }
            if (z) {
                this.f17738c.f17732b.mo5136a(1657);
                this.f17738c.f17734d.mo3527a();
                return;
            }
            this.f17738c.f17732b.mo5136a(1625);
            this.f17738c.f17734d.mo3529b();
        }
    }
}
