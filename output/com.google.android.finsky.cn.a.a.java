package com.google.android.finsky.cn.a;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.os.a;
import com.google.android.finsky.ak.e;
import com.google.android.finsky.ak.q;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.ds.b;
import com.google.android.finsky.instantappscompatibility.b;
import com.google.android.finsky.p2p.FrostingUtil;
import com.google.android.finsky.p2p.a;
import com.google.android.finsky.p2p.f;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.b;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.t;
import com.google.android.finsky.z.d;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.g;
import com.google.wireless.android.finsky.c.a.k;
import com.google.wireless.android.finsky.c.a.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.cn.a.a implements com.google.android.finsky.cn.a, com.google.android.finsky.packagemanager.h
{

    public static final com.google.android.finsky.cn.b a;
    public final Context b;
    public final PackageManager c;
    public final Map d;
    public final DevicePolicyManager e;
    public final com.google.android.finsky.ds.b f;
    public final com.google.android.finsky.ba.c g;
    public final FrostingUtil h;

    static {
        com.google.android.finsky.cn.a.a.a = new com.google.android.finsky.cn.b(0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, -1, 0, 0);
    }

    a(Context p0, com.google.android.finsky.instantappscompatibility.b p1, DevicePolicyManager p2, com.google.android.finsky.ds.b p3, com.google.android.finsky.ba.c p4, FrostingUtil p5) {
        this.d = new HashMap();
        this.b = p0;
        this.c = p1.e;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        this.h = p5;
    }

    private final com.google.android.finsky.cn.b a(String p0, boolean p1) {
        v0 = this.f.b(p0);
        if (p1 != 0 && v0 == 0) {
            this.d.put(p0, com.google.android.finsky.cn.a.a.a);
            v0 = com.google.android.finsky.cn.a.a.a;
        }
        else {
            if (v0 != 0)
                v0 = 4202688;
            else
                v0 = 192;
            try {
                v0 = this.b(this.c.getPackageInfo(p0, v0));
                this.d.put(p0, v0);
            }
            catch (PackageManager$NameNotFoundException ex) {
                this.d.put(p0, com.google.android.finsky.cn.a.a.a);
                v0 = com.google.android.finsky.cn.a.a.a;
            }
        }
        return v0;
    }

    private static String[] a(PackageInfo p0) {
        v2 = new String[p0.signatures.length];
        v0 = 0;
        while (v0 < p0.signatures.length) {
            v2[v0] = com.google.android.finsky.utils.t.a(p0.signatures[v0].toByteArray());
            v0 = v0 + 1;
        }
        return v2;
    }

    private final com.google.android.finsky.cn.b b(PackageInfo p0) {
        try {
            if (com.google.android.finsky.instantappscompatibility.b.a(p0.applicationInfo)) {
                v4 = com.google.android.finsky.cn.a.a.a;
                return v4;
            }
            if (p0.applicationInfo.metaData == 0)
                v13 = 0;
            else {
                try {
                    v13 = p0.applicationInfo.metaData.getInt("com.android.vending.derived.apk.id", 0);
                }
                catch (IllegalArgumentException ex) {
                    v5 = new Object[1];
                    v5[0] = p0.packageName;
                    FinskyLog.c("Package %s not installed", v5);
                    v4 = com.google.android.finsky.cn.a.a.a;
                    return v4;
                }
            }
            v14 = 0;
            if (this.g.dj().a(12637130)) {
                if (com.google.android.finsky.utils.bb.c())
                    FinskyLog.a("Frosting ID looked up on UI thread. Caller should move to a background thread.", new Object[0]);
                v4 = (List)com.google.android.finsky.z.g.a(this.h.a.a.a(new com.google.android.finsky.ak.q(p0.packageName).a("last_updated", Long.valueOf(p0.lastUpdateTime))));
                if (v4 != 0 && v4.size() == 1) {
                    v4 = ((com.google.wireless.android.finsky.c.a.l)v4.get(0)).e;
                    if (v4 != 0 && v4.d())
                        v4 = v4.b;
                    else
                        v4 = 0;
                }
                else {
                    v6 = FrostingUtil.b(p0);
                    if (p0 == 0)
                        v4 = this.h.a.b.a(0);
                    else {
                        v5 = new com.google.wireless.android.finsky.c.a.l();
                        if (p0.packageName == 0)
                            throw new NullPointerException();
                        v5.a = v5.a | 1;
                        v5.b = p0.packageName;
                        v5.a = v5.a | 2;
                        v5.c = p0.lastUpdateTime;
                        v7 = FrostingUtil.a(p0);
                        if (v7 != 0) {
                            if (v7 == 0)
                                throw new NullPointerException();
                            v5.a = v5.a | 4;
                            v5.d = v7;
                        }
                        if (v6 != 0)
                            v5.e = v6;
                        v4 = this.h.a.a.b(v5);
                    }
                    v4.a(com.google.android.finsky.p2p.f.a);
                    if (v6 != 0 && v6.d())
                        v4 = v6.b;
                    else
                        v4 = 0;
                }
                v14 = v4;
            }
            if (p0.applicationInfo.flags & 1)
                v8 = 1;
            else
                v8 = 0;
            if (p0.applicationInfo.flags & 128)
                v9 = 1;
            else
                v9 = 0;
            if (p0.applicationInfo.flags & 2)
                v19 = 1;
            else
                v19 = 0;
            v4 = this.c.getApplicationEnabledSetting(p0.packageName);
            if (v4 == 0) {
                v11 = 0;
                if (p0.applicationInfo.enabled == 0)
                    v4 = 1;
                else
                    v4 = 0;
                v10 = v4;
            }
            else {
                if (v4 == 3 || v4 == 4)
                    v11 = 1;
                else
                    v11 = 0;
                if (v11 != 0 || v4 == 2)
                    v4 = 1;
                else
                    v4 = 0;
                v10 = v4;
            }
            if (android.support.v4.os.a.b())
                v18 = com.google.android.finsky.instantappscompatibility.b.b(p0.applicationInfo);
            else
                v18 = 1;
            if (com.google.android.finsky.utils.b.d() && this.g.dj().a(12640717) && p0.splitNames != 0 && p0.splitNames.length > 0) {
                v20 = (String[])Arrays.copyOf(p0.splitNames, p0.splitNames.length);
                Arrays.sort(v20);
            }
            else
                v20 = 0;
            v4 = new com.google.android.finsky.cn.b(p0.packageName, com.google.android.finsky.cn.a.a.a(p0), 0, v8, v9, v10, v11, p0.versionCode, v13, v14, this.h(p0.packageName), p0.applicationInfo.targetSdkVersion, v18, v19, v20);
        }
        catch (IllegalArgumentException ex) {
            v5 = new Object[1];
            v5[0] = p0.packageName;
            FinskyLog.c("Package %s not installed", v5);
            v4 = com.google.android.finsky.cn.a.a.a;
            return v4;
        }
        return v4;
    }

    private final boolean h(String p0) {
        v0 = this.e.getActiveAdmins();
        if (v0 == 0)
            v0 = 0;
        else {
            v2 = v0.iterator();
            while (v2.hasNext()) {
                if (((ComponentName)v2.next()).getPackageName().equals(p0)) {
                    v0 = 1;
                    return v0;
                }
            }
            v0 = 0;
        }
        return v0;
    }

    public final synchronized com.google.android.finsky.cn.b a(String p0) {
        enter this;
        try {
            v0 = (com.google.android.finsky.cn.b)this.d.get(p0);
            if (v0 == 0)
                v0 = this.a(p0, 0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        if (v0.equals(com.google.android.finsky.cn.a.a.a))
            v0 = 0;
        exit this;
        return v0;
    }

    public final Collection a() {
        StrictMode.noteSlowCall("PackageManagerRepository.getAllBlocking");
        v0 = this.c.getInstalledPackages(192);
        v1 = new ArrayList(v0.size());
        v2 = v0.iterator();
        while (v2.hasNext()) {
            v0 = this.b((PackageInfo)v2.next());
            if (v0.equals(com.google.android.finsky.cn.a.a.a))
                continue;
            v1.add(v0);
        }
        return v1;
    }

    public final void a(String[] p0) {
        v0 = 0;
        while (v0 < p0.length) {
            this.a(p0[v0], 0);
            v0 = v0 + 1;
        }
    }

    public final synchronized void b(String p0) {
        enter this;
        try {
            this.d.remove(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void b(String p0, boolean p1) {
        this.a(p0, 0);
    }

    public final void c(String p0, boolean p1) {
        if (p1 == 0)
            v0 = 1;
        else
            v0 = 0;
        this.a(p0, v0);
    }

    public final boolean c(String p0) {
        v0 = 1;
        if (com.google.android.finsky.as.a.a(this.b)) {
            if (this.c.getLeanbackLaunchIntentForPackage(p0) == 0)
                v0 = 0;
        }
        else if (this.c.getLaunchIntentForPackage(p0) == 0)
            v0 = 0;
        return v0;
    }

    public final void d(String p0) {
        this.a(p0, 0);
    }

    public final void e(String p0) {
    }

    public final String f(String p0) {
        try {
            v0 = this.c.getPackageInfo(p0, 0).versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            v0 = 0;
        }
        return v0;
    }

    public final int g(String p0) {
        try {
            v0 = this.c.getPackageInfo(p0, 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            v0 = -1;
        }
        return v0;
    }

}
