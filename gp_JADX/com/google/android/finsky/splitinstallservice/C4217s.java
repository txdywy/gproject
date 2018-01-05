package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final /* synthetic */ class C4217s implements ao {
    public final C4215q f21283a;
    public final String f21284b;
    public final InstallRequest f21285c;
    public final int f21286d;
    public final C6279c f21287e;

    C4217s(C4215q c4215q, String str, InstallRequest installRequest, int i, C6279c c6279c) {
        this.f21283a = c4215q;
        this.f21284b = str;
        this.f21285c = installRequest;
        this.f21286d = i;
        this.f21287e = c6279c;
    }

    public final void mo4017a(Object obj) {
        C4215q c4215q = this.f21283a;
        c4215q.f21262b.mo3481a(new am(c4215q, this.f21284b, this.f21285c, this.f21286d, this.f21287e));
    }
}
