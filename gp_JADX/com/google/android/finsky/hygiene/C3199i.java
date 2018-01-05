package com.google.android.finsky.hygiene;

import com.google.android.finsky.api.C1254c;

final class C3199i implements Runnable {
    public final /* synthetic */ C1254c f16499a;
    public final /* synthetic */ boolean f16500b;
    public final /* synthetic */ DailyHygiene f16501c;

    C3199i(DailyHygiene dailyHygiene, C1254c c1254c, boolean z) {
        this.f16501c = dailyHygiene;
        this.f16499a = c1254c;
        this.f16500b = z;
    }

    public final void run() {
        this.f16501c.m16195c(this.f16499a, this.f16500b);
    }
}
