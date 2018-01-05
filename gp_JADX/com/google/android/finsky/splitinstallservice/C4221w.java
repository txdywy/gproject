package com.google.android.finsky.splitinstallservice;

import android.os.RemoteException;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final /* synthetic */ class C4221w implements ao {
    public final C6279c f21297a;
    public final int f21298b;

    C4221w(C6279c c6279c, int i) {
        this.f21297a = c6279c;
        this.f21298b = i;
    }

    public final void mo4017a(Object obj) {
        C6279c c6279c = this.f21297a;
        int i = this.f21298b;
        C4196a c4196a = (C4196a) obj;
        if (c4196a == null) {
            C4215q.m19610c(c6279c, -4);
            return;
        }
        try {
            c6279c.mo5375d(i, C4203f.m19578a(c4196a));
        } catch (RemoteException e) {
        }
    }
}
