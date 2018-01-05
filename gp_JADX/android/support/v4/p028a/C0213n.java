package android.support.v4.p028a;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class C0213n {
    public static final ThreadFactory f1205d = new C0225o();
    public static final BlockingQueue f1206e = new LinkedBlockingQueue(10);
    public static final Executor f1207f;
    public static C0230s f1208g;
    public static volatile Executor f1209h;
    public final C0226u f1210i = new C0227p(this);
    public final FutureTask f1211j = new C0228q(this, this.f1210i);
    public volatile C0231t f1212k = C0231t.PENDING;
    public final AtomicBoolean f1213l = new AtomicBoolean();
    public final AtomicBoolean f1214m = new AtomicBoolean();

    private static Handler m1100c() {
        Handler handler;
        synchronized (C0213n.class) {
            if (f1208g == null) {
                f1208g = new C0230s();
            }
            handler = f1208g;
        }
        return handler;
    }

    protected abstract Object mo269a();

    C0213n() {
    }

    final void m1104c(Object obj) {
        if (!this.f1214m.get()) {
            m1105d(obj);
        }
    }

    final Object m1105d(Object obj) {
        C0213n.m1100c().obtainMessage(1, new C0229r(this, obj)).sendToTarget();
        return obj;
    }

    protected void mo270a(Object obj) {
    }

    protected static void m1099b() {
    }

    protected void mo271b(Object obj) {
    }

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f1206e, f1205d);
        f1207f = threadPoolExecutor;
        f1209h = threadPoolExecutor;
    }
}
