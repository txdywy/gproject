package com.google.android.finsky.ia2;

public final class C3224a {
    public final float f16573a = 0.5f;
    public final int f16574b;
    public final int f16575c;
    public final int f16576d;
    public int f16577e;

    public C3224a(int i, int i2, int i3, int i4) {
        this.f16574b = i;
        this.f16575c = i2;
        this.f16576d = i3;
        this.f16577e = i4;
    }

    final boolean m16277a(int i, int i2) {
        return (i - (this.f16574b * 2)) / i2 > this.f16575c;
    }

    final void m16276a(C3222b c3222b, int i) {
        int totalChildCount = (i - (this.f16574b * 2)) / c3222b.getTotalChildCount();
        if (totalChildCount > this.f16576d) {
            totalChildCount = this.f16576d;
        }
        c3222b.setChildWidth(totalChildCount);
    }
}
