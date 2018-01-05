package com.google.android.finsky.setup;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.layout.by;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class da implements Runnable {
    public final /* synthetic */ ee[] f21057a;
    public final /* synthetic */ cz f21058b;

    da(cz czVar, ee[] eeVarArr) {
        this.f21058b = czVar;
        this.f21057a = eeVarArr;
    }

    public final void run() {
        if (this.f21058b.f20968a.f20678D != null) {
            this.f21058b.f20968a.f20691v = C1473m.f7980a.cH().m19495a(this.f21057a);
            Context context = this.f21058b.f20968a;
            List<ee> list = this.f21058b.f20968a.f20691v.f21089a;
            if (context.f20686q == null || context.f20686q.length == 0) {
                context.f20686q = new ef[1];
                context.f20686q[0] = new ef();
                ef efVar = context.f20686q[0];
                efVar.b |= 1;
                efVar.c = "";
                for (ee eeVar : list) {
                    eeVar.b |= 32;
                    eeVar.j = 0;
                }
            }
            context.f20684o = new by[context.f20686q.length];
            for (int i = 0; i < context.f20684o.length; i++) {
                boolean z;
                ArrayList arrayList = new ArrayList();
                Collection arrayList2 = new ArrayList();
                for (ee eeVar2 : list) {
                    if (eeVar2.j == i) {
                        if (eeVar2.h) {
                            arrayList.add(eeVar2);
                        } else {
                            arrayList2.add(eeVar2);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
                ee[] eeVarArr = (ee[]) arrayList.toArray(new ee[arrayList.size()]);
                context.f20684o[i] = new by(context);
                by byVar = context.f20684o[i];
                String str = context.f20686q[i].c;
                if (i == context.f20684o.length - 1) {
                    z = true;
                } else {
                    z = false;
                }
                byVar.m17435a(str, eeVarArr, z);
                context.f20689t.addView(context.f20684o[i], context.f20689t.getChildCount());
            }
            this.f21058b.f20968a.m19133j();
            this.f21058b.f20968a.m19135l();
            this.f21058b.f20968a.m19134k();
            if (!this.f21058b.f20968a.m19136m()) {
                this.f21058b.f20968a.mo1274i();
            }
            this.f21058b.f20968a.f20675A = true;
            this.f21058b.f20968a.m19130g();
        }
    }
}
