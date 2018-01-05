package com.google.android.finsky.billing.addresschallenge.a;

public static class com.google.android.finsky.billing.addresschallenge.a.e extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.a.e a;
    public static final com.google.android.finsky.billing.addresschallenge.a.e b;
    public static final com.google.android.finsky.billing.addresschallenge.a.e c;
    public static final com.google.android.finsky.billing.addresschallenge.a.e d;
    public static final com.google.android.finsky.billing.addresschallenge.a.e e;
    public static final e[] f;

    static {
        com.google.android.finsky.billing.addresschallenge.a.e.a = new com.google.android.finsky.billing.addresschallenge.a.e("USING_UNUSED_FIELD", 0);
        com.google.android.finsky.billing.addresschallenge.a.e.b = new com.google.android.finsky.billing.addresschallenge.a.e("MISSING_REQUIRED_FIELD", 1);
        com.google.android.finsky.billing.addresschallenge.a.e.c = new com.google.android.finsky.billing.addresschallenge.a.e("UNKNOWN_VALUE", 2);
        com.google.android.finsky.billing.addresschallenge.a.e.d = new com.google.android.finsky.billing.addresschallenge.a.e("UNRECOGNIZED_FORMAT", 3);
        com.google.android.finsky.billing.addresschallenge.a.e.e = new com.google.android.finsky.billing.addresschallenge.a.e("MISMATCHING_VALUE", 4);
        v0 = new e[5];
        v0[0] = com.google.android.finsky.billing.addresschallenge.a.e.a;
        v0[1] = com.google.android.finsky.billing.addresschallenge.a.e.b;
        v0[2] = com.google.android.finsky.billing.addresschallenge.a.e.c;
        v0[3] = com.google.android.finsky.billing.addresschallenge.a.e.d;
        v0[4] = com.google.android.finsky.billing.addresschallenge.a.e.e;
        com.google.android.finsky.billing.addresschallenge.a.e.f = v0;
    }

    e(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.billing.addresschallenge.a.e valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.e)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.a.e, p0);
    }

    public static e[] values() {
        return (e[])com.google.android.finsky.billing.addresschallenge.a.e.f.clone();
    }

}
