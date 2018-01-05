package com.google.android.finsky.installqueue;

import com.google.android.finsky.installer.p208b.p209a.C3312b;

public final class C3361d {
    public C3312b f17256a = new C3312b();
    public TimeWindow f17257b;

    public final C3361d m16793a(int i) {
        C3312b c3312b = this.f17256a;
        c3312b.f17118b |= 1;
        c3312b.f17119c = i;
        return this;
    }

    public final C3361d m16794a(boolean z) {
        C3312b c3312b = this.f17256a;
        c3312b.f17118b |= 2;
        c3312b.f17120d = z;
        return this;
    }

    public final C3361d m16796b(boolean z) {
        C3312b c3312b = this.f17256a;
        c3312b.f17118b |= 4;
        c3312b.f17122f = z;
        return this;
    }

    public final C3361d m16792a() {
        C3312b c3312b = this.f17256a;
        c3312b.f17118b |= 8;
        c3312b.f17123g = 0;
        return this;
    }

    public final C3361d m16795b() {
        C3312b c3312b = this.f17256a;
        c3312b.f17118b |= 16;
        c3312b.f17124h = 0;
        return this;
    }

    public final C3361d m16797c() {
        C3312b c3312b = this.f17256a;
        c3312b.f17118b |= 64;
        c3312b.f17126j = 0;
        return this;
    }

    public final C3361d m16798d() {
        C3312b c3312b = this.f17256a;
        c3312b.f17118b |= 128;
        c3312b.f17127k = 0;
        return this;
    }

    public final InstallConstraint m16799e() {
        return new InstallConstraint(this.f17256a, this.f17257b);
    }
}
