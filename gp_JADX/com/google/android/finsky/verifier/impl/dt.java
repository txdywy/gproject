package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;

final class dt implements ea {
    public final /* synthetic */ dk f24638a;

    dt(dk dkVar) {
        this.f24638a = dkVar;
    }

    public final void mo4379a(C4699c c4699c, C4735g c4735g, PackageInfo packageInfo, String str) {
        switch (c4735g.f24364a) {
            case 1:
            case 3:
                ComponentName d = cs.m22284d(this.f24638a.f24599c);
                if (d != null) {
                    dk dkVar = this.f24638a;
                    Intent intent = new Intent("com.google.android.vending.verifier.APPLICATION_REMOVED");
                    intent.setComponent(d);
                    intent.putExtra("digest", c4699c.f24145d.f24199b);
                    intent.putExtra("package_name", c4699c.f24154m.f24169b);
                    intent.putExtra("version_code", c4699c.f24154m.f24170c);
                    intent.putExtra("package_cert_fingerprints", am.m22061a(c4699c.f24148g));
                    intent.putExtra("description_string", c4735g.f24365b);
                    dkVar.f24599c.sendBroadcast(intent);
                } else if (!c4735g.f24371h) {
                    this.f24638a.f24602f.mo3788a(str, c4699c.f24154m.f24169b, c4735g.f24365b, c4735g.f24369f, c4699c.f24154m.f24176i);
                }
                PackageVerificationService.m22004a(this.f24638a.f24599c, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, false);
                return;
            default:
                return;
        }
    }
}
