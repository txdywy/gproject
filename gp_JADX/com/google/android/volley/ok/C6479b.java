package com.google.android.volley.ok;

import android.net.TrafficStats;
import android.os.SystemClock;
import com.google.android.common.http.a;
import org.apache.http.HttpEntity;

final class C6479b implements C6478m {
    public long f32472a = SystemClock.elapsedRealtime();
    public long f32473b;
    public long f32474c;
    public final /* synthetic */ C6477a f32475d;

    C6479b(C6477a c6477a) {
        this.f32475d = c6477a;
        this.f32473b = TrafficStats.getUidTxBytes(c6477a.f32471a);
        this.f32474c = TrafficStats.getUidRxBytes(c6477a.f32471a);
    }

    public final HttpEntity mo5451a(String str, HttpEntity httpEntity) {
        return new a(httpEntity, str, this.f32475d.f32471a, this.f32473b, this.f32474c, SystemClock.elapsedRealtime() - this.f32472a, this.f32472a);
    }
}
