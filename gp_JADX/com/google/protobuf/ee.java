package com.google.protobuf;

import sun.misc.Unsafe;

final class ee extends ef {
    ee(Unsafe unsafe) {
        super(unsafe);
    }

    public final void mo6206a(long j, byte b) {
        this.a.putByte(j, b);
    }

    public final int mo6205a(long j) {
        return this.a.getInt(j);
    }

    public final void mo6207a(long j, int i) {
        this.a.putInt(j, i);
    }

    public final void mo6213b(long j) {
        this.a.putLong(j, -1);
    }

    public final byte mo6204a(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public final void mo6208a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    public final boolean mo6214b(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    public final void mo6211a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    public final float mo6215c(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    public final void mo6210a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }

    public final double mo6216d(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    public final void mo6209a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    public final void mo6212a(byte[] bArr, long j, long j2, long j3) {
        this.a.copyMemory(bArr, ea.f35386j + j, null, j2, j3);
    }
}
