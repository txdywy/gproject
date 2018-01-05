package com.google.android.gms.internal;

public enum rf implements ve {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    public final int f27401g;

    static {
        rr rrVar = new rr();
    }

    private rf(int i) {
        this.f27401g = i;
    }

    public static rf m25457a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_KEYMATERIAL;
            case 1:
                return SYMMETRIC;
            case 2:
                return ASYMMETRIC_PRIVATE;
            case 3:
                return ASYMMETRIC_PUBLIC;
            case 4:
                return REMOTE;
            default:
                return null;
        }
    }

    public final int m25458a() {
        if (this != UNRECOGNIZED) {
            return this.f27401g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
