package com.google.android.finsky.packagemanager.impl;

import android.content.pm.IPackageDeleteObserver.Stub;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.packagemanager.C3280e;

final class C3856e extends Stub {
    public final /* synthetic */ C3280e f19242a;

    C3856e(C3280e c3280e) {
        this.f19242a = c3280e;
    }

    public final void packageDeleted(String str, int i) {
        new Handler(Looper.getMainLooper()).post(new C3857f(this, str, i));
    }
}
