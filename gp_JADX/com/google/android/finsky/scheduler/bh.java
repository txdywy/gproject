package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class bh implements C0978f {
    public final List f20279a;

    bh(List list) {
        this.f20279a = list;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            if (((Integer) c4809e.get()).intValue() != this.f20279a.size() - 1) {
                FinskyLog.m21669e("Incorrect number of records deleted", new Object[0]);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Incorrect number of records deleted", new Object[0]);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Incorrect number of records deleted", new Object[0]);
        }
    }
}
