package com.google.android.volley.p363a;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.tsccm.PoolEntryRequest;

final class C6460d implements ClientConnectionRequest {
    public final /* synthetic */ PoolEntryRequest f32443a;
    public final /* synthetic */ HttpRoute f32444b;
    public final /* synthetic */ C6459c f32445c;

    C6460d(C6459c c6459c, PoolEntryRequest poolEntryRequest, HttpRoute httpRoute) {
        this.f32445c = c6459c;
        this.f32443a = poolEntryRequest;
        this.f32444b = httpRoute;
    }

    public final void abortRequest() {
        this.f32443a.abortRequest();
    }

    public final ManagedClientConnection getConnection(long j, TimeUnit timeUnit) {
        if (this.f32444b == null) {
            throw new IllegalArgumentException("Route may not be null.");
        }
        return new C6461e(this.f32445c, this.f32443a.getPoolEntry(j, timeUnit));
    }
}
