package com.google.common.p420f.p421a;

import java.util.concurrent.Future;

public final class bi {
    public static Object m31906a(Future future) {
        Object obj;
        Object obj2 = null;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException e) {
                obj2 = 1;
            } catch (Throwable th) {
                if (obj2 != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        if (obj2 != null) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }
}
