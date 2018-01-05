package com.google.android.finsky.hygiene.p139a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C3188m implements C0978f {
    public static final C0978f f16482a = new C3188m();

    private C3188m() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21669e("Could not schedule hygiene task", new Object[0]);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Could not schedule hygiene task", new Object[0]);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Could not schedule hygiene task", new Object[0]);
        }
    }
}
