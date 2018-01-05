package com.google.android.finsky.verifier.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.C4708l;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.safetynet.C5571a;
import com.google.android.gms.safetynet.C5573h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.List;

final class cs {
    static void m22274a(Context context) {
        m22278a(context, (String) C0955b.hX.m28964b());
    }

    static void m22278a(Context context, String str) {
        try {
            Intent intent = new Intent("com.google.android.gms.settings.VERIFY_APPS_SETTINGS");
            if (m22279a(context, intent)) {
                context.startActivity(intent);
                return;
            }
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Security exception occurred", new Object[0]);
        }
        context.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(str)));
    }

    static boolean m22282b(Context context) {
        return C5095d.m23664d(context) >= ((Integer) C0955b.im.m28964b()).intValue() && m22279a(context, new Intent("com.google.android.gms.settings.VERIFY_APPS_SETTINGS"));
    }

    private static boolean m22279a(Context context, Intent intent) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static void m22277a(Context context, C4756h c4756h, ab abVar, String str, byte[] bArr) {
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        try {
            packageInfo = packageManager.getPackageInfo(str, 512);
        } catch (NameNotFoundException e) {
        }
        if (!(packageInfo == null || packageInfo.applicationInfo.enabled)) {
            packageManager.setApplicationEnabledSetting(str, 0, 0);
        }
        c4756h.m22366a(str, bArr, false);
        abVar.mo3802b(str);
    }

    static void m22283c(Context context) {
        Intent intent = new Intent("com.google.android.vending.verifier.ACTION_HARMFUL_APP_INSTALLED");
        intent.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() != 0) {
            intent.setComponent(new ComponentName(((ResolveInfo) queryBroadcastReceivers.get(0)).activityInfo.packageName, ((ResolveInfo) queryBroadcastReceivers.get(0)).activityInfo.name));
            context.sendBroadcast(intent);
        }
    }

    @TargetApi(19)
    static void m22281b(Context context, String str) {
        FinskyLog.m21659a("Attempting to stop application: %s", str);
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            ActivityManager.class.getMethod("forceStopPackage", new Class[]{String.class}).invoke(activityManager, new Object[]{str});
        } catch (NoSuchMethodException e) {
            FinskyLog.m21665c("Cannot stop applications on this platform", new Object[0]);
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "Cannot stop application due to security exception", new Object[0]);
        } catch (Throwable e22) {
            FinskyLog.m21660a(e22, "Cannot stop application due to reflection access exception", new Object[0]);
        } catch (Throwable e222) {
            FinskyLog.m21660a(e222, "Cannot stop application due to reflection invocation exception", new Object[0]);
        }
    }

    static ComponentName m22284d(Context context) {
        ComponentName componentName;
        String str = (String) C0955b.bK.m28964b();
        if (TextUtils.isEmpty(str)) {
            componentName = null;
        } else {
            componentName = ComponentName.unflattenFromString(str);
        }
        if (componentName == null) {
            return null;
        }
        try {
            if (context.getPackageManager().getPackageInfo(componentName.getPackageName(), 0) == null) {
                return null;
            }
            return componentName;
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    static void m22276a(Context context, C4699c c4699c, byte[] bArr, int i, boolean z) {
        try {
            Intent intent = new Intent("com.google.android.gms.security.verifyapps.UPLOAD_APK");
            intent.putExtra("package_name", c4699c.f24154m.f24169b);
            intent.putExtra("digest", c4699c.f24145d.f24199b);
            intent.putExtra("version_code", i);
            intent.putExtra("length", (int) c4699c.f24146e);
            intent.putExtra("token", bArr);
            intent.putExtra("is_autoscan", z);
            intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.security.verifier.ApkUploadService"));
            context.startService(intent);
        } catch (SecurityException e) {
            FinskyLog.m21667d("Could not access ApkUploadService", new Object[0]);
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "Error occurred while sending UPLOAD_APK intent", new Object[0]);
        }
    }

    static void m22275a(Context context, C1500a c1500a, C4699c c4699c) {
        boolean z = true;
        long longValue = ((Long) C0955b.m5748a().m28964b()).longValue();
        c4699c.f24143b |= 16;
        c4699c.f24155n = longValue;
        String locale = context.getResources().getConfiguration().locale.toString();
        if (locale == null) {
            throw new NullPointerException();
        }
        c4699c.f24143b |= 8;
        c4699c.f24153l = locale;
        locale = (String) C0955b.cR.m28964b();
        if (locale == null) {
            throw new NullPointerException();
        }
        c4699c.f24143b |= 256;
        c4699c.f24165x = locale;
        boolean e = bg.m22121a().m22130e();
        c4699c.f24143b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        c4699c.f24167z = e;
        Object e2 = m22285e(context);
        if (!TextUtils.isEmpty(e2)) {
            if (e2 == null) {
                throw new NullPointerException();
            }
            c4699c.f24143b |= 64;
            c4699c.f24161t = e2;
        }
        if (((Boolean) C0955b.cN.m28964b()).booleanValue()) {
            if (c1500a.m8818a()) {
                c4699c.f24139E = new C4708l();
                if (c1500a.m8824d()) {
                    c4699c.f24139E.m21916a(1);
                } else if (c1500a.m8822b()) {
                    c4699c.f24139E.m21916a(2);
                }
                locale = c1500a.f8169k;
                if (locale != null) {
                    C4708l c4708l = c4699c.f24139E;
                    if (locale == null) {
                        throw new NullPointerException();
                    }
                    c4708l.f24215a |= 1;
                    c4708l.f24216b = locale;
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(locale, 64);
                        c4699c.f24139E.f24218d = am.m22059a(C4747b.m22106a(packageInfo.signatures));
                    } catch (NameNotFoundException e3) {
                        FinskyLog.m21665c("Could not retrieve info for managing app %s", locale);
                    }
                }
            }
            if (c1500a.m8825e() != null) {
                c4699c.f24143b |= 32768;
                c4699c.f24140F = true;
            }
            if (VERSION.SDK_INT >= 17) {
                if (Global.getInt(context.getContentResolver(), "install_non_market_apps", -1) != 0) {
                    e = true;
                } else {
                    e = false;
                }
                c4699c.m21877a(e);
            } else {
                if (Secure.getInt(context.getContentResolver(), "install_non_market_apps", -1) != 0) {
                    e = true;
                } else {
                    e = false;
                }
                c4699c.m21877a(e);
            }
            if (VERSION.SDK_INT >= 21) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager == null || !userManager.hasUserRestriction("no_install_unknown_sources")) {
                    z = false;
                }
                c4699c.f24143b |= 131072;
                c4699c.f24142H = z;
            }
        }
    }

    static boolean m22280a(String str) {
        return (TextUtils.isEmpty(str) || "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa".equals(str)) ? false : true;
    }

    static String m22285e(Context context) {
        String str = (String) C0954a.f5818N.m5760a();
        if (C5095d.m23655a(context) != 0) {
            FinskyLog.m21667d("GMSCore is missing, disabled or the version installed is older than the one required by this client", new Object[0]);
            return str;
        } else if (str == null) {
            try {
                Object a = C5573h.m26563a(context);
                if (!m22280a((String) a)) {
                    return null;
                }
                C0954a.f5818N.m5763a(a);
                return a;
            } catch (RuntimeException e) {
                FinskyLog.m21667d("Unable to fetch SafetyNet ID: %s", e);
                return str;
            }
        } else {
            C5571a.m26561a(context).mo5051a().mo5055a(new ct());
            return str;
        }
    }
}
