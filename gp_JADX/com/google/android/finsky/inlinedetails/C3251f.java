package com.google.android.finsky.inlinedetails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.activities.ej;
import com.google.android.finsky.as.C1504b;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.recoverymode.C3982a;

public final class C3251f {
    public final Activity f16755a;
    public final ej f16756b;
    public final C1039i f16757c;
    public final C1552e f16758d;
    public final C3646a f16759e;
    public final C1504b f16760f;
    public final C1506e f16761g;
    public final C3982a f16762h;
    public final C2171b f16763i;
    public final C2495w f16764j;
    public boolean f16765k;

    public C3251f(Activity activity, ej ejVar, C1039i c1039i, C1461c c1461c, C3646a c3646a, C1504b c1504b, C1506e c1506e, C3982a c3982a, C2171b c2171b, C2495w c2495w) {
        this.f16755a = activity;
        this.f16756b = ejVar;
        this.f16757c = c1039i;
        this.f16758d = c1461c.dj();
        this.f16759e = c3646a;
        this.f16760f = c1504b;
        this.f16761g = c1506e;
        this.f16762h = c3982a;
        this.f16763i = c2171b;
        this.f16764j = c2495w;
    }

    public final void m16364a(Bundle bundle) {
        boolean z = bundle == null && (this.f16755a.getIntent().getFlags() & 1048576) == 0;
        this.f16765k = z;
        if (this.f16762h.mo3875b()) {
            this.f16762h.mo3879f();
            this.f16755a.finish();
        } else if (this.f16761g.m8838a()) {
            this.f16760f.m8837a(new C3252g(this));
        } else {
            this.f16755a.startActivity(this.f16763i.mo2765e(this.f16755a));
            this.f16755a.finish();
        }
    }

    public final void m16365a(C3254j c3254j) {
        if (this.f16758d.mo2294a(12639141) && c3254j != null) {
            ej ejVar = this.f16756b;
            String str = c3254j.f16771c;
            new Object[1][0] = str;
            ejVar.f6718g.f24081b.remove(str);
        }
    }

    final void m16363a() {
        Intent a = this.f16756b.m6520a();
        if (((Boolean) C0955b.ae.m28964b()).booleanValue()) {
            Runnable c3253h = new C3253h(this, a);
            if (!this.f16758d.mo2294a(12633098)) {
                this.f16759e.m17248a(c3253h);
                return;
            } else if (this.f16759e.f18022b.m11208b()) {
                c3253h.run();
                return;
            } else if (ej.m6515a(this.f16755a.getIntent().getData())) {
                this.f16759e.m17248a(c3253h);
                return;
            } else {
                this.f16759e.m17248a(null);
                c3253h.run();
                return;
            }
        }
        this.f16755a.startActivity(a);
        this.f16755a.finish();
    }

    public final boolean m16366a(int i, int i2) {
        if (i != 20) {
            return false;
        }
        if (i2 == -1) {
            this.f16760f.f8188c = true;
            m16363a();
            return true;
        }
        this.f16755a.finish();
        return true;
    }
}
