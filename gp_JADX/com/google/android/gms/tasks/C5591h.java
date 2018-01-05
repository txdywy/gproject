package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.am;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class C5591h {
    private static Object m26585a(C5587d c5587d) {
        if (c5587d.mo5060b()) {
            return c5587d.mo5061c();
        }
        throw new ExecutionException(c5587d.mo5062d());
    }

    public static Object m26586a(C5587d c5587d, long j, TimeUnit timeUnit) {
        am.m23745c("Must not be called on the main application thread");
        am.m23734a((Object) c5587d, (Object) "Task must not be null");
        am.m23734a((Object) timeUnit, (Object) "TimeUnit must not be null");
        if (c5587d.mo5059a()) {
            return C5591h.m26585a(c5587d);
        }
        C5585b c5592i = new C5592i();
        c5587d.mo5058a(C5589f.f28507b, (C5586c) c5592i);
        c5587d.mo5057a(C5589f.f28507b, c5592i);
        if (c5592i.f28509a.await(j, timeUnit)) {
            return C5591h.m26585a(c5587d);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
