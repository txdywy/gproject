package com.google.android.finsky.utils;

import android.util.Base64;
import com.google.protobuf.nano.C0757i;

public final class ab {
    public static String m21685a(C0757i c0757i) {
        return Base64.encodeToString(C0757i.m4909a(c0757i), 3);
    }

    public static String m21687b(C0757i c0757i) {
        if (c0757i == null) {
            return null;
        }
        return Base64.encodeToString(C4681l.m21820a(C0757i.m4909a(c0757i)), 11);
    }

    public static boolean m21686a(String str, C0757i c0757i) {
        try {
            C0757i.m4905a(c0757i, Base64.decode(str, 3));
            return true;
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Error parsing string into proto", new Object[0]);
            return false;
        }
    }
}
