package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class C4825n implements C0978f {
    public final /* synthetic */ C1207b f25105a;
    public final /* synthetic */ C4823l f25106b;

    C4825n(C4823l c4823l, C1207b c1207b) {
        this.f25106b = c4823l;
        this.f25105a = c1207b;
    }

    public final void mo1172a(C4809e c4809e) {
        boolean z = true;
        this.f25106b.f25103a = null;
        C4823l c4823l = this.f25106b;
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
                this.f25106b.set(this.f25105a.mo1528a(c4809e.get()));
            } catch (ExecutionException e) {
                this.f25106b.setException(e.getCause());
            } catch (Throwable e2) {
                this.f25106b.setException(e2);
            }
        }
    }
}
