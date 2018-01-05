package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.bj;
import com.google.android.gms.common.util.C5154i;

public final class C5106e extends C5105f {
    @Deprecated
    public static int m23700a(Context context) {
        return C5105f.m23694d(context);
    }

    public static Resources m23703b(Context context) {
        return C5105f.m23697g(context);
    }

    public static boolean m23702a(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        if (C5105f.m23693b(activity, i)) {
            i = 18;
        }
        if (fragment == null) {
            return C5096b.m23669a(activity, i, i2, onCancelListener);
        }
        Dialog a = C5096b.m23666a((Context) activity, i, new bj(C5095d.m23656a(activity, i, "d"), fragment, i2), onCancelListener);
        if (a == null) {
            return false;
        }
        C5096b.m23668a(activity, a, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    @Deprecated
    public static boolean m23701a(int i, Activity activity) {
        return C5106e.m23702a(i, activity, null, 0, null);
    }

    public static boolean m23704c(Context context) {
        return C5154i.m23887b(context);
    }
}
