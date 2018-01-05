package com.google.android.gms.internal;

import com.google.android.gms.common.internal.am;
import java.lang.Thread.UncaughtExceptionHandler;

final class hs implements UncaughtExceptionHandler {
    public final String f26913a;
    public /* synthetic */ hr f26914b;

    public hs(hr hrVar, String str) {
        this.f26914b = hrVar;
        am.m23733a((Object) str);
        this.f26913a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f26914b.mo4742p().f26845d.m24653a(this.f26913a, th);
    }
}
