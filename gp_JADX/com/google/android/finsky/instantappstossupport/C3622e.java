package com.google.android.finsky.instantappstossupport;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class C3622e implements C0978f {
    C3622e() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            if (-1 == ((Long) c4809e.get()).longValue()) {
                FinskyLog.m21669e("Could not schedule get opt in info job", new Object[0]);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Could not schedule get opt in info job", new Object[0]);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Could not schedule get opt in info job", new Object[0]);
        }
    }
}
