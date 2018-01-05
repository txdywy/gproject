package com.google.android.finsky.splitinstallservice;

import java.util.concurrent.ThreadFactory;

final /* synthetic */ class C4199b implements ThreadFactory {
    public static final ThreadFactory f21226a = new C4199b();

    private C4199b() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitInstallBackgroundThread");
    }
}
