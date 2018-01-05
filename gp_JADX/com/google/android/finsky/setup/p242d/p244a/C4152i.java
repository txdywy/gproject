package com.google.android.finsky.setup.p242d.p244a;

import android.os.Bundle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.nano.ci;

final class C4152i implements Runnable {
    public final /* synthetic */ ci f21003a;
    public final /* synthetic */ C4151h f21004b;

    C4152i(C4151h c4151h, ci ciVar) {
        this.f21004b = c4151h;
        this.f21003a = ciVar;
    }

    public final void run() {
        C4147d c4147d = this.f21004b.f21002a;
        ci ciVar = this.f21003a;
        bb.m21791a();
        ci ciVar2 = c4147d.f20989f;
        c4147d.f20989f = ciVar;
        if (ciVar2 == null) {
            c4147d.f20994k.mo3949a(null, 3);
        }
        if (c4147d.f20989f == null) {
            c4147d.m19427a(5, (Bundle) c4147d.f20987d.mo3197a(ciVar2));
            return;
        }
        int i;
        String str = c4147d.f20989f.c.f11833b;
        boolean z = ciVar2 != null && str.equals(ciVar2.c.f11833b);
        if (z) {
            i = c4147d.f20990g;
            c4147d.f20990g = i + 1;
        } else {
            i = 0;
        }
        c4147d.f20990g = i;
        if (z) {
            boolean z2;
            Integer num;
            int i2 = c4147d.f20990g;
            ci ciVar3 = c4147d.f20989f;
            if ((ciVar3.b & 8) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && ciVar3.g) {
                num = (Integer) C0955b.em.m28964b();
            } else {
                num = (Integer) C0955b.en.m28964b();
            }
            if (i2 >= num.intValue()) {
                C4147d.m19425a(c4147d.f20989f);
                c4147d.m19432c();
                return;
            }
        }
        FinskyLog.m21659a("Starting early update of %s:%d", c4147d.f20989f.c.f11833b, Integer.valueOf(c4147d.f20989f.e));
        C3366j a = new C3366j(c4147d.f20986c.m13184a("early_update"), c4147d.f20989f).m16813a(new C3361d().m16793a(1).m16792a().m16799e());
        C3314d c3314d = a.f17266b;
        c3314d.f17131a |= 512;
        c3314d.f17144n = true;
        c4147d.f20992i.m16744a(a.m16814b(1).m16809a(C3367k.f17269c).m16817d(c4147d.f20989f.h).m16806a());
        if (((Boolean) C0955b.hO.m28964b()).booleanValue()) {
            c4147d.f20993j.mo3462p(str);
        }
    }
}
