package com.google.android.finsky.wear;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p107l.C0974i;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class au implements C0974i {
    public final ar f24839a;
    public final String f24840b;
    public final int f24841c;
    public final String f24842d;
    public final cc f24843e;

    au(ar arVar, String str, int i, String str2, cc ccVar) {
        this.f24839a = arVar;
        this.f24840b = str;
        this.f24841c = i;
        this.f24842d = str2;
        this.f24843e = ccVar;
    }

    public final void mo1171a(boolean z) {
        ar arVar = this.f24839a;
        String str = this.f24840b;
        int i = this.f24841c;
        String str2 = this.f24842d;
        cc ccVar = this.f24843e;
        C1473m c1473m = C1473m.f7980a;
        cd cdVar = new cd(c1473m.f7981b, str, c1473m.ah(), arVar.f24823g.f24797g.m22484a(str), C1473m.f7980a.mo2222d(str), arVar.f24823g.f24798h, i, str2, arVar.f24823g, new at(arVar, str));
        String[] a = C4680k.m21818a((String) C0955b.ev.m28964b());
        cj bfVar = new bf(arVar, str, ccVar);
        if (C1473m.f7980a.mo2035O().m8838a()) {
            Account cY = C1473m.f7980a.cY();
            if (cY == null) {
                cd.m22508a(bfVar, false);
                return;
            } else if (!cdVar.f24934g.f18022b.m11208b()) {
                FinskyLog.m21669e("Require loaded app states to perform update check.", new Object[0]);
                cd.m22508a(bfVar, false);
                return;
            } else if (cdVar.f24933f.mo2816a()) {
                new ce(cdVar, cY, cdVar.f24933f.mo2817b(), bfVar, a).execute(new Void[0]);
                return;
            } else {
                FinskyLog.m21669e("Require loaded libraries to perform update check.", new Object[0]);
                cd.m22508a(bfVar, false);
                return;
            }
        }
        FinskyLog.m21659a("Skip update checks for node %s because the store is invalid.", cdVar.f24932e);
        cd.m22508a(bfVar, false);
    }
}
