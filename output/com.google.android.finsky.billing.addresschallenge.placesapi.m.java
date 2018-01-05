package com.google.android.finsky.billing.addresschallenge.placesapi;

public final class com.google.android.finsky.billing.addresschallenge.placesapi.m
{

    public final String a;
    public final String b;
    public final com.google.android.finsky.billing.addresschallenge.placesapi.a c;

    m(String p0, String p1, com.google.android.finsky.billing.addresschallenge.placesapi.a p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final String a(StringBuilder p0) {
        p0.append("&key=").append(this.a).append("&sensor=true");
        return "https://maps.googleapis.com".concat(p0.toString());
    }

}
