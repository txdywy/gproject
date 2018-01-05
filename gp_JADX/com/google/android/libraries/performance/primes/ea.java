package com.google.android.libraries.performance.primes;

import android.app.Activity;
import d.a.a.a.a.a.a;
import d.a.a.a.a.a.bc;
import d.a.a.a.a.a.bk;
import d.a.a.a.a.a.bp;
import d.a.a.a.a.a.bu;
import java.util.UUID;

final class ea implements C5952o {
    public final C6018r f30015a;
    public final eo f30016b;
    public final eo f30017c;

    ea(C6018r c6018r, eo eoVar, eo eoVar2) {
        this.f30015a = c6018r;
        this.f30015a.m27896a((C5950g) this);
        this.f30016b = eoVar;
        this.f30017c = eoVar2;
    }

    public final void mo5226b(Activity activity) {
        if (ek.f30037a.f30040d) {
            this.f30015a.m27897b((C5950g) this);
            return;
        }
        dz dzVar = dz.f30003a;
        if (dzVar.f30010h > 0) {
            long j;
            this.f30015a.m27897b((C5950g) this);
            if (this.f30016b.mo5221a() != null && m27838a(dzVar) > 0) {
                j = dzVar.f30010h;
                boolean z = dzVar.f30004b;
                long a = m27838a(dzVar);
                m27839a(dzVar, a, j, z ? "Cold startup" : "Warm startup");
                m27839a(dzVar, a, dzVar.f30011i, z ? "Cold startup interactive" : "Warm startup interactive");
                a = dzVar.f30009g;
                j = dzVar.f30010h;
                if (!(z || a == 0)) {
                    m27839a(dzVar, a, j, "Warm startup activity onStart");
                }
            }
            if (this.f30017c.mo5221a() != null && m27838a(dzVar) > 0) {
                j = m27838a(dzVar);
                long j2 = dzVar.f30010h;
                if (j2 >= j) {
                    String valueOf;
                    String valueOf2;
                    boolean z2 = dzVar.f30004b;
                    eb ebVar = new eb(z2 ? "Cold startup" : "Warm startup", j);
                    if (z2) {
                        ebVar.m27841a("App create", dzVar.f30005c, dzVar.f30006d);
                        valueOf = String.valueOf(dzVar.f30013k);
                        valueOf2 = String.valueOf(": onCreate");
                        long a2 = ebVar.m27841a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), dzVar.f30006d, dzVar.f30008f);
                        if (dzVar.f30007e > 0) {
                            valueOf = String.valueOf(dzVar.f30013k);
                            valueOf2 = String.valueOf(": init");
                            valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            long j3 = dzVar.f30006d;
                            long j4 = dzVar.f30007e;
                            j = ebVar.f30019b + 1;
                            ebVar.f30019b = j;
                            ebVar.m27842a(valueOf2, j, a2, j3, j4);
                        }
                    } else {
                        valueOf = String.valueOf(dzVar.f30013k);
                        valueOf2 = String.valueOf(": onCreate");
                        ebVar.m27841a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), dzVar.f30007e, dzVar.f30008f);
                    }
                    valueOf = String.valueOf(dzVar.f30013k);
                    valueOf2 = String.valueOf(": onDraw");
                    ebVar.m27841a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), dzVar.f30008f, j2);
                    es esVar = (es) this.f30017c.mo5221a();
                    bc bcVar = new bc();
                    bcVar.a = Long.valueOf(UUID.randomUUID().getLeastSignificantBits());
                    bcVar.b = (bk[]) ebVar.f30018a.toArray(new bk[ebVar.f30018a.size()]);
                    String a3 = cc.m27771a(dzVar.f30012j);
                    C5989do.m27824a(3, "TraceService", "Recording trace %d: %s", bcVar.a, bcVar.b[0].b);
                    bp bpVar = new bp();
                    bpVar.p = bcVar;
                    if (a3 != null) {
                        bpVar.u = new a();
                        bpVar.u.a = a3;
                    }
                    esVar.m27577a(bpVar);
                }
            }
        }
    }

    private static long m27838a(dz dzVar) {
        if (dzVar.f30004b) {
            return dzVar.f30005c;
        }
        return dzVar.f30007e;
    }

    private final void m27839a(dz dzVar, long j, long j2, String str) {
        if (j2 >= j) {
            er erVar = (er) this.f30016b.mo5221a();
            eq eqVar = new eq(j, j2);
            String a = cc.m27771a(dzVar.f30012j);
            if (eqVar == eq.f30045c || str.isEmpty()) {
                C5989do.m27824a(3, "TimerMetricService", "Can't record an event that was never started or has been stopped already", new Object[0]);
            } else if (erVar.m27580a()) {
                bu buVar = new bu();
                buVar.a = Long.valueOf(eqVar.f30047b - eqVar.f30046a);
                bp bpVar = new bp();
                bpVar.d = buVar;
                if (a != null) {
                    bpVar.u = new a();
                    bpVar.u.a = a;
                }
                erVar.m27579a(str, true, bpVar, null);
            }
        }
    }
}
