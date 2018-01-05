package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class as implements C0978f {
    public final ak f20226a;
    public final C4026d f20227b;

    as(ak akVar, C4026d c4026d) {
        this.f20226a = akVar;
        this.f20227b = c4026d;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        ak akVar = this.f20226a;
        C4026d c4026d = this.f20227b;
        try {
            if (((Long) c4809e.get()).longValue() > 0) {
                akVar.m18812a(2528, c4026d);
                if (akVar.f20200a != null) {
                    akVar.f20200a.m18933b();
                    return;
                } else if (akVar.m18815a(12642906) && C4042t.m18943a(akVar.f20207h.m18945a(), c4026d) && !c4026d.m18856a().f20246a.f20158f) {
                    akVar.f20203d.mo3885a();
                    return;
                } else {
                    akVar.m18818c(-1);
                    return;
                }
            }
            akVar.m18812a(2546, c4026d);
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21660a(e, "Failed to schedule job %d (%d) (%s)", Integer.valueOf(c4026d.f20249a.f20174b), Integer.valueOf(c4026d.f20249a.f20176d), c4026d.f20249a.f20175c);
            akVar.m18812a(2546, c4026d);
        } catch (CancellationException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Failed to schedule job %d (%d) (%s)", Integer.valueOf(c4026d.f20249a.f20174b), Integer.valueOf(c4026d.f20249a.f20176d), c4026d.f20249a.f20175c);
            akVar.m18812a(2546, c4026d);
        } catch (InterruptedException e4) {
            e = e4;
            FinskyLog.m21660a(e, "Failed to schedule job %d (%d) (%s)", Integer.valueOf(c4026d.f20249a.f20174b), Integer.valueOf(c4026d.f20249a.f20176d), c4026d.f20249a.f20175c);
            akVar.m18812a(2546, c4026d);
        }
    }
}
