package com.google.android.libraries.performance.primes.p333b.p334a;

public final class C5958d {
    public final Object[] f29710a;
    public final int[] f29711b;
    public int f29712c;
    public int f29713d;
    public Object f29714e;

    C5958d(int[] iArr, Object[] objArr) {
        this.f29711b = iArr;
        this.f29710a = objArr;
    }

    public final boolean m27667a() {
        this.f29714e = null;
        while (this.f29714e == null && this.f29712c < this.f29710a.length) {
            Object[] objArr = this.f29710a;
            int i = this.f29712c;
            this.f29712c = i + 1;
            this.f29714e = objArr[i];
        }
        if (this.f29712c > 0) {
            this.f29713d = this.f29711b[this.f29712c - 1];
        }
        return this.f29714e != null;
    }
}
