package com.google.android.finsky.packagemanager.impl;

import android.content.pm.IPackageInstallObserver.Stub;
import com.google.android.finsky.packagemanager.C3850d;

final class C3853b extends Stub {
    public final /* synthetic */ C3850d f19238a;

    C3853b(C3850d c3850d) {
        this.f19238a = c3850d;
    }

    public final void packageInstalled(String str, int i) {
        this.f19238a.mo3826a(str, i);
    }
}
