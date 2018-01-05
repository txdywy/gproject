package com.google.android.finsky.notification;

import com.google.android.finsky.utils.C4678i;

public final class C3782f {
    public final C3783g f18988a;

    C3782f(String str, String str2, String str3, int i) {
        this.f18988a = new C3783g();
        this.f18988a.f18989a = str;
        this.f18988a.f18991c = str2;
        this.f18988a.f18992d = str3;
        this.f18988a.f18993e = i;
        this.f18988a.f18995g = C4678i.m21812a();
        this.f18988a.f18996h = 0;
    }

    C3782f(C3783g c3783g) {
        this.f18988a = new C3783g(c3783g);
    }

    public final C3782f m18037a(String str) {
        this.f18988a.f18990b = str;
        return this;
    }

    public final C3782f m18035a(C3816o c3816o) {
        this.f18988a.f18994f = c3816o;
        return this;
    }

    public final C3782f m18033a(long j) {
        this.f18988a.f18995g = j;
        return this;
    }

    public final C3782f m18032a(int i) {
        this.f18988a.f18996h = i;
        return this;
    }

    public final C3782f m18036a(C3820u c3820u) {
        this.f18988a.f18997i = c3820u;
        return this;
    }

    public final C3782f m18041b(C3820u c3820u) {
        this.f18988a.f18998j = c3820u;
        return this;
    }

    public final C3782f m18034a(C3778a c3778a) {
        this.f18988a.f18999k = c3778a;
        return this;
    }

    public final C3782f m18040b(C3778a c3778a) {
        this.f18988a.f19000l = c3778a;
        return this;
    }

    public final C3782f m18039b(int i) {
        this.f18988a.f19001m = Integer.valueOf(i);
        return this;
    }

    public final C3782f m18038a(byte[] bArr) {
        this.f18988a.f19002n = bArr;
        return this;
    }

    public final C3781e m18031a() {
        return new C3781e(this.f18988a);
    }
}
