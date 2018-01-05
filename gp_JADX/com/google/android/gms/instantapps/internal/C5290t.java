package com.google.android.gms.instantapps.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.instantapps.C5267f;

public final class C5290t implements C5267f {
    public static C5290t f26474a;
    public final Context f26475b;
    public final boolean f26476c = true;

    private C5290t(Context context) {
        this.f26475b = context;
    }

    public static synchronized C5290t m24169a(Context context) {
        C5290t c5290t;
        synchronized (C5290t.class) {
            Context applicationContext = context.getApplicationContext();
            if (!(f26474a != null && f26474a.f26475b == applicationContext && f26474a.f26476c)) {
                f26474a = new C5290t(applicationContext);
            }
            c5290t = f26474a;
        }
        return c5290t;
    }

    public final String[] mo4693a(int i) {
        if (this.f26476c) {
            String[] packagesForUid = this.f26475b.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null) {
                return packagesForUid;
            }
        }
        C5287q a = C5287q.m24167a(this.f26475b);
        if (a == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("uid", i);
            if (a.m24168a("getAppPackageForUid", bundle).getString("result") == null) {
                return null;
            }
            return new String[]{a.m24168a("getAppPackageForUid", bundle).getString("result")};
        } catch (Throwable e) {
            Log.e("InstantAppsPMW", "Error getting app package for UID", e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.pm.PackageInfo mo4692a(java.lang.String r5) {
        /*
        r4 = this;
        r0 = r4.f26476c;
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = r4.f26475b;	 Catch:{ NameNotFoundException -> 0x0011 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0011 }
        r1 = 64;
        r0 = r0.getPackageInfo(r5, r1);	 Catch:{ NameNotFoundException -> 0x0011 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = move-exception;
    L_0x0012:
        r0 = r4.f26475b;
        r0 = com.google.android.gms.instantapps.internal.C5287q.m24167a(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x001a:
        r1 = new android.os.Bundle;	 Catch:{ RemoteException -> 0x0041 }
        r1.<init>();	 Catch:{ RemoteException -> 0x0041 }
        r2 = "packageName";
        r1.putString(r2, r5);	 Catch:{ RemoteException -> 0x0041 }
        r2 = "flags";
        r3 = 64;
        r1.putInt(r2, r3);	 Catch:{ RemoteException -> 0x0041 }
        r2 = "getWHPackageInfo";
        r0 = r0.m24168a(r2, r1);	 Catch:{ RemoteException -> 0x0041 }
        r1 = "result";
        r0 = r0.getParcelable(r1);	 Catch:{ RemoteException -> 0x0041 }
        r0 = (android.content.pm.PackageInfo) r0;	 Catch:{ RemoteException -> 0x0041 }
        if (r0 != 0) goto L_0x0010;
    L_0x003b:
        r0 = new android.content.pm.PackageManager$NameNotFoundException;
        r0.<init>();
        throw r0;
    L_0x0041:
        r0 = move-exception;
        r1 = "InstantAppsPMW";
        r2 = "Error getting package info";
        android.util.Log.e(r1, r2, r0);
        goto L_0x003b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.instantapps.internal.t.a(java.lang.String):android.content.pm.PackageInfo");
    }

    public final boolean mo4694b(String str) {
        C5287q a = C5287q.m24167a(this.f26475b);
        if (a != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("packageName", str);
                return a.m24168a("isInstantApp", bundle).getBoolean("result");
            } catch (Throwable e) {
                Log.e("InstantAppsPMW", "Error checking if app is instant app", e);
            }
        }
        return false;
    }
}
