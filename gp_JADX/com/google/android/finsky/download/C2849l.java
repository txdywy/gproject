package com.google.android.finsky.download;

import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.haha.perflib.HprofParser;
import java.util.Map;
import java.util.Set;

final class C2849l implements Runnable {
    public final C2850m f15288a;
    public final Set f15289b;
    public final Set f15290c;
    public final Map f15291d;

    public C2849l(C2850m c2850m, Set set, Set set2, Map map) {
        this.f15288a = c2850m;
        this.f15289b = set;
        this.f15290c = set2;
        this.f15291d = map;
    }

    public final void run() {
        for (Uri a : this.f15289b) {
            C2839b a2 = this.f15288a.mo3170a(a);
            if (a2 != null && a2.mo3166p() == 2) {
                this.f15288a.mo3180c(a2);
            }
        }
        for (Uri a3 : this.f15290c) {
            C2839b a4 = this.f15288a.mo3170a(a3);
            if (a4 != null) {
                C2845h c2845h = (C2845h) this.f15291d.get(a3);
                switch (c2845h.f15279d) {
                    case HprofParser.ROOT_PRIMITIVE_ARRAY_NODATA /*195*/:
                        if (a4.mo3161k()) {
                            c2845h = new C2845h(c2845h.f15276a, c2845h.f15280e, c2845h.f15277b, c2845h.f15278c, 196);
                            break;
                        }
                        break;
                    case 198:
                        FinskyLog.m21659a("%s: Caught error %d while state=%d", a4, Integer.valueOf(c2845h.f15279d), Integer.valueOf(a4.mo3166p()));
                        if (a4.mo3166p() == 2) {
                            a4.mo3152b(c2845h.f15279d);
                            this.f15288a.mo3174a(a4, 5);
                            break;
                        }
                        continue;
                }
                this.f15288a.mo3175a(a4, c2845h);
            }
        }
    }
}
