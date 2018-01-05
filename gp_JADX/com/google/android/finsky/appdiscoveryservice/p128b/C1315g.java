package com.google.android.finsky.appdiscoveryservice.p128b;

import android.os.IBinder.DeathRecipient;

final class C1315g implements DeathRecipient {
    public final /* synthetic */ C1308f f7802a;

    C1315g(C1308f c1308f) {
        this.f7802a = c1308f;
    }

    public final void binderDied() {
        this.f7802a.f7770z = false;
    }
}
