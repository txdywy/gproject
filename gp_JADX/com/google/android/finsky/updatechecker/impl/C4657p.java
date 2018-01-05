package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C4657p implements C0978f {
    public static final C0978f f23983a = new C4657p();

    private C4657p() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21669e("Could not schedule pre l auto update task: %s", c4809e.get());
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Could not schedule pre l auto update task", new Object[0]);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Could not schedule pre l auto update task", new Object[0]);
        }
    }
}
