package com.google.common.flogger.backend.p424a;

import android.os.Build;
import android.util.Log;
import com.google.common.flogger.backend.C7013i;
import com.google.common.flogger.backend.C7017j;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

final class C7028i extends C7018a {
    public static final AtomicReference f34510b = new AtomicReference();
    public static C7021e f34511d;
    public static final AtomicLong f34512e = new AtomicLong();
    public static final ConcurrentLinkedQueue f34513f = new ConcurrentLinkedQueue();
    public volatile C7017j f34514c;

    static void m32060b() {
        while (true) {
            C7028i c7028i = (C7028i) C7029j.f34515a.poll();
            if (c7028i != null) {
                c7028i.f34514c = ((C7021e) f34510b.get()).mo5986a(c7028i.mo5982a());
            } else {
                C7028i.m32061c();
                return;
            }
        }
    }

    C7028i(String str) {
        super(str);
        this.f34514c = f34511d != null ? f34511d.mo5986a(mo5982a()) : null;
    }

    private static void m32061c() {
        while (true) {
            C7030k c7030k = (C7030k) f34513f.poll();
            if (c7030k != null) {
                f34512e.getAndDecrement();
                C7017j c7017j = c7030k.f34516a;
                C7013i c7013i = c7030k.f34517b;
                if (c7013i.mo5978j() || c7017j.mo5985a(c7013i.mo5972d())) {
                    c7017j.mo5984a(c7013i);
                }
            } else {
                return;
            }
        }
    }

    public final boolean mo5985a(Level level) {
        if (this.f34514c != null) {
            return this.f34514c.mo5985a(level);
        }
        return true;
    }

    public final void mo5984a(C7013i c7013i) {
        if (this.f34514c != null) {
            this.f34514c.mo5984a(c7013i);
            return;
        }
        if (f34512e.incrementAndGet() > 20) {
            f34513f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f34513f.offer(new C7030k(this, c7013i));
        if (this.f34514c != null) {
            C7028i.m32061c();
        }
    }

    static {
        Object obj = null;
        Object obj2 = (Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT)) ? 1 : null;
        if ("goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE)) {
            obj = 1;
        }
        if (obj2 == null && r1 == null) {
            f34511d = null;
        } else {
            f34511d = new C7022d();
        }
    }
}
