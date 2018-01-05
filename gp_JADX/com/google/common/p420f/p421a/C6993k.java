package com.google.common.p420f.p421a;

import com.google.common.p414a.C6939o;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class C6993k extends C6984b {
    public static final Unsafe f34430a;
    public static final long f34431b;
    public static final long f34432c;
    public static final long f34433d;
    public static final long f34434e;
    public static final long f34435f;

    C6993k() {
    }

    final void mo5948a(C6995m c6995m, Thread thread) {
        f34430a.putObject(c6995m, f34434e, thread);
    }

    final void mo5947a(C6995m c6995m, C6995m c6995m2) {
        f34430a.putObject(c6995m, f34435f, c6995m2);
    }

    final boolean mo5950a(C6977a c6977a, C6995m c6995m, C6995m c6995m2) {
        return f34430a.compareAndSwapObject(c6977a, f34432c, c6995m, c6995m2);
    }

    final boolean mo5949a(C6977a c6977a, C6989f c6989f, C6989f c6989f2) {
        return f34430a.compareAndSwapObject(c6977a, f34431b, c6989f, c6989f2);
    }

    final boolean mo5951a(C6977a c6977a, Object obj, Object obj2) {
        return f34430a.compareAndSwapObject(c6977a, f34433d, obj, obj2);
    }

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new C6994l());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            Class cls = C6977a.class;
            f34432c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            f34431b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            f34433d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            f34434e = unsafe.objectFieldOffset(C6995m.class.getDeclaredField("thread"));
            f34435f = unsafe.objectFieldOffset(C6995m.class.getDeclaredField("next"));
            f34430a = unsafe;
        } catch (Throwable e3) {
            C6939o.m31642a(e3);
            throw new RuntimeException(e3);
        }
    }
}
