package com.google.android.finsky.installqueue;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C3364h implements C0978f {
    public static final C0978f f17264a = new C3364h();

    private C3364h() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            c4809e.get();
            return;
        } catch (InterruptedException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        }
        FinskyLog.m21663b(e, "Unexpected exception", new Object[0]);
    }
}
