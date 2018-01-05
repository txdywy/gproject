package com.google.android.finsky.bc;

import android.content.Intent;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public final class aa extends C1568y implements C0657w, C0660x, C1569m {
    public C2910a f8380a;
    public C1582l f8381b;

    public aa(C1585q c1585q) {
        super(c1585q);
        ((C1347t) C3947d.m18649a(C1347t.class)).mo1713a(this);
    }

    public final void mo2336a() {
        C1582l.m9130a(new ab(this), this.e.mo2348d(), true);
    }

    public final void mo2337a(int i, Intent intent) {
        FinskyLog.m21659a("resultCode=" + i, new Object[0]);
        if (i == 1) {
            this.f8381b = C1582l.m9129a(this, this.e.mo2348d());
            mo2338c();
            return;
        }
        m9097d();
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f8381b.m9132b(volleyError);
    }

    public final void mo2338c() {
        this.f8380a.m15186a(this.e.mo2344a(), this, this, "1");
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f8381b = null;
        this.e.mo2348d().f8410e = true;
        m9098e();
    }
}
