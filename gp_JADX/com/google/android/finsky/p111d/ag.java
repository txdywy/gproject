package com.google.android.finsky.p111d;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.libraries.performance.primes.cm;
import com.google.wireless.android.a.a.a.a.aw;

public final class ag extends fe implements C2472z {
    public boolean f13334a = false;
    public cm f13335b;
    public C2487n f13336c;
    public C2495w f13337d;
    public int f13338e;

    public ag(cm cmVar, C2487n c2487n, C2495w c2495w, int i) {
        this.f13335b = cmVar;
        this.f13336c = c2487n;
        this.f13337d = c2495w;
        this.f13338e = i;
    }

    public final void mo2913a(RecyclerView recyclerView, int i) {
        if (!this.f13334a && i == 1) {
            this.f13334a = true;
            this.f13335b.f29879c.mo5216a(cm.m27797a(ae.f13328a));
        } else if (this.f13334a && i == 0) {
            this.f13336c.f13409d = this;
            this.f13334a = false;
            this.f13335b.f29879c.mo5217a(cm.m27797a(ae.f13328a), true);
        }
    }

    public final void mo791a(RecyclerView recyclerView, int i, int i2) {
    }

    public final void mo2912a(int i, d.a.a.a.a.a.ag agVar) {
        aw awVar = new aw();
        awVar.c = agVar;
        awVar.b = i;
        awVar.a |= 1;
        FinskyLog.m21662b("JankReport: %s, pageType: %d", awVar, Integer.valueOf(this.f13338e));
        C2495w c2495w = this.f13337d;
        C2474c c2474c = new C2474c(18);
        c2474c.f13342a.at = awVar;
        c2495w.m13367a(c2474c.m13250e(this.f13338e));
    }
}
