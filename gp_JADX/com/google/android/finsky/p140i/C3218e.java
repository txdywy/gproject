package com.google.android.finsky.p140i;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;

final class C3218e implements Runnable {
    public final /* synthetic */ long f16547a;
    public final /* synthetic */ long f16548b;
    public final /* synthetic */ long f16549c;
    public final /* synthetic */ C3216c f16550d;

    C3218e(C3216c c3216c, long j, long j2, long j3) {
        this.f16550d = c3216c;
        this.f16547a = j;
        this.f16548b = j2;
        this.f16549c = j3;
    }

    public final void run() {
        if (this.f16550d.f16543b.m16267a()) {
            long elapsedRealtime = this.f16548b - (SystemClock.elapsedRealtime() - this.f16547a);
            C3216c c3216c;
            long j;
            if (elapsedRealtime > 0) {
                c3216c = this.f16550d;
                j = this.f16549c;
                new Handler(Looper.getMainLooper()).postDelayed(new C3218e(c3216c, SystemClock.elapsedRealtime(), elapsedRealtime, j), j);
                return;
            } else if (((Boolean) C0955b.fD.m28964b()).booleanValue() && this.f16550d.f16545d.m21698c()) {
                c3216c = this.f16550d;
                elapsedRealtime = ((Long) C0955b.fB.m28964b()).longValue();
                j = this.f16549c;
                new Handler(Looper.getMainLooper()).postDelayed(new C3218e(c3216c, SystemClock.elapsedRealtime(), elapsedRealtime, j), j);
                return;
            } else if (this.f16550d.f16544c.m7133a()) {
                c3216c = this.f16550d;
                elapsedRealtime = ((Long) C0955b.fB.m28964b()).longValue();
                j = this.f16549c;
                new Handler(Looper.getMainLooper()).postDelayed(new C3218e(c3216c, SystemClock.elapsedRealtime(), elapsedRealtime, j), j);
                return;
            } else {
                FinskyLog.m21665c("Killing app as it has been scheduled for restart", new Object[0]);
                System.exit(0);
                return;
            }
        }
        this.f16550d.m16265a();
    }
}
