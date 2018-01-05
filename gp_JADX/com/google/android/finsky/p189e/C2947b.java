package com.google.android.finsky.p189e;

import android.text.TextUtils;
import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.utils.C4690v;
import com.google.android.finsky.utils.FinskyLog;
import java.io.OutputStream;

public final class C2947b {
    public static String m15326a(C1518d c1518d, C1552e c1552e) {
        String str = "SHA-1";
        if (c1552e.mo2294a(12632105)) {
            str = TextUtils.isEmpty(c1518d.f8211i) ? "SHA-1" : "SHA-256";
        }
        FinskyLog.m21659a("APK integrity will be verified using [%s] method", str);
        return str;
    }

    public static C4690v m15325a(String str, OutputStream outputStream, C1518d c1518d) {
        if (str.equals("SHA-256")) {
            return new C4690v(outputStream, c1518d.f8209g, "SHA-256");
        }
        return C4690v.m21840a(outputStream, c1518d.f8209g);
    }
}
