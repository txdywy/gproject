package org.chromium.net.impl;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class ac implements ThreadFactory {
    public final /* synthetic */ int f40754a;

    ac(int i) {
        this.f40754a = i;
    }

    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new ad(this, runnable));
    }
}
