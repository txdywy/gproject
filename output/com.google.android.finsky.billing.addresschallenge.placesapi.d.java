package com.google.android.finsky.billing.addresschallenge.placesapi;

public static class com.google.android.finsky.billing.addresschallenge.placesapi.d extends Enum
{

    public static final com.google.android.finsky.billing.addresschallenge.placesapi.d a;
    public static final com.google.android.finsky.billing.addresschallenge.placesapi.d b;
    public static final com.google.android.finsky.billing.addresschallenge.placesapi.d c;
    public static final com.google.android.finsky.billing.addresschallenge.placesapi.d d;
    public static final com.google.android.finsky.billing.addresschallenge.placesapi.d e;
    public static final com.google.android.finsky.billing.addresschallenge.placesapi.d f;
    public static final com.google.android.finsky.billing.addresschallenge.placesapi.d g;
    public static final d[] i;
    public final String h;

    static {
        com.google.android.finsky.billing.addresschallenge.placesapi.d.a = new com.google.android.finsky.billing.addresschallenge.placesapi.d("ADR_STREET_ADDRESS", 0, "street-address");
        com.google.android.finsky.billing.addresschallenge.placesapi.d.b = new com.google.android.finsky.billing.addresschallenge.placesapi.d("ADR_EXTENDED_ADDRESS", 1, "extended-address");
        com.google.android.finsky.billing.addresschallenge.placesapi.d.c = new com.google.android.finsky.billing.addresschallenge.placesapi.d("ADR_LOCALITY", 2, "locality");
        com.google.android.finsky.billing.addresschallenge.placesapi.d.d = new com.google.android.finsky.billing.addresschallenge.placesapi.d("ADR_REGION", 3, "region");
        com.google.android.finsky.billing.addresschallenge.placesapi.d.e = new com.google.android.finsky.billing.addresschallenge.placesapi.d("ADR_POSTAL_CODE", 4, "postal-code");
        com.google.android.finsky.billing.addresschallenge.placesapi.d.f = new com.google.android.finsky.billing.addresschallenge.placesapi.d("UNKNOWN", 5, 0);
        com.google.android.finsky.billing.addresschallenge.placesapi.d.g = new com.google.android.finsky.billing.addresschallenge.placesapi.d("SEPARATOR", 6, 0);
        v0 = new d[7];
        v0[0] = com.google.android.finsky.billing.addresschallenge.placesapi.d.a;
        v0[1] = com.google.android.finsky.billing.addresschallenge.placesapi.d.b;
        v0[2] = com.google.android.finsky.billing.addresschallenge.placesapi.d.c;
        v0[3] = com.google.android.finsky.billing.addresschallenge.placesapi.d.d;
        v0[4] = com.google.android.finsky.billing.addresschallenge.placesapi.d.e;
        v0[5] = com.google.android.finsky.billing.addresschallenge.placesapi.d.f;
        v0[6] = com.google.android.finsky.billing.addresschallenge.placesapi.d.g;
        com.google.android.finsky.billing.addresschallenge.placesapi.d.i = v0;
    }

    d(String p0, int p1, String p2) {
        Enum(p0, p1);
        this.h = p2;
    }

    public static com.google.android.finsky.billing.addresschallenge.placesapi.d valueOf(String p0) {
        return (com.google.android.finsky.billing.addresschallenge.placesapi.d)Enum.valueOf(com.google.android.finsky.billing.addresschallenge.placesapi.d, p0);
    }

    public static d[] values() {
        return (d[])com.google.android.finsky.billing.addresschallenge.placesapi.d.i.clone();
    }

}
