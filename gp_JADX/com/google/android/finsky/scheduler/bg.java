package com.google.android.finsky.scheduler;

import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bh;
import java.util.List;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class bg implements C0978f {
    public final bc f20276a;
    public final C2495w f20277b;
    public final C2474c f20278c;

    bg(bc bcVar, C2495w c2495w, C2474c c2474c) {
        this.f20276a = bcVar;
        this.f20277b = c2495w;
        this.f20278c = c2474c;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        bc bcVar = this.f20276a;
        C2495w c2495w = this.f20277b;
        C2474c c2474c = this.f20278c;
        try {
            List list = (List) c4809e.get();
            list.add(bcVar.f20270g);
            bcVar.f20264a.c = (bh[]) list.toArray(new bh[list.size()]);
            c2495w.m13367a(c2474c);
            bcVar.f20265b.f20290c.mo1523b(new C1215q()).mo4398a(new bh(list));
            return;
        } catch (ExecutionException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        FinskyLog.m21663b(e, "Failed to read log data store", new Object[0]);
    }
}
