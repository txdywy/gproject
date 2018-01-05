package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import java.util.concurrent.ExecutionException;

final class C4816f implements C0978f {
    public final /* synthetic */ boolean f25094a = false;
    public final /* synthetic */ C4814d f25095b;

    C4816f(C4814d c4814d) {
        this.f25095b = c4814d;
    }

    public final void mo1172a(C4809e c4809e) {
        if (this.f25094a) {
            try {
                if (c4809e.isCancelled()) {
                    this.f25095b.cancel(false);
                    return;
                }
                c4809e.get();
                this.f25095b.m22599a();
                return;
            } catch (ExecutionException e) {
                this.f25095b.setException(e.getCause());
                return;
            } catch (Throwable e2) {
                this.f25095b.setException(e2);
                return;
            }
        }
        this.f25095b.m22599a();
    }
}
