package com.google.android.finsky.datasync.p180a;

import com.android.volley.C0657w;
import com.android.volley.C0659a;
import com.android.volley.C0660x;
import com.android.volley.C0684b;
import com.android.volley.p060a.ag;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class C2513j extends C2503a {
    public final C1287h f13506g;

    C2513j(List list, long j, C1287h c1287h, C2531s c2531s, C1461c c1461c, ai aiVar) {
        super(list, null, j, c2531s, c1461c, aiVar);
        this.f13506g = c1287h;
    }

    protected final void mo2923a(String str) {
    }

    public final boolean mo2924a() {
        return ((Integer) C1189b.f7268d.m5760a()).intValue() == 3 && ((Integer) C1189b.f7270f.m5760a()).intValue() == 1 && ((Integer) C1189b.f7271g.m5760a()).intValue() == 1;
    }

    public final boolean mo2925b() {
        return ((Integer) C1189b.f7268d.m5760a()).intValue() == 4;
    }

    public final void mo2926c() {
        for (String str : this.b) {
            if (!m13411d()) {
                C0660x agVar = new ag();
                C1254c a = this.f13506g.mo2016a(str);
                if (a != null) {
                    a.mo1607a(false, false, false, agVar, (C0657w) agVar);
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
            } else {
                return;
            }
        }
        C1189b.f7268d.m5763a(Integer.valueOf(4));
        C1189b.f7269e.m5763a(Integer.valueOf(5));
        FinskyLog.m21662b("[Cache and Sync] Cache state is now: COMPLETE. Cache and sync successfully completed.", new Object[0]);
        C1189b.f7273i.m5763a(Long.valueOf(C4678i.m21812a()));
        C1189b.f7274j.m5763a((Long) C1189b.f7273i.m5760a());
        C1189b.f7276l.m5763a((Integer) C1189b.f7277m.m5760a());
        C1189b.f7277m.m5763a(Integer.valueOf(0));
        C1189b.f7279o.m5763a((Integer) C1189b.f7280p.m5760a());
        C1189b.f7280p.m5763a(Integer.valueOf(0));
        this.d.m13481a(this.b, 1621);
        C0659a dl = this.d.f13567d.dl();
        if (dl != null) {
            C0684b c0684b = new C0684b();
            c0684b.f4131a = new byte[0];
            dl.mo1066a("cache_and_sync_marker_cache_key", c0684b);
        }
    }
}
