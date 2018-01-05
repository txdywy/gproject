package com.google.android.finsky.flushlogs;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C3136i implements C0978f {
    public static final C0978f f16142a = new C3136i();

    private C3136i() {
    }

    public final void mo1172a(C4809e c4809e) {
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21669e("Could not complete flushing logs: %s", c4809e.get());
            }
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21660a(e, "InterruptedException while flushing logs.", new Object[0]);
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "ExecutionException while flushing logs.", new Object[0]);
        }
    }
}
