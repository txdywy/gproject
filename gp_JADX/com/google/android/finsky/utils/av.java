package com.google.android.finsky.utils;

enum av extends an {
    av(String str) {
        super(str, 7);
    }

    public final long mo4319a(long j) {
        if (j > 8589934591L) {
            return Long.MAX_VALUE;
        }
        if (j < -8589934591L) {
            return Long.MIN_VALUE;
        }
        return 1073741824 * j;
    }

    public final long mo4325f(long j) {
        if (j > 8796093022207L) {
            return Long.MAX_VALUE;
        }
        if (j < -8796093022207L) {
            return Long.MIN_VALUE;
        }
        return 1048576 * j;
    }

    public final long mo4326g(long j) {
        if (j > 9007199254740991L) {
            return Long.MAX_VALUE;
        }
        if (j < -9007199254740991L) {
            return Long.MIN_VALUE;
        }
        return 1024 * j;
    }

    public final long mo4327h(long j) {
        return j;
    }

    public final long mo4328i(long j) {
        return j / 1024;
    }

    public final long mo4320a(long j, an anVar) {
        return anVar.mo4327h(j);
    }
}
