package com.google.protobuf;

import libcore.io.Memory;
import sun.misc.Unsafe;

final class ec extends ef {
    ec(Unsafe unsafe) {
        super(unsafe);
    }

    public final void mo6206a(long j, byte b) {
        Memory.pokeByte((int) (-1 & j), b);
    }

    public final int mo6205a(long j) {
        return Memory.peekInt((int) (-1 & j), false);
    }

    public final void mo6207a(long j, int i) {
        Memory.pokeInt((int) (-1 & j), i, false);
    }

    public final void mo6213b(long j) {
        Memory.pokeLong((int) (-1 & j), -1, false);
    }

    public final byte mo6204a(Object obj, long j) {
        if (ea.f35388l) {
            return ea.m33386g(obj, j);
        }
        return ea.m33387h(obj, j);
    }

    public final void mo6208a(Object obj, long j, byte b) {
        if (ea.f35388l) {
            ea.m33365a(obj, j, b);
        } else {
            ea.m33375b(obj, j, b);
        }
    }

    public final boolean mo6214b(Object obj, long j) {
        if (ea.f35388l) {
            return ea.m33388i(obj, j);
        }
        return ea.m33389j(obj, j);
    }

    public final void mo6211a(Object obj, long j, boolean z) {
        if (ea.f35388l) {
            ea.m33376b(obj, j, z);
        } else {
            ea.m33378c(obj, j, z);
        }
    }

    public final float mo6215c(Object obj, long j) {
        return Float.intBitsToFloat(m33406e(obj, j));
    }

    public final void mo6210a(Object obj, long j, float f) {
        m33398a(obj, j, Float.floatToIntBits(f));
    }

    public final double mo6216d(Object obj, long j) {
        return Double.longBitsToDouble(m33407f(obj, j));
    }

    public final void mo6209a(Object obj, long j, double d) {
        m33399a(obj, j, Double.doubleToLongBits(d));
    }

    public final void mo6212a(byte[] bArr, long j, long j2, long j3) {
        Memory.pokeByteArray((int) (-1 & j2), bArr, (int) j, (int) j3);
    }
}
