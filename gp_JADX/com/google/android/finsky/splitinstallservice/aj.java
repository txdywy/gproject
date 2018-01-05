package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final /* synthetic */ class aj implements ao {
    public final C4215q f21180a;
    public final String f21181b;
    public final int f21182c;
    public final C6279c f21183d;

    aj(C4215q c4215q, String str, int i, C6279c c6279c) {
        this.f21180a = c4215q;
        this.f21181b = str;
        this.f21182c = i;
        this.f21183d = c6279c;
    }

    public final void mo4017a(Object obj) {
        C4215q c4215q = this.f21180a;
        String str = this.f21181b;
        int i = this.f21182c;
        C6279c c6279c = this.f21183d;
        C4196a c4196a = (C4196a) obj;
        if (c4196a == null || c4196a.f21137b != i) {
            c4215q.m19615a(c4215q.f21268h.m19563a(str, i), c6279c, new al(c4215q, c6279c, str, i));
        } else if (c4196a.f21142g == 4) {
            C4215q.m19608b(i, c6279c);
        } else {
            c4215q.m19615a(c4215q.f21262b.mo3479a(new C3363f().m16801a("SplitInstallService").m16803b(str).m16800a()), c6279c, new ak(c4215q, c4196a, str, c6279c));
        }
    }
}
