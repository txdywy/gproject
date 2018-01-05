package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final /* synthetic */ class al implements ao {
    public final C4215q f21188a;
    public final C6279c f21189b;
    public final String f21190c;
    public final int f21191d;

    al(C4215q c4215q, C6279c c6279c, String str, int i) {
        this.f21188a = c4215q;
        this.f21189b = c6279c;
        this.f21190c = str;
        this.f21191d = i;
    }

    public final void mo4017a(Object obj) {
        C4215q c4215q = this.f21188a;
        C6279c c6279c = this.f21189b;
        String str = this.f21190c;
        int i = this.f21191d;
        C4196a c4196a = (C4196a) obj;
        if (c4196a == null) {
            C4215q.m19610c(c6279c, -4);
        } else if (c4196a.f21142g == 3) {
            c4215q.f21275o.m19574a(c4196a.f21137b);
            c4215q.m19623c(str, i, c6279c);
        } else {
            C4215q.m19608b(i, c6279c);
        }
    }
}
