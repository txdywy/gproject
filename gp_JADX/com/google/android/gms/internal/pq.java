package com.google.android.gms.internal;

public enum pq implements ve {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public final int f27329g;

    static {
        pr prVar = new pr();
    }

    private pq(int i) {
        this.f27329g = i;
    }

    public static pq m25378a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_HASH;
            case 1:
                return SHA1;
            case 2:
                return SHA224;
            case 3:
                return SHA256;
            case 4:
                return SHA512;
            default:
                return null;
        }
    }

    public final int m25379a() {
        if (this != UNRECOGNIZED) {
            return this.f27329g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
