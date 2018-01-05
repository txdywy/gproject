package com.google.android.volley.p363a;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;

final class C6463g implements PoolEntryRequest {
    public final /* synthetic */ WaitingThreadAborter f32447a;
    public final /* synthetic */ HttpRoute f32448b;
    public final /* synthetic */ Object f32449c;
    public final /* synthetic */ C6462f f32450d;

    C6463g(C6462f c6462f, WaitingThreadAborter waitingThreadAborter, HttpRoute httpRoute, Object obj) {
        this.f32450d = c6462f;
        this.f32447a = waitingThreadAborter;
        this.f32448b = httpRoute;
        this.f32449c = obj;
    }

    public final void abortRequest() {
        this.f32450d.poolLock.lock();
        try {
            this.f32447a.abort();
        } finally {
            this.f32450d.poolLock.unlock();
        }
    }

    public final BasicPoolEntry getPoolEntry(long j, TimeUnit timeUnit) {
        return this.f32450d.getEntryBlocking(this.f32448b, this.f32449c, j, timeUnit, this.f32447a);
    }
}
