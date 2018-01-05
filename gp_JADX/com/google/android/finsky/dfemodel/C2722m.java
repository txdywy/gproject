package com.google.android.finsky.dfemodel;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;

public final class C2722m extends C2335k implements C0660x {
    public boolean f14932a;

    public C2722m(C1254c c1254c, String str, String str2, int i) {
        c1254c.mo1590a(str, str2, i, (C0660x) this, (C0657w) this);
    }

    public final boolean mo2861a() {
        return this.f14932a;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f14932a = true;
        super.mo1062a(volleyError);
        m11926j();
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f14932a = true;
        m11927l();
        m11926j();
    }
}
