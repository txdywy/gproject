package com.google.android.finsky.bk;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.herrevad.C5244a;
import com.google.android.gms.herrevad.C5245b;

public final class C2110d extends C2107a {
    public final C5058o f10723h;
    public final C5245b f10724i;

    public C2110d(Context context, Handler handler) {
        this(context, handler, C5244a.f26372d);
    }

    private C2110d(Context context, Handler handler, C5245b c5245b) {
        super(context, handler);
        this.f10723h = new C5089p(context).m23647a(C5244a.f26371c).m23650a(new C2111e()).m23652b();
        this.f10724i = c5245b;
    }

    public final void mo2647e(C2839b c2839b) {
        if (this.d >= 0 && this.e >= 0) {
            long n = c2839b.mo3164n() - this.d;
            long uptimeMillis = SystemClock.uptimeMillis() - this.e;
            C2109c c2109c = this.f;
            m11000a();
            if (n < 0) {
                FinskyLog.m21665c("Throughput was calculated incorrectly or not at all", new Object[0]);
            } else {
                this.c.post(new C2113g(this, c2109c, uptimeMillis, n));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void mo2644f(C2839b c2839b) {
        super.mo2644f(c2839b);
    }

    public final /* bridge */ /* synthetic */ void mo2645g(C2839b c2839b) {
        super.mo2645g(c2839b);
    }

    public final /* bridge */ /* synthetic */ void mo2646h(C2839b c2839b) {
    }
}
