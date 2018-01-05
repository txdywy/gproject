package com.google.android.gms.internal;

public final class ek {
    public long f26736a;

    public ek() {
        this((byte) 0);
    }

    private ek(byte b) {
        this.f26736a = -1;
    }

    public final long m24338a() {
        if (this.f26736a == -1) {
            return System.nanoTime();
        }
        try {
            long j = this.f26736a;
            return j;
        } finally {
            this.f26736a = -1;
        }
    }
}
