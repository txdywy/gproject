package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller$SessionInfo;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.cm.f implements Runnable
{

    public final com.google.android.finsky.cm.e a;

    f(com.google.android.finsky.cm.e p0) {
        this.a = p0;
    }

    public final void run() {
        v2 = this.a.b.getMySessions().iterator();
        while (v2.hasNext()) {
            v0 = (PackageInstaller$SessionInfo)v2.next();
            v3 = v0.getAppPackageName();
            v1 = (PackageInstaller$SessionInfo)this.a.c.put(v3, v0);
            if (v1 == 0)
                continue;
            v5 = new Object[3];
            v5[0] = v3;
            v5[1] = Integer.valueOf(v1.getSessionId());
            v5[2] = Integer.valueOf(v0.getSessionId());
            FinskyLog.c("Multiple sessions for %s found. Removing %d & keeping %d.", v5);
        }
    }

}
