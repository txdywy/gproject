package com.google.android.finsky.ca;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.os.a;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.df;
import com.google.wireless.android.finsky.dfe.nano.dg;
import com.google.wireless.android.finsky.dfe.nano.dh;
import com.google.wireless.android.finsky.dfe.nano.di;
import java.util.Iterator;
import java.util.List;

final class com.google.android.finsky.ca.a
{

    public final DevicePolicyManager a;
    public final Context b;
    public final com.google.android.finsky.bn.b c;
    public final com.google.android.finsky.d.g d;
    public Intent e;

    a(DevicePolicyManager p0, Context p1, com.google.android.finsky.bn.b p2, com.google.android.finsky.d.g p3) {
        this.a = (DevicePolicyManager)com.google.android.finsky.utils.aj.a(p0);
        this.b = (Context)com.google.android.finsky.utils.aj.a(p1);
        this.c = (com.google.android.finsky.bn.b)com.google.android.finsky.utils.aj.a(p2);
        this.d = (com.google.android.finsky.d.g)com.google.android.finsky.utils.aj.a(p3);
    }

    private final Bundle a(Bundle p0, com.google.wireless.android.finsky.dfe.nano.df p1) {
        v0 = 0;
        com.google.android.finsky.utils.aj.a(p0);
        com.google.android.finsky.utils.aj.a(p1);
        if (p1.a == 0)
            v1 = 1;
        else
            v1 = 0;
        if (v1 != 0) {
            if (p1.a == 0)
                v0 = p1.e;
            p0.putBoolean(p1.d, v0);
        }
        else if (p1.a == 1) {
            if (p1.a == 1)
                v0 = p1.f;
            p0.putInt(p1.d, v0);
        }
        else if (p1.a == 2) {
            if (p1.a == 2)
                v0 = p1.g;
            else
                v0 = "";
            p0.putString(p1.d, v0);
        }
        else if (p1.e() != 0)
            p0.putStringArray(p1.d, p1.e().a);
        else if (p1.f() != 0)
            p0.putBundle(p1.d, this.a(p1.f().b));
        else if (p1.g() != 0) {
            v1 = p1.g().a;
            v4 = new Parcelable[v1.length];
            while (v0 < v1.length) {
                v4[v0] = this.a(v1[v0].b);
                v0 = v0 + 1;
            }
            p0.putParcelableArray(p1.d, v4);
        }
        else {
            v2 = new Object[1];
            v2[0] = p1.d;
            FinskyLog.e("Unknown managed value type for key: '%s'", v2);
        }
        return p0;
    }

    static void a(com.google.android.finsky.ca.a p0, String p1, int p2, String p3, int p4, Exception p5, String p6) {
        p0.a(p1, p2, p3, p4, p5, p6);
    }

    final Bundle a(df[] p0) {
        com.google.android.finsky.utils.aj.a(p0);
        v1 = new Bundle(p0.length);
        v0 = 0;
        while (v0 < p0.length) {
            this.a(v1, p0[v0]);
            v0 = v0 + 1;
        }
        return v1;
    }

    final void a(String p0, int p1, String p2, int p3, Exception p4, String p5) {
        com.google.android.finsky.utils.aj.a(p0);
        this.d.f(p0).a(new com.google.android.finsky.d.c(p1).b(p2).a(p4).a(p3).a(p5).a, 0);
    }

    public final boolean a() {
  6:    if (this.b()) {
  8:        v0 = 1;
  9:        return v0;
        }
 12:    v0 = this.a.getActiveAdmins();
 16:    if (v0 == 0) goto 69;
 18:    v4 = v0.iterator();
 26:    if (!v4.hasNext()) goto 69;
 38:    v1 = new Intent("com.android.vending.dpc.APPLICATION_RESTRICTIONS_PROXY");
 45:    v1.setPackage(((ComponentName)v4.next()).getPackageName());
 58:    if (this.b.getPackageManager().resolveService(v1, 0) == 0) goto 22;
 60:    v0 = v1;
 61:    this.e = v0;
 65:    if (this.e != 0)
 67:        v0 = 1;
        else
 71:        v0 = 0;
 68:    return v0;
 69:    v0 = 0;
 70:    goto 61;
    }

    final boolean b() {
        if (!android.support.v4.os.a.a())
            v0 = 0;
        else
            v0 = this.a.isCallerApplicationRestrictionsManagingPackage();
        return v0;
    }

}
