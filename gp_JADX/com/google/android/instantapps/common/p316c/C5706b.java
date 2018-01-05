package com.google.android.instantapps.common.p316c;

import android.os.SystemClock;
import com.google.android.gms.clearcut.C5019g;

public final class C5706b {
    public byte[] f28870a;
    public final long f28871b = SystemClock.elapsedRealtime();
    public final /* synthetic */ C5705a f28872c;

    public C5706b(C5705a c5705a, byte[] bArr) {
        this.f28872c = c5705a;
        this.f28870a = bArr;
    }

    public final void m26968a(String str) {
        if (C5705a.m26966a()) {
            synchronized (C5705a.class) {
                C5019g c5019g = (C5019g) this.f28872c.f28868b.mo1a();
                byte[] bArr = this.f28870a;
                c5019g.f25564i.writeLock().lock();
                try {
                    c5019g.f25566k = bArr;
                    c5019g.f25567l = (Integer) c5019g.f25568m.get(c5019g.f25566k);
                    c5019g.f25564i.writeLock().unlock();
                    this.f28872c.m26967a(str).mo4532c(SystemClock.elapsedRealtime() - this.f28871b);
                    C5705a.f28867a.m27209b("Incremented %s for %dms", str, Long.valueOf(r0));
                } catch (Throwable th) {
                    c5019g.f25564i.writeLock().unlock();
                }
            }
            return;
        }
        C5705a.f28867a.m27209b("No-op incremented timer: %s", str);
    }
}
