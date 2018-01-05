package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C5302b
public final class C5331q {
    public static final ThreadPoolExecutor f27346a = new ThreadPoolExecutor(20, 20, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), C5331q.m25397a("Default"));
    public static final ThreadPoolExecutor f27347b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), C5331q.m25397a("Loader"));

    static {
        f27346a.allowCoreThreadTimeOut(true);
        f27347b.allowCoreThreadTimeOut(true);
    }

    public static as m25394a(int i, Runnable runnable) {
        return i == 1 ? C5331q.m25396a(f27347b, new C5332r(runnable)) : C5331q.m25396a(f27346a, new C5333s(runnable));
    }

    public static as m25395a(Runnable runnable) {
        return C5331q.m25394a(0, runnable);
    }

    private static as m25396a(ExecutorService executorService, Callable callable) {
        ay ayVar = new ay();
        try {
            Runnable c5335u = new C5335u(ayVar, executorService.submit(new C5334t(ayVar, callable)));
            Executor executor = av.f26493a;
            at atVar = ayVar.f26500f;
            synchronized (atVar.f26488a) {
                if (atVar.f26490c) {
                    executor.execute(c5335u);
                } else {
                    atVar.f26489b.add(new au(executor, c5335u));
                }
            }
        } catch (Throwable e) {
            ap.m24194c("Thread execution is rejected.", e);
            ayVar.m24197a(e);
        }
        return ayVar;
    }

    private static ThreadFactory m25397a(String str) {
        return new C5336v(str);
    }
}
