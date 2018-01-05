package com.google.android.finsky.cs.p135a.p136a;

import android.os.AsyncTask;
import com.google.android.finsky.cs.C2378b;
import com.google.android.finsky.cs.C2409f;
import com.google.android.finsky.cs.p135a.C2377c;
import com.google.android.finsky.cs.p135a.C2400h;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.bb;
import java.util.HashMap;
import java.util.Map;

public final class C2379d extends C2377c implements C2378b {
    public C2380e f11644e;

    public C2379d() {
        ((C1368o) C3947d.m18649a(C1368o.class)).mo1791a(this);
    }

    public final void mo2888d(String str) {
        C2380e c2380e = this.f11644e;
        AsyncTask c2389m = new C2389m(c2380e.f11649e, c2380e.f11648d, c2380e.f11646b, "com.google.android.finsky.stable", C2400h.f11700a, c2380e.f11647c, C2380e.m12056a(str), c2380e.f11650f.m12086a(), c2380e.f11645a, c2380e.f11651g, c2380e.f11652h);
        C2380e c2380e2 = this.f11644e;
        AsyncTask c2386j = new C2386j(c2380e2.f11649e, c2380e2.f11648d, c2380e2.f11646b, "com.google.android.finsky.regular", C2400h.f11700a, c2380e2.f11647c, C2380e.m12056a(str), c2380e2.f11650f.m12086a(), c2380e2.f11645a);
        bb.m21792a(c2389m, new Void[0]);
        bb.m21792a(c2386j, new Void[0]);
    }

    public final C2409f mo2882a() {
        return C2379d.m12048a(this.d.m12089a(), this.c);
    }

    public final C2409f mo2883a(String str) {
        return C2379d.m12048a(this.d.m12092b(str), this.b);
    }

    private static C2409f m12048a(C2409f c2409f, Map map) {
        if (c2409f == null) {
            return new C2409f(map, null, null, null);
        }
        Map hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(c2409f.f11707a);
        return new C2409f(hashMap, c2409f.f11708b, c2409f.f11709c, c2409f.f11710d);
    }

    public final void mo2885b(String str) {
        C2380e c2380e = this.f11644e;
        new C2387k(c2380e.f11648d, c2380e.f11646b, "com.google.android.finsky.stable", C2380e.m12056a(str)).m12076a();
    }

    public final void mo2887c(String str) {
        C2380e c2380e = this.f11644e;
        new C2387k(c2380e.f11648d, c2380e.f11646b, "com.google.android.finsky.regular", C2380e.m12056a(str)).m12076a();
    }

    public final void mo2884a(String str, Map map) {
        C2380e c2380e = this.f11644e;
        new C2388l(c2380e.f11648d, c2380e.f11646b, "com.google.android.finsky.stable", map, C2380e.m12056a(str)).m12078a();
    }

    public final void mo2886b(String str, Map map) {
        C2380e c2380e = this.f11644e;
        new C2388l(c2380e.f11648d, c2380e.f11646b, "com.google.android.finsky.regular", map, C2380e.m12056a(str)).m12078a();
    }
}
