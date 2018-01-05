package com.google.android.finsky.verifier.impl;

import android.content.Intent;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.gms.safetynet.C5571a;

final class ci extends co {
    public final /* synthetic */ C4699c f24542a;
    public final /* synthetic */ bx f24543b;

    ci(bx bxVar, C4699c c4699c, C4699c c4699c2) {
        this.f24543b = bxVar;
        this.f24542a = c4699c2;
        super(bxVar, c4699c);
    }

    public final void mo4373a(C4735g c4735g) {
        byte[] bArr;
        ac a = this.f24543b.f24499h.f24308a.m15217a(this.f24542a.f24154m.f24169b);
        boolean z;
        if (a != null) {
            boolean z2 = a.f15507u;
            bArr = a.f15489c;
            z = z2;
        } else {
            bArr = null;
            z = false;
        }
        C4735g c4735g2;
        if (ag.m15238b(this.f24543b.f24494c.dj())) {
            if (((Boolean) C0955b.bJ.m28964b()).booleanValue()) {
                if ((this.f24543b.m22247b() == 2000 ? 1 : null) == null && c4735g.f24364a != 0) {
                    bx bxVar = this.f24543b;
                    byte[] bArr2 = this.f24542a.f24145d.f24199b;
                    ag agVar = bxVar.f24499h.f24309b;
                    Boolean bool = (Boolean) ag.m15236a(agVar.m15240a(new cb(bxVar, agVar, bArr2)));
                    if (bool == null ? false : bool.booleanValue()) {
                        c4735g2 = new C4735g(1, c4735g.f24365b, c4735g.f24366c, c4735g.f24367d, c4735g.f24368e, c4735g.f24369f, c4735g.f24370g, true, c4735g.f24372i, c4735g.f24375l, c4735g.f24373j, c4735g.f24374k);
                        this.f24543b.m22233b(this.f24542a, c4735g);
                        c4735g = c4735g2;
                    }
                }
            }
            c4735g2 = c4735g;
            this.f24543b.m22233b(this.f24542a, c4735g);
            c4735g = c4735g2;
        } else {
            ac a2 = this.f24543b.m22233b(this.f24542a, c4735g);
            if (((Boolean) C0955b.bJ.m28964b()).booleanValue() && a2 != null) {
                if ((this.f24543b.m22247b() == 2000 ? 1 : null) == null && c4735g.f24364a != 0) {
                    if (a2.f15505s) {
                        c4735g2 = new C4735g(1, a2.f15497k, null, null, false, 0, a2.f15493g, true, a2.f15507u, a2.f15509w);
                    } else {
                        c4735g2 = new C4735g(a2.f15496j, a2.f15497k, null, null, false, 0, a2.f15493g, false, a2.f15507u, a2.f15509w);
                    }
                    if (c4735g2.f24371h) {
                        c4735g = c4735g2;
                    }
                }
            }
        }
        switch (c4735g.f24364a) {
            case 1:
                C0954a.f5815K.m5763a(Boolean.valueOf(true));
                this.f24543b.m22257h();
                this.f24543b.m22243a(this.f24542a, c4735g);
                if (c4735g.f24371h) {
                    FinskyLog.m21659a("Installation silently blocked for %s", this.f24543b.f24507p);
                    this.f24543b.m22069l();
                } else {
                    this.f24543b.m22244a(c4735g.f24365b, c4735g.f24369f);
                }
                if (((Boolean) C0955b.cQ.m28964b()).booleanValue()) {
                    C5571a.m26561a(this.f24543b.f24499h).m26565a(3, null);
                    return;
                }
                return;
            case 3:
                if (!this.f24543b.m22253d()) {
                    this.f24543b.m22252c(-1);
                }
                bx bxVar2 = this.f24543b;
                bxVar2.f24516y.set(true);
                bxVar2.f24503l.m1133a(new Intent("verify_install_dialog_shown"));
                PackageWarningDialog.m22008a(bxVar2.f24499h, 0, bxVar2.m22256g(), c4735g.f24365b, c4735g.f24369f, new VerifyAppsInstallTask$7(bxVar2, c4735g));
                C0954a.f5815K.m5763a(Boolean.valueOf(true));
                return;
            default:
                if (((Boolean) C0955b.cF.m28964b()).booleanValue() && r15) {
                    cs.m22277a(this.f24543b.f24499h, this.f24543b.f24505n, this.f24543b.f24498g, this.f24542a.f24154m.f24169b, bArr);
                }
                this.f24543b.f24503l.m1133a(new Intent("verify_install_safe"));
                this.f24543b.m22241a(1);
                this.f24543b.m22069l();
                return;
        }
    }
}
