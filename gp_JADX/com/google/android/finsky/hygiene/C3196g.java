package com.google.android.finsky.hygiene;

import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.updatechecker.C2239c;

final class C3196g implements C2239c {
    public final /* synthetic */ C1254c f16492a;
    public final /* synthetic */ boolean f16493b;
    public final /* synthetic */ DailyHygiene f16494c;

    C3196g(DailyHygiene dailyHygiene, C1254c c1254c, boolean z) {
        this.f16494c = dailyHygiene;
        this.f16492a = c1254c;
        this.f16493b = z;
    }

    public final void mo2827a(boolean z) {
        if (this.f16494c.f16431c.m8841d() && this.f16494c.f16440l.mo2294a(12644528)) {
            this.f16494c.m16195c(this.f16492a, this.f16493b);
            return;
        }
        DailyHygiene dailyHygiene = this.f16494c;
        C1254c c1254c = this.f16492a;
        boolean z2 = z && this.f16493b;
        dailyHygiene.m16191a(c1254c, z2);
    }
}
