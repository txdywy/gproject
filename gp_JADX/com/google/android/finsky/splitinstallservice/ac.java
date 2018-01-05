package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.play.p122c.p246b.p247a.C6279c;

final /* synthetic */ class ac implements Runnable {
    public final C4215q f21155a;
    public final String f21156b;
    public final C6279c f21157c;
    public final int f21158d;
    public final InstallRequest f21159e;

    ac(C4215q c4215q, String str, C6279c c6279c, int i, InstallRequest installRequest) {
        this.f21155a = c4215q;
        this.f21156b = str;
        this.f21157c = c6279c;
        this.f21158d = i;
        this.f21159e = installRequest;
    }

    public final void run() {
        C4215q c4215q = this.f21155a;
        String str = this.f21156b;
        c4215q.f21262b.mo3479a(new C3363f().m16803b(str).m16800a()).mo4398a(new ae(c4215q, this.f21157c, str, this.f21158d, this.f21159e));
    }
}
