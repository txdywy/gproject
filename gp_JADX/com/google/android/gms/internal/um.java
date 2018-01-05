package com.google.android.gms.internal;

public abstract class um {
    public int f27522a;
    public int f27523b = 100;

    um() {
    }

    public static um m25684a(byte[] bArr) {
        return m25685a(bArr, 0, bArr.length);
    }

    static um m25685a(byte[] bArr, int i, int i2) {
        um unVar = new un(bArr, i, i2);
        try {
            unVar.mo4906c(i2);
            return unVar;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int mo4901a();

    public abstract uu mo4902a(uu uuVar, uq uqVar);

    public abstract void mo4903a(int i);

    public abstract int mo4904b();

    public abstract boolean mo4905b(int i);

    public abstract int mo4906c(int i);

    public abstract String mo4907c();

    public abstract ud mo4908d();

    public abstract void mo4909d(int i);

    public abstract int mo4910e();

    public abstract void mo4911e(int i);

    abstract long mo4912f();

    public abstract boolean mo4913g();

    public abstract int mo4914h();
}
