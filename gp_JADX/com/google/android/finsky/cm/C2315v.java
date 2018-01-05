package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller.SessionInfo;
import android.graphics.Bitmap;
import com.google.android.finsky.utils.FinskyLog;

final class C2315v implements Runnable {
    public final /* synthetic */ String f11389a;
    public final /* synthetic */ Bitmap f11390b;
    public final /* synthetic */ C2298e f11391c;

    C2315v(C2298e c2298e, String str, Bitmap bitmap) {
        this.f11391c = c2298e;
        this.f11389a = str;
        this.f11390b = bitmap;
    }

    public final void run() {
        SessionInfo sessionInfo = (SessionInfo) this.f11391c.f11332c.get(this.f11389a);
        if (sessionInfo != null) {
            try {
                this.f11391c.f11331b.updateSessionAppIcon(sessionInfo.getSessionId(), this.f11390b);
            } catch (SecurityException e) {
                FinskyLog.m21665c("Stale session id %d for %s", Integer.valueOf(sessionInfo.getSessionId()), this.f11389a);
            }
        }
    }
}
