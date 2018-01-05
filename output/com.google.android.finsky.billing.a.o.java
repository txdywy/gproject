package com.google.android.finsky.billing.a;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.z.e;
import java.util.concurrent.ExecutionException;

public final class com.google.android.finsky.billing.a.o implements com.google.android.finsky.z.f
{

    o() {
    }

    public final void a(com.google.android.finsky.z.e p0) {
 15:    if (((Long)p0.get()).longValue() <= 0)
 22:        FinskyLog.c("Couldn't schedule a Janitor", new Object[0]);
 25:    return;
 26:    v0 = ex;
 30:    v2 = new Object[1];
 32:    v2[0] = v0;
 34:    FinskyLog.c("Got an exception scheduling a Janitor: %s", v2);
 37:    return;
 38:    v0 = ex;
 39:    goto 27;
 40:    try
            run 1...25
        catch (ExecutionException ex) {
  1:        goto 38;
        }
        catch (InterruptedException ex) {
  1:        goto 26;
        }
    }

}
