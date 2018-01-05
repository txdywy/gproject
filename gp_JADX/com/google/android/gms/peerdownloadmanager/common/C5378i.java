package com.google.android.gms.peerdownloadmanager.common;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class C5378i {
    public static Object m26142a(Future future, Class cls, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (ExecutionException e) {
            if (e.getCause().getClass().isAssignableFrom(cls)) {
                throw ((Exception) cls.cast(e.getCause()));
            }
            throw new IllegalStateException("unknown cause", e.getCause());
        }
    }

    public static Object m26141a(Future future, Class cls) {
        try {
            return future.get();
        } catch (ExecutionException e) {
            if (e.getCause().getClass().isAssignableFrom(cls)) {
                throw ((Exception) cls.cast(e.getCause()));
            }
            throw new IllegalStateException("unknown cause", e.getCause());
        }
    }
}
