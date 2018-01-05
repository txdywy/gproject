package com.google.android.finsky.billing.p151a;

import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

final /* synthetic */ class C1650c implements Runnable {
    public final C1649b f8589a;
    public final C4026d f8590b;

    C1650c(C1649b c1649b, C4026d c4026d) {
        this.f8589a = c1649b;
        this.f8590b = c4026d;
    }

    public final void run() {
        ah ahVar = this.f8589a;
        String b = this.f8590b.m18859d().m18854b("key_directory");
        if (b == null) {
            FinskyLog.m21669e("Missing KEY_CACHE_DIRECTORY", new Object[0]);
            return;
        }
        C1648a.m9355a(new File(b));
        ahVar.m5802b(null);
    }
}
