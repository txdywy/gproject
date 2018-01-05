package com.google.common.p420f.p421a;

final class C6992i extends C6984b {
    C6992i() {
    }

    final void mo5948a(C6995m c6995m, Thread thread) {
        c6995m.thread = thread;
    }

    final void mo5947a(C6995m c6995m, C6995m c6995m2) {
        c6995m.next = c6995m2;
    }

    final boolean mo5950a(C6977a c6977a, C6995m c6995m, C6995m c6995m2) {
        boolean z;
        synchronized (c6977a) {
            if (c6977a.waiters == c6995m) {
                c6977a.waiters = c6995m2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    final boolean mo5949a(C6977a c6977a, C6989f c6989f, C6989f c6989f2) {
        boolean z;
        synchronized (c6977a) {
            if (c6977a.listeners == c6989f) {
                c6977a.listeners = c6989f2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    final boolean mo5951a(C6977a c6977a, Object obj, Object obj2) {
        boolean z;
        synchronized (c6977a) {
            if (c6977a.value == obj) {
                c6977a.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
