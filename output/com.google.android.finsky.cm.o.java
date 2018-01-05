package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller$Session;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

public final class com.google.android.finsky.cm.o implements Runnable
{

    public final String a;
    public final String b;
    public final com.google.android.finsky.cm.e c;

    o(com.google.android.finsky.cm.e p0, String p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        v0 = this.c.d(this.a);
        if (v0 != 0) {
            try {
                v0.removeSplit(this.b);
            }
            catch (IOException ex) {
                v1 = new Object[1];
                v1[0] = this.b;
                FinskyLog.c("Error with session removeSplit: %s", v1);
            }
        }
    }

}
