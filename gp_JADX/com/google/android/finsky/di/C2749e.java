package com.google.android.finsky.di;

import android.os.Bundle;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.Callable;

public final class C2749e implements Callable {
    public final /* synthetic */ C2746b f14987a;
    public final /* synthetic */ C2748d f14988b;

    public C2749e(C2748d c2748d, C2746b c2746b) {
        this.f14988b = c2748d;
        this.f14987a = c2746b;
    }

    public final /* synthetic */ Object call() {
        Bundle a = this.f14988b.m14803a(this.f14987a.f14978a);
        if (a.getInt("status_code") != 0) {
            return a;
        }
        if (!this.f14988b.f14983b.m14800a(this.f14987a.f14978a, this.f14987a.f14979b, new FileInputStream(this.f14987a.f14980c.getFileDescriptor()))) {
            return new C2745a().m14795a(-4).m14796a("Error caching split").m14794a();
        }
        Object a2 = this.f14988b.m14802a(this.f14987a);
        File file = new File(this.f14988b.f14983b.f14981a, C2747c.m14798b(this.f14987a.f14978a, this.f14987a.f14979b));
        if (!file.exists()) {
            return a2;
        }
        file.delete();
        return a2;
    }
}
