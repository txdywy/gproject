package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0216d;

public final class C0234a extends C0216d {
    public static C0239d f1283a;

    public static void m1141a(Activity activity, Intent intent, int i) {
        if (VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, null);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void m1140a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static boolean m1142a(Activity activity, String str) {
        if (VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
