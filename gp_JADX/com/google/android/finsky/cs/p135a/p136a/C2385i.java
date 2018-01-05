package com.google.android.finsky.cs.p135a.p136a;

import com.google.android.finsky.cs.p135a.C2384l;
import com.google.android.gms.phenotype.core.C5530i;

public final class C2385i extends C2384l {
    public final C5530i f11663a;
    public final int f11664b;

    public C2385i(C5530i c5530i) {
        this.f11663a = c5530i;
        switch (c5530i.f28388g) {
            case 1:
                this.f11664b = 2;
                return;
            case 2:
                this.f11664b = 3;
                return;
            case 3:
                this.f11664b = 4;
                return;
            case 4:
                this.f11664b = 5;
                return;
            case 5:
                this.f11664b = 6;
                return;
            default:
                this.f11664b = 1;
                return;
        }
    }

    public final String mo2889a() {
        return this.f11663a.f28382a;
    }

    public final long mo2890b() {
        return this.f11663a.m26469a();
    }

    public final boolean mo2891c() {
        return this.f11663a.m26471b();
    }

    public final double mo2892d() {
        return this.f11663a.m26472c();
    }

    public final String mo2893e() {
        return this.f11663a.m26473d();
    }

    public final byte[] mo2894f() {
        return this.f11663a.m26474e();
    }

    public final int mo2895g() {
        return this.f11664b;
    }
}
