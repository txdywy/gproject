package com.google.android.finsky.notification.impl;

import com.google.android.finsky.cd.C2263f;
import com.google.android.finsky.cd.C2265h;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C3796k {
    public C2471a f19076a;
    public C3027b f19077b;

    public C3796k(C2471a c2471a, C3027b c3027b) {
        this.f19076a = c2471a;
        this.f19077b = c3027b;
    }

    public final void m18148a(C2263f c2263f) {
        ArrayList arrayList = new ArrayList();
        for (cv cvVar : c2263f.ao_().f11246b) {
            Document document = new Document(cvVar);
            if (this.f19077b.m15626a(document.cf()).m15624b(document)) {
                arrayList.add(cvVar);
            }
        }
        C2265h c2265h = new C2265h();
        c2265h.f11246b = (cv[]) arrayList.toArray(new cv[arrayList.size()]);
        c2265h.m11713a(arrayList.size());
        c2263f.m11706a(c2265h);
    }

    public final void m18149a(C3803r c3803r, C2263f c2263f) {
        int i;
        cv[] cvVarArr = c2263f.ao_().f11246b;
        List arrayList = new ArrayList();
        for (cv document : cvVarArr) {
            arrayList.add(new Document(document));
        }
        try {
            i = c2263f.f11243g;
            int i2 = c2263f.ao_().f11247c;
            C2495w a = this.f19076a.m13183a(c2263f.f11241e);
            switch (i) {
                case 900:
                    c3803r.m18237c(arrayList, i2, a);
                    return;
                case 903:
                    c3803r.m18233b(arrayList, a);
                    return;
                case 904:
                    c3803r.m18240d(arrayList, i2, a);
                    return;
                default:
                    FinskyLog.m21669e("Reschedule job of notification id is unsupported", new Object[0]);
                    return;
            }
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Reschedule job of notification type is unsupported", new Object[0]);
        }
        FinskyLog.m21663b(e, "Reschedule job of notification type is unsupported", new Object[0]);
    }
}
