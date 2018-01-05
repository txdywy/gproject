package com.google.android.gms.internal;

import sun.misc.Unsafe;

final class wf extends wg {
    wf(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte mo4944a(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    public final void mo4945a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }
}
