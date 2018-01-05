package com.google.android.gms.internal;

public enum pm implements ve {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    
    public final int f27313e;

    static {
        pn pnVar = new pn();
    }

    private pm(int i) {
        this.f27313e = i;
    }

    public static pm m25374a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
            default:
                return null;
        }
    }

    public final int m25375a() {
        if (this != UNRECOGNIZED) {
            return this.f27313e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
