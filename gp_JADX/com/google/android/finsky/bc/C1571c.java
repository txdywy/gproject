package com.google.android.finsky.bc;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.dx.C1054h;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C1571c extends C1568y implements C0657w, C0660x, C1569m, C1054h {
    public C2910a f8383a;
    public C1557b f8384b;
    public int f8385c;
    public C1582l f8386d;

    public C1571c(C1585q c1585q) {
        super(c1585q);
        ((C1347t) C3947d.m18649a(C1347t.class)).mo1714a(this);
    }

    public final void mo2336a() {
        C1582l.m9130a(new C1572d(this), this.e.mo2348d(), true);
    }

    public final void mo2337a(int i, Intent intent) {
        FinskyLog.m21662b("result code=" + i, new Object[0]);
        this.f8385c = i;
        this.f8386d = C1582l.m9129a(this, this.e.mo2348d());
        if (i == 1) {
            String stringExtra = intent.getStringExtra("consistencyToken");
            if (stringExtra != null) {
                this.f8384b.mo2306a(this.e.mo2344a()).mo2321b(stringExtra);
            }
            mo2338c();
            this.e.mo2348d().f8411f = true;
            return;
        }
        m9097d();
    }

    public final void mo2338c() {
        this.f8383a.m15182a((C1054h) this);
        this.f8383a.m15184a(this.e.mo2344a(), 3);
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f8386d.m9132b(volleyError);
    }

    public final void P_() {
        this.f8383a.m15191b((C1054h) this);
        if (this.f8385c == 1) {
            this.f8383a.m15186a(this.e.mo2344a(), this, this, "1");
        } else {
            m9097d();
        }
    }

    public final void ce_() {
        this.f8383a.m15191b((C1054h) this);
        Fragment fragment = this.f8386d;
        fragment.mo1345a(fragment.m592c((int) C7582R.string.error_family_refresh_failed));
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f8386d = null;
        if (!"pfm".equals(this.e.mo2349e().f8376a)) {
            this.e.mo2348d().f8410e = true;
        }
        m9098e();
    }
}
