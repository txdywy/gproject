package com.google.android.finsky.splitinstallservice;

import android.os.RemoteException;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class C4222x implements ao {
    public final C6279c f21299a;

    C4222x(C6279c c6279c) {
        this.f21299a = c6279c;
    }

    public final void mo4017a(Object obj) {
        C6279c c6279c = this.f21299a;
        List<C4196a> list = (List) obj;
        if (list == null) {
            C4215q.m19610c(c6279c, -4);
            return;
        }
        try {
            List arrayList = new ArrayList(list.size());
            for (C4196a a : list) {
                arrayList.add(C4203f.m19578a(a));
            }
            c6279c.mo5372a(arrayList);
        } catch (RemoteException e) {
        }
    }
}
