package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final /* synthetic */ class af implements C0978f {
    public final C4215q f21169a;
    public final InstallRequest f21170b;
    public final C6279c f21171c;
    public final int f21172d;

    af(C4215q c4215q, InstallRequest installRequest, C6279c c6279c, int i) {
        this.f21169a = c4215q;
        this.f21170b = installRequest;
        this.f21171c = c6279c;
        this.f21172d = i;
    }

    public final void mo1172a(C4809e c4809e) {
        C4215q c4215q = this.f21169a;
        InstallRequest installRequest = this.f21170b;
        C6279c c6279c = this.f21171c;
        c4215q.m19615a(c4215q.f21262b.m16748b(installRequest), c6279c, new ab(this.f21172d, c6279c));
    }
}
