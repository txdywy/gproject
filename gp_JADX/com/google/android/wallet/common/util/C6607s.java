package com.google.android.wallet.common.util;

import android.content.Context;

public final class C6607s {
    public static C6607s f32776a;

    public static C6607s m29978a() {
        if (f32776a == null) {
            f32776a = new C6607s();
        }
        return f32776a;
    }

    public static boolean m29980a(Context context, String str) {
        C6607s.m29978a();
        return C6607s.m29981a(context, context.getPackageName(), str);
    }

    public static boolean m29979a(Context context) {
        C6607s.m29978a();
        return C6607s.m29982b(context, context.getPackageName());
    }

    public static boolean m29982b(Context context, String str) {
        return C6607s.m29981a(context, str, "android.permission.ACCESS_COARSE_LOCATION") || C6607s.m29981a(context, str, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static boolean m29981a(Context context, String str, String str2) {
        return context.getPackageManager().checkPermission(str2, str) == 0;
    }
}
