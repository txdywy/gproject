package com.google.android.gms.internal;

import com.google.android.gms.common.internal.am;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class dn implements ThreadFactory {
    public final String f26659a;
    public final AtomicInteger f26660b;
    public final ThreadFactory f26661c;

    public dn(String str) {
        this(str, (byte) 0);
    }

    private dn(String str, byte b) {
        this.f26660b = new AtomicInteger();
        this.f26661c = Executors.defaultThreadFactory();
        this.f26659a = (String) am.m23734a((Object) str, (Object) "Name must not be null");
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f26661c.newThread(new C5305do(runnable));
        String str = this.f26659a;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 13).append(str).append("[").append(this.f26660b.getAndIncrement()).append("]").toString());
        return newThread;
    }
}
