package com.google.android.finsky.billing.addresschallenge.a;

final class com.google.android.finsky.billing.addresschallenge.a.aq
{

    public String a;
    public String b;

    aq() {
    }

    aq(com.google.android.finsky.billing.addresschallenge.a.aq p0) {
        com.google.android.finsky.billing.addresschallenge.a.az.a(p0);
        this.a = p0.a;
        this.b = p0.b;
    }

    public final String a() {
        if (this.b != 0)
            v0 = this.b;
        else
            v0 = this.a;
        return v0;
    }

    final boolean a(String p0) {
        v0 = 0;
        if (p0 != 0 && ((p0.equalsIgnoreCase(this.a)) || p0.equalsIgnoreCase(this.b)))
            v0 = 1;
        return v0;
    }

}
