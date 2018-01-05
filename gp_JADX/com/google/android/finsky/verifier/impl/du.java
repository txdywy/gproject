package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import android.support.v4.app.cm;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;

final class du implements ea {
    public boolean f24639a = false;
    public final /* synthetic */ dk f24640b;

    du(dk dkVar) {
        this.f24640b = dkVar;
    }

    public final void mo4379a(C4699c c4699c, C4735g c4735g, PackageInfo packageInfo, String str) {
        switch (c4735g.f24364a) {
            case 1:
                if (!c4735g.f24371h) {
                    this.f24640b.f24602f.mo3788a(str, c4699c.f24154m.f24169b, c4735g.f24365b, c4735g.f24369f, c4699c.f24154m.f24176i);
                }
                PackageVerificationService.m22004a(this.f24640b.f24599c, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, false);
                return;
            case 3:
                if (!((Boolean) C0955b.cI.m28964b()).booleanValue() || !this.f24640b.m22327a(c4699c, c4735g)) {
                    dk dkVar;
                    if (!this.f24639a) {
                        cs.m22283c(this.f24640b.f24599c);
                        this.f24639a = true;
                    }
                    if (!c4699c.f24154m.f24175h) {
                        if (VERSION.SDK_INT >= 19) {
                            cs.m22281b(this.f24640b.f24599c, c4699c.f24154m.f24169b);
                        }
                        dkVar = this.f24640b;
                        if (dkVar.f24616v == null) {
                            dkVar.f24616v = Boolean.valueOf(cm.m1438a(dkVar.f24599c).m1439a());
                        }
                        boolean z = dkVar.f24616v.booleanValue() && dk.m22323a(c4699c.f24154m.f24169b, c4699c.f24154m.f24176i, c4735g.f24372i);
                        if (z && packageInfo.applicationInfo.enabled) {
                            PackageVerificationService.m22004a(this.f24640b.f24599c, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, true);
                            this.f24640b.f24609o.m22366a(c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, true);
                        }
                        PendingIntent a = PackageVerificationService.m22002a(this.f24640b.f24599c, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, c4735g.f24367d);
                        PendingIntent b = PackageVerificationService.m22005b(this.f24640b.f24599c, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, c4735g.f24367d);
                        if (z) {
                            this.f24640b.f24602f.mo3787a(str, c4699c.f24154m.f24169b, c4735g.f24365b, c4735g.f24369f, a, b, c4699c.f24154m.f24176i);
                        } else {
                            this.f24640b.f24602f.mo3804b(str, c4699c.f24154m.f24169b, c4735g.f24365b, c4735g.f24369f, a, b, c4699c.f24154m.f24176i);
                        }
                    }
                    dkVar = this.f24640b;
                    if (dkVar.f24616v == null) {
                        dkVar.f24616v = Boolean.valueOf(cm.m1438a(dkVar.f24599c).m1439a());
                    }
                    if (!dkVar.f24616v.booleanValue() && dk.m22323a(c4699c.f24154m.f24169b, c4699c.f24154m.f24176i, c4735g.f24372i)) {
                        dkVar = this.f24640b;
                        dkVar.f24619y++;
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
