package com.google.android.finsky.application;

import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;

final class cw implements C1287h {
    public final /* synthetic */ String f7975a;
    public final /* synthetic */ C1475d f7976b;

    cw(C1475d c1475d, String str) {
        this.f7976b = c1475d;
        this.f7975a = str;
    }

    public final C1254c mo2016a(String str) {
        return this.f7976b.mo2047a(str, this.f7975a);
    }

    public final C1254c mo2015a() {
        return this.f7976b.mo2168c(this.f7975a);
    }

    public final C1254c mo2017b() {
        throw new UnsupportedOperationException("Authenticated accounts only for Wear");
    }
}
