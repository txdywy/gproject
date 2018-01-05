package com.google.android.finsky.scheduler;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.bg;
import java.util.List;

final /* synthetic */ class C4044v implements C1207b {
    public final C4042t f20335a;
    public final C1202e f20336b;
    public final C2495w f20337c;
    public final C4033g f20338d;

    C4044v(C4042t c4042t, C1202e c1202e, C2495w c2495w, C4033g c4033g) {
        this.f20335a = c4042t;
        this.f20336b = c1202e;
        this.f20337c = c2495w;
        this.f20338d = c4033g;
    }

    public final Object mo1528a(Object obj) {
        C4042t c4042t = this.f20335a;
        C1202e c1202e = this.f20336b;
        C2495w c2495w = this.f20337c;
        C4033g c4033g = this.f20338d;
        List<C4026d> list = (List) obj;
        ak.m18802a((List) list);
        C4046x c4046x = new C4046x();
        c4046x.f20342c = list.size();
        for (C4026d c4026d : list) {
            C4026d c4026d2;
            if (c4042t.m18946a(c4026d2)) {
                FinskyLog.m21665c("Job Blacklisted: %d %d", Integer.valueOf(c4026d2.f20249a.f20174b), Integer.valueOf(c4026d2.f20249a.f20176d));
            } else {
                if (c4026d2.f20249a.f20178f > C4678i.m21812a()) {
                    bc a = c4042t.f20332d.m18907a(2538).m18895a(c4026d2);
                    long a2 = C4678i.m21812a();
                    bg bgVar = a.f20264a;
                    bgVar.a |= 16384;
                    bgVar.r = a2;
                    C2474c c2474c = new C2474c(a.f20268e);
                    c2474c.m13210a(2);
                    c2474c.m13222a(a.f20264a);
                    a.m18899a(c2495w, c2474c);
                    c4026d2 = c4026d2.m18861f().m18865a(C4678i.m21812a()).m18866a(c4026d2.m18856a().m18836a().m18839a(((Long) C0955b.iU.m28964b()).longValue()).m18843b((c4026d2.m18856a().f20246a.f20155c - c4026d2.m18856a().f20246a.f20154b) + ((Long) C0955b.iU.m28964b()).longValue()).m18837a()).m18863a();
                    c1202e.mo1524b((Object) c4026d2);
                }
                if (C4042t.m18943a(c4033g, c4026d2)) {
                    c4046x.f20340a.add(c4026d2);
                } else if (C4042t.m18944b(c4033g, c4026d2)) {
                    c4046x.f20341b.add(c4026d2);
                }
            }
        }
        return c4046x;
    }
}
