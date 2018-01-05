package com.google.android.p103d;

import java.io.InputStream;
import java.util.zip.ZipException;

public final class C0938c {
    public String f5735a;
    public long f5736b = -1;
    public long f5737c = -1;
    public int f5738d = -1;
    public int f5739e = -1;
    public long f5740f = -1;
    public int f5741g;

    public final String toString() {
        return this.f5735a;
    }

    public final int hashCode() {
        return this.f5735a.hashCode();
    }

    C0938c(byte[] bArr, InputStream inputStream) {
        C0937b.m5677a(inputStream, bArr, 0, bArr.length);
        C0936a c0936a = new C0936a(bArr);
        int a = c0936a.m5674a();
        if (((long) a) != 33639248) {
            C0939d.m5680a("Central Directory Entry", a);
        }
        c0936a.f5734c = 8;
        a = c0936a.m5675b() & 65535;
        if ((a & 1) != 0) {
            throw new ZipException("Invalid General Purpose Bit Flag: " + a);
        }
        this.f5738d = c0936a.m5675b() & 65535;
        c0936a.m5675b();
        c0936a.m5675b();
        c0936a.m5674a();
        this.f5736b = ((long) c0936a.m5674a()) & 4294967295L;
        this.f5737c = ((long) c0936a.m5674a()) & 4294967295L;
        this.f5739e = c0936a.m5675b() & 65535;
        a = c0936a.m5675b() & 65535;
        int b = c0936a.m5675b() & 65535;
        if (a >= 32768) {
            this.f5741g |= 1;
        }
        if (b >= 32768) {
            this.f5741g |= 2;
        }
        c0936a.f5734c = 42;
        this.f5740f = ((long) c0936a.m5674a()) & 4294967295L;
        byte[] bArr2 = new byte[this.f5739e];
        C0937b.m5677a(inputStream, bArr2, 0, bArr2.length);
        if (C0938c.m5678a(bArr2)) {
            this.f5741g |= 16;
        }
        try {
            this.f5735a = new String(bArr2, 0, bArr2.length, "UTF-8");
            if (a > 0) {
                C0937b.m5676a(inputStream, a);
            }
            if (b > 0) {
                C0937b.m5676a(inputStream, b);
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean m5678a(byte[] bArr) {
        for (byte b : bArr) {
            if (b == (byte) 0) {
                return true;
            }
        }
        return false;
    }
}
