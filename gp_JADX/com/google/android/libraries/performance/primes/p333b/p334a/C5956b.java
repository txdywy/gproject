package com.google.android.libraries.performance.primes.p333b.p334a;

public final class C5956b {
    public final int[] f29700a;
    public final int[] f29701b;
    public final int f29702c;
    public int f29703d;
    public int f29704e;
    public int f29705f;

    public C5956b(int[] iArr, int[] iArr2, int i) {
        this.f29700a = iArr;
        this.f29701b = iArr2;
        this.f29702c = i;
    }

    public final boolean m27661a() {
        this.f29705f = this.f29702c;
        while (this.f29705f == this.f29702c && this.f29703d < this.f29701b.length) {
            int[] iArr = this.f29701b;
            int i = this.f29703d;
            this.f29703d = i + 1;
            this.f29705f = iArr[i];
        }
        if (this.f29703d > 0) {
            this.f29704e = this.f29700a[this.f29703d - 1];
        }
        return this.f29705f != this.f29702c;
    }
}
