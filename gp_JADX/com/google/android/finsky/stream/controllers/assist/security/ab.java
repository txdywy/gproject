package com.google.android.finsky.stream.controllers.assist.security;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class ab implements C0983h, C4317u {
    public final ad f21774a;
    public final C4316a f21775b;
    public final long f21776c;
    public final C3646a f21777d;
    public final C3851f f21778e;
    public final SecurityUtils f21779f;
    public final C4726d f21780g;

    ab(ad adVar, C3646a c3646a, C3851f c3851f, SecurityUtils securityUtils, C4726d c4726d, C4316a c4316a, long j) {
        this.f21774a = adVar;
        this.f21775b = c4316a;
        this.f21776c = j;
        this.f21777d = c3646a;
        this.f21778e = c3851f;
        this.f21779f = securityUtils;
        this.f21780g = c4726d;
    }

    public final int mo4118b() {
        return 0;
    }

    public final int mo4119c() {
        return C7582R.layout.my_apps_security_action_in_progress;
    }

    public final void mo4115a() {
        if (this.f21779f.m20044b(this.f21775b.f21769a)) {
            C4323d.m20084a().m20085a(this.f21774a.m20066a());
            return;
        }
        this.f21778e.mo3818a((C0983h) this);
        bb.m21792a(new ac(this), new Void[0]);
    }

    public final void mo4120d() {
        this.f21778e.mo3819b(this);
    }

    public final void mo4116a(View view) {
    }

    public final void mo4121e() {
    }

    public final void mo4117a(ae aeVar) {
    }

    public final void mo1175b(String str, boolean z) {
    }

    public final void mo1176c(String str, boolean z) {
        if (!this.f21775b.f21772d && str.equals(this.f21775b.f21769a) && !z) {
            this.f21778e.mo3819b(this);
            if (!C1473m.f7980a.aN().dj().mo2294a(12639670) || ((Boolean) C0954a.aI.m5760a()).booleanValue()) {
                C4323d.m20084a().m20085a(this.f21774a.m20068a(this.f21775b.f21771c, this.f21775b.f21772d, this.f21776c));
            } else {
                C4323d.m20084a().m20085a(this.f21774a.m20069b());
            }
        }
    }

    public final void mo1177d(String str) {
        if (this.f21775b.f21772d && str.equals(this.f21775b.f21769a)) {
            C3647b a = this.f21777d.m17243a(str);
            if (a != null && a.f18028c != null && a.f18028c.f11424i) {
                this.f21778e.mo3819b(this);
                C4323d.m20084a().m20085a(this.f21774a.m20068a(this.f21775b.f21771c, this.f21775b.f21772d, this.f21776c));
            }
        }
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
