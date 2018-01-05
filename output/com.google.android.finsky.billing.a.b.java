package com.google.android.finsky.billing.a;

import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.utils.FinskyLog;

protected final class com.google.android.finsky.billing.a.b extends com.google.android.finsky.scheduler.ah
{

    b() {
        com.google.android.finsky.scheduler.ah();
    }

    protected final boolean a(com.google.android.finsky.scheduler.b.d p0) {
        FinskyLog.a("Starting job to clear the cache", new Object[0]);
        new Thread(new com.google.android.finsky.billing.a.c(this, p0)).start();
        return 1;
    }

    protected final boolean k_(int p0) {
        FinskyLog.a("Job was stopped", new Object[0]);
        return 0;
    }

}
