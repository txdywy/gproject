package com.google.android.finsky.ba.p129a;

import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.utils.FinskyLog;

public final class C1555e extends C1553c {
    public static final long[] f8335k = new long[]{12603301, 12603329, 12603516, 12604154, 12607073};

    public C1555e(String str, C0986a c0986a, C1549f... c1549fArr) {
        super(str, c0986a, c1549fArr);
    }

    public final synchronized boolean mo2294a(long j) {
        boolean z = true;
        synchronized (this) {
            for (long j2 : f8335k) {
                if (j == j2) {
                    FinskyLog.m21659a("Target id: \"%s\" enabled by default on SW", Long.valueOf(j));
                    break;
                }
            }
            z = super.mo2294a(j);
        }
        return z;
    }
}
