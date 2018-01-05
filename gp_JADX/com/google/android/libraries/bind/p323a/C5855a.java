package com.google.android.libraries.bind.p323a;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.bind.p325d.C5893b;
import java.util.concurrent.Executor;

public final class C5855a {
    public static final Handler f29356a = new Handler(Looper.getMainLooper());
    public static Executor f29357b = new C5856b();
    public static Thread f29358c = Looper.getMainLooper().getThread();
    public static Executor f29359d = new C5857c();

    public static void m27294a() {
        C5893b.m27343a(C5855a.m27295b(), "Not on the main thread");
    }

    public static boolean m27295b() {
        return f29358c == Thread.currentThread();
    }
}
