package com.google.android.finsky.utils;

enum ap extends an {
    ap(String str) {
        super(str, 1);
    }

    public final long mo4319a(long j) {
        if (j > 9223372036854775L) {
            return Long.MAX_VALUE;
        }
        if (j < -9223372036854775L) {
            return Long.MIN_VALUE;
        }
        return 1000 * j;
    }

    public final long mo4321b(long j) {
        return j;
    }

    public final long mo4322c(long j) {
        return j / 1000;
    }

    public final long mo4323d(long j) {
        return j / 1000000;
    }

    public final long mo4324e(long j) {
        return j / 1000000000;
    }

    public final long mo4320a(long j, an anVar) {
        return anVar.mo4321b(j);
    }
}
