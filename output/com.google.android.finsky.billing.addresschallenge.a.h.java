package com.google.android.finsky.billing.addresschallenge.a;

public static class com.google.android.finsky.billing.addresschallenge.a.h extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.a.h a;
    public static final com.google.android.finsky.billing.addresschallenge.a.h b;
    public static final h[] c;

    static {
        com.google.android.finsky.billing.addresschallenge.a.h.a = new com.google.android.finsky.billing.addresschallenge.a.h("EDIT", 0);
        com.google.android.finsky.billing.addresschallenge.a.h.b = new com.google.android.finsky.billing.addresschallenge.a.h("SPINNER", 1);
        v0 = new h[2];
        v0[0] = com.google.android.finsky.billing.addresschallenge.a.h.a;
        v0[1] = com.google.android.finsky.billing.addresschallenge.a.h.b;
        com.google.android.finsky.billing.addresschallenge.a.h.c = v0;
    }

    h(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.billing.addresschallenge.a.h valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.h)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.a.h, p0);
    }

    public static h[] values() {
        return (h[])com.google.android.finsky.billing.addresschallenge.a.h.c.clone();
    }

}
