package com.google.android.finsky.utils;

enum aq extends an {
    aq(String str) {
        super(str, 2);
    }

    public final long mo4319a(long j) {
        if (j > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (j < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return 1000000 * j;
    }

    public final long mo4321b(long j) {
        if (j > 9223372036854775L) {
            return Long.MAX_VALUE;
        }
        if (j < -9223372036854775L) {
            return Long.MIN_VALUE;
        }
        return 1000 * j;
    }

    public final long mo4322c(long j) {
        return j;
    }

    public final long mo4323d(long j) {
        return j / 1000;
    }

    public final long mo4324e(long j) {
        return j / 1000000;
    }

    public final long mo4320a(long j, an anVar) {
        return anVar.mo4322c(j);
    }
}
