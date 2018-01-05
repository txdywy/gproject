package com.google.android.finsky.bs;

import a.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.l.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import java.util.List;

public final class com.google.android.finsky.bs.b implements com.google.android.finsky.packagemanager.h
{

    public final Context a;
    public final com.google.android.finsky.ba.c b;
    public final a.a c;

    b(Context p0, com.google.android.finsky.ba.c p1, a.a p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    private final void a(String p0, int p1, String p2) {
        ((com.google.android.finsky.l.a)this.c.a()).a(new com.google.android.finsky.bs.c(this, p0, p1, p2));
    }

    public final void a(String[] p0) {
    }

    public final void b(String p0, boolean p1) {
        if ("com.google.android.instantapps.supervisor".equals(p0)) {
            this.a(p0, 1, "install/update");
            if (!this.b.dj().a(12626696)) {
                v2 = new Intent((String)com.google.android.finsky.aa.b.gw.b());
                v2.setClassName("com.google.android.instantapps.supervisor", (String)com.google.android.finsky.aa.b.gx.b());
                if (this.a.getPackageManager().queryBroadcastReceivers(v2, 0).isEmpty()) {
                    v1 = new Object[1];
                    v1[0] = v2;
                    FinskyLog.b("No receiver found for intent: %s", v1);
                }
                else {
                    v2.setFlags(32);
                    v3 = new Object[1];
                    v3[0] = v2;
                    FinskyLog.b("Sending broadcast: %s", v3);
                    this.a.sendBroadcast(v2);
                }
            }
        }
    }

    public final void c(String p0, boolean p1) {
        if (p1 == 0 && "com.google.android.instantapps.supervisor".equals(p0))
            this.a(p0, 2, "removed");
    }

    public final void d(String p0) {
    }

    public final void e(String p0) {
    }

}
