package com.google.android.gms.internal;

public enum po implements ve {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    public final int f27321g;

    static {
        pp ppVar = new pp();
    }

    private po(int i) {
        this.f27321g = i;
    }

    public static po m25376a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CURVE;
            case 1:
                return NIST_P224;
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    public final int m25377a() {
        if (this != UNRECOGNIZED) {
            return this.f27321g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
