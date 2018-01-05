package com.google.android.finsky.billing.addresschallenge.p156a;

import java.io.Serializable;

public final class C1704a implements Serializable {
    public final String f8784a;
    public final String f8785b;
    public final String f8786c;
    public final String f8787d;
    public final String f8788e;
    public final String f8789f;
    public final String f8790g;
    public final String f8791h;
    public final String f8792i;
    public final String f8793j;
    public final String f8794k;

    C1704a(C1707b c1707b) {
        this.f8784a = (String) c1707b.f8914a.get(C1709d.COUNTRY);
        this.f8787d = (String) c1707b.f8914a.get(C1709d.ADMIN_AREA);
        this.f8788e = (String) c1707b.f8914a.get(C1709d.LOCALITY);
        this.f8789f = (String) c1707b.f8914a.get(C1709d.DEPENDENT_LOCALITY);
        this.f8790g = (String) c1707b.f8914a.get(C1709d.POSTAL_CODE);
        this.f8791h = (String) c1707b.f8914a.get(C1709d.SORTING_CODE);
        this.f8792i = (String) c1707b.f8914a.get(C1709d.ORGANIZATION);
        this.f8793j = (String) c1707b.f8914a.get(C1709d.RECIPIENT);
        this.f8785b = (String) c1707b.f8914a.get(C1709d.ADDRESS_LINE_1);
        this.f8786c = (String) c1707b.f8914a.get(C1709d.ADDRESS_LINE_2);
        this.f8794k = c1707b.f8915b;
    }

    public final String m9517a(C1709d c1709d) {
        switch (c1709d.ordinal()) {
            case 0:
                return this.f8787d;
            case 1:
                return this.f8788e;
            case 2:
                return this.f8793j;
            case 3:
                return this.f8792i;
            case 4:
                return this.f8785b;
            case 5:
                return this.f8786c;
            case 6:
                return this.f8789f;
            case 7:
                return this.f8790g;
            case 8:
                return this.f8791h;
            case 10:
                return this.f8784a;
            default:
                String valueOf = String.valueOf(c1709d);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("unrecognized key: ").append(valueOf).toString());
        }
    }
}
