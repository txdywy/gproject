package com.google.android.volley.p363a;

import com.android.volley.aa;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.BasicPoolEntry;
import org.apache.http.impl.conn.tsccm.ConnPoolByRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;
import org.apache.http.impl.conn.tsccm.RouteSpecificPool;
import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.apache.http.impl.conn.tsccm.WaitingThreadAborter;
import org.apache.http.params.HttpParams;

public final class C6462f extends ConnPoolByRoute {
    public C6462f(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        super(clientConnectionOperator, httpParams);
    }

    public final PoolEntryRequest requestPoolEntry(HttpRoute httpRoute, Object obj) {
        return new C6463g(this, new WaitingThreadAborter(), httpRoute, obj);
    }

    protected final BasicPoolEntry getEntryBlocking(HttpRoute httpRoute, Object obj, long j, TimeUnit timeUnit, WaitingThreadAborter waitingThreadAborter) {
        Date date = null;
        if (j > 0) {
            date = new Date(System.currentTimeMillis() + timeUnit.toMillis(j));
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.poolLock.lock();
        RouteSpecificPool routePool = getRoutePool(httpRoute, true);
        WaitingThread waitingThread = null;
        BasicPoolEntry basicPoolEntry = null;
        while (basicPoolEntry == null) {
            if (this.isShutDown) {
                throw new IllegalStateException("Connection pool shut down.");
            }
            WaitingThread newWaitingThread;
            try {
                basicPoolEntry = getFreeEntry(routePool, obj);
                if (basicPoolEntry != null) {
                    break;
                }
                aa.a("Constructed new connection to route=[%s]", new Object[]{httpRoute});
                Object obj2 = routePool.getCapacity() > 0 ? 1 : null;
                if (obj2 != null && this.numConnections < this.maxTotalConnections) {
                    basicPoolEntry = createEntry(routePool, this.operator);
                } else if (obj2 == null || this.freeConnections.isEmpty()) {
                    if (waitingThread == null) {
                        newWaitingThread = newWaitingThread(this.poolLock.newCondition(), routePool);
                        waitingThreadAborter.setWaitingThread(newWaitingThread);
                    } else {
                        newWaitingThread = waitingThread;
                    }
                    routePool.queueThread(newWaitingThread);
                    this.waitingThreads.add(newWaitingThread);
                    boolean await = newWaitingThread.await(date);
                    routePool.removeThread(newWaitingThread);
                    this.waitingThreads.remove(newWaitingThread);
                    if (await || date == null || date.getTime() > System.currentTimeMillis()) {
                        waitingThread = newWaitingThread;
                    } else {
                        throw new ConnectionPoolTimeoutException("Timeout waiting for connection");
                    }
                } else {
                    deleteLeastUsedEntry();
                    basicPoolEntry = createEntry(routePool, this.operator);
                }
            } catch (Throwable th) {
                this.poolLock.unlock();
                if (System.currentTimeMillis() - currentTimeMillis > 10) {
                    aa.a("GetEntryBlocking() took %s ms", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
                }
            }
        }
        BasicPoolEntry basicPoolEntry2 = basicPoolEntry;
        this.poolLock.unlock();
        if (System.currentTimeMillis() - currentTimeMillis > 10) {
            aa.a("GetEntryBlocking() took %s ms", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        }
        return basicPoolEntry2;
    }
}
