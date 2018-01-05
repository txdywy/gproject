package com.google.android.finsky.wear;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class bk implements C0978f {
    public final /* synthetic */ String f24881a;

    bk(String str) {
        this.f24881a = str;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21669e("Could not schedule hygiene for jobTag: %s", this.f24881a);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Could not schedule hygiene for jobTag: %s", this.f24881a);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Could not schedule hygiene for jobTag: %s", this.f24881a);
        }
    }
}
