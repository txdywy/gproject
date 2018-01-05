package com.google.android.finsky.detailsmodules.modules.subscriptions;

import com.android.volley.C0660x;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.bu;
import com.google.wireless.android.finsky.dfe.nano.bx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

final /* synthetic */ class C2614e implements C0660x {
    public final C2613d f13878a;
    public final Map f13879b;

    C2614e(C2613d c2613d, Map map) {
        this.f13878a = c2613d;
        this.f13879b = map;
    }

    public final void b_(Object obj) {
        C2613d c2613d = this.f13878a;
        Map map = this.f13879b;
        bx bxVar = (bx) obj;
        Collection arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        for (bu buVar : bxVar.a) {
            if (buVar.b == null) {
                FinskyLog.m21667d("Received response entry without doc.", new Object[0]);
            } else {
                C2231n c2231n = (C2231n) map.get(buVar.b.f12097d);
                if (c2231n == null) {
                    FinskyLog.m21667d("Subscription entry not available for: %s", r10);
                } else {
                    arrayList.add(new Document(buVar.b));
                    arrayList2.add(c2231n);
                }
            }
        }
        c2613d.f13875b.mo2981a(new ArrayList(arrayList), new ArrayList(arrayList2));
    }
}
