package com.google.android.finsky.ac;

import com.google.android.finsky.aa.b;
import com.google.android.finsky.scheduler.a.a.b;
import com.google.android.finsky.scheduler.a.a.f;
import com.google.android.finsky.scheduler.b.a;
import com.google.android.finsky.scheduler.b.b;
import com.google.android.finsky.scheduler.b.d;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.i;
import com.google.android.finsky.z.e;
import com.google.android.play.utils.b.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.ac.f implements com.google.android.finsky.z.f
{

    public final com.google.android.finsky.ac.e a;

    f(com.google.android.finsky.ac.e p0) {
        this.a = p0;
    }

    public final void a(com.google.android.finsky.z.e p0) {
  8:    v0 = (com.google.android.finsky.scheduler.b.d)p0.get();
 10:    if (v0 == 0) goto 134;
 44:    if (com.google.android.finsky.utils.i.a() + ((Long)com.google.android.finsky.aa.b.jL.b()).longValue() < v0.a.f + v0.a().a.b)
 46:        v0 = 1;
        else
107:        v0 = 0;
 47:    if (v0 != 0)
103:        this.a.a.a(1, "content-sync-service", com.google.android.finsky.ac.c, new com.google.android.finsky.scheduler.b.b().a(((Long)com.google.android.finsky.aa.b.jL.b()).longValue()).b(TimeUnit.DAYS.toMillis(1)).a(1).a(), 0).a(com.google.android.finsky.ac.g.a);
106:    return;
114:    Thread.currentThread().interrupt();
121:    FinskyLog.a(ex, "InterruptedException failed to check job parameters in content sync", new Object[0]);
124:    v0 = 1;
125:    goto 47;
131:    FinskyLog.a(ex, "ListenableFuture failed to check job parameters in content sync", new Object[0]);
134:    v0 = 1;
135:    goto 47;
136:    try
            run 4...40
        catch (InterruptedException ex) {
  4:        goto 109;
        }
        catch (ExecutionException ex) {
  4:        goto 126;
        }
    }

}
