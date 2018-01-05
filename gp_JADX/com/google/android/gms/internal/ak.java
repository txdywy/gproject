package com.google.android.gms.internal;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import com.google.android.gms.ads.p270c.C4909c;
import java.util.concurrent.Callable;

@C5302b
public final class ak {
    public static Object m24180a(Callable callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        Object call;
        try {
            StrictMode.setThreadPolicy(new Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            call = callable.call();
            return call;
        } catch (Throwable th) {
            call = th;
            ap.m24192b("Unexpected exception.", call);
            C4909c.m22927a().f25264d.m24772a(call, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
