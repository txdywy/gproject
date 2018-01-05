package com.google.android.gms.internal;

public enum ru implements ve {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    UNRECOGNIZED(-1);
    
    public final int f27442f;

    static {
        rv rvVar = new rv();
    }

    private ru(int i) {
        this.f27442f = i;
    }

    public static ru m25485a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PREFIX;
            case 1:
                return TINK;
            case 2:
                return LEGACY;
            case 3:
                return RAW;
            default:
                return null;
        }
    }

    public final int m25486a() {
        if (this != UNRECOGNIZED) {
            return this.f27442f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
