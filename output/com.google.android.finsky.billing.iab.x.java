package com.google.android.finsky.billing.iab;

public final class com.google.android.finsky.billing.iab.x extends Enum
{

    public static final com.google.android.finsky.billing.iab.x a;
    public static final com.google.android.finsky.billing.iab.x b;
    public static final com.google.android.finsky.billing.iab.x c;
    public static final com.google.android.finsky.billing.iab.x d;
    public static final com.google.android.finsky.billing.iab.x e;
    public static final com.google.android.finsky.billing.iab.x f;
    public static final com.google.android.finsky.billing.iab.x g;
    public static final com.google.android.finsky.billing.iab.x h;
    public static final com.google.android.finsky.billing.iab.x i;
    public static final com.google.android.finsky.billing.iab.x j;
    public static final com.google.android.finsky.billing.iab.x k;
    public static final x[] m;
    public final int l;

    static {
        com.google.android.finsky.billing.iab.x.a = new com.google.android.finsky.billing.iab.x("RESULT_OK", 0, 0);
        com.google.android.finsky.billing.iab.x.b = new com.google.android.finsky.billing.iab.x("RESULT_USER_CANCELED", 1, 1);
        com.google.android.finsky.billing.iab.x.c = new com.google.android.finsky.billing.iab.x("RESULT_SERVICE_UNAVAILABLE", 2, 2);
        com.google.android.finsky.billing.iab.x.d = new com.google.android.finsky.billing.iab.x("RESULT_BILLING_UNAVAILABLE", 3, 3);
        com.google.android.finsky.billing.iab.x.e = new com.google.android.finsky.billing.iab.x("RESULT_ITEM_UNAVAILABLE", 4, 4);
        com.google.android.finsky.billing.iab.x.f = new com.google.android.finsky.billing.iab.x("RESULT_DEVELOPER_ERROR", 5, 5);
        com.google.android.finsky.billing.iab.x.g = new com.google.android.finsky.billing.iab.x("RESULT_ERROR", 6, 6);
        com.google.android.finsky.billing.iab.x.h = new com.google.android.finsky.billing.iab.x("RESULT_ITEM_ALREADY_OWNED", 7, 7);
        com.google.android.finsky.billing.iab.x.i = new com.google.android.finsky.billing.iab.x("RESULT_ITEM_NOT_OWNED", 8, 8);
        com.google.android.finsky.billing.iab.x.j = new com.google.android.finsky.billing.iab.x("RESULT_PROMO_ELIGIBLE", 9, 9);
        com.google.android.finsky.billing.iab.x.k = new com.google.android.finsky.billing.iab.x("RESULT_NOT_PROMO_ELIGIBLE", 10, 10);
        v0 = new x[11];
        v0[0] = com.google.android.finsky.billing.iab.x.a;
        v0[1] = com.google.android.finsky.billing.iab.x.b;
        v0[2] = com.google.android.finsky.billing.iab.x.c;
        v0[3] = com.google.android.finsky.billing.iab.x.d;
        v0[4] = com.google.android.finsky.billing.iab.x.e;
        v0[5] = com.google.android.finsky.billing.iab.x.f;
        v0[6] = com.google.android.finsky.billing.iab.x.g;
        v0[7] = com.google.android.finsky.billing.iab.x.h;
        v0[8] = com.google.android.finsky.billing.iab.x.i;
        v0[9] = com.google.android.finsky.billing.iab.x.j;
        v0[10] = com.google.android.finsky.billing.iab.x.k;
        com.google.android.finsky.billing.iab.x.m = v0;
    }

    x(String p0, int p1, int p2) {
        Enum(p0, p1);
        this.l = p2;
    }

    public static com.google.android.finsky.billing.iab.x valueOf(String p0) {
        return (com.google.android.finsky.billing.iab.x)Enum.valueOf(com.google.android.finsky.billing.iab.x, p0);
    }

    public static x[] values() {
        return (x[])com.google.android.finsky.billing.iab.x.m.clone();
    }

    public final String toString() {
        return super.toString() + 40 + this.l + 41;
    }

}
