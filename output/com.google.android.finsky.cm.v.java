package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller$SessionInfo;
import android.graphics.Bitmap;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;

public final class com.google.android.finsky.cm.v implements Runnable
{

    public final String a;
    public final Bitmap b;
    public final com.google.android.finsky.cm.e c;

    v(com.google.android.finsky.cm.e p0, String p1, Bitmap p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        v0 = (PackageInstaller$SessionInfo)this.c.c.get(this.a);
        if (v0 != 0) {
            try {
                this.c.b.updateSessionAppIcon(v0.getSessionId(), this.b);
            }
            catch (SecurityException ex) {
                v2 = new Object[2];
                v2[0] = Integer.valueOf(v0.getSessionId());
                v2[1] = this.a;
                FinskyLog.c("Stale session id %d for %s", v2);
            }
        }
    }

}
