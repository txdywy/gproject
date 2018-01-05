package com.google.android.finsky.dr;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;

public final class C2883a {
    public static boolean m15120a(C1506e c1506e, C1461c c1461c) {
        return (c1461c.dj().mo2294a(12636122) || ((Boolean) C0955b.ax.m28964b()).booleanValue()) && c1506e.m8843f() == 0;
    }

    public static boolean m15122b(C1506e c1506e, C1461c c1461c) {
        C1552e dj = c1461c.dj();
        return C2883a.m15124c(c1506e, c1461c) || C2883a.m15121a(c1506e, dj) || C2883a.m15123b(c1506e, dj);
    }

    public static boolean m15119a(C0988c c0988c, C1506e c1506e, C1461c c1461c) {
        C1552e dj = c1461c.dj();
        return c0988c.cX().isEmpty() && (C2883a.m15124c(c1506e, c1461c) || C2883a.m15123b(c1506e, dj) || C2883a.m15121a(c1506e, dj));
    }

    private static boolean m15124c(C1506e c1506e, C1461c c1461c) {
        if (!C2883a.m15120a(c1506e, c1461c)) {
            Object obj;
            if ((c1461c.dj().mo2294a(12638805) || ((Boolean) C0955b.ay.m28964b()).booleanValue()) && c1506e.m8843f() == 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                return false;
            }
        }
        return true;
    }

    private static boolean m15121a(C1506e c1506e, C1552e c1552e) {
        return c1552e.mo2294a(12644086) && 5 == c1506e.m8843f();
    }

    private static boolean m15123b(C1506e c1506e, C1552e c1552e) {
        return c1552e.mo2294a(12644528) && c1506e.m8841d();
    }
}
