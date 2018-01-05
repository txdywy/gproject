package org.chromium.base;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Looper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.chromium.base.annotations.CalledByNative;

public class ApplicationStatus {
    public static final Object f40479a = new Object();
    @SuppressLint({"SupportAnnotationUsage"})
    public static Integer f40480b;
    @SuppressLint({"StaticFieldLeak"})
    public static Activity f40481c;
    public static C7885d f40482d;
    public static final Map f40483e = new ConcurrentHashMap();
    public static final C7895l f40484f = new C7895l();

    private ApplicationStatus() {
    }

    private static native void nativeOnApplicationStateChange(int i);

    @CalledByNative
    public static int getStateForApplication() {
        int i;
        int i2 = 0;
        int i3 = 1;
        synchronized (f40479a) {
            if (f40480b == null) {
                int i4 = 0;
                for (C7887c c7887c : f40483e.values()) {
                    i = c7887c.f40513a;
                    if (i != 4 && i != 5 && i != 6) {
                        break;
                    } else if (i == 4) {
                        i4 = 1;
                    } else {
                        if (i == 5) {
                            i = 1;
                        } else {
                            i = i2;
                        }
                        i2 = i;
                    }
                }
                i3 = i4 != 0 ? 2 : i2 != 0 ? 3 : 4;
                f40480b = Integer.valueOf(i3);
            }
            i = f40480b.intValue();
        }
        return i;
    }

    public static void m37782a(C7885d c7885d) {
        C7895l c7895l = f40484f;
        if (c7885d != null && !c7895l.f40528a.contains(c7885d)) {
            c7895l.f40528a.add(c7885d);
            c7895l.f40530c++;
        }
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        Runnable c7884a = new C7884a();
        if ((ThreadUtils.m37806a().getLooper() == Looper.myLooper() ? 1 : null) != null) {
            c7884a.run();
        } else {
            ThreadUtils.m37806a().post(c7884a);
        }
    }

    static {
        C7895l c7895l = new C7895l();
    }
}
