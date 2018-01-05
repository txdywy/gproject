package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import org.chromium.base.C7888e;
import org.chromium.base.C7893j;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.an;

public class CronetLibraryLoader {
    public static final Object f40687a = new Object();
    public static final String f40688b = ("cronet." + "64.0.3261.0");
    public static final String f40689c = CronetLibraryLoader.class.getSimpleName();
    public static final HandlerThread f40690d = new HandlerThread("CronetInit");
    public static volatile boolean f40691e = false;
    public static volatile boolean f40692f = false;
    public static final ConditionVariable f40693g = new ConditionVariable();

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    public static void m37992a(Context context, C7942e c7942e) {
        synchronized (f40687a) {
            if (!f40692f) {
                if (C7888e.f40514a != null && C7888e.f40514a != context) {
                    throw new RuntimeException("Attempting to set multiple global application contexts.");
                } else if (context == null) {
                    throw new RuntimeException("Global application context cannot be set to null.");
                } else {
                    C7888e.f40514a = context;
                    if (!f40690d.isAlive()) {
                        f40690d.start();
                    }
                    m37993a(new C7948h());
                }
            }
            if (!f40691e) {
                if (c7942e.mo6616b() != null) {
                    c7942e.mo6616b().mo6631a();
                } else {
                    System.loadLibrary(f40688b);
                }
                if ("64.0.3261.0".equals(nativeGetCronetVersion())) {
                    String str = f40689c;
                    Object[] objArr = new Object[]{r0, System.getProperty("os.arch")};
                    String a = C7893j.m37815a("Cronet version: %s, arch: %s", objArr);
                    Throwable a2 = C7893j.m37816a(objArr);
                    if (a2 != null) {
                        Log.i(C7893j.m37814a(str), a, a2);
                    } else {
                        Log.i(C7893j.m37814a(str), a);
                    }
                    f40691e = true;
                    f40693g.open();
                } else {
                    throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", new Object[]{"64.0.3261.0", nativeGetCronetVersion()}));
                }
            }
        }
    }

    static void m37991a() {
        if (!f40692f) {
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.f40572e.m37843a(true, new an());
            f40693g.block();
            nativeCronetInitOnInitThread();
            f40692f = true;
        }
    }

    public static void m37993a(Runnable runnable) {
        if ((f40690d.getLooper() == Looper.myLooper() ? 1 : null) != null) {
            runnable.run();
        } else {
            new Handler(f40690d.getLooper()).post(runnable);
        }
    }
}
