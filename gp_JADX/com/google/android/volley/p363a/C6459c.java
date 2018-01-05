package com.google.android.volley.p363a;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.AbstractConnPool;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

public final class C6459c extends ThreadSafeClientConnManager {
    public C6459c(HttpParams httpParams, SchemeRegistry schemeRegistry) {
        super(httpParams, schemeRegistry);
    }

    protected final AbstractConnPool createConnectionPool(HttpParams httpParams) {
        AbstractConnPool c6462f = new C6462f(this.connOperator, httpParams);
        c6462f.enableConnectionGC();
        return c6462f;
    }

    public final ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
        return new C6460d(this, this.connectionPool.requestPoolEntry(httpRoute, obj), httpRoute);
    }

    public final void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
        if ((managedClientConnection instanceof C6461e) && managedClientConnection.getRoute() != null) {
            if (System.currentTimeMillis() - ((C6461e) managedClientConnection).f32446a > (managedClientConnection.getRoute().isSecure() ? 5000 : 2500)) {
                try {
                    managedClientConnection.close();
                } catch (IOException e) {
                }
            }
        }
        super.releaseConnection(managedClientConnection, j, timeUnit);
    }
}
