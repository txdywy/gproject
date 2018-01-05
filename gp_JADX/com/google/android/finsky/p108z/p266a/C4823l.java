package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.p108z.C2919a;
import com.google.android.finsky.p108z.C4809e;
import java.util.concurrent.Executor;

final class C4823l extends C4810i {
    public C4809e f25103a;
    public C4809e f25104b;

    C4823l(C4809e c4809e, C1207b c1207b, Executor executor) {
        super(new C4824m(), executor);
        this.f25103a = c4809e;
        c4809e.mo4398a(new C4825n(this, c1207b));
    }

    C4823l(C4809e c4809e, C2919a c2919a, Executor executor) {
        super(new C4826o(), executor);
        this.f25103a = c4809e;
        c4809e.mo4398a(new C4827p(this, c2919a));
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            if (this.f25104b != null) {
                this.f25104b.cancel(z);
                this.f25104b = null;
            }
            if (this.f25103a != null) {
                this.f25103a.cancel(z);
                this.f25103a = null;
            }
        }
        return cancel;
    }

    public final void run() {
    }
}
