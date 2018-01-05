package com.google.android.finsky.scheduler;

import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4028f;
import java.util.Comparator;

final /* synthetic */ class C4045w implements Comparator {
    public static final Comparator f20339a = new C4045w();

    private C4045w() {
    }

    public final int compare(Object obj, Object obj2) {
        C4028f c4028f = null;
        C4026d c4026d = (C4026d) obj;
        C4026d c4026d2 = (C4026d) obj2;
        if (aa.m18792a(c4026d) == aa.m18792a(c4026d2)) {
            return 0;
        }
        C4023a a = c4026d.m18856a();
        C4023a a2 = c4026d2.m18856a();
        if (a.f20246a.f20159g != a2.f20246a.f20159g) {
            return a.f20246a.f20159g - a2.f20246a.f20159g;
        }
        if (a.f20246a.f20160h && !a2.f20246a.f20160h) {
            return -1;
        }
        if (a.f20246a.f20160h || !a2.f20246a.f20160h) {
            C4028f c4028f2;
            if (c4026d.m18858c() != 0) {
                c4028f2 = c4026d.m18857b()[c4026d.m18858c() - 1];
            } else {
                c4028f2 = null;
            }
            if (c4026d2.m18858c() != 0) {
                c4028f = c4026d2.m18857b()[c4026d2.m18858c() - 1];
            }
            if (c4028f2 == null && c4028f == null) {
                return 0;
            }
            if (c4028f2 == null) {
                return -1;
            }
            if (c4028f != null && c4028f2.f20251a.f20186c < c4028f.f20251a.f20186c) {
                return -1;
            }
        }
        return 1;
    }
}
