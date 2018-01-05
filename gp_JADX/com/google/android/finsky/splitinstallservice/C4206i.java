package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import java.util.Arrays;

final /* synthetic */ class C4206i implements C1207b {
    public final C3369m f21240a;

    C4206i(C3369m c3369m) {
        this.f21240a = c3369m;
    }

    public final Object mo1528a(Object obj) {
        C3369m c3369m = this.f21240a;
        C4196a c4196a = (C4196a) obj;
        if (!C4203f.m19581a(c3369m, c4196a)) {
            return null;
        }
        int a = C4203f.m19577a(c3369m.f17273c.f17153d);
        if (a != 0) {
            c4196a.m19536a(a);
        }
        if (a == 5 || a == 3 || a == 0) {
            c4196a.m19540b(3);
        }
        if (a == 5 || a == 3) {
            c4196a.f21148m = (String[]) Arrays.copyOf(c3369m.m16823e(), c3369m.m16823e().length);
        }
        switch (c3369m.m16820b()) {
            case 0:
                a = 0;
                break;
            case 999:
                a = -2;
                break;
            default:
                a = -100;
                break;
        }
        if (a != 0) {
            c4196a.f21136a |= 32;
            c4196a.f21143h = a;
        }
        if (c3369m.m16822d() != 0) {
            long d = c3369m.m16822d();
            c4196a.f21136a |= 128;
            c4196a.f21145j = d;
        }
        if (c3369m.m16821c() == 0) {
            return c4196a;
        }
        long c = c3369m.m16821c();
        c4196a.f21136a |= 64;
        c4196a.f21144i = c;
        return c4196a;
    }
}
