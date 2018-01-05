package com.google.android.finsky.datasync;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;

public final /* synthetic */ class C2523i implements C0978f {
    public final C2522h f13549a;

    public C2523i(C2522h c2522h) {
        this.f13549a = c2522h;
    }

    public final void mo1172a(C4809e c4809e) {
        C2522h c2522h = this.f13549a;
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                c2522h.f13548c.m13367a(new C2474c(530));
                FinskyLog.m21669e("Could not schedule browse data sync: %s", c4809e.get());
            }
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21660a(e, "InterruptedException during browse data sync scheduling.", new Object[0]);
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "ExecutionException during browse data sync scheduling.", new Object[0]);
        }
    }
}
