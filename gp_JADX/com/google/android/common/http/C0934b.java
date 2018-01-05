package com.google.android.common.http;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.util.EventLog;
import java.io.FilterInputStream;
import java.io.InputStream;

final class C0934b extends FilterInputStream {
    public final /* synthetic */ C0933a f5726a;

    public C0934b(C0933a c0933a, InputStream inputStream) {
        this.f5726a = c0933a;
        super(inputStream);
    }

    public final void close() {
        long uidTxBytes;
        long uidRxBytes;
        try {
            super.close();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f5726a.f5725f;
            uidTxBytes = TrafficStats.getUidTxBytes(this.f5726a.f5721b);
            uidRxBytes = TrafficStats.getUidRxBytes(this.f5726a.f5721b);
            EventLog.writeEvent(52001, new Object[]{this.f5726a.f5720a, Long.valueOf(this.f5726a.f5724e), Long.valueOf(elapsedRealtime), Long.valueOf(uidTxBytes - this.f5726a.f5722c), Long.valueOf(uidRxBytes - this.f5726a.f5723d)});
        } catch (Throwable th) {
            uidTxBytes = SystemClock.elapsedRealtime() - this.f5726a.f5725f;
            uidRxBytes = TrafficStats.getUidTxBytes(this.f5726a.f5721b);
            long uidRxBytes2 = TrafficStats.getUidRxBytes(this.f5726a.f5721b);
            EventLog.writeEvent(52001, new Object[]{this.f5726a.f5720a, Long.valueOf(this.f5726a.f5724e), Long.valueOf(uidTxBytes), Long.valueOf(uidRxBytes - this.f5726a.f5722c), Long.valueOf(uidRxBytes2 - this.f5726a.f5723d)});
        }
    }
}
