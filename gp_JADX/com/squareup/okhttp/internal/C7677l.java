package com.squareup.okhttp.internal;

import java.util.concurrent.ThreadFactory;

final class C7677l implements ThreadFactory {
    public final /* synthetic */ String f39712a;
    public final /* synthetic */ boolean f39713b = true;

    C7677l(String str) {
        this.f39712a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f39712a);
        thread.setDaemon(this.f39713b);
        return thread;
    }
}
