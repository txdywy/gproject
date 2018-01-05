package com.google.android.gms.internal;

import com.google.android.gms.ads.p270c.C4909c;
import java.security.GeneralSecurityException;

final class ef {
    public static qm f26683a;

    static boolean m24330a() {
        if (f26683a != null) {
            return true;
        }
        String str = (String) C4909c.m22927a().f25267g.m26014a(yu.f27761q);
        if (str.length() == 0) {
            return false;
        }
        try {
            try {
                qo a = qy.m25439a(eb.m24316a(str, true));
                sj.m25545a();
                f26683a = sj.m25544a(a);
                return f26683a != null;
            } catch (GeneralSecurityException e) {
                return false;
            }
        } catch (IllegalArgumentException e2) {
            return false;
        }
    }
}
