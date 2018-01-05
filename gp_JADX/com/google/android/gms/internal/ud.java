package com.google.android.gms.internal;

import java.io.Serializable;
import java.util.Iterator;

public abstract class ud implements Serializable, Iterable {
    public static final ud f27511a = new uk(vd.f27561b);
    public static final uh f27512b;
    public int f27513c = 0;

    ud() {
    }

    static int m25651a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((((i | i2) | i4) | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static ud m25652a(String str) {
        return new uk(str.getBytes(vd.f27560a));
    }

    public static ud m25653a(byte[] bArr) {
        return m25654a(bArr, 0, bArr.length);
    }

    public static ud m25654a(byte[] bArr, int i, int i2) {
        return new uk(f27512b.mo4890a(bArr, i, i2));
    }

    static ud m25655b(byte[] bArr) {
        return new uk(bArr);
    }

    static ui m25656c(int i) {
        return new ui(i);
    }

    public abstract byte mo4891a(int i);

    public abstract int mo4892a();

    protected abstract int mo4893a(int i, int i2);

    abstract void mo4894a(uc ucVar);

    protected abstract void mo4895a(byte[] bArr, int i);

    public abstract ud mo4897b(int i);

    public final boolean m25663b() {
        return mo4892a() == 0;
    }

    public final byte[] m25664c() {
        int a = mo4892a();
        if (a == 0) {
            return vd.f27561b;
        }
        byte[] bArr = new byte[a];
        mo4895a(bArr, a);
        return bArr;
    }

    public abstract um mo4898d();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f27513c;
        if (i == 0) {
            i = mo4892a();
            i = mo4893a(i, i);
            if (i == 0) {
                i = 1;
            }
            this.f27513c = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new ue(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo4892a())});
    }

    static {
        uh ulVar;
        Object obj = 1;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException e) {
            obj = null;
        }
        if (obj != null) {
            ulVar = new ul();
        } else {
            ulVar = new uf();
        }
        f27512b = ulVar;
    }
}
