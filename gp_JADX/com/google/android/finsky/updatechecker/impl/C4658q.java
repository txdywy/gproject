package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C4658q implements C0978f {
    public static final C0978f f23984a = new C4658q();

    private C4658q() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            if (!((Boolean) c4809e.get()).booleanValue()) {
                FinskyLog.m21665c("Could not cancel pre l auto update job", new Object[0]);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Could not cancel pre l auto update task", new Object[0]);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Could not cancel pre l auto update task", new Object[0]);
        }
    }
}
