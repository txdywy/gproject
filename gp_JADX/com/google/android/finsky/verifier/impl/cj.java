package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;

final class cj extends co {
    public final /* synthetic */ C4699c f24544a;
    public final /* synthetic */ bx f24545b;

    cj(bx bxVar, C4699c c4699c, C4699c c4699c2) {
        this.f24545b = bxVar;
        this.f24544a = c4699c2;
        super(bxVar, c4699c);
    }

    protected final void mo4373a(C4735g c4735g) {
        this.f24545b.m22233b(this.f24544a, c4735g);
        switch (c4735g.f24364a) {
            case 1:
            case 3:
                C0954a.f5815K.m5763a(Boolean.valueOf(true));
                this.f24545b.m22257h();
                this.f24545b.m22243a(this.f24544a, c4735g);
                ComponentName d = cs.m22284d(this.f24545b.f24499h);
                if (d != null) {
                    bx bxVar = this.f24545b;
                    C4699c c4699c = this.f24544a;
                    String str = c4735g.f24365b;
                    Intent intent = new Intent("com.google.android.vending.verifier.INSTALL_BLOCKED");
                    intent.setComponent(d);
                    intent.putExtra("digest", c4699c.f24145d.f24199b);
                    intent.putExtra("package_name", bxVar.f24507p);
                    intent.putExtra("version_code", c4699c.f24154m.f24170c);
                    intent.putExtra("package_certs", am.m22061a(c4699c.f24148g));
                    intent.putExtra("description_string", str);
                    bxVar.f24499h.sendBroadcast(intent);
                    this.f24545b.m22069l();
                    return;
                } else if (c4735g.f24371h) {
                    this.f24545b.m22069l();
                    return;
                } else {
                    this.f24545b.m22244a(c4735g.f24365b, c4735g.f24369f);
                    return;
                }
            default:
                this.f24545b.f24503l.m1133a(new Intent("verify_install_safe"));
                this.f24545b.m22241a(1);
                this.f24545b.m22069l();
                return;
        }
    }
}
