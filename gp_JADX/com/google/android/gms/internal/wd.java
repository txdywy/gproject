package com.google.android.gms.internal;

import sun.misc.Unsafe;

final class wd extends wg {
    wd(Unsafe unsafe) {
        super(unsafe);
    }

    public final byte mo4944a(Object obj, long j) {
        return wc.f27599k ? ((byte) (wc.m25832c(obj, -4 & j) >>> ((int) (((-1 ^ j) & 3) << 3)))) : ((byte) (wc.m25832c(obj, -4 & j) >>> ((int) ((3 & j) << 3))));
    }

    public final void mo4945a(Object obj, long j, byte b) {
        if (wc.f27599k) {
            wc.m25825a(obj, j, b);
        } else {
            wc.m25830b(obj, j, b);
        }
    }
}
