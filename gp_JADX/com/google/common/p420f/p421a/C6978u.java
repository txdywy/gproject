package com.google.common.p420f.p421a;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class C6978u {
    public static final C7000v f34375e;
    public static final Logger f34376f = Logger.getLogger(C6978u.class.getName());
    public volatile int remaining;
    public volatile Set seenExceptions = null;

    C6978u(int i) {
        this.remaining = i;
    }

    abstract void mo5928a(Set set);

    static {
        C7000v c7001w;
        Throwable th = null;
        try {
            c7001w = new C7001w(AtomicReferenceFieldUpdater.newUpdater(C6978u.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(C6978u.class, "remaining"));
        } catch (Throwable th2) {
            th = th2;
            c7001w = new C7002x();
        }
        f34375e = c7001w;
        if (th != null) {
            f34376f.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }
}
