package com.google.android.gms.internal;

import java.util.concurrent.Callable;

public final class ky implements Callable {
    public final jp f27147a;
    public final ci f27148b;

    public ky(jp jpVar, ci ciVar) {
        this.f27147a = jpVar;
        this.f27148b = ciVar;
    }

    private final Void m25079a() {
        if (this.f27147a.f27082l != null) {
            this.f27147a.f27082l.get();
        }
        wz wzVar = this.f27147a.f27081k;
        if (wzVar != null) {
            try {
                synchronized (this.f27148b) {
                    wz wzVar2 = this.f27148b;
                    byte[] a = wz.m24212a(wzVar);
                    wz.m24211a(wzVar2, a, a.length);
                }
            } catch (zzfyy e) {
            }
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return m25079a();
    }
}
