package com.google.android.finsky.dy;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1198a;
import com.google.android.finsky.ak.C1201d;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.C4819c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Executors;

public final class ag {
    public final C4819c f15524a;
    public C4817d f15525b;
    public C1203f f15526c;
    public final ao f15527d = new C2943y();
    public final ao f15528e = new C2920b();
    public final ao f15529f = new C2928j();
    public final ao f15530g = new C2934p();
    public final ao f15531h = new C2938t();
    public final ao[] f15532i = new ao[]{this.f15527d, this.f15528e, this.f15529f, this.f15530g, this.f15531h};
    public final C1198a f15533j;
    public final as f15534k = new ak(this);

    public ag() {
        ((af) C3947d.m18649a(af.class)).mo1833a(this);
        this.f15524a = this.f15525b.mo4399a(Executors.newSingleThreadExecutor());
        C1201d[] c1201dArr = new C1201d[this.f15532i.length];
        for (int i = 0; i < this.f15532i.length; i++) {
            c1201dArr[i] = this.f15532i[i].mo3204a();
        }
        this.f15533j = this.f15526c.mo1516a("verify_apps.db", c1201dArr);
    }

    public final synchronized C4809e m15241a(aq aqVar) {
        return this.f15524a.mo4403a(new ah(this, aqVar));
    }

    public final synchronized C4809e m15243b(aq aqVar) {
        return this.f15524a.mo4403a(new ai(this, aqVar)).mo4396a(aj.f15539a);
    }

    public final synchronized C4809e m15240a(ap apVar) {
        return this.f15524a.mo4403a(apVar);
    }

    public final synchronized C4809e m15242b(ap apVar) {
        return this.f15524a.mo4403a(apVar).mo4396a(new al());
    }

    public static boolean m15237a(C1552e c1552e) {
        return (((Boolean) C0955b.cM.m28964b()).booleanValue() || c1552e.mo2294a(12639300)) ? false : true;
    }

    public static boolean m15238b(C1552e c1552e) {
        return (!((Boolean) C0955b.cL.m28964b()).booleanValue() || ((Boolean) C0955b.cM.m28964b()).booleanValue() || c1552e.mo2294a(12639300)) ? false : true;
    }

    public final as m15239a() {
        return new am(this);
    }

    public static Object m15236a(C4809e c4809e) {
        Object obj = null;
        try {
            obj = c4809e.get();
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Unexpected InterruptedException", new Object[0]);
        } catch (Throwable e2) {
            FinskyLog.m21663b(e2, "Unexpected exception", new Object[0]);
        }
        return obj;
    }
}
