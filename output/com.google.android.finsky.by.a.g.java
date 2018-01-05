package com.google.android.finsky.by.a;

import java.util.concurrent.CountDownLatch;

public final class com.google.android.finsky.by.a.g implements Runnable
{

    public final CountDownLatch a;

    g(CountDownLatch p0) {
        this.a = p0;
    }

    public final void run() {
        this.a.countDown();
    }

}
