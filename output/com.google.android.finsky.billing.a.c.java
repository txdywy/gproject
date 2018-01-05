package com.google.android.finsky.billing.a;

import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.b.c;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

public final class com.google.android.finsky.billing.a.c implements Runnable
{

    public final com.google.android.finsky.billing.a.b a;
    public final com.google.android.finsky.scheduler.b.d b;

    c(com.google.android.finsky.billing.a.b p0, com.google.android.finsky.scheduler.b.d p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        v1 = this.b.d().b("key_directory");
        if (v1 == 0)
            FinskyLog.e("Missing KEY_CACHE_DIRECTORY", new Object[0]);
        else {
            com.google.android.finsky.billing.a.a.a(new File(v1));
            this.a.b(0);
        }
    }

}
