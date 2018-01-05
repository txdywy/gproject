package com.google.android.gms.internal;

final /* synthetic */ class rx {
    public static final /* synthetic */ int[] f27443a = new int[po.values().length];
    public static final /* synthetic */ int[] f27444b = new int[pq.values().length];
    public static final /* synthetic */ int[] f27445c = new int[pm.values().length];

    static {
        try {
            f27445c[pm.COMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f27445c[pm.UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f27444b[pq.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f27444b[pq.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f27444b[pq.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f27443a[po.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f27443a[po.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
        }
        try {
            f27443a[po.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
        }
    }
}
