package com.google.android.gms.internal;

public enum rs implements ve {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public final int f27435f;

    static {
        rt rtVar = new rt();
    }

    private rs(int i) {
        this.f27435f = i;
    }

    public static rs m25483a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
            default:
                return null;
        }
    }

    public final int m25484a() {
        if (this != UNRECOGNIZED) {
            return this.f27435f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
