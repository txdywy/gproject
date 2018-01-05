package com.google.android.finsky.detailsmodules;

import com.google.android.finsky.detailsmodules.p183a.C2597a;
import com.google.android.finsky.detailsmodules.p183a.C2601e;

public final class C2603b implements Runnable {
    public final /* synthetic */ C2597a f13827a;
    public final /* synthetic */ int f13828b = 0;

    public C2603b(C2597a c2597a) {
        this.f13827a = c2597a;
    }

    public final void run() {
        if (!this.f13827a.f13820a.isEmpty() && this.f13827a.f13820a.get(this.f13828b) != null) {
            this.f13827a.mo2976b(((C2601e) this.f13827a.f13820a.get(this.f13828b)).a, this.f13828b);
        }
    }
}
