package org.chromium.base;

import android.util.Log;
import java.util.Locale;

public final class C7893j {
    public static String m37815a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        return String.format(Locale.US, str, objArr);
    }

    public static String m37814a(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        int i = 0;
        if (str.startsWith("cr.")) {
            i = 3;
        }
        return "cr_" + str.substring(i, str.length());
    }

    public static void m37817a(String str, String str2, Object... objArr) {
        String a = C7893j.m37815a(str2, objArr);
        Throwable a2 = C7893j.m37816a(objArr);
        if (a2 != null) {
            Log.w(C7893j.m37814a(str), a, a2);
        } else {
            Log.w(C7893j.m37814a(str), a);
        }
    }

    public static void m37818b(String str, String str2, Object... objArr) {
        String a = C7893j.m37815a(str2, objArr);
        Throwable a2 = C7893j.m37816a(objArr);
        if (a2 != null) {
            Log.e(C7893j.m37814a(str), a, a2);
        } else {
            Log.e(C7893j.m37814a(str), a);
        }
    }

    public static Throwable m37816a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[objArr.length - 1];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }
}
