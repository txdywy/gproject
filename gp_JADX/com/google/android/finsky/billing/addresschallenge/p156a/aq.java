package com.google.android.finsky.billing.addresschallenge.p156a;

final class aq {
    public String f8849a;
    public String f8850b;

    aq() {
    }

    aq(aq aqVar) {
        az.m9577a((Object) aqVar);
        this.f8849a = aqVar.f8849a;
        this.f8850b = aqVar.f8850b;
    }

    public final String m9559a() {
        return this.f8850b != null ? this.f8850b : this.f8849a;
    }

    final boolean m9560a(String str) {
        if (str == null) {
            return false;
        }
        if (str.equalsIgnoreCase(this.f8849a) || str.equalsIgnoreCase(this.f8850b)) {
            return true;
        }
        return false;
    }
}
