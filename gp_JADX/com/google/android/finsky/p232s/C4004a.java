package com.google.android.finsky.p232s;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C4004a {
    public final ab f20093a;
    public final C2127b f20094b;

    public C4004a(ab abVar, C2127b c2127b) {
        this.f20093a = abVar;
        this.f20094b = c2127b;
    }

    public final void m18747a(List list, C2495w c2495w) {
        if (!list.isEmpty()) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            for (C4005d c4005d : list) {
                if (!c4005d.f20096b) {
                    arrayList.add(c4005d);
                    C2129c c2129c = c4005d.f20101g;
                    int h = c4005d.f20099e.m14653h();
                    if (c2129c == null || h > c2129c.f10810d) {
                        this.f20094b.mo2672c(c4005d.f20099e.cf(), h);
                        arrayList2.add(c4005d);
                    }
                }
            }
            if (!arrayList.isEmpty() && ((Boolean) C0968o.f5931h.m5760a()).booleanValue()) {
                boolean a;
                int size;
                this.f20093a.mo3772a();
                C2495w a2 = c2495w.m13365a();
                if (((Boolean) C0954a.f5854x.m5760a()).booleanValue()) {
                    a = m18746a(arrayList, arrayList2, a2);
                } else {
                    size = arrayList.size();
                    if (arrayList2.size() > 0) {
                        FinskyLog.m21659a("Notifying user that [%d/%d] applications have new updates.", Integer.valueOf(arrayList2.size()), Integer.valueOf(size));
                        this.f20093a.mo3798a(C4004a.m18745a(arrayList2), size, a2);
                        C0954a.ag.m5763a(Long.valueOf(C4678i.m21812a()));
                        a = true;
                    } else {
                        a = false;
                    }
                }
                if (!a) {
                    if (C4678i.m21812a() - ((Long) C0954a.ag.m5760a()).longValue() > ((Long) C0955b.dn.m28964b()).longValue()) {
                        size = 1;
                    } else {
                        size = 0;
                    }
                    if (size != 0) {
                        FinskyLog.m21659a("Notifying user that %d applications have outstanding updates.", Integer.valueOf(arrayList.size()));
                        this.f20093a.mo3799a(C4004a.m18745a(arrayList), a2);
                        C0954a.ag.m5763a(Long.valueOf(C4678i.m21812a()));
                    }
                }
            }
        }
    }

    private final boolean m18746a(List list, List list2, C2495w c2495w) {
        List arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        for (C4005d c4005d : list) {
            boolean z2;
            if ((c4005d.f20095a & 7) != 0) {
                arrayList.add(c4005d.f20099e);
                if (!z && list2.contains(c4005d)) {
                    z2 = true;
                    z = z2;
                }
            }
            z2 = z;
            z = z2;
        }
        if (!z) {
            return false;
        }
        FinskyLog.m21659a("Notifying user [%d/%d] applications have updates that require approval.", Integer.valueOf(arrayList.size()), Integer.valueOf(size));
        this.f20093a.mo3805b(arrayList, size, c2495w);
        C0954a.ag.m5763a(Long.valueOf(C4678i.m21812a()));
        return true;
    }

    private static List m18745a(List list) {
        List arrayList = new ArrayList();
        for (C4005d c4005d : list) {
            arrayList.add(c4005d.f20099e);
        }
        return arrayList;
    }
}
