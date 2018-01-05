package com.google.android.common.http;

import android.net.TrafficStats;
import android.os.SystemClock;
import android.util.EventLog;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class com.google.android.common.http.b extends FilterInputStream
{

    public final com.google.android.common.http.a a;

    b(com.google.android.common.http.a p0, InputStream p1) {
        this.a = p0;
        FilterInputStream(p1);
    }

    public final void close() {
        try {
            super.close();
        }
        catch (Throwable ex) {
            v8 = new Object[5];
            v8[0] = this.a.a;
            v8[1] = Long.valueOf(this.a.e);
            v8[2] = Long.valueOf(SystemClock.elapsedRealtime() - this.a.f);
            v8[3] = Long.valueOf(TrafficStats.getUidTxBytes(this.a.b) - this.a.c);
            v8[4] = Long.valueOf(TrafficStats.getUidRxBytes(this.a.b) - this.a.d);
            EventLog.writeEvent(52001, v8);
            throw ex;
        }
        v7 = new Object[5];
        v7[0] = this.a.a;
        v7[1] = Long.valueOf(this.a.e);
        v7[2] = Long.valueOf(SystemClock.elapsedRealtime() - this.a.f);
        v7[3] = Long.valueOf(TrafficStats.getUidTxBytes(this.a.b) - this.a.c);
        v7[4] = Long.valueOf(TrafficStats.getUidRxBytes(this.a.b) - this.a.d);
        EventLog.writeEvent(52001, v7);
    }

}
