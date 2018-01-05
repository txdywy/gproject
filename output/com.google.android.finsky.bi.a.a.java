package com.google.android.finsky.bi.a;

import a.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.finsky.l.a;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.bi.a.a implements com.google.android.finsky.packagemanager.h
{

    public final Context a;
    public final a.a b;

    a(Context p0, a.a p1) {
        this.a = p0;
        this.b = p1;
    }

    private final void a(String p0, int p1, String p2) {
        ((com.google.android.finsky.l.a)this.b.a()).a(new com.google.android.finsky.bi.a.b(this, p0, p1, p2));
    }

    public final void a(String[] p0) {
    }

    public final void b(String p0, boolean p1) {
        v0 = 0;
        if (!"com.google.android.gms".equals(p0))
            return;
        v2 = new Intent("com.google.android.gms.GMS_UPDATED");
        v2.setPackage("com.google.android.gms");
        this.a.sendBroadcast(v2);
        try {
            v3 = this.a.getPackageManager().getApplicationInfo(p0, 0).flags;
        }
        catch (PackageManager$NameNotFoundException ex) {
            v1 = new Object[1];
            v1[0] = p0;
            FinskyLog.c("NameNotFoundException getting info for %s", v1);
            return;
        }
        if (v3 & 1)
            v2 = 1;
        else
            v2 = 0;
        if (v3 & 128)
            v0 = 1;
        if (v2 != 0 && v0 == 0)
            this.a(p0, 2, "downgrade");
        else
            this.a(p0, 1, "install/update");
    }

    public final void c(String p0, boolean p1) {
        if (p1 == 0 && "com.google.android.gms".equals(p0))
            this.a(p0, 2, "removed");
    }

    public final void d(String p0) {
    }

    public final void e(String p0) {
    }

}
