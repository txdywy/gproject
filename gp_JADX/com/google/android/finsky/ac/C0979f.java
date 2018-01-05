package com.google.android.finsky.ac;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.TimeUnit;

final /* synthetic */ class C0979f implements C0978f {
    public final C0977e f5962a;

    C0979f(C0977e c0977e) {
        this.f5962a = c0977e;
    }

    public final void mo1172a(C4809e c4809e) {
        int i;
        C0977e c0977e = this.f5962a;
        try {
            C4026d c4026d = (C4026d) c4809e.get();
            if (c4026d != null) {
                i = C4678i.m21812a() + ((Long) C0955b.jL.m28964b()).longValue() < c4026d.f20249a.f20178f + c4026d.m18856a().f20246a.f20154b ? 1 : 0;
                if (i != 0) {
                    c0977e.f5958a.m18888a(1, "content-sync-service", C0975c.class, new C4024b().m18839a(((Long) C0955b.jL.m28964b()).longValue()).m18843b(TimeUnit.DAYS.toMillis(1)).m18838a(1).m18837a(), null).mo4398a(C0980g.f5963a);
                }
            }
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21660a(e, "InterruptedException failed to check job parameters in content sync", new Object[0]);
            i = 1;
        } catch (Throwable e2) {
            FinskyLog.m21660a(e2, "ListenableFuture failed to check job parameters in content sync", new Object[0]);
        }
        i = 1;
        if (i != 0) {
            c0977e.f5958a.m18888a(1, "content-sync-service", C0975c.class, new C4024b().m18839a(((Long) C0955b.jL.m28964b()).longValue()).m18843b(TimeUnit.DAYS.toMillis(1)).m18838a(1).m18837a(), null).mo4398a(C0980g.f5963a);
        }
    }
}
