package com.google.android.finsky.setup;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p198f.C3028c;
import java.util.concurrent.Callable;

final class C4185r implements Callable {
    public final /* synthetic */ PlaySetupService f21109a;

    C4185r(PlaySetupService playSetupService) {
        this.f21109a = playSetupService;
    }

    public final /* synthetic */ Object call() {
        if (this.f21109a.f20552e != null) {
            C3300k o = C1473m.f7980a.mo2256o();
            C3340g bw = C1473m.f7980a.bw();
            o.mo3461o(this.f21109a.f20552e);
            int b = bw.mo3482b(this.f21109a.f20552e);
            C1473m.f7980a.bu();
            if (C3028c.m15628a(b)) {
                return Boolean.valueOf(false);
            }
        }
        return Boolean.valueOf(true);
    }
}
