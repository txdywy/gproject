package com.google.android.finsky.ea;

public final class C2963c implements C2960f {
    public boolean f15606a;
    public boolean f15607b;

    public final boolean mo3209a(boolean z, boolean z2) {
        return z && z2;
    }

    public final int mo3208a(int i, boolean z, boolean z2, boolean z3) {
        switch (i) {
            case 0:
                this.f15607b = false;
                if (!z) {
                    m15364b();
                    if (!z2) {
                        return 1;
                    }
                } else if (!this.f15606a && z3) {
                    return 3;
                } else {
                    m15364b();
                    return 2;
                }
                break;
            case 1:
            case 2:
                this.f15607b = true;
                break;
        }
        return 0;
    }

    public final int mo3207a() {
        if (this.f15607b) {
            this.f15606a = true;
            return 0;
        }
        m15364b();
        return 2;
    }

    private final void m15364b() {
        this.f15607b = false;
        this.f15606a = false;
    }
}
