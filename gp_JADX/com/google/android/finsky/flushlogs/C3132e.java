package com.google.android.finsky.flushlogs;

import android.accounts.Account;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class C3132e implements Runnable {
    public final /* synthetic */ C3131d f16137a;

    C3132e(C3131d c3131d) {
        this.f16137a = c3131d;
    }

    public final void run() {
        ah ahVar = this.f16137a;
        Account[] d = ahVar.f16135c.mo1188d();
        CountDownLatch countDownLatch = new CountDownLatch(d.length + 1);
        Runnable c3133f = new C3133f(countDownLatch);
        for (Account account : d) {
            FinskyLog.m21659a("Flushing event logs for %s", FinskyLog.m21655a(account.name));
            ahVar.f16134a.mo2049a(account).m13329a(c3133f);
        }
        ahVar.f16134a.mo2049a(null).m13329a(c3133f);
        try {
            if (!countDownLatch.await(((Long) C0955b.ft.m28964b()).longValue(), TimeUnit.MILLISECONDS)) {
                FinskyLog.m21659a("Logs flushing took more than %d ms.", C0955b.ft.m28964b());
            }
        } catch (InterruptedException e) {
            FinskyLog.m21665c("Logs flushing was interrupted.", new Object[0]);
        }
        C0954a.ax.m5763a(Long.valueOf(0));
        ahVar.m5802b(null);
    }
}
