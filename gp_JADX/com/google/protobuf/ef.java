package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class ef {
    public Unsafe f35389a;

    ef(Unsafe unsafe) {
        this.f35389a = unsafe;
    }

    public abstract byte mo6204a(Object obj, long j);

    public abstract int mo6205a(long j);

    public abstract void mo6206a(long j, byte b);

    public abstract void mo6207a(long j, int i);

    public abstract void mo6208a(Object obj, long j, byte b);

    public abstract void mo6209a(Object obj, long j, double d);

    public abstract void mo6210a(Object obj, long j, float f);

    public abstract void mo6211a(Object obj, long j, boolean z);

    public abstract void mo6212a(byte[] bArr, long j, long j2, long j3);

    public abstract void mo6213b(long j);

    public abstract boolean mo6214b(Object obj, long j);

    public abstract float mo6215c(Object obj, long j);

    public abstract double mo6216d(Object obj, long j);

    public final long m33392a(Field field) {
        return this.f35389a.objectFieldOffset(field);
    }

    public final int m33406e(Object obj, long j) {
        return this.f35389a.getInt(obj, j);
    }

    public final void m33398a(Object obj, long j, int i) {
        this.f35389a.putInt(obj, j, i);
    }

    public final long m33407f(Object obj, long j) {
        return this.f35389a.getLong(obj, j);
    }

    public final void m33399a(Object obj, long j, long j2) {
        this.f35389a.putLong(obj, j, j2);
    }
}
