package com.google.common.p420f.p421a;

import com.google.common.p414a.C6937m;
import java.util.concurrent.Callable;

final class bh extends as {
    public final Callable f34412c;
    public final /* synthetic */ bg f34413d;

    bh(bg bgVar, Callable callable) {
        this.f34413d = bgVar;
        this.f34412c = (Callable) C6937m.m31623a((Object) callable);
    }

    final boolean mo5945a() {
        return this.f34413d.isDone();
    }

    final Object mo5946b() {
        return this.f34412c.call();
    }

    final void mo5944a(Object obj, Throwable th) {
        if (th == null) {
            this.f34413d.mo5942a(obj);
        } else {
            this.f34413d.mo5943a(th);
        }
    }

    public final String toString() {
        return this.f34412c.toString();
    }
}
