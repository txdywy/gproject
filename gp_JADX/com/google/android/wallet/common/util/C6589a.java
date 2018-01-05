package com.google.android.wallet.common.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.a.a.a.a.b.a.a.h.a.a;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.android.gms.common.d;

public final class C6589a {
    public static long f32726a;
    public static Boolean f32727b;
    public static Boolean f32728c;

    public static boolean m29897a(Context context) {
        return ((AccessibilityManager) context.getSystemService("accessibility")).isEnabled();
    }

    public static String m29894a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        String packageName = callingActivity.getPackageName();
        if (packageName != null) {
            return packageName;
        }
        String valueOf = String.valueOf(callingActivity);
        Log.e("AndroidUtils", new StringBuilder(String.valueOf(valueOf).length() + 54).append("getCallingPackage(): Couldn't get a package name from ").append(valueOf).toString());
        return null;
    }

    @TargetApi(17)
    public static DisplayMetrics m29898b(Context context) {
        if (VERSION.SDK_INT < 17) {
            return context.getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public static boolean m29896a() {
        if ("unknown".equals(Build.BOARD) && (("generic".equals(Build.BRAND) || "generic_x86".equals(Build.BRAND) || "google".equals(Build.BRAND)) && ("generic".equals(Build.DEVICE) || "generic_x86".equals(Build.DEVICE) || "Android".equals(Build.DEVICE)))) {
            return true;
        }
        return false;
    }

    public static Intent m29893a(c cVar, String str) {
        Intent a = C6589a.m29892a(cVar);
        a.setData(Uri.parse(str));
        return a;
    }

    public static Intent m29892a(c cVar) {
        String str;
        Intent intent = new Intent();
        if (TextUtils.isEmpty(cVar.f)) {
            intent.setAction("android.intent.action.VIEW");
        } else {
            intent.setAction(cVar.f);
        }
        for (String str2 : cVar.g) {
            intent.addCategory(str2);
        }
        for (a aVar : cVar.h) {
            if (TextUtils.isEmpty(aVar.c())) {
                String str3;
                str2 = aVar.c;
                if (aVar.a == 0) {
                    str3 = aVar.d;
                } else {
                    str3 = "";
                }
                intent.putExtra(str2, str3);
            } else {
                intent.putExtra(aVar.c, aVar.c());
            }
        }
        intent.setPackage(cVar.c);
        return intent;
    }

    public static boolean m29899c(Context context) {
        return d.a(context) == 0;
    }

    @TargetApi(23)
    public static boolean m29900d(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f32727b != null && elapsedRealtime - f32726a <= ((long) ((Integer) com.google.android.wallet.a.a.u.a()).intValue())) {
            return f32727b.booleanValue();
        }
        if (VERSION.SDK_INT < 23 || !C6607s.m29980a(context, "android.permission.USE_FINGERPRINT")) {
            f32727b = Boolean.valueOf(false);
        } else {
            try {
                boolean z;
                FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(FingerprintManager.class);
                if (fingerprintManager != null && fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
                    z = true;
                } else {
                    z = false;
                }
                f32727b = Boolean.valueOf(z);
            } catch (RuntimeException e) {
                f32727b = Boolean.valueOf(false);
            }
        }
        f32726a = elapsedRealtime;
        return f32727b.booleanValue();
    }

    public static void m29895a(Activity activity, boolean z) {
        if ("user".equals(Build.TYPE)) {
            Window window = activity.getWindow();
            if (window == null) {
                return;
            }
            if (z) {
                window.clearFlags(8192);
            } else {
                window.addFlags(8192);
            }
        }
    }
}
