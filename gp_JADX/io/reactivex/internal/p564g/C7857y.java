package io.reactivex.internal.p564g;

import io.reactivex.p554d.C7773a;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

final class C7857y implements Runnable {
    C7857y() {
    }

    public final void run() {
        try {
            ArrayList arrayList = new ArrayList(C7856x.f40454c.keySet());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C7856x.f40454c.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        } catch (Throwable th) {
            C7773a.m37567a(th);
        }
    }
}
