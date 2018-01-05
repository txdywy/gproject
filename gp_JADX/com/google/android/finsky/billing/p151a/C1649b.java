package com.google.android.finsky.billing.p151a;

import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.FinskyLog;

public class C1649b extends ah {
    protected final boolean mo1168a(C4026d c4026d) {
        FinskyLog.m21659a("Starting job to clear the cache", new Object[0]);
        new Thread(new C1650c(this, c4026d)).start();
        return true;
    }

    protected final boolean k_(int i) {
        FinskyLog.m21659a("Job was stopped", new Object[0]);
        return false;
    }
}
