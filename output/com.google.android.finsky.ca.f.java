package com.google.android.finsky.ca;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.dc;
import com.google.wireless.android.finsky.dfe.nano.de;

public final class com.google.android.finsky.ca.f implements com.android.volley.x
{

    public final String a;
    public final Runnable b;
    public final com.google.android.finsky.ca.c c;

    f(com.google.android.finsky.ca.c p0, String p1, Runnable p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void b_(Object p0) {
        com.google.android.finsky.ca.c.a(this.c, this.a, 0, 0);
        v8 = ((com.google.wireless.android.finsky.dfe.nano.de)p0).a;
        com.google.android.finsky.utils.aj.a(this.a);
        if (v8 == 0) {
            ForegroundCoordinator.a(this.c.i);
            if (this.b != 0)
                this.b.run();
            return;
        }
        if (v8.length != 0) {
            if (this.c.e.b()) {
                com.google.android.finsky.utils.aj.a(v8);
                com.google.android.finsky.utils.aj.a(this.a);
                v7 = 0;
                while (v7 < v8.length) {
                    this.c.e.a.setApplicationRestrictions(0, v8[v7].c, this.c.e.a(v8[v7].d));
                    this.c.e.c.a(v8[v7].c, v8[v7].e);
                    this.c.e.a(this.a, 1302, "via-dpm", 0, 0, v8[v7].c);
                    v7 = v7 + 1;
                }
            }
            else {
                if (this.c.e.e == 0)
                    throw new RuntimeException("Not initialized.");
                com.google.android.finsky.utils.aj.a(v8);
                com.google.android.finsky.utils.aj.a(this.a);
                com.google.android.finsky.utils.aj.a(this.c.e.e);
                try {
                    if (!this.c.e.b.bindService(this.c.e.e, new com.google.android.finsky.ca.b(this.c.e, v8, this.a), 1))
                        this.c.e.a(this.a, 1304, "via-dpc-proxy", 2, 0, 0);
                }
                catch (SecurityException ex) {
                    this.c.e.a(this.a, 1304, "via-dpc-proxy", 3, ex, 0);
                }
            }
        }
        ForegroundCoordinator.a(this.c.i);
        if (this.b != 0)
            this.b.run();
    }

}
