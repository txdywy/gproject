package com.google.android.finsky.p189e;

import com.google.android.finsky.au.C1518d;
import com.google.android.finsky.utils.C4689u;
import com.google.android.finsky.utils.FinskyLog;

public final class C2955j {
    static int m15344a(C1518d c1518d, C4689u c4689u) {
        if (c4689u == null) {
            FinskyLog.m21667d("No digestResult for %s (%s)", c1518d.f8208f, c1518d.f8207e);
            return 961;
        } else if (c1518d.f8209g != c4689u.f24071a) {
            FinskyLog.m21667d("Signature check of %s (%s) failed, size expected=%d actual=%d", c1518d.f8208f, c1518d.f8207e, Long.valueOf(c1518d.f8209g), Long.valueOf(c4689u.f24071a));
            return 919;
        } else {
            String str;
            if ("SHA-256".equals(c4689u.f24074d)) {
                str = c1518d.f8211i;
            } else {
                str = c1518d.f8210h;
            }
            if (str.equals(c4689u.f24073c)) {
                return 0;
            }
            FinskyLog.m21667d("Signature check of %s (%s) failed, hash (%s) expected=%s actual=%s", c1518d.f8208f, c1518d.f8207e, c4689u.f24074d, str, c4689u.f24073c);
            return 960;
        }
    }
}
