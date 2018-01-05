package com.google.android.finsky.dy;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;

public class ar implements C0978f {
    public final void mo1172a(C4809e c4809e) {
        try {
            c4809e.get();
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Unexpected InterruptedException", new Object[0]);
        } catch (Throwable e2) {
            FinskyLog.m21663b(e2, "Unexpected exception", new Object[0]);
        }
        mo4374a();
    }

    public void mo4374a() {
    }
}
