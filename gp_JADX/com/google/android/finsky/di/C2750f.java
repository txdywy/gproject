package com.google.android.finsky.di;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class C2750f implements Callable {
    public final /* synthetic */ C2758n f14989a;
    public final /* synthetic */ C2748d f14990b;

    public C2750f(C2748d c2748d, C2758n c2758n) {
        this.f14990b = c2748d;
        this.f14989a = c2758n;
    }

    public final /* synthetic */ Object call() {
        Bundle a = this.f14990b.m14803a(this.f14989a.f15000a);
        if (a.getInt("status_code") != 0) {
            return a;
        }
        C2748d c2748d = this.f14990b;
        C2758n c2758n = this.f14989a;
        String str = c2758n.f15000a;
        String str2 = c2758n.f15001b;
        c2748d.m14804b(str);
        c2748d.f14982a.mo2846a(str, str2);
        boolean c = c2748d.m14805c(str);
        C2745a c2745a = new C2745a();
        if (c) {
            c2745a.m14795a(0);
        } else {
            c2745a.m14795a(-4).m14796a("Session error");
        }
        return c2745a.m14794a();
    }
}
