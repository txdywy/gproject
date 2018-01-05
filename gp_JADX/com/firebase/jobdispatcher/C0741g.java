package com.firebase.jobdispatcher;

public final class C0741g {
    public final C0736c f4680a;
    public final ValidationEnforcer f4681b;

    public C0741g(C0736c c0736c) {
        this.f4680a = c0736c;
        this.f4681b = new ValidationEnforcer(c0736c.mo1115b());
        an anVar = new an();
    }

    public final int m4844a(C0752t c0752t) {
        this.f4680a.mo1116c();
        return this.f4680a.mo1114a(c0752t);
    }

    public final int m4843a() {
        this.f4680a.mo1116c();
        return this.f4680a.mo1113a();
    }

    public final C0753u m4845b() {
        return new C0753u(this.f4681b);
    }
}
