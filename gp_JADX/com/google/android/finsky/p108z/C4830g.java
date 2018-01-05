package com.google.android.finsky.p108z;

import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

public final class C4830g {
    public static Object m22622a(C4809e c4809e) {
        Throwable e;
        try {
            return c4809e.get();
        } catch (InterruptedException e2) {
            e = e2;
            FinskyLog.m21663b(e, "Unexpected exception: %s", e.getMessage());
            return null;
        } catch (ExecutionException e3) {
            e = e3;
            FinskyLog.m21663b(e, "Unexpected exception: %s", e.getMessage());
            return null;
        }
    }
}
