package com.google.android.finsky.utils;

enum at extends an {
    at(String str) {
        super(str, 5);
    }

    public final long mo4319a(long j) {
        if (j > 9007199254740991L) {
            return Long.MAX_VALUE;
        }
        if (j < -9007199254740991L) {
            return Long.MIN_VALUE;
        }
        return 1024 * j;
    }

    public final long mo4325f(long j) {
        return j;
    }

    public final long mo4326g(long j) {
        return j / 1024;
    }

    public final long mo4327h(long j) {
        return j / 1048576;
    }

    public final long mo4328i(long j) {
        return j / 1073741824;
    }

    public final long mo4320a(long j, an anVar) {
        return anVar.mo4325f(j);
    }
}
