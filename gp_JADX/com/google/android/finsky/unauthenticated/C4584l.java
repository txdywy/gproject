package com.google.android.finsky.unauthenticated;

import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class C4584l implements C0978f {
    public final /* synthetic */ C4573n f23411a;
    public final /* synthetic */ C4579g f23412b;

    C4584l(C4579g c4579g, C4573n c4573n) {
        this.f23412b = c4579g;
        this.f23411a = c4573n;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        List arrayList = new ArrayList();
        try {
            List list = (List) c4809e.get();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((C3369m) list.get(i)).m16819a());
            }
            this.f23412b.f23398d.mo3480a(arrayList).mo4398a(new C4585m(this));
        } catch (InterruptedException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Error while retrieving InstallStatus for cancellation", new Object[0]);
        } catch (ExecutionException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Error while retrieving InstallStatus for cancellation", new Object[0]);
        }
    }
}
