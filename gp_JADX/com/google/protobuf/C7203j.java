package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;

public abstract class C7203j implements Serializable, Iterable {
    public static final C7203j f35320a = new C7211q(bb.f35209b);
    public static final C7208n f35321b;
    public int f35322c = 0;

    C7203j() {
    }

    public abstract byte mo6169a(int i);

    public abstract int mo6170a();

    protected abstract int mo6171a(int i, int i2, int i3);

    public abstract C7203j mo6172a(int i, int i2);

    protected abstract String mo6173a(Charset charset);

    abstract void mo6174a(C7195i c7195i);

    protected abstract int mo6175b(int i, int i2, int i3);

    protected abstract void mo6176b(byte[] bArr, int i, int i2, int i3);

    public abstract boolean mo6177c();

    public abstract C7225s mo6178d();

    protected abstract int mo6179e();

    public abstract boolean equals(Object obj);

    protected abstract boolean mo6181f();

    public static C7203j m33201a(byte[] bArr, int i, int i2) {
        return new C7211q(f35321b.mo6222a(bArr, i, i2));
    }

    static C7203j m33200a(byte[] bArr) {
        return new C7211q(bArr);
    }

    static C7203j m33202b(byte[] bArr, int i, int i2) {
        return new C7212m(bArr, i, i2);
    }

    public static C7203j m33198a(String str) {
        return new C7211q(str.getBytes(bb.f35208a));
    }

    public static C7203j m33197a(Iterable iterable) {
        int size = ((Collection) iterable).size();
        if (size == 0) {
            return f35320a;
        }
        return C7203j.m33199a(iterable.iterator(), size);
    }

    private static C7203j m33199a(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return (C7203j) it.next();
        } else {
            int i2 = i >>> 1;
            C7203j a = C7203j.m33199a(it, i2);
            C7203j a2 = C7203j.m33199a(it, i - i2);
            if (Integer.MAX_VALUE - a.mo6170a() >= a2.mo6170a()) {
                return da.m33220a(a, a2);
            }
            int a3 = a.mo6170a();
            throw new IllegalArgumentException("ByteString would be too long: " + a3 + "+" + a2.mo6170a());
        }
    }

    public final void m33212a(byte[] bArr, int i, int i2, int i3) {
        C7203j.m33205c(i, i + i3, mo6170a());
        C7203j.m33205c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo6176b(bArr, i, i2, i3);
        }
    }

    public final String m33214b() {
        return mo6170a() == 0 ? "" : mo6173a(bb.f35208a);
    }

    public final int hashCode() {
        int i = this.f35322c;
        if (i == 0) {
            i = mo6170a();
            i = mo6175b(i, 0, i);
            if (i == 0) {
                i = 1;
            }
            this.f35322c = i;
        }
        return i;
    }

    static C7223o m33203b(int i) {
        return new C7223o(i);
    }

    static void m33204b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    static int m33205c(int i, int i2, int i3) {
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

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo6170a())});
    }

    public /* synthetic */ Iterator iterator() {
        return new C7207k(this);
    }

    static {
        C7208n c7224r;
        Object obj = 1;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException e) {
            obj = null;
        }
        if (obj != null) {
            c7224r = new C7224r();
        } else {
            c7224r = new C7209l();
        }
        f35321b = c7224r;
    }
}
