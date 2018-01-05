package com.google.android.finsky.utils;

enum aw extends an {
    aw(String str) {
        super(str, 8);
    }

    public final long mo4319a(long j) {
        if (j > 8388607) {
            return Long.MAX_VALUE;
        }
        if (j < -8388607) {
            return Long.MIN_VALUE;
        }
        return 1099511627776L * j;
    }

    public final long mo4325f(long j) {
        if (j > 8589934591L) {
            return Long.MAX_VALUE;
        }
        if (j < -8589934591L) {
            return Long.MIN_VALUE;
        }
        return 1073741824 * j;
    }

    public final long mo4326g(long j) {
        if (j > 8796093022207L) {
            return Long.MAX_VALUE;
        }
        if (j < -8796093022207L) {
            return Long.MIN_VALUE;
        }
        return 1048576 * j;
    }

    public final long mo4327h(long j) {
        if (j > 9007199254740991L) {
            return Long.MAX_VALUE;
        }
        if (j < -9007199254740991L) {
            return Long.MIN_VALUE;
        }
        return 1024 * j;
    }

    public final long mo4328i(long j) {
        return j;
    }

    public final long mo4320a(long j, an anVar) {
        return anVar.mo4328i(j);
    }
}
