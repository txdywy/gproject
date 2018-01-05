package com.google.android.finsky.deviceconfig;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.hygiene.C0971t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class C2708u extends C0971t {
    protected final void mo1170a(C1254c c1254c, C2495w c2495w) {
        C2693e a = C2693e.m14552a();
        ArrayDeque b = a.m14568b(c1254c);
        CountDownLatch countDownLatch = new CountDownLatch(b.size());
        Iterator it = b.iterator();
        while (it.hasNext()) {
            a.m14562a((C1254c) it.next(), new C2709v(countDownLatch), true, true);
        }
        try {
            if (!countDownLatch.await(((Long) C0955b.dg.m28964b()).longValue(), TimeUnit.SECONDS)) {
                FinskyLog.m21665c("Upload config timed out.", new Object[0]);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            FinskyLog.m21665c("Thread was interrupted.", new Object[0]);
        }
    }
}
