package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final class am implements C1003o {
    public final /* synthetic */ String f21192a;
    public final /* synthetic */ InstallRequest f21193b;
    public final /* synthetic */ int f21194c;
    public final /* synthetic */ C6279c f21195d;
    public final /* synthetic */ C4215q f21196e;

    am(C4215q c4215q, String str, InstallRequest installRequest, int i, C6279c c6279c) {
        this.f21196e = c4215q;
        this.f21192a = str;
        this.f21193b = installRequest;
        this.f21194c = i;
        this.f21195d = c6279c;
    }

    public final void mo1205a(C3369m c3369m) {
        if (c3369m.f17273c.f17153d == 2) {
            FinskyLog.m21659a("Cancelled running auto update for %s.", this.f21192a);
            this.f21196e.m19614a(this.f21193b, this.f21194c, this.f21195d);
            this.f21196e.f21262b.mo3484b((C1003o) this);
        }
    }
}
