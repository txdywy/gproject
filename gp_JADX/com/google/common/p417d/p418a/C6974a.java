package com.google.common.p417d.p418a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C6974a extends b implements Cloneable {
    public int f34364a;
    public int f34365b;
    public int f34366c;
    public int f34367d;
    public int f34368e;
    public int f34369f;
    public int f34370g;

    private static int m31823a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum OnOff");
        }
    }

    public C6974a() {
        this.f34364a = 0;
        this.f34365b = 0;
        this.f34366c = 0;
        this.f34367d = 0;
        this.f34368e = 0;
        this.f34369f = 0;
        this.f34370g = 0;
        this.aO = null;
        this.aP = -1;
    }

    private final C6974a m31825d() {
        try {
            return (C6974a) super.cK_();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6974a)) {
            return false;
        }
        C6974a c6974a = (C6974a) obj;
        if (this.f34364a != c6974a.f34364a) {
            return false;
        }
        if (this.f34365b != c6974a.f34365b) {
            return false;
        }
        if (this.f34366c != c6974a.f34366c) {
            return false;
        }
        if (this.f34367d != c6974a.f34367d) {
            return false;
        }
        if (this.f34368e != c6974a.f34368e) {
            return false;
        }
        if (this.f34369f != c6974a.f34369f) {
            return false;
        }
        if (this.f34370g != c6974a.f34370g) {
            return false;
        }
        if (this.aO != null && !this.aO.m33598b()) {
            return this.aO.equals(c6974a.aO);
        }
        if (c6974a.aO == null || c6974a.aO.m33598b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f34364a) * 31) + this.f34365b) * 31) + this.f34366c) * 31) + this.f34367d) * 31) + this.f34368e) * 31) + this.f34369f) * 31) + this.f34370g) * 31;
        if (this.aO == null || this.aO.m33598b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void m31827a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34364a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34364a);
        }
        if (this.f34365b != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f34365b);
        }
        if (this.f34366c != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34366c);
        }
        if (this.f34367d != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f34367d);
        }
        if (this.f34368e != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f34368e);
        }
        if (this.f34369f != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f34369f);
        }
        if (this.f34370g != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f34370g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m31828b() {
        int b = super.b();
        if (this.f34364a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34364a);
        }
        if (this.f34365b != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f34365b);
        }
        if (this.f34366c != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f34366c);
        }
        if (this.f34367d != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f34367d);
        }
        if (this.f34368e != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f34368e);
        }
        if (this.f34369f != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f34369f);
        }
        if (this.f34370g != 0) {
            return b + CodedOutputByteBufferNano.m33502d(7, this.f34370g);
        }
        return b;
    }

    private final C6974a m31824b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    o = c7213a.m33573o();
                    try {
                        this.f34364a = C6974a.m31823a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    o = c7213a.m33573o();
                    try {
                        this.f34365b = C6974a.m31823a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 24:
                    o = c7213a.m33573o();
                    try {
                        this.f34366c = C6974a.m31823a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e3) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 32:
                    o = c7213a.m33573o();
                    try {
                        this.f34367d = C6974a.m31823a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e4) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 40:
                    o = c7213a.m33573o();
                    try {
                        this.f34368e = C6974a.m31823a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e5) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 48:
                    o = c7213a.m33573o();
                    try {
                        this.f34369f = C6974a.m31823a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e6) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 56:
                    o = c7213a.m33573o();
                    try {
                        this.f34370g = C6974a.m31823a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e7) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ b cK_() {
        return (C6974a) clone();
    }

    public final /* synthetic */ i cJ_() {
        return (C6974a) clone();
    }

    public final /* synthetic */ i m31826a(C7213a c7213a) {
        return m31824b(c7213a);
    }

    public final /* synthetic */ Object clone() {
        return m31825d();
    }
}
