package com.google.android.finsky.hygiene;

import android.text.TextUtils;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

public abstract class C0971t extends ah {
    public C2471a f5953e;
    public C1287h f5954f;

    public abstract void mo1170a(C1254c c1254c, C2495w c2495w);

    public void mo1167a() {
        ((C1393s) C3947d.m18649a(C1393s.class)).mo1853a(this);
    }

    protected final boolean k_(int i) {
        return false;
    }

    protected final boolean mo1168a(C4026d c4026d) {
        mo1167a();
        C2495w a = c4026d.m18859d().m18847a("logging_context", this.f5953e);
        if (a == null) {
            FinskyLog.m21665c("Failed to find the Hygiene logging context. Creating a new one.", new Object[0]);
            a = this.f5953e.m13184a("HygieneJob");
        }
        boolean a2 = c4026d.m18859d().m18852a("use_dfe_api");
        Object b = c4026d.m18859d().m18854b("account_name");
        C1254c c1254c = null;
        if (a2) {
            if (TextUtils.isEmpty(b)) {
                c1254c = this.f5954f.mo2017b();
            } else {
                c1254c = this.f5954f.mo2016a(b);
            }
        }
        bb.m21792a(new C3208u(this, a), c1254c);
        return true;
    }
}
