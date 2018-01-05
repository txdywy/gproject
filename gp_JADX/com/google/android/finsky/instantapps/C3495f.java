package com.google.android.finsky.instantapps;

import android.graphics.Bitmap;

final class C3495f implements Runnable {
    public final /* synthetic */ Bitmap f17697a;
    public final /* synthetic */ C3471e f17698b;

    C3495f(C3471e c3471e, Bitmap bitmap) {
        this.f17698b = c3471e;
        this.f17697a = bitmap;
    }

    public final void run() {
        this.f17698b.f17662b.mo5136a(1615);
        EphemeralInstallerActivity ephemeralInstallerActivity = this.f17698b.f17663c;
        Bitmap bitmap = this.f17697a;
        if (!ephemeralInstallerActivity.isFinishing() && !ephemeralInstallerActivity.f17294L.f739K) {
            ephemeralInstallerActivity.f17294L.mo5167a(bitmap);
        }
    }
}
