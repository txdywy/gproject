package com.google.android.finsky.bk;

import com.google.android.gms.herrevad.NetworkQualityReport;
import java.util.concurrent.TimeUnit;

final class C2113g implements Runnable {
    public final /* synthetic */ C2109c f10726a;
    public final /* synthetic */ long f10727b;
    public final /* synthetic */ long f10728c;
    public final /* synthetic */ C2110d f10729d;

    C2113g(C2110d c2110d, C2109c c2109c, long j, long j2) {
        this.f10729d = c2110d;
        this.f10726a = c2109c;
        this.f10727b = j;
        this.f10728c = j2;
    }

    public final void run() {
        if (C2107a.m10999a(this.f10726a, this.f10729d.m11001b())) {
            long toMicros = TimeUnit.MILLISECONDS.toMicros(this.f10727b);
            NetworkQualityReport networkQualityReport = new NetworkQualityReport();
            networkQualityReport.f26357c = this.f10728c;
            networkQualityReport.f26356b = toMicros;
            C2110d c2110d = this.f10729d;
            new Object[1][0] = networkQualityReport;
            c2110d.f10723h.mo4557e();
            c2110d.f10724i.mo4721a(c2110d.f10723h, networkQualityReport).mo4490a(new C2112f(c2110d));
        }
    }
}
