package com.google.android.finsky.ca;

import com.google.wireless.android.finsky.dfe.nano.dj;

final class C2253e implements Runnable {
    public final /* synthetic */ dj[] f11189a;
    public final /* synthetic */ String f11190b;
    public final /* synthetic */ Runnable f11191c;
    public final /* synthetic */ C2251c f11192d;

    C2253e(C2251c c2251c, dj[] djVarArr, String str, Runnable runnable) {
        this.f11192d = c2251c;
        this.f11189a = djVarArr;
        this.f11190b = str;
        this.f11191c = runnable;
    }

    public final void run() {
        this.f11192d.m11687b(this.f11189a, this.f11190b, this.f11191c);
    }
}
