package com.google.android.gms.peerdownloadmanager.comms.rpc;

import java.util.HashSet;

public final class C5462f {
    public final Object f28188a = new Object();
    public final HashSet f28189b = new HashSet();

    public final HashSet m26327a() {
        HashSet hashSet;
        synchronized (this.f28188a) {
            hashSet = new HashSet(this.f28189b);
        }
        return hashSet;
    }

    public final void m26328a(C5436b c5436b) {
        synchronized (this.f28188a) {
            this.f28189b.add(c5436b);
        }
    }

    public final void m26329b(C5436b c5436b) {
        synchronized (this.f28188a) {
            this.f28189b.remove(c5436b);
        }
    }
}
