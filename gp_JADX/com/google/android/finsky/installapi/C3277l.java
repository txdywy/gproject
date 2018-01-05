package com.google.android.finsky.installapi;

import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.utils.FinskyLog;

public final class C3277l {
    public static Object m16395a(ag agVar, String str) {
        try {
            return agVar.get();
        } catch (InterruptedException e) {
            FinskyLog.m21669e("%s, %s", str, e);
            throw e;
        } catch (Throwable e2) {
            Throwable cause = e2.getCause();
            FinskyLog.m21667d("%s: %s", str, cause);
            if (cause instanceof VolleyError) {
                throw ((VolleyError) cause);
            }
            throw new RuntimeException(e2);
        }
    }
}
