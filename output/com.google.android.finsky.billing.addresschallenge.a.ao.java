package com.google.android.finsky.billing.addresschallenge.a;

public static class com.google.android.finsky.billing.addresschallenge.a.ao extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.a.ao a;
    public static final com.google.android.finsky.billing.addresschallenge.a.ao b;
    public static final ao[] c;

    static {
        com.google.android.finsky.billing.addresschallenge.a.ao.a = new com.google.android.finsky.billing.addresschallenge.a.ao("LATIN", 0);
        com.google.android.finsky.billing.addresschallenge.a.ao.b = new com.google.android.finsky.billing.addresschallenge.a.ao("LOCAL", 1);
        v0 = new ao[2];
        v0[0] = com.google.android.finsky.billing.addresschallenge.a.ao.a;
        v0[1] = com.google.android.finsky.billing.addresschallenge.a.ao.b;
        com.google.android.finsky.billing.addresschallenge.a.ao.c = v0;
    }

    ao(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.billing.addresschallenge.a.ao valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.ao)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.a.ao, p0);
    }

    public static ao[] values() {
        return (ao[])com.google.android.finsky.billing.addresschallenge.a.ao.c.clone();
    }

}
