package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.p270c.C4909c;
import java.util.concurrent.Callable;

final class C5334t implements Runnable {
    public /* synthetic */ ay f27493a;
    public /* synthetic */ Callable f27494b;

    C5334t(ay ayVar, Callable callable) {
        this.f27493a = ayVar;
        this.f27494b = callable;
    }

    public final void run() {
        try {
            Process.setThreadPriority(10);
            ay ayVar = this.f27493a;
            Object call = this.f27494b.call();
            synchronized (ayVar.f26495a) {
                if (ayVar.f26499e) {
                } else if (ayVar.m24198a()) {
                    C4909c.m22927a().f25264d.m24772a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                } else {
                    ayVar.f26498d = true;
                    ayVar.f26496b = call;
                    ayVar.f26495a.notifyAll();
                    ayVar.f26500f.m24196a();
                }
            }
        } catch (Throwable e) {
            C4909c.m22927a().f25264d.m24772a(e, "AdThreadPool.submit");
            this.f27493a.m24197a(e);
        }
    }
}
