package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class bd implements C0978f {
    public static final C0978f f20271a = new bd();

    private bd() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21669e("Failed to store log", new Object[0]);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Failed to store log", new Object[0]);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Failed to store log", new Object[0]);
        }
    }
}
