package com.google.android.finsky.by.p132a;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public final class C2217p {
    public final Handler f11064a;
    public final Handler f11065b;
    public final al f11066c;
    public final C2198a f11067d;
    public final List f11068e = new ArrayList();
    public int f11069f = 0;

    public C2217p(al alVar, C2198a c2198a, Handler handler, Handler handler2) {
        this.f11066c = alVar;
        this.f11067d = c2198a;
        this.f11064a = handler2;
        this.f11065b = handler;
    }

    public final synchronized void m11620a(Runnable runnable) {
        this.f11068e.add(runnable);
        this.f11064a.post(new C2218q(this));
    }
}
