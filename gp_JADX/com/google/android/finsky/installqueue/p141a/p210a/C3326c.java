package com.google.android.finsky.installqueue.p141a.p210a;

import android.support.v4.p037h.C0308c;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3370n;
import com.google.android.finsky.installqueue.InstallRequest;
import java.util.ArrayList;
import java.util.Collection;

public final class C3326c implements C3324a {
    public final C3369m mo3469a(C3369m c3369m, InstallRequest installRequest) {
        Object obj;
        if ("single_install".equals(installRequest.f17171a.f17147q) && c3369m.m16824f() && c3369m.f17273c.f17153d != 11) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Collection c0308c = new C0308c(c3369m.f17274d.f17172b);
        c0308c.addAll(installRequest.f17172b);
        C3370n c3370n = new C3370n(c3369m);
        InstallRequest a = new C3366j(installRequest).m16811a(new ArrayList(c0308c)).m16806a();
        c3370n.f17275a.f17152c = a.f17171a;
        return c3370n.m16826a();
    }
}
