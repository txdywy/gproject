package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.family.remoteescalation.C3098p;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.h.a.e;

public final class ba extends C1089s implements C0657w, C0660x {
    public String f9838a;
    public String f9839b;

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21660a(volleyError, "Error sending remote escalation", new Object[0]);
        if (m610k()) {
            this.f9838a = C1290m.m7702a(m603h(), volleyError);
            m6758b(3, 0);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        e eVar = (e) obj;
        if (m610k()) {
            this.f9839b = eVar.b;
            this.f9838a = eVar.c;
            m6758b(2, 0);
        }
        C3098p.m15869a(C1473m.f7980a.cZ(), eVar.e);
    }
}
