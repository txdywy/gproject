package io.reactivex.internal.p564g;

import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class C7856x {
    public static final int f40452a;
    public static final AtomicReference f40453b = new AtomicReference();
    public static final Map f40454c = new ConcurrentHashMap();

    private static void m37717a() {
        while (true) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f40453b.get();
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C7852t("RxSchedulerPurge"));
                if (f40453b.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    newScheduledThreadPool.scheduleAtFixedRate(new C7857y(), (long) f40452a, (long) f40452a, TimeUnit.SECONDS);
                    return;
                }
                newScheduledThreadPool.shutdownNow();
            } else {
                return;
            }
        }
    }

    public static ScheduledExecutorService m37716a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            f40454c.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }

    static {
        int i = 1;
        Properties properties = System.getProperties();
        if (properties.containsKey("rx2.purge-enabled") && Boolean.getBoolean("rx2.purge-enabled") && properties.containsKey("rx2.purge-period-seconds")) {
            i = Integer.getInteger("rx2.purge-period-seconds", 1).intValue();
        }
        f40452a = i;
        C7856x.m37717a();
    }
}
