package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class C4828q implements C0978f {
    public final /* synthetic */ C4827p f25109a;

    C4828q(C4827p c4827p) {
        this.f25109a = c4827p;
    }

    public final void mo1172a(C4809e c4809e) {
        boolean z = true;
        this.f25109a.f25108b.f25104b = null;
        C4823l c4823l = this.f25109a.f25108b;
        if (!c4823l.isCancelled()) {
            if (!c4809e.isDone()) {
                FinskyLog.m21669e("Future not done but listener called", new Object[0]);
            }
            if (c4809e.isCancelled()) {
                c4823l.cancel(false);
            } else {
                z = false;
            }
        }
        if (!z) {
            try {
                this.f25109a.f25108b.set(c4809e.get());
            } catch (ExecutionException e) {
                this.f25109a.f25108b.setException(e.getCause());
            } catch (Throwable e2) {
                this.f25109a.f25108b.setException(e2);
            }
        }
    }
}
