package com.google.protobuf;

import java.io.InputStream;

public abstract class C7225s {
    public static volatile boolean f35482e;
    public int f35483a;
    public int f35484b = 100;
    public int f35485c = Integer.MAX_VALUE;
    public C7229w f35486d;

    public abstract int mo6231a();

    public abstract at mo6232a(at atVar, ah ahVar);

    public abstract cf mo6233a(cs csVar, ah ahVar);

    public abstract void mo6234a(int i);

    public abstract double mo6235b();

    public abstract boolean mo6236b(int i);

    public abstract float mo6237c();

    public abstract int mo6238c(int i);

    public abstract long mo6239d();

    public abstract void mo6240d(int i);

    public abstract long mo6241e();

    public abstract void mo6242e(int i);

    public abstract int mo6243f();

    public abstract long mo6244g();

    public abstract int mo6245h();

    public abstract boolean mo6246i();

    public abstract String mo6247j();

    public abstract String mo6248k();

    public abstract C7203j mo6249l();

    public abstract int mo6250m();

    public abstract int mo6251n();

    public abstract int mo6252o();

    public abstract long mo6253p();

    public abstract int mo6254q();

    public abstract long mo6255r();

    public abstract int mo6256s();

    abstract long mo6257t();

    public abstract int mo6258u();

    public abstract boolean mo6259v();

    public abstract int mo6260w();

    public static C7225s m33628a(InputStream inputStream) {
        return new C7227u(inputStream);
    }

    public static C7225s m33629a(byte[] bArr, int i, int i2, boolean z) {
        C7225s c7226t = new C7226t(bArr, i, i2, z);
        try {
            c7226t.mo6238c(i2);
            return c7226t;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    C7225s() {
    }

    public static int m33630f(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long m33627a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    static {
        f35482e = false;
        f35482e = true;
    }
}
