package com.google.android.gms.internal;

import java.util.Arrays;

public final class wb {
    public static final wb f27585a = new wb(0, new int[0], new Object[0]);
    public int f27586b;
    public int[] f27587c;
    public Object[] f27588d;

    private wb() {
        this(0, new int[8], new Object[8]);
    }

    private wb(int i, int[] iArr, Object[] objArr) {
        this.f27586b = i;
        this.f27587c = iArr;
        this.f27588d = objArr;
    }

    static wb m25817a(wb wbVar, wb wbVar2) {
        int i = wbVar.f27586b + wbVar2.f27586b;
        Object copyOf = Arrays.copyOf(wbVar.f27587c, i);
        System.arraycopy(wbVar2.f27587c, 0, copyOf, wbVar.f27586b, wbVar2.f27586b);
        Object copyOf2 = Arrays.copyOf(wbVar.f27588d, i);
        System.arraycopy(wbVar2.f27588d, 0, copyOf2, wbVar.f27586b, wbVar2.f27586b);
        return new wb(i, copyOf, copyOf2);
    }

    final void m25818a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.f27586b; i2++) {
            vn.m25794a(stringBuilder, i, String.valueOf(this.f27587c[i2] >>> 3), this.f27588d[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj;
        if (this.f27586b == wbVar.f27586b) {
            int i;
            boolean z;
            int[] iArr = this.f27587c;
            int[] iArr2 = wbVar.f27587c;
            int i2 = this.f27586b;
            for (i = 0; i < i2; i++) {
                if (iArr[i] != iArr2[i]) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                Object[] objArr = this.f27588d;
                Object[] objArr2 = wbVar.f27588d;
                i2 = this.f27586b;
                for (i = 0; i < i2; i++) {
                    if (!objArr[i].equals(objArr2[i])) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f27586b + 527) * 31) + Arrays.hashCode(this.f27587c)) * 31) + Arrays.deepHashCode(this.f27588d);
    }
}
