package com.squareup.okhttp.internal.p525a;

public final class ap {
    public int f39434a;
    public int f39435b;
    public int f39436c;
    public final int[] f39437d = new int[10];

    final ap m36754a(int i, int i2, int i3) {
        if (i < this.f39437d.length) {
            int i4 = 1 << i;
            this.f39434a |= i4;
            if ((i2 & 1) != 0) {
                this.f39435b |= i4;
            } else {
                this.f39435b &= i4 ^ -1;
            }
            if ((i2 & 2) != 0) {
                this.f39436c = i4 | this.f39436c;
            } else {
                this.f39436c = (i4 ^ -1) & this.f39436c;
            }
            this.f39437d[i] = i3;
        }
        return this;
    }

    final boolean m36755a(int i) {
        if (((1 << i) & this.f39434a) != 0) {
            return true;
        }
        return false;
    }

    final int m36757b(int i) {
        int i2;
        int i3 = 0;
        if ((((1 << i) & this.f39436c) != 0 ? 1 : 0) != 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (((1 << i) & this.f39435b) != 0) {
            i3 = 1;
        }
        if (i3 != 0) {
            return i2 | 1;
        }
        return i2;
    }

    final int m36753a() {
        return (this.f39434a & 2) != 0 ? this.f39437d[1] : -1;
    }

    public final int m36756b() {
        return (this.f39434a & 128) != 0 ? this.f39437d[7] : 65536;
    }
}
