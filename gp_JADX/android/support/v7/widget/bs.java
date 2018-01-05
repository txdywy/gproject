package android.support.v7.widget;

final class bs {
    public long f3232a = 0;
    public bs f3233b;

    bs() {
    }

    final void m3339a(int i) {
        while (i >= 64) {
            m3338a();
            this = this.f3233b;
            i -= 64;
        }
        this.f3232a |= 1 << i;
    }

    private final void m3338a() {
        if (this.f3233b == null) {
            this.f3233b = new bs();
        }
    }

    final void m3341b(int i) {
        while (i >= 64) {
            if (this.f3233b != null) {
                this = this.f3233b;
                i -= 64;
            } else {
                return;
            }
        }
        this.f3232a &= (1 << i) ^ -1;
    }

    final boolean m3342c(int i) {
        while (i >= 64) {
            m3338a();
            this = this.f3233b;
            i -= 64;
        }
        return (this.f3232a & (1 << i)) != 0;
    }

    final void m3340a(int i, boolean z) {
        while (true) {
            if (i >= 64) {
                m3338a();
                this = this.f3233b;
                i -= 64;
            } else {
                boolean z2 = (this.f3232a & Long.MIN_VALUE) != 0;
                long j = (1 << i) - 1;
                this.f3232a = (((j ^ -1) & this.f3232a) << 1) | (this.f3232a & j);
                if (z) {
                    m3339a(i);
                } else {
                    m3341b(i);
                }
                if (z2 || this.f3233b != null) {
                    m3338a();
                    this = this.f3233b;
                    i = 0;
                    z = z2;
                } else {
                    return;
                }
            }
        }
    }

    final boolean m3343d(int i) {
        while (i >= 64) {
            m3338a();
            this = this.f3233b;
            i -= 64;
        }
        long j = 1 << i;
        boolean z = (this.f3232a & j) != 0;
        this.f3232a &= j ^ -1;
        j--;
        this.f3232a = Long.rotateRight((j ^ -1) & this.f3232a, 1) | (this.f3232a & j);
        if (this.f3233b != null) {
            if (this.f3233b.m3342c(0)) {
                m3339a(63);
            }
            this.f3233b.m3343d(0);
        }
        return z;
    }

    final int m3344e(int i) {
        if (this.f3233b == null) {
            if (i >= 64) {
                return Long.bitCount(this.f3232a);
            }
            return Long.bitCount(this.f3232a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f3232a & ((1 << i) - 1));
        } else {
            return this.f3233b.m3344e(i - 64) + Long.bitCount(this.f3232a);
        }
    }

    public final String toString() {
        if (this.f3233b == null) {
            return Long.toBinaryString(this.f3232a);
        }
        return this.f3233b.toString() + "xx" + Long.toBinaryString(this.f3232a);
    }
}
