package com.google.android.finsky.activities;

import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4830g;
import com.google.android.finsky.p108z.C4831h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final /* synthetic */ class eu implements C0978f {
    public final C3340g f6772a;

    eu(C3340g c3340g) {
        this.f6772a = c3340g;
    }

    public final void mo1172a(C4809e c4809e) {
        C3340g c3340g = this.f6772a;
        List<C3369m> list = (List) C4830g.m22622a(c4809e);
        if (list != null && !list.isEmpty()) {
            Collection arrayList = new ArrayList(list.size());
            for (C3369m c3369m : list) {
                arrayList.add(new C3366j(c3369m.f17274d).m16813a(new C3361d().m16793a(1).m16799e()).m16806a());
            }
            c3340g.mo3483b(arrayList).mo4398a(C4831h.f25111a);
        }
    }
}
