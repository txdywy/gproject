package com.google.android.finsky.dy;

import com.google.android.finsky.utils.C4691w;
import java.util.Locale;

public final class C2933o {
    public final byte[] f15555a;
    public final long f15556b;

    public C2933o(byte[] bArr, long j) {
        this.f15555a = bArr;
        this.f15556b = j;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "%s, %d", new Object[]{C4691w.m21842a(this.f15555a), Long.valueOf(this.f15556b)});
    }
}
