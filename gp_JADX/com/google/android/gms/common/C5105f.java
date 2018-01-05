package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.C4885a;
import com.google.android.gms.common.internal.ac;
import com.google.android.gms.common.util.C5154i;
import com.google.android.gms.common.util.C5155j;
import com.google.android.gms.common.util.C5159n;
import java.util.concurrent.atomic.AtomicBoolean;

public class C5105f {
    @Deprecated
    public static final int f25965a = 11200000;
    public static boolean f25966b = false;
    public static boolean f25967c = false;
    public static final AtomicBoolean f25968d = new AtomicBoolean();
    public static final AtomicBoolean f25969e = new AtomicBoolean();

    @Deprecated
    public static String m23689a(int i) {
        return ConnectionResult.m23262a(i);
    }

    @Deprecated
    public static boolean m23690a(Context context, int i) {
        return C5159n.m23895a(context, i);
    }

    @Deprecated
    public static boolean m23692b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    public static boolean m23693b(Context context, int i) {
        return i == 18 ? true : i == 1 ? C5105f.m23691a(context, "com.google.android.gms") : false;
    }

    @Deprecated
    public static int m23694d(Context context) {
        int i;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(C4885a.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!("com.google.android.gms".equals(context.getPackageName()) || f25969e.get())) {
            int b = ac.m23719b(context);
            if (b == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b != f25965a) {
                String str = "com.google.android.gms.version";
                throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(f25965a).append(" but found ").append(b).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(str).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
        if (!C5154i.m23886a(context)) {
            if (C5154i.f26092c == null) {
                boolean z;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    z = true;
                } else {
                    z = false;
                }
                C5154i.f26092c = Boolean.valueOf(z);
            }
            if (!C5154i.f26092c.booleanValue()) {
                i = 1;
                packageInfo = null;
                if (i != 0) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (NameNotFoundException e) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                        return 9;
                    }
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                C5107g.m23705a(context);
                if (i != 0) {
                    if (C5107g.m23706a(packageInfo, C5142p.f26087a) != null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    if (C5107g.m23706a(packageInfo2, C5107g.m23706a(packageInfo, C5142p.f26087a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                } else if (C5107g.m23706a(packageInfo2, C5142p.f26087a) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
                if (packageInfo2.versionCode / 1000 >= f25965a / 1000) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f25965a + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (Throwable e2) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                        return 1;
                    }
                }
                return applicationInfo.enabled ? 3 : 0;
            }
        }
        i = 0;
        packageInfo = null;
        if (i != 0) {
            packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
        }
        try {
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C5107g.m23705a(context);
            if (i != 0) {
                if (C5107g.m23706a(packageInfo, C5142p.f26087a) != null) {
                    if (C5107g.m23706a(packageInfo2, C5107g.m23706a(packageInfo, C5142p.f26087a)) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                }
                Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                return 9;
            } else if (C5107g.m23706a(packageInfo2, C5142p.f26087a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (packageInfo2.versionCode / 1000 >= f25965a / 1000) {
                applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                }
                if (applicationInfo.enabled) {
                }
            }
            Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + f25965a + " but found " + packageInfo2.versionCode);
            return 2;
        } catch (NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    public static Resources m23697g(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static Context m23698h(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    public static int m23699i(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return i;
        }
    }

    @Deprecated
    public static void m23695e(Context context) {
        int a = C5095d.m23655a(context);
        if (a != 0) {
            Intent a2 = C5095d.m23656a(context, a, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (a2 == null) {
                throw new GooglePlayServicesNotAvailableException(a);
            }
            throw new GooglePlayServicesRepairableException(a, "Google Play Services not available", a2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m23696f(android.content.Context r7) {
        /*
        r0 = 0;
        r1 = 1;
        r2 = f25967c;
        if (r2 != 0) goto L_0x002f;
    L_0x0006:
        r2 = com.google.android.gms.internal.dr.f26667b;	 Catch:{ NameNotFoundException -> 0x0043 }
        r2 = r2.m24299a(r7);	 Catch:{ NameNotFoundException -> 0x0043 }
        r3 = "com.google.android.gms";
        r4 = 64;
        r2 = r2.m24298b(r3, r4);	 Catch:{ NameNotFoundException -> 0x0043 }
        if (r2 == 0) goto L_0x003f;
    L_0x0016:
        com.google.android.gms.common.C5107g.m23705a(r7);	 Catch:{ NameNotFoundException -> 0x0043 }
        r3 = 1;
        r3 = new com.google.android.gms.common.C5139m[r3];	 Catch:{ NameNotFoundException -> 0x0043 }
        r4 = 0;
        r5 = com.google.android.gms.common.C5142p.f26087a;	 Catch:{ NameNotFoundException -> 0x0043 }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ NameNotFoundException -> 0x0043 }
        r3[r4] = r5;	 Catch:{ NameNotFoundException -> 0x0043 }
        r2 = com.google.android.gms.common.C5107g.m23706a(r2, r3);	 Catch:{ NameNotFoundException -> 0x0043 }
        if (r2 == 0) goto L_0x003f;
    L_0x002a:
        r2 = 1;
        f25966b = r2;	 Catch:{ NameNotFoundException -> 0x0043 }
    L_0x002d:
        f25967c = r1;
    L_0x002f:
        r2 = f25966b;
        if (r2 != 0) goto L_0x003d;
    L_0x0033:
        r2 = "user";
        r3 = android.os.Build.TYPE;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x003e;
    L_0x003d:
        r0 = r1;
    L_0x003e:
        return r0;
    L_0x003f:
        r2 = 0;
        f25966b = r2;	 Catch:{ NameNotFoundException -> 0x0043 }
        goto L_0x002d;
    L_0x0043:
        r2 = move-exception;
        r3 = "GooglePlayServicesUtil";
        r4 = "Cannot find Google Play services package name.";
        android.util.Log.w(r3, r4, r2);	 Catch:{ all -> 0x004e }
        f25967c = r1;
        goto L_0x002f;
    L_0x004e:
        r0 = move-exception;
        f25967c = r1;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.f.f(android.content.Context):boolean");
    }

    @TargetApi(21)
    static boolean m23691a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C5155j.m23889b()) {
            for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled) {
                Object obj;
                if (VERSION.SDK_INT >= 18) {
                    Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
                    if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                        obj = 1;
                        if (obj == null) {
                            return true;
                        }
                    }
                }
                obj = null;
                if (obj == null) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
