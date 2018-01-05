package com.google.android.libraries.performance.primes;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

final class dd implements RejectedExecutionHandler {
    dd() {
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        String valueOf = String.valueOf(runnable);
        C5989do.m27824a(3, "PrimesExecutors", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Service rejected execution of ").append(valueOf).toString(), new Object[0]);
    }
}
