package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.scheduler.p238b.C4030h;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.aa;

public class C4659r extends ah implements C2239c {
    public C2471a f23985a;
    public C4661t f23986c;
    public C4026d f23987d;

    protected final boolean mo1168a(C4026d c4026d) {
        C2495w a;
        ((C1448f) C3947d.m18649a(C1448f.class)).mo1970a(this);
        this.f23987d = c4026d;
        if (c4026d.m18859d() == null || c4026d.m18859d().m18847a("logging_context", this.f23985a) == null) {
            a = this.f23985a.m13184a(null);
        } else {
            a = c4026d.m18859d().m18847a("logging_context", this.f23985a);
            if (a == null) {
                a = this.f23985a.m13184a(null);
            }
        }
        if (this.f23986c.m21650b()) {
            FinskyLog.m21659a("Checking wifi: disabled, will check wifi again later.", new Object[0]);
            C4661t c4661t = this.f23986c;
            aa aaVar = new aa();
            aaVar.a |= 32768;
            aaVar.q = true;
            aaVar.b(c4661t.m21649a());
            aaVar.c(c4661t.m21650b());
            aaVar.a(false);
            a.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
            C4023a b = C4656o.m21638b();
            if (b != null) {
                m5802b(new C4030h(true, b, C4656o.m21639b(a)));
            }
            this.f23987d = null;
            return false;
        }
        this.f23986c.m21648a(new C4660s(this, a));
        return true;
    }

    protected final boolean k_(int i) {
        this.f23987d = null;
        return false;
    }

    public final void mo2827a(boolean z) {
        String str;
        if (this.f23987d != null) {
            m5802b(null);
            this.f23987d = null;
        }
        if (z) {
            str = "auto-updates finished successfully.";
        } else {
            str = "finished w/error. waiting for next daily hygiene.";
        }
        FinskyLog.m21659a(str, new Object[0]);
    }
}
