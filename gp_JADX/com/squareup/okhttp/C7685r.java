package com.squareup.okhttp;

import java.util.ArrayDeque;
import java.util.Deque;

public final class C7685r {
    public final Deque f39788a = new ArrayDeque();

    public C7685r() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque = new ArrayDeque();
    }

    final synchronized void m37008a(C7605f c7605f) {
        this.f39788a.add(c7605f);
    }

    final synchronized void m37009b(C7605f c7605f) {
        if (!this.f39788a.remove(c7605f)) {
            throw new AssertionError("Call wasn't in-flight!");
        }
    }
}
