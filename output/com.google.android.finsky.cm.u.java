package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller$Session;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;

public final class com.google.android.finsky.cm.u implements Runnable
{

    public final String a;
    public final long b;
    public final long c;
    public final com.google.android.finsky.cm.e d;

    u(com.google.android.finsky.cm.e p0, String p1, long p2, long p4) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p4;
    }

    public final void run() {
        v0 = this.d.d(this.a);
        if (v0 != 0) {
            try {
                if (this.b > 0)
                    v0.setStagingProgress((float)this.c / (float)this.b);
            }
            catch (Exception ex) {
                v2 = new Object[2];
                v2[0] = this.a;
                v2[1] = ex;
                FinskyLog.d("Session for %s unexpectedly closed: %s", v2);
                this.d.d.remove(this.a);
            }
        }
    }

}
