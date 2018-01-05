package com.google.android.finsky.hygiene.p139a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C3187l implements C0978f {
    public static final C0978f f16481a = new C3187l();

    private C3187l() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            c4809e.get();
            return;
        } catch (ExecutionException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        FinskyLog.m21663b(e, "Could not cancel hygiene task", new Object[0]);
    }
}
