package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller.Session;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

final class C2308o implements Runnable {
    public final /* synthetic */ String f11357a;
    public final /* synthetic */ String f11358b;
    public final /* synthetic */ C2298e f11359c;

    C2308o(C2298e c2298e, String str, String str2) {
        this.f11359c = c2298e;
        this.f11357a = str;
        this.f11358b = str2;
    }

    public final void run() {
        Session d = this.f11359c.m11848d(this.f11357a);
        if (d != null) {
            try {
                d.removeSplit(this.f11358b);
            } catch (IOException e) {
                FinskyLog.m21665c("Error with session removeSplit: %s", this.f11358b);
            }
        }
    }
}
