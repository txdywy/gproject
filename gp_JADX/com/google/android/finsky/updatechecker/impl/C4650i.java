package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.updatechecker.impl.ReschedulerUsingJobScheduler.CheckPreconditionsAndAutoUpdateJobService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.aa;

final class C4650i implements Runnable {
    public final /* synthetic */ boolean f23950a;
    public final /* synthetic */ int f23951b;
    public final /* synthetic */ C2495w f23952c;
    public final /* synthetic */ boolean f23953d;
    public final /* synthetic */ int f23954e;
    public final /* synthetic */ boolean f23955f;
    public final /* synthetic */ boolean f23956g;
    public final /* synthetic */ int f23957h;
    public final /* synthetic */ CheckPreconditionsAndAutoUpdateJobService f23958i;

    C4650i(CheckPreconditionsAndAutoUpdateJobService checkPreconditionsAndAutoUpdateJobService, boolean z, int i, C2495w c2495w, boolean z2, int i2, boolean z3, boolean z4, int i3) {
        this.f23958i = checkPreconditionsAndAutoUpdateJobService;
        this.f23950a = z;
        this.f23951b = i;
        this.f23952c = c2495w;
        this.f23953d = z2;
        this.f23954e = i2;
        this.f23955f = z3;
        this.f23956g = z4;
        this.f23957h = i3;
    }

    public final void run() {
        boolean z = true;
        if (this.f23958i.f23860e != null) {
            if (this.f23950a || (this.f23951b & 2) == 0 || !this.f23958i.f23857b.f23994e.m9312b()) {
                int b = this.f23958i.f23858c.m21697b();
                if ((this.f23951b & 1) == 0 || this.f23953d || ReschedulerUsingJobScheduler.m21602a(b, this.f23954e)) {
                    if (this.f23955f) {
                        C4647e b2 = new C4647e().m21623a(b).m21624a(this.f23953d).m21626b(this.f23956g);
                        switch (this.f23957h) {
                            case 0:
                                b = 1;
                                break;
                            case 1:
                                b = 2;
                                break;
                            case 2:
                                b = 3;
                                break;
                            default:
                                FinskyLog.m21659a("unknown networkType [%d]", Integer.valueOf(this.f23957h));
                                b = 0;
                                break;
                        }
                        this.f23952c.m13367a(new C2474c(169).m13214a(b2.m21625b(b).f23946a));
                    }
                    boolean z2 = (this.f23958i.f23857b.f23994e.m9312b() || this.f23958i.f23857b.m21650b() || (this.f23953d && this.f23958i.f23857b.m21649a())) ? false : true;
                    if ((this.f23951b & 1) != 0 && z2) {
                        C0954a.f5840j.m5763a(Long.valueOf(System.currentTimeMillis()));
                    }
                    b = -1;
                    if (this.f23953d || !this.f23958i.f23859d.dj().mo2294a(12619131)) {
                        z = false;
                    }
                    if (z) {
                        b = ((Integer) C0955b.ha.m28964b()).intValue();
                    }
                    this.f23958i.f23857b.m21647a(this.f23958i, z2, b, this.f23952c);
                    return;
                }
                this.f23958i.jobFinished(this.f23958i.f23860e, true);
                return;
            }
            this.f23958i.jobFinished(this.f23958i.f23860e, true);
            C4661t c4661t = this.f23958i.f23857b;
            C2495w c2495w = this.f23952c;
            aa aaVar = new aa();
            aaVar.a |= 32768;
            aaVar.q = true;
            aaVar.b(c4661t.m21649a());
            aaVar.c(c4661t.m21650b());
            aaVar.a(true);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
        }
    }
}
