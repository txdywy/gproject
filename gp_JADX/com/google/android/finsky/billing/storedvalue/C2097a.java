package com.google.android.finsky.billing.storedvalue;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;

public final class C2097a extends C1089s implements C0657w, C1031w {
    public C2720j f10677a;
    public VolleyError f10678b;

    static C2097a m10963a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("list_url", str2);
        bundle.putString("authAccount", str);
        Fragment c2097a = new C2097a();
        c2097a.m600f(bundle);
        return c2097a;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        C1254c b = C1473m.f7980a.mo2112b(this.f760q.getString("authAccount"));
        String string = this.f760q.getString("list_url");
        C1473m.f7980a.aO();
        this.f10677a = C2721l.m14733a(b, string, false, true);
        this.f10677a.m11918a((C1031w) this);
        this.f10677a.m11917a((C0657w) this);
    }

    public final void m_() {
        if (this.f10677a.f14908a == null || this.f10677a.f14908a.m14638a() <= 0) {
            m6758b(3, 1);
        } else {
            m6758b(2, 0);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f10678b = volleyError;
        m6758b(3, 0);
    }
}
