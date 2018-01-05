package com.google.android.finsky.wear;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.wearable.C5652n;

final class bb implements Runnable {
    public final /* synthetic */ ba f24862a;

    bb(ba baVar) {
        this.f24862a = baVar;
    }

    public final void run() {
        this.f24862a.f24861c.f24850a.mo4386b();
        ar arVar = this.f24862a.f24861c.f24853d;
        String[] strArr = this.f24862a.f24860b;
        boolean z = this.f24862a.f24861c.f24851b;
        C4780a c4780a = this.f24862a.f24861c.f24850a;
        cc ccVar = this.f24862a.f24861c.f24852c;
        C1473m c1473m = C1473m.f7980a;
        C1552e dj = c1473m.dj();
        arVar.f24825i = c1473m.bz();
        if (dj.mo2294a(12609856) || !z || !arVar.f24825i.m16017a()) {
            arVar.m22469a(strArr, ccVar);
        } else if (arVar.f24826j != null) {
            FinskyLog.m21669e("Already exists foreground connection", new Object[0]);
        } else {
            c4780a.mo4385a();
            arVar.f24826j = arVar.f24825i.m16016a(4, dj, new bc(arVar, c4780a, strArr, ccVar));
        }
        arVar = this.f24862a.f24861c.f24853d;
        C4780a c4780a2 = this.f24862a.f24861c.f24850a;
        cc ccVar2 = this.f24862a.f24861c.f24852c;
        if (C1473m.f7980a.dj().mo2294a(12605594)) {
            FinskyLog.m21659a("Checking pending zapp requests", new Object[0]);
            c4780a2.mo4387c();
            arVar.f24823g.m22458b();
            C5652n.f28708a.mo5116a(arVar.f24823g.f24792b, cl.f24964h, 1).mo4490a(new bi(arVar, c4780a2, ccVar2));
            return;
        }
        FinskyLog.m21659a("Wear zapp experiment disabled", new Object[0]);
    }
}
