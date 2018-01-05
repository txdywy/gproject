package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class C4827p implements C0978f {
    public final /* synthetic */ C2919a f25107a;
    public final /* synthetic */ C4823l f25108b;

    C4827p(C4823l c4823l, C2919a c2919a) {
        this.f25108b = c4823l;
        this.f25107a = c2919a;
    }

    public final void mo1172a(C4809e c4809e) {
        boolean z = true;
        this.f25108b.f25103a = null;
        C4823l c4823l = this.f25108b;
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
                this.f25108b.f25104b = this.f25107a.mo3198a(c4809e.get());
                this.f25108b.f25104b.mo4398a(new C4828q(this));
            } catch (ExecutionException e) {
                this.f25108b.setException(e.getCause());
            } catch (Throwable e2) {
                this.f25108b.setException(e2);
            }
        }
    }
}
