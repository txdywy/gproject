package com.google.android.finsky.packagemanager.impl;

import android.content.Context;
import android.content.pm.IPackageDataObserver;
import android.content.pm.IPackageDeleteObserver;
import android.content.pm.IPackageInstallObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.support.v4.os.C0327a;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.packagemanager.C2294c;
import com.google.android.finsky.packagemanager.C2860b;
import com.google.android.finsky.packagemanager.C3280e;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.lang.reflect.Method;

public final class C3852a implements C3849a {
    public static final String[] f19227a = new String[]{"_data"};
    public final Context f19228b;
    public final C2320a f19229c;
    public final Object f19230d;
    public final C2376e f19231e;
    public final C0986a f19232f;
    public final Method f19233g;
    public final Method f19234h;
    public final Method f19235i;
    public final Method f19236j;
    public final Method f19237k;

    public C3852a(Context context, C2376e c2376e, C0986a c0986a, C2320a c2320a) {
        this(context, c2376e, c0986a, c2320a, new C3865n(context.getPackageManager()));
    }

    private C3852a(Context context, C2376e c2376e, C0986a c0986a, C2320a c2320a, C3865n c3865n) {
        this.f19228b = context;
        this.f19229c = c2320a;
        this.f19230d = c3865n.f19270b;
        this.f19233g = c3865n.m18350a("deletePackage", true, String.class, IPackageDeleteObserver.class, Integer.TYPE);
        this.f19234h = c3865n.m18350a("freeStorageAndNotify", true, Long.TYPE, IPackageDataObserver.class);
        this.f19235i = c3865n.m18350a("installExistingPackage", true, String.class);
        this.f19236j = c3865n.m18350a("installExistingPackage", C0327a.m1722b(), String.class, Integer.TYPE);
        this.f19237k = c3865n.m18350a("installPackage", true, Uri.class, IPackageInstallObserver.class, Integer.TYPE, String.class);
        this.f19231e = c2376e;
        this.f19232f = c0986a;
    }

    public final void mo3822a(Uri uri, long j, String str, C2294c c2294c, boolean z, String str2) {
        bb.m21792a(new C3858g(this, uri, j, str, c2294c, z, str2, this.f19228b, this.f19229c), new Void[0]);
    }

    public final int mo3820a(String str, int i) {
        Throwable e;
        if (this.f19236j == null && this.f19235i == null) {
            return 979;
        }
        try {
            if (this.f19236j == null) {
                return ((Integer) this.f19235i.invoke(this.f19230d, new Object[]{str})).intValue();
            }
            return ((Integer) this.f19236j.invoke(this.f19230d, new Object[]{str, Integer.valueOf(i)})).intValue();
        } catch (Throwable e2) {
            FinskyLog.m21663b(e2, "Cannot install existing packages due to reflection access exception", new Object[0]);
            return 979;
        } catch (Throwable e22) {
            Throwable th = e22;
            e22 = th.getCause();
            if (e22 instanceof NameNotFoundException) {
                throw ((NameNotFoundException) e22);
            }
            FinskyLog.m21663b(th, "Cannot install existing packages due to reflection invocation exception", new Object[0]);
            return 979;
        }
    }

    public final void mo3821a(long j, C2860b c2860b) {
        if (this.f19234h != null) {
            C3854c c3854c = new C3854c(c2860b);
            try {
                this.f19234h.invoke(this.f19230d, new Object[]{Long.valueOf(j), c3854c});
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Cannot freeStorageAndNotify due to reflection access exception", new Object[0]);
            } catch (Throwable e2) {
                FinskyLog.m21663b(e2, "Cannot freeStorageAndNotify due to reflection invocation exception", new Object[0]);
            }
        }
    }

    public final void mo3823a(String str) {
        PackageManager packageManager = this.f19228b.getPackageManager();
        try {
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting(str);
            if (applicationEnabledSetting == 2 || applicationEnabledSetting == 4) {
                FinskyLog.m21659a("Enabling package %s (was %d)", str, Integer.valueOf(applicationEnabledSetting));
                packageManager.setApplicationEnabledSetting(str, 1, 0);
            }
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Could not enable package %s", str);
        }
    }

    public final boolean mo3824a(String str, boolean z, C3280e c3280e) {
        if (this.f19233g == null) {
            return false;
        }
        Object c3856e;
        int i;
        if (c3280e != null) {
            try {
                c3856e = new C3856e(c3280e);
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Cannot delete packages due to reflection access exception", new Object[0]);
                return false;
            } catch (Throwable e2) {
                FinskyLog.m21663b(e2, "Cannot delete packages due to reflection invocation exception", new Object[0]);
                return false;
            }
        }
        c3856e = null;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.f19233g.invoke(this.f19230d, new Object[]{str, c3856e, Integer.valueOf(i)});
        return true;
    }

    public final void mo3825b(String str, int i) {
        if (C0327a.m1722b() && i != 0) {
            try {
                int i2;
                PackageManager packageManager = this.f19228b.getPackageManager();
                switch (i) {
                    case 1:
                        i2 = 0;
                        break;
                    case 2:
                        i2 = 1;
                        break;
                    case 3:
                        i2 = 2;
                        break;
                    case 4:
                        i2 = 3;
                        break;
                    case 5:
                        i2 = 4;
                        break;
                    case 6:
                        i2 = 5;
                        break;
                    case 7:
                        i2 = 6;
                        break;
                    case 8:
                        i2 = 7;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
                packageManager.setApplicationCategoryHint(str, i2);
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Unable to find application for category hint", new Object[0]);
            }
        }
    }
}
