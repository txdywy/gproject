package com.google.android.finsky.verifier.impl;

import com.android.volley.C0660x;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;

abstract class co implements C0660x {
    public final /* synthetic */ bx f24540b;
    public final C4699c f24541c;

    public co(bx bxVar, C4699c c4699c) {
        this.f24540b = bxVar;
        this.f24541c = c4699c;
    }

    protected abstract void mo4373a(C4735g c4735g);

    public final void m22267b(C4735g c4735g) {
        FinskyLog.m21659a("Verification id=%d response=%d", Integer.valueOf(this.f24540b.f24506o), Integer.valueOf(c4735g.f24364a));
        bx bxVar = this.f24540b;
        if (bxVar.f24510s != null) {
            ForegroundCoordinator.m16015a(bxVar.f24510s);
            bxVar.f24510s = null;
        }
        if (this.f24540b.f24489C != null) {
            this.f24540b.f24489C.m13367a(new C2474c(2628));
        }
        if (c4735g.f24368e) {
            cs.m22276a(this.f24540b.f24499h, this.f24541c, c4735g.f24367d, this.f24541c.f24154m.f24170c, false);
        }
        mo4373a(c4735g);
    }

    public final /* synthetic */ void b_(Object obj) {
        bb.m21792a(new cp(this, (C4735g) obj), new Void[0]);
    }
}
