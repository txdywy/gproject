package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import java.util.List;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class ae implements C0978f {
    public final C4215q f21164a;
    public final C6279c f21165b;
    public final String f21166c;
    public final int f21167d;
    public final InstallRequest f21168e;

    ae(C4215q c4215q, C6279c c6279c, String str, int i, InstallRequest installRequest) {
        this.f21164a = c4215q;
        this.f21165b = c6279c;
        this.f21166c = str;
        this.f21167d = i;
        this.f21168e = installRequest;
    }

    public final void mo1172a(C4809e c4809e) {
        C4215q c4215q = this.f21164a;
        C6279c c6279c = this.f21165b;
        String str = this.f21166c;
        int i = this.f21167d;
        InstallRequest installRequest = this.f21168e;
        try {
            int i2;
            List<C3369m> list = (List) c4809e.get();
            C1552e dj = c4215q.f21273m.dj();
            if (dj.mo2294a(12637967) && dj.mo2294a(12644444) && !dj.mo2294a(12644707)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                for (C3369m c3369m : list) {
                    if ((c3369m.f17274d.f17171a.f17147q.equals("auto_update") || c3369m.f17274d.f17171a.f17147q.equals("rapid_auto_update")) && c3369m.f17273c.f17153d == 11 && c3369m.m16819a().equals(str)) {
                        i2 = 1;
                        continue;
                    } else {
                        i2 = 0;
                        continue;
                    }
                    if (i2 != 0) {
                        i2 = 1;
                        break;
                    }
                }
                i2 = 0;
                if (i2 != 0) {
                    FinskyLog.m21659a("Cancelling running auto update for %s.", str);
                    c4215q.m19615a(c4215q.f21262b.m16742a(str), c6279c, new C4217s(c4215q, str, installRequest, i, c6279c));
                    return;
                }
            }
            if (C4215q.m19600a((List) list).isEmpty()) {
                c4215q.m19614a(installRequest, i, c6279c);
            } else {
                c4215q.m19621b(c6279c, -1);
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
            c4215q.m19621b(c6279c, -100);
        }
    }
}
