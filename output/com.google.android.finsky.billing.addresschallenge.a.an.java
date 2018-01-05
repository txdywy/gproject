package com.google.android.finsky.billing.addresschallenge.a;

public static class com.google.android.finsky.billing.addresschallenge.a.an extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.a.an a;
    public static final com.google.android.finsky.billing.addresschallenge.a.an b;
    public static final an[] c;

    static {
        com.google.android.finsky.billing.addresschallenge.a.an.a = new com.google.android.finsky.billing.addresschallenge.a.an("DATA", 0);
        com.google.android.finsky.billing.addresschallenge.a.an.b = new com.google.android.finsky.billing.addresschallenge.a.an("EXAMPLES", 1);
        v0 = new an[2];
        v0[0] = com.google.android.finsky.billing.addresschallenge.a.an.a;
        v0[1] = com.google.android.finsky.billing.addresschallenge.a.an.b;
        com.google.android.finsky.billing.addresschallenge.a.an.c = v0;
    }

    an(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.billing.addresschallenge.a.an valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.an)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.a.an, p0);
    }

    public static an[] values() {
        return (an[])com.google.android.finsky.billing.addresschallenge.a.an.c.clone();
    }

}
