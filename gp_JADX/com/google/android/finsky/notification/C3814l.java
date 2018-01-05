package com.google.android.finsky.notification;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class C3814l implements C0978f {
    public final /* synthetic */ C3813k f19137a;

    public C3814l(C3813k c3813k) {
        this.f19137a = c3813k;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            List list = (List) c4809e.get();
            for (C2281m a : this.f19137a.f19136c) {
                a.mo2834a(list);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Can not fetch notifications from cache.", new Object[0]);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Can not fetch notifications from cache.", new Object[0]);
        }
    }
}
