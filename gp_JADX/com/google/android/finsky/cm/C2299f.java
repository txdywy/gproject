package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller.SessionInfo;
import com.google.android.finsky.utils.FinskyLog;

final class C2299f implements Runnable {
    public final /* synthetic */ C2298e f11341a;

    C2299f(C2298e c2298e) {
        this.f11341a = c2298e;
    }

    public final void run() {
        for (SessionInfo sessionInfo : this.f11341a.f11331b.getMySessions()) {
            if (((SessionInfo) this.f11341a.f11332c.put(sessionInfo.getAppPackageName(), sessionInfo)) != null) {
                FinskyLog.m21665c("Multiple sessions for %s found. Removing %d & keeping %d.", sessionInfo.getAppPackageName(), Integer.valueOf(((SessionInfo) this.f11341a.f11332c.put(sessionInfo.getAppPackageName(), sessionInfo)).getSessionId()), Integer.valueOf(sessionInfo.getSessionId()));
            }
        }
    }
}
