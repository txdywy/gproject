package com.google.android.finsky.billing.addresschallenge.placesapi;

public final class C1757m {
    public final String f9072a;
    public final String f9073b;
    public final C1745a f9074c;

    public C1757m(String str, String str2, C1745a c1745a) {
        this.f9072a = str;
        this.f9073b = str2;
        this.f9074c = c1745a;
    }

    public final String m9658a(StringBuilder stringBuilder) {
        stringBuilder.append("&key=").append(this.f9072a).append("&sensor=true");
        return "https://maps.googleapis.com".concat(stringBuilder.toString());
    }
}
