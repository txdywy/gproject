package com.google.android.gms.common.p283b;

import android.util.Log;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class C5094c implements ThreadFactory {
    public final String f25934a;
    public final AtomicInteger f25935b = new AtomicInteger(0);

    C5094c(String str) {
        String str2 = "NTF";
        String str3 = "NamedThreadFactory: created, for ";
        String valueOf = String.valueOf(str);
        Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        this.f25934a = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f25934a;
        Thread thread = new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 12).append(str).append("-").append(this.f25935b.incrementAndGet()).toString());
        String str2 = "NTF";
        String str3 = "NamedThreadFactory: newThread: ";
        str = String.valueOf(thread.getName());
        Log.d(str2, str.length() != 0 ? str3.concat(str) : new String(str3));
        return thread;
    }
}
