package com.google.android.finsky.packagemanager.impl;

import android.content.pm.IPackageDataObserver.Stub;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.packagemanager.C2860b;

final class C3854c extends Stub {
    public final /* synthetic */ C2860b f19239a;

    C3854c(C2860b c2860b) {
        this.f19239a = c2860b;
    }

    public final void onRemoveCompleted(String str, boolean z) {
        new Handler(Looper.getMainLooper()).post(new C3855d(this, z));
    }
}
