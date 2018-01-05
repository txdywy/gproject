package com.google.android.finsky.p229o;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.C4819c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.x;
import com.google.wireless.android.a.a.a.a.y;
import com.google.wireless.android.finsky.dfe.b.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class C3828c {
    public final List f19177a = new ArrayList();
    public final C4819c f19178b;

    public C3828c(C2830g c2830g, C4817d c4817d, C3960a c3960a) {
        m18282a(new C3831f(c3960a));
        m18282a(new C3834i(c2830g));
        this.f19178b = c4817d.mo4399a(Executors.newFixedThreadPool(this.f19177a.size()));
    }

    private final void m18282a(C3826a c3826a) {
        for (C3826a a : this.f19177a) {
            if (a.mo3813a() == c3826a.mo3813a()) {
                FinskyLog.m21669e("Already have a data provider with type " + c3826a.mo3813a(), new Object[0]);
                return;
            }
        }
        this.f19177a.add(c3826a);
    }

    public final a m18283a(C2495w c2495w) {
        long b = C4678i.m21813b();
        a aVar = new a();
        CountDownLatch countDownLatch = new CountDownLatch(this.f19177a.size());
        List arrayList = new ArrayList(this.f19177a.size());
        List arrayList2 = new ArrayList(this.f19177a.size());
        for (C3826a c3826a : this.f19177a) {
            long b2 = C4678i.m21813b();
            y yVar = new y();
            yVar.c = c3826a.mo3813a();
            yVar.b |= 1;
            arrayList2.add(yVar);
            C4809e a = this.f19178b.mo4403a(new C3829d(c3826a));
            a.mo4398a(new C3830e(yVar, b2, a, c3826a, aVar, countDownLatch));
            arrayList.add(a);
        }
        try {
            countDownLatch.await(((Long) C0955b.jI.m28964b()).longValue(), TimeUnit.MILLISECONDS);
            ArrayList arrayList3 = (ArrayList) arrayList;
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                ((C4809e) obj).cancel(false);
            }
            c2495w.m13367a(new C2474c(2950).m13242b(C4678i.m21813b() - b).m13233a(C3828c.m18281a(arrayList2, false)));
            return aVar;
        } catch (InterruptedException e) {
            c2495w.m13367a(new C2474c(2950).m13242b(C4678i.m21813b() - b).m13254g(1900).m13233a(C3828c.m18281a(arrayList2, true)));
            FinskyLog.m21665c("Interrupted while waiting for data providers", new Object[0]);
            throw e;
        }
    }

    private static x m18281a(List list, boolean z) {
        x xVar = new x();
        xVar.a = (y[]) list.toArray(new y[0]);
        for (y yVar : xVar.a) {
            if (((yVar.b & 2) != 0 ? 1 : 0) == 0) {
                int i;
                if (z) {
                    i = 1902;
                } else {
                    i = 1904;
                }
                yVar.a(i);
            }
        }
        return xVar;
    }
}
