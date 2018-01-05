package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller.Session;
import com.google.android.finsky.utils.FinskyLog;

final class C2314u implements Runnable {
    public final /* synthetic */ String f11385a;
    public final /* synthetic */ long f11386b;
    public final /* synthetic */ long f11387c;
    public final /* synthetic */ C2298e f11388d;

    C2314u(C2298e c2298e, String str, long j, long j2) {
        this.f11388d = c2298e;
        this.f11385a = str;
        this.f11386b = j;
        this.f11387c = j2;
    }

    public final void run() {
        Session d = this.f11388d.m11848d(this.f11385a);
        if (d != null) {
            try {
                if (this.f11386b > 0) {
                    d.setStagingProgress(((float) this.f11387c) / ((float) this.f11386b));
                }
            } catch (Exception e) {
                FinskyLog.m21667d("Session for %s unexpectedly closed: %s", this.f11385a, e);
                this.f11388d.f11333d.remove(this.f11385a);
            }
        }
    }
}
