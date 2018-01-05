package com.google.android.finsky.cu;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;

final class C2420f implements C0657w {
    public final /* synthetic */ C2417d f11741a;

    C2420f(C2417d c2417d) {
        this.f11741a = c2417d;
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Unable to load JSON: %s", volleyError.getCause());
        this.f11741a.f11732g = null;
        C2417d c2417d = this.f11741a;
        c2417d.f11726a.mo2908g();
        c2417d.f11730e = null;
        c2417d.m12131c();
    }
}
