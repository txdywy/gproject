package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import java.util.List;

final /* synthetic */ class ak implements ao {
    public final C4215q f21184a;
    public final C4196a f21185b;
    public final String f21186c;
    public final C6279c f21187d;

    ak(C4215q c4215q, C4196a c4196a, String str, C6279c c6279c) {
        this.f21184a = c4215q;
        this.f21185b = c4196a;
        this.f21186c = str;
        this.f21187d = c6279c;
    }

    public final void mo4017a(Object obj) {
        C4215q c4215q = this.f21184a;
        C4196a c4196a = this.f21185b;
        String str = this.f21186c;
        C6279c c6279c = this.f21187d;
        List a = C4215q.m19600a((List) obj);
        if (a.size() != 1) {
            C4215q.m19610c(c6279c, -100);
        } else if (C4203f.m19581a((C3369m) a.get(0), c4196a)) {
            c4215q.f21277q.post(new C4218t(c4215q, str, c4196a, c6279c));
        } else {
            C4215q.m19610c(c6279c, -100);
        }
    }
}
