package com.google.android.finsky.scheduler;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class aq implements C0978f {
    public final ak f20223a;
    public final int f20224b;

    aq(ak akVar, int i) {
        this.f20223a = akVar;
        this.f20224b = i;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        ak akVar = this.f20223a;
        int i = this.f20224b;
        try {
            ak.m18802a((List) c4809e.get());
            akVar.f20203d.mo3886a((List) c4809e.get(), i);
            return;
        } catch (ExecutionException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        FinskyLog.m21663b(e, "Failed to scheduled jobs", new Object[0]);
    }
}
