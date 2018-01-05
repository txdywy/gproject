package com.google.android.gms.common.p283b;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class C5093b extends ThreadPoolExecutor {
    public C5093b(BlockingQueue blockingQueue) {
        super(6, 6, 0, TimeUnit.MILLISECONDS, blockingQueue, new C5094c("CommsRunnable"));
    }
}
