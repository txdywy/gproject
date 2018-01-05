package com.google.android.finsky.wear;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4680k;

public final class ck {
    public static String m22512a(String str, long j) {
        return new StringBuilder(String.valueOf(str).length() + 21).append(str).append("-").append(j).toString();
    }

    public static boolean m22514a(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (strArr.length == 0) {
            return true;
        }
        for (Object equals : strArr) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m22513a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] a = C4680k.m21818a((String) C0955b.ez.m28964b());
        if (a.length == 0) {
            return false;
        }
        for (Object equals : a) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
