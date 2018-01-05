package com.google.android.finsky.installqueue.p141a.p210a;

import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3370n;
import com.google.android.finsky.installqueue.InstallRequest;

public final class C3325b implements C3324a {
    public final C3369m mo3469a(C3369m c3369m, InstallRequest installRequest) {
        Object obj = 1;
        if (c3369m.m16824f() && !(c3369m.f17273c.f17153d == 11 && "single_install".equals(installRequest.f17171a.f17147q))) {
            obj = null;
        }
        if (obj != null) {
            return new C3370n(installRequest).m16827a(11).m16826a();
        }
        return null;
    }
}
