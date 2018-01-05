package com.google.android.finsky.ac;

import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.z.e;
import com.google.android.finsky.z.f;
import java.util.concurrent.ExecutionException;

public final class com.google.android.finsky.ac.g implements com.google.android.finsky.z.f
{

    public static final com.google.android.finsky.z.f a;

    static {
        com.google.android.finsky.ac.g.a = new com.google.android.finsky.ac.g();
    }

    g() {
    }

    public final void a(com.google.android.finsky.z.e p0) {
        try {
            if (((Long)p0.get()).longValue() <= 0) {
                v1 = new Object[1];
                v1[0] = p0.get();
                FinskyLog.e("Could not content sync service task: %s", v1);
            }
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            FinskyLog.a(ex, "InterruptedException failed to run content sync", new Object[0]);
        }
        catch (ExecutionException ex) {
            FinskyLog.a(ex, "ExecutionException failed to run content sync", new Object[0]);
        }
    }

}
