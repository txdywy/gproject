package com.google.android.finsky.billing.acquire;

public final class com.google.android.finsky.billing.acquire.g extends Enum
{

    public static final com.google.android.finsky.billing.acquire.g a;
    public static final com.google.android.finsky.billing.acquire.g b;
    public static final com.google.android.finsky.billing.acquire.g c;
    public static final g[] e;
    public final int d;

    static {
        com.google.android.finsky.billing.acquire.g.a = new com.google.android.finsky.billing.acquire.g("RESULT_OK", 0, 0);
        com.google.android.finsky.billing.acquire.g.b = new com.google.android.finsky.billing.acquire.g("RESULT_USER_CANCELED", 1, 1);
        com.google.android.finsky.billing.acquire.g.c = new com.google.android.finsky.billing.acquire.g("RESULT_SERVICE_UNAVAILABLE", 2, 2);
        v0 = new g[3];
        v0[0] = com.google.android.finsky.billing.acquire.g.a;
        v0[1] = com.google.android.finsky.billing.acquire.g.b;
        v0[2] = com.google.android.finsky.billing.acquire.g.c;
        com.google.android.finsky.billing.acquire.g.e = v0;
    }

    g(String p0, int p1, int p2) {
        Enum(p0, p1);
        this.d = p2;
    }

    public static com.google.android.finsky.billing.acquire.g valueOf(String p0) {
        return (com.google.android.finsky.billing.acquire.g)Enum.valueOf(com.google.android.finsky.billing.acquire.g, p0);
    }

    public static g[] values() {
        return (g[])com.google.android.finsky.billing.acquire.g.e.clone();
    }

    public final String toString() {
        return super.toString() + 40 + this.d + 41;
    }

}
