package com.google.android.finsky.bk;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.internal.fb;
import com.google.android.gms.p285e.C5183a;
import com.google.android.gms.p285e.C5185c;

final class C2115i implements Runnable {
    public final /* synthetic */ C2109c f10731a;
    public final /* synthetic */ long f10732b;
    public final /* synthetic */ long f10733c;
    public final /* synthetic */ C2114h f10734d;

    C2115i(C2114h c2114h, C2109c c2109c, long j, long j2) {
        this.f10734d = c2114h;
        this.f10731a = c2109c;
        this.f10732b = j;
        this.f10733c = j2;
    }

    public final void run() {
        if (C2107a.m10999a(this.f10731a, this.f10734d.m11001b())) {
            Bundle bundle = new Bundle();
            bundle.putString("bytes_transferred", Long.toString(this.f10732b));
            Context context = this.f10734d.f10730h;
            Long valueOf = Long.valueOf(this.f10733c);
            if (C5183a.f26122a) {
                C5058o b = new C5089p(context).m23650a(C5183a.f26123b).m23647a(fb.f26750c).m23652b();
                b.mo4557e();
                try {
                    fb.f26751d.mo4722a(b, valueOf, bundle).mo4490a(new C5185c(b));
                } catch (RuntimeException e) {
                    String valueOf2 = String.valueOf(e);
                    Log.w("Herrevad", new StringBuilder(String.valueOf(valueOf2).length() + 95).append("Exception in logNetworkStats.  This call should always fail silently, so we will swallow this: ").append(valueOf2).toString());
                }
            }
        }
    }
}
