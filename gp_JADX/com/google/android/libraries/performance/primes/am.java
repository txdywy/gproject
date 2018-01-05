package com.google.android.libraries.performance.primes;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Build.VERSION;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.metriccapture.C6011c;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import d.a.a.a.a.a.bp;
import java.util.HashMap;
import java.util.Map;

@TargetApi(24)
final class am extends C5949a implements dy, C5952o {
    public static volatile am f29652e;
    public final C6018r f29653f;
    public final ao f29654g;
    public final Map f29655h = new HashMap();
    public final boolean f29656i;
    public final boolean f29657j;
    public final int f29658k;

    static am m27618a(C5984a c5984a, Application application, eo eoVar, dm dmVar) {
        C5916a.m27410b(VERSION.SDK_INT >= 24);
        if (f29652e == null) {
            synchronized (am.class) {
                if (f29652e == null) {
                    f29652e = new am(c5984a, application, eoVar, dmVar.f29975e, dmVar.f29973c, dmVar.f29976f);
                }
            }
        }
        return f29652e;
    }

    private am(C5984a c5984a, Application application, eo eoVar, boolean z, boolean z2, int i) {
        super(c5984a, application, eoVar, bv.BACKGROUND_THREAD, i);
        this.f29653f = C6018r.m27894a(application);
        this.f29656i = z;
        this.f29657j = z2;
        this.f29658k = C6011c.m27878a(application);
        this.f29654g = new ao(new an(this), z2);
        this.f29653f.m27896a(this.f29654g);
    }

    public final void mo5223d() {
    }

    public final void mo5224e() {
    }

    public final void mo5226b(Activity activity) {
        synchronized (this.f29655h) {
            this.f29655h.clear();
        }
    }

    final void m27619a(String str) {
        synchronized (this.f29655h) {
            if (this.f29655h.containsKey(str)) {
                C5989do.m27824a(5, "FrameMetricService", "measurement already started: %s", str);
            } else if (this.f29655h.size() >= 25) {
                C5989do.m27824a(5, "FrameMetricService", "Too many concurrent measurements, ignoring %s", str);
            } else {
                if (this.f29656i) {
                    this.f29655h.put(str, new aq(str));
                } else {
                    this.f29655h.put(str, new ar());
                }
                if (this.f29655h.size() == 1 && !this.f29657j) {
                    C5989do.m27824a(3, "FrameMetricService", "measuring start", new Object[0]);
                    ao aoVar = this.f29654g;
                    synchronized (aoVar) {
                        aoVar.f29663d = true;
                        if (aoVar.f29662c != null) {
                            aoVar.m27634a();
                        } else {
                            C5989do.m27824a(3, "FrameMetricService", "No activity", new Object[0]);
                        }
                    }
                }
            }
        }
    }

    final void m27620a(String str, boolean z) {
        synchronized (this.f29655h) {
            as asVar = (as) this.f29655h.remove(str);
            if (this.f29655h.isEmpty() && !this.f29657j) {
                this.f29654g.m27636b();
            }
        }
        if (asVar == null) {
            C5989do.m27824a(5, "FrameMetricService", "Measurement not found: %s", str);
        } else if (!this.f29656i && asVar.mo5233a()) {
            bp bpVar = new bp();
            bpVar.l = asVar.mo5234b();
            bpVar.l.f = Integer.valueOf(C6011c.m27879b(this.f29613b));
            m27578a(str, z, bpVar);
        }
    }

    public final void mo5222c() {
        this.f29653f.m27897b(this.f29654g);
        ao aoVar = this.f29654g;
        synchronized (aoVar) {
            aoVar.m27636b();
            if (aoVar.f29665f != null) {
                aoVar.f29664e.quitSafely();
                aoVar.f29664e = null;
                aoVar.f29665f = null;
            }
        }
        synchronized (this.f29655h) {
            this.f29655h.clear();
        }
    }
}
