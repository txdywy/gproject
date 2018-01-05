package com.google.android.finsky.cl;

import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.TimeWindow;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.l.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

final class C2290b implements C0978f {
    public final /* synthetic */ a f11314a;
    public final /* synthetic */ C2289a f11315b;

    C2290b(C2289a c2289a, a aVar) {
        this.f11315b = c2289a;
        this.f11314a = aVar;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            List<C3369m> list = (List) c4809e.get();
            if (!list.isEmpty()) {
                InstallConstraint e2 = new C3361d().m16793a(2).m16799e();
                long toMillis = TimeUnit.SECONDS.toMillis(this.f11314a.e);
                long toMillis2 = TimeUnit.SECONDS.toMillis(this.f11314a.f);
                C3361d a = new C3361d().m16793a(3);
                a.f17257b = new TimeWindow(toMillis, toMillis2);
                InstallConstraint e3 = a.m16799e();
                Collection arrayList = new ArrayList();
                for (C3369m c3369m : list) {
                    arrayList.add(new C3366j(c3369m.f17274d).m16813a(e2, e3).m16806a());
                }
                ((C3340g) this.f11315b.f11313a.mo1a()).m16746a(arrayList);
            }
        } catch (InterruptedException e4) {
            e = e4;
            FinskyLog.m21663b(e, "Unexpected exception", new Object[0]);
        } catch (ExecutionException e5) {
            e = e5;
            FinskyLog.m21663b(e, "Unexpected exception", new Object[0]);
        }
    }
}
