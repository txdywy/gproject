package com.google.android.finsky.datasync.p180a;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class C2507d extends C2503a {
    public final C1287h f13495g;

    C2507d(List list, long j, C2531s c2531s, C1287h c1287h, C1461c c1461c, ai aiVar) {
        super(list, null, j, c2531s, c1461c, aiVar);
        this.f13495g = c1287h;
    }

    protected final void mo2923a(String str) {
    }

    public final boolean mo2924a() {
        int intValue = ((Integer) C1189b.f7270f.m5760a()).intValue();
        return intValue == 1 || intValue == 2;
    }

    public final boolean mo2925b() {
        int intValue = ((Integer) C1189b.f7270f.m5760a()).intValue();
        return (intValue == 1 || intValue == 2) ? false : true;
    }

    public final void mo2926c() {
        if (((Integer) C1189b.f7270f.m5760a()).intValue() != 2) {
            C1189b.f7270f.m5763a(Integer.valueOf(2));
            C1189b.f7271g.m5763a(Integer.valueOf(2));
            this.d.m13481a(this.b, 1613);
            FinskyLog.m21659a("[Cache and Sync] Sync state is now: STARTED.", new Object[0]);
        }
        if (!m13411d()) {
            for (String str : this.b) {
                C0660x agVar = new ag();
                this.f13495g.mo2016a(str).mo1607a(false, true, false, agVar, (C0657w) agVar);
                try {
                    agVar.get();
                } catch (InterruptedException e) {
                    FinskyLog.m21665c("[Cache and Sync] Interrupted while trying to retrieve toc response.", new Object[0]);
                    return;
                } catch (ExecutionException e2) {
                    FinskyLog.m21665c("[Cache and Sync] Execution exception while trying to retrieve toc response.", new Object[0]);
                    return;
                }
            }
            C1189b.f7282r.m5763a(Long.valueOf(C4678i.m21812a() + ((Long) C0955b.dz.m28964b()).longValue()));
            C1189b.f7269e.m5763a(Integer.valueOf(4));
            C1189b.f7270f.m5763a(Integer.valueOf(3));
            C1189b.f7271g.m5763a(Integer.valueOf(3));
            FinskyLog.m21662b("[Cache and Sync] Sync state is now: READY TO DEQUEUE.", new Object[0]);
            this.d.m13481a(this.b, 1614);
        }
    }
}
