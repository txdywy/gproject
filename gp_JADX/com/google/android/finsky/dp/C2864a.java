package com.google.android.finsky.dp;

import android.os.StrictMode;
import com.google.android.finsky.api.C1254c;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class C2864a {
    public final C2866c f15326a;

    public C2864a(C2866c c2866c) {
        this.f15326a = c2866c;
    }

    public final gp m15105a(C1254c c1254c) {
        StrictMode.noteSlowCall("TocHelper.getTocBlocking");
        Semaphore semaphore = new Semaphore(0);
        gp[] gpVarArr = new gp[1];
        this.f15326a.m15108a(c1254c, false, true, new C2865b(gpVarArr, semaphore));
        try {
            if (semaphore.tryAcquire(999, TimeUnit.SECONDS)) {
                return gpVarArr[0];
            }
            return null;
        } catch (InterruptedException e) {
            return null;
        }
    }
}
