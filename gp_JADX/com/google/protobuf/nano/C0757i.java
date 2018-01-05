package com.google.protobuf.nano;

import java.util.Arrays;

public abstract class C0757i {
    public volatile int aP = -1;

    public abstract C0757i mo1131a(a aVar);

    public final int m4914m() {
        if (this.aP < 0) {
            m4915n();
        }
        return this.aP;
    }

    public final int m4915n() {
        int b = mo1128b();
        this.aP = b;
        return b;
    }

    public int mo1128b() {
        return 0;
    }

    public void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
    }

    public static final byte[] m4909a(C0757i c0757i) {
        byte[] bArr = new byte[c0757i.m4915n()];
        C0757i.m4907a(c0757i, bArr, bArr.length);
        return bArr;
    }

    private static void m4907a(C0757i c0757i, byte[] bArr, int i) {
        try {
            CodedOutputByteBufferNano a = CodedOutputByteBufferNano.a(bArr, i);
            c0757i.mo1127a(a);
            if (a.a.remaining() != 0) {
                throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(a.a.remaining())}));
            }
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public static final C0757i m4905a(C0757i c0757i, byte[] bArr) {
        return C0757i.m4906a(c0757i, bArr, 0, bArr.length);
    }

    public static final C0757i m4906a(C0757i c0757i, byte[] bArr, int i, int i2) {
        try {
            a a = a.a(bArr, i, i2);
            c0757i.mo1131a(a);
            a.a(0);
            return c0757i;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (Throwable e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final C0757i m4910b(C0757i c0757i) {
        try {
            return C0757i.m4905a((C0757i) c0757i.getClass().getConstructor(new Class[0]).newInstance(new Object[0]), C0757i.m4909a(c0757i));
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        } catch (Throwable e2) {
            throw new IllegalStateException(e2);
        } catch (Throwable e22) {
            throw new IllegalStateException(e22);
        } catch (Throwable e222) {
            throw new IllegalStateException(e222);
        } catch (Throwable e2222) {
            throw new IllegalStateException(e2222);
        }
    }

    public static final boolean m4908a(C0757i c0757i, C0757i c0757i2) {
        if (c0757i == c0757i2) {
            return true;
        }
        if (c0757i == null || c0757i2 == null || c0757i.getClass() != c0757i2.getClass()) {
            return false;
        }
        int n = c0757i.m4915n();
        if (c0757i2.m4915n() != n) {
            return false;
        }
        byte[] bArr = new byte[n];
        byte[] bArr2 = new byte[n];
        C0757i.m4907a(c0757i, bArr, n);
        C0757i.m4907a(c0757i2, bArr2, n);
        return Arrays.equals(bArr, bArr2);
    }

    public String toString() {
        return j.a(this);
    }

    public C0757i cJ_() {
        return (C0757i) super.clone();
    }

    public /* synthetic */ Object clone() {
        return cJ_();
    }
}
