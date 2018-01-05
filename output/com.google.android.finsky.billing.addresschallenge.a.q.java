package com.google.android.finsky.billing.addresschallenge.a;

public static class com.google.android.finsky.billing.addresschallenge.a.q extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.a.q a;
    public static final com.google.android.finsky.billing.addresschallenge.a.q b;
    public static final q[] c;

    static {
        com.google.android.finsky.billing.addresschallenge.a.q.a = new com.google.android.finsky.billing.addresschallenge.a.q("ZIP", 0);
        com.google.android.finsky.billing.addresschallenge.a.q.b = new com.google.android.finsky.billing.addresschallenge.a.q("POSTAL", 1);
        v0 = new q[2];
        v0[0] = com.google.android.finsky.billing.addresschallenge.a.q.a;
        v0[1] = com.google.android.finsky.billing.addresschallenge.a.q.b;
        com.google.android.finsky.billing.addresschallenge.a.q.c = v0;
    }

    q(String p0, int p1) {
        Enum(p0, p1);
    }

    public static com.google.android.finsky.billing.addresschallenge.a.q valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.a.q)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.a.q, p0);
    }

    public static q[] values() {
        return (q[])com.google.android.finsky.billing.addresschallenge.a.q.c.clone();
    }

}
