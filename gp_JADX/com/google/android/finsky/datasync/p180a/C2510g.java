package com.google.android.finsky.datasync.p180a;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.datasync.C2515v;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.datasync.C2532u;
import com.google.android.finsky.datasync.C2533w;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.wireless.android.finsky.dfe.d.a.c;
import com.google.wireless.android.finsky.dfe.d.a.d;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class C2510g extends C2503a {
    public long f13499a;
    public final C2515v f13500g;
    public final C1287h f13501h;

    C2510g(List list, List list2, long j, C2515v c2515v, C1287h c1287h, C2531s c2531s, C1461c c1461c, ai aiVar) {
        super(list, list2, j, c2531s, c1461c, aiVar);
        this.f13499a = j;
        this.f13500g = c2515v;
        this.f13501h = c1287h;
    }

    protected final void mo2923a(String str) {
        this.f13500g.mo2929a(str);
    }

    public final boolean mo2924a() {
        int intValue = ((Integer) C1189b.f7270f.m5760a()).intValue();
        return intValue == 3 || intValue == 4;
    }

    public final boolean mo2925b() {
        int intValue = ((Integer) C1189b.f7268d.m5760a()).intValue();
        return (intValue == 3 || intValue == 4) && ((Integer) C1189b.f7270f.m5760a()).intValue() == 1;
    }

    public final void mo2926c() {
        m13413f();
        long longValue = ((Long) C1189b.f7287w.m5760a()).longValue();
        if (longValue <= 0 || C4678i.m21812a() > longValue) {
            while (m13412e() && !m13411d()) {
                if (!C2531s.m13477b()) {
                    List<C2533w> a = this.f13500g.mo2928a(((Integer) C0955b.hf.m28964b()).intValue());
                    if (a.isEmpty()) {
                        break;
                    }
                    int i;
                    if (((Integer) C1189b.f7270f.m5760a()).intValue() == 3) {
                        this.d.m13481a(this.b, 1615);
                        C1189b.f7270f.m5763a(Integer.valueOf(4));
                        C1189b.f7272h.m5763a(Long.valueOf(C4678i.m21812a()));
                    }
                    String str = ((C2533w) a.get(0)).f13577b;
                    List arrayList = new ArrayList(a.size());
                    for (C2533w c2533w : a) {
                        arrayList.add(c2533w.f13576a.f12151c);
                    }
                    if (!this.e.dj().mo2294a(12637989)) {
                        Iterator it = arrayList.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            if (this.d.m13484a(str2, str)) {
                                this.f13500g.mo2931a(str2, str, true);
                                this.f13500g.mo2932b(str2, str);
                                it.remove();
                                i++;
                                C1189b.f7268d.m5763a(Integer.valueOf(3));
                                FinskyLog.m21662b("[Cache and Sync] Skip fetch suggestion %s for account %s.", str2, str);
                            }
                            i = i;
                        }
                        C1189b.m7141a(C1189b.f7277m, -i);
                        if (arrayList.isEmpty()) {
                            continue;
                        }
                    }
                    C1189b.m7141a(C1189b.f7278n, arrayList.size());
                    FinskyLog.m21662b("[Cache and Sync] Number of urls to process on DFE queue: " + arrayList.size(), new Object[0]);
                    try {
                        C0660x agVar = new ag();
                        this.f13501h.mo2016a(str).mo1604a(arrayList, agVar, (C0657w) agVar, new C2532u(str));
                        c cVar = (c) agVar.get();
                        for (d dVar : cVar.c) {
                            this.f13500g.mo2934c(dVar.c, str);
                        }
                        if (cVar.b > 0) {
                            C1189b.f7287w.m5763a(Long.valueOf(C4678i.m21812a() + cVar.b));
                            m13425g();
                            return;
                        }
                    } catch (InterruptedException e) {
                        FinskyLog.m21665c("[Cache and Sync] Interrupted while performing getBulkDataFetch DFE call", new Object[0]);
                    } catch (ExecutionException e2) {
                        FinskyLog.m21665c("[Cache and Sync] Execution exception while performing getBulkDataFetch DFE call", new Object[0]);
                    }
                } else {
                    return;
                }
            }
            if (!this.f13500g.mo2933b()) {
                C1189b.f7270f.m5763a(Integer.valueOf(1));
                this.d.m13481a(this.b, 1617);
                return;
            }
            return;
        }
        m13425g();
    }

    private final void m13425g() {
        long longValue = ((Long) C1189b.f7287w.m5760a()).longValue();
        if (longValue >= this.f13499a) {
            long j = longValue - this.f13499a;
            FinskyLog.m21662b(new StringBuilder(HprofParser.ROOT_VM_INTERNAL).append("[Cache and Sync] Decided not to reschedule a step. Threshold: ").append(longValue).append(", Run end: ").append(this.f13499a).append(", Diff: ").append(j).toString(), new Object[0]);
        } else if (longValue >= C4678i.m21812a()) {
            HandlerThread a = C4674e.m21808a("[Cache and Sync] Process Fetch Suggestions from DFE queue.");
            a.start();
            new Handler(a.getLooper()).postDelayed(new C2511h(this), ((Long) C1189b.f7287w.m5760a()).longValue() - C4678i.m21812a());
            FinskyLog.m21662b("[Cache and Sync] Scheduled DFE step with delay: " + (longValue - C4678i.m21812a()), new Object[0]);
        }
    }
}
