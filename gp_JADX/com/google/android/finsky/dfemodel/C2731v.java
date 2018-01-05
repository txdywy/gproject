package com.google.android.finsky.dfemodel;

public enum C2731v {
    PURCHASE,
    RENTAL,
    HIGH_DEF,
    PURCHASE_HIGH_DEF,
    RENTAL_HIGH_DEF;

    public final boolean m14768a(int i) {
        switch (ordinal()) {
            case 0:
                if (i == 1 || i == 7) {
                    return true;
                }
                return false;
            case 1:
                if (i == 3 || i == 4) {
                    return true;
                }
                return false;
            case 2:
                if (i == 7 || i == 4) {
                    return true;
                }
                return false;
            case 3:
                if (i == 7) {
                    return true;
                }
                return false;
            case 4:
                return i == 4;
            default:
                throw new IllegalArgumentException();
        }
    }
}
