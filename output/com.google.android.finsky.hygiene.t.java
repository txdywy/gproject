package com.google.android.finsky.hygiene;

import android.text.TextUtils;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.b.c;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;

protected final class com.google.android.finsky.hygiene.t extends com.google.android.finsky.scheduler.ah
{

    public com.google.android.finsky.d.a e;
    public com.google.android.finsky.api.h f;

    t() {
        com.google.android.finsky.scheduler.ah();
    }

    public void a() {
        ((com.google.android.finsky.hygiene.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.hygiene.s)).a(this);
    }

    public abstract void a(com.google.android.finsky.api.c p0, com.google.android.finsky.d.w p1);

    protected final boolean a(com.google.android.finsky.scheduler.b.d p0) {
        this.a();
        v0 = p0.d().a("logging_context", this.e);
        if (v0 == 0) {
            FinskyLog.c("Failed to find the Hygiene logging context. Creating a new one.", new Object[0]);
            v0 = this.e.a("HygieneJob");
        }
        v3 = p0.d().b("account_name");
        v1 = 0;
        if (p0.d().a("use_dfe_api")) {
            if (TextUtils.isEmpty(v3))
                v1 = this.f.b();
            else
                v1 = this.f.a(v3);
        }
        v2 = new com.google.android.finsky.hygiene.u(this, v0);
        v0 = new c[1];
        v0[0] = v1;
        com.google.android.finsky.utils.bb.a(v2, v0);
        return 1;
    }

    protected final boolean k_(int p0) {
        return 0;
    }

}
