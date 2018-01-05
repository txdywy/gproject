package com.google.android.wallet.ui.common;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class bb {
    public static int f33550a = 1;
    public AtomicInteger f33551b = new AtomicInteger();
    public ArrayList f33552c;
    public int f33553d = -1;
    public boolean f33554e = false;

    public bb(ArrayList arrayList, boolean z) {
        this.f33552c = arrayList;
        m30737a(0);
        this.f33554e = z;
    }

    public final synchronized int m30742a() {
        if (this.f33551b.get() == ((Integer) this.f33552c.get(this.f33553d)).intValue() + 32) {
            m30737a(this.f33553d + 1);
        }
        return this.f33551b.getAndIncrement();
    }

    public final synchronized void m30744b() {
        if (this.f33554e) {
            m30737a(0);
        } else {
            throw new IllegalStateException("Cannot be called on non-resettable IdGenerator.");
        }
    }

    public final void m30743a(Bundle bundle) {
        bundle.putIntegerArrayList("idGenerator.startingIdList", this.f33552c);
        bundle.putBoolean("idGenerator.isResettable", this.f33554e);
    }

    private final void m30737a(int i) {
        if (i >= this.f33552c.size()) {
            i = this.f33552c.size();
            this.f33552c.add(Integer.valueOf(m30741e()));
        }
        this.f33551b.set(((Integer) this.f33552c.get(i)).intValue());
        this.f33553d = i;
    }

    public static bb m30739c() {
        return new bb(new ArrayList(2), false);
    }

    public static bb m30738b(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("idGenerator.startingIdList")) {
            return null;
        }
        return new bb(bundle.getIntegerArrayList("idGenerator.startingIdList"), bundle.getBoolean("idGenerator.isResettable", false));
    }

    private static synchronized void m30740d() {
        synchronized (bb.class) {
            f33550a = 1;
        }
    }

    private static synchronized int m30741e() {
        int i;
        synchronized (bb.class) {
            if (f33550a > 16777184) {
                m30740d();
            }
            i = f33550a;
            f33550a += 32;
        }
        return i;
    }
}
