package com.google.android.finsky.installqueue;

import com.google.android.finsky.installer.p208b.p209a.C3311a;
import com.google.android.finsky.installer.p208b.p209a.C3313c;
import com.google.android.finsky.installer.p208b.p209a.C3315e;
import com.google.protobuf.nano.C0757i;

public final class C3370n {
    public final C3315e f17275a;

    public C3370n(C3369m c3369m) {
        this.f17275a = (C3315e) C0757i.m4910b(c3369m.f17273c);
    }

    public C3370n(InstallRequest installRequest) {
        this.f17275a = new C3315e();
        this.f17275a.f17152c = installRequest.f17171a;
        this.f17275a.f17154e = new C3313c();
        this.f17275a.f17156g = new C3311a();
    }

    public final C3369m m16826a() {
        C3315e c3315e = this.f17275a;
        long currentTimeMillis = System.currentTimeMillis();
        c3315e.f17150a |= 1;
        c3315e.f17151b = currentTimeMillis;
        return new C3369m(this.f17275a);
    }

    public final C3370n m16827a(int i) {
        this.f17275a.m16668a(i);
        return this;
    }
}
