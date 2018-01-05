package com.google.android.gms.internal;

public final class ww implements Cloneable {
    public static final wx f27644a = new wx();
    public int[] f27645b;
    public wx[] f27646c;
    public int f27647d;

    ww() {
        this(10);
    }

    private ww(int i) {
        int a = m25912a(i);
        this.f27645b = new int[a];
        this.f27646c = new wx[a];
        this.f27647d = 0;
    }

    static int m25912a(int i) {
        int i2 = i << 2;
        for (int i3 = 4; i3 < 32; i3++) {
            if (i2 <= (1 << i3) - 12) {
                i2 = (1 << i3) - 12;
                break;
            }
        }
        return i2 / 4;
    }

    public final boolean m25913a() {
        return this.f27647d == 0;
    }

    final int m25914b(int i) {
        int i2 = 0;
        int i3 = this.f27647d - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f27645b[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f27647d;
        ww wwVar = new ww(i);
        System.arraycopy(this.f27645b, 0, wwVar.f27645b, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f27646c[i2] != null) {
                wwVar.f27646c[i2] = (wx) this.f27646c[i2].clone();
            }
        }
        wwVar.f27647d = i;
        return wwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ww)) {
            return false;
        }
        ww wwVar = (ww) obj;
        if (this.f27647d != wwVar.f27647d) {
            return false;
        }
        int i;
        boolean z;
        int[] iArr = this.f27645b;
        int[] iArr2 = wwVar.f27645b;
        int i2 = this.f27647d;
        for (i = 0; i < i2; i++) {
            if (iArr[i] != iArr2[i]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            wx[] wxVarArr = this.f27646c;
            wx[] wxVarArr2 = wwVar.f27646c;
            i2 = this.f27647d;
            for (i = 0; i < i2; i++) {
                if (!wxVarArr[i].equals(wxVarArr2[i])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f27647d; i2++) {
            i = (((i * 31) + this.f27645b[i2]) * 31) + this.f27646c[i2].hashCode();
        }
        return i;
    }
}
