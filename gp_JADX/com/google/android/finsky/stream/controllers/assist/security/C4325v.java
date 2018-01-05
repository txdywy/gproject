package com.google.android.finsky.stream.controllers.assist.security;

import android.content.Context;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.C4726d;
import com.google.android.gms.common.C5095d;

abstract class C4325v implements C4317u {
    public final ad f21803f;
    public final C4726d f21804g;
    public final Context f21805h;
    public ah f21806i;

    C4325v(ad adVar, Context context, C4726d c4726d) {
        this.f21803f = adVar;
        this.f21805h = context;
        this.f21804g = c4726d;
    }

    public int mo4119c() {
        return 0;
    }

    public int mo4118b() {
        return 0;
    }

    public void mo4115a() {
    }

    public void mo4120d() {
        m20087h();
    }

    public void mo4121e() {
        if (this.f21806i == null) {
            this.f21806i = new ah(this.f21803f);
            this.f21806i.f21794b = this;
            bb.m21792a(new C4340w(this, this.f21806i), new Void[0]);
        }
    }

    public final void mo4117a(ae aeVar) {
        C4317u b;
        m20087h();
        if ((C5095d.m23664d(this.f21805h) >= ((Integer) C0955b.in.m28964b()).intValue() ? 1 : 0) == 0) {
            FinskyLog.m21667d("Outdated GMSCore", new Object[0]);
            b = this.f21803f.m20069b();
        } else if (this.f21804g.mo4367d()) {
            long currentTimeMillis = System.currentTimeMillis() - aeVar.f21787a;
            if (currentTimeMillis > 28857600000L || currentTimeMillis < 0) {
                FinskyLog.m21659a("Too old scan or negative relative time span.", new Object[0]);
                b = this.f21803f.m20069b();
            } else {
                int size = aeVar.f21789c.size();
                if (size == 0) {
                    if (C1473m.f7980a.aN().dj().mo2294a(12639670) && !((Boolean) C0954a.aI.m5760a()).booleanValue()) {
                        b = this.f21803f.m20069b();
                    } else if (aeVar.f21788b == 0) {
                        r1 = this.f21803f;
                        b = new C4327h(r1, r1.f21782a, r1.f21786e, aeVar.f21787a);
                    } else {
                        r1 = this.f21803f;
                        b = new C4334o(r1, r1.f21782a, r1.f21786e, aeVar.f21787a, aeVar.f21788b);
                    }
                } else if (size == 1) {
                    C4316a c4316a = (C4316a) aeVar.f21789c.iterator().next();
                    String str = c4316a.f21769a;
                    String str2 = (String) C0954a.br.m5760a();
                    if (str == null || !str.equals(str2)) {
                        r2 = this.f21803f;
                        r0 = new C4331l(r2, r2.f21782a, r2.f21786e, c4316a, aeVar.f21787a);
                    } else {
                        b = this.f21803f.m20067a(aeVar.f21787a);
                    }
                } else {
                    r2 = this.f21803f;
                    r0 = new C4343z(r2, r2.f21782a, r2.f21786e, size, aeVar.f21787a);
                }
            }
        } else {
            FinskyLog.m21659a("Play protect is disabled", new Object[0]);
            b = this.f21803f.m20069b();
        }
        C4323d.m20084a().m20085a(b);
    }

    private final void m20087h() {
        if (this.f21806i != null) {
            this.f21806i.f21794b = null;
            this.f21806i = null;
        }
    }

    final OnClickListener m20094f() {
        return new C4341x(this);
    }

    final OnClickListener m20095g() {
        return new C4342y(this);
    }
}
