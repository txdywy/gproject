package com.google.android.finsky.setup.p242d.p244a;

import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p198f.C3028c;
import java.util.concurrent.Callable;

final class C4149f implements Callable {
    public final /* synthetic */ C4147d f21000a;

    C4149f(C4147d c4147d) {
        this.f21000a = c4147d;
    }

    public final /* synthetic */ Object call() {
        boolean z = true;
        if (this.f21000a.f20989f != null) {
            String str = this.f21000a.f20989f.c.f11833b;
            this.f21000a.f20992i.m16742a(str).mo4398a(C4831h.f25111a);
            if (C3028c.m15628a(this.f21000a.f20992i.mo3482b(str))) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
