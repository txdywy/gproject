package com.google.android.finsky.stream.controllers;

import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.stream.myapps.C4344x;
import com.google.android.finsky.stream.myapps.C4560y;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class ax implements C0978f {
    public final aw f21877a;
    public final Map f21878b;

    ax(aw awVar, Map map) {
        this.f21877a = awVar;
        this.f21878b = map;
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        C4344x c4344x = this.f21877a;
        Map map = this.f21878b;
        try {
            C4560y v = c4344x.m20167v();
            c4344x.m20164r();
            List arrayList = new ArrayList();
            for (C3369m c3369m : (List) c4809e.get()) {
                String a = c3369m.m16819a();
                Document document = (Document) map.get(a);
                c4344x.y.m15637b(document);
                if (!c4344x.y.m15634a(document)) {
                    arrayList.add(document);
                    c4344x.m20135a(a, document, c3369m.f17273c.f17153d);
                }
            }
            c4344x.K = arrayList;
            c4344x.ca_();
            c4344x.m20166u();
            c4344x.mo4137c();
            c4344x.m20134a(v);
        } catch (InterruptedException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Unexpected exception: %s", e.getMessage());
        } catch (ExecutionException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Unexpected exception: %s", e.getMessage());
        } catch (CancellationException e4) {
        }
    }
}
