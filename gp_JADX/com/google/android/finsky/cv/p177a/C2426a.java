package com.google.android.finsky.cv.p177a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C2426a extends C0758b {
    public int f11746a;
    public int f11747b;
    public int f11748c;
    public int f11749d;
    public int f11750e;
    public int f11751f;
    public int f11752g;
    public int f11753h;

    private static int m12159a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum OnOff");
        }
    }

    public C2426a() {
        this.f11746a = 0;
        this.f11747b = 0;
        this.f11748c = 0;
        this.f11749d = 0;
        this.f11750e = 0;
        this.f11751f = 0;
        this.f11752g = 0;
        this.f11753h = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2426a)) {
            return false;
        }
        C2426a c2426a = (C2426a) obj;
        if ((this.f11746a & 1) != (c2426a.f11746a & 1)) {
            return false;
        }
        if (this.f11747b != c2426a.f11747b) {
            return false;
        }
        if ((this.f11746a & 2) != (c2426a.f11746a & 2)) {
            return false;
        }
        if (this.f11748c != c2426a.f11748c) {
            return false;
        }
        if ((this.f11746a & 4) != (c2426a.f11746a & 4)) {
            return false;
        }
        if (this.f11749d != c2426a.f11749d) {
            return false;
        }
        if ((this.f11746a & 8) != (c2426a.f11746a & 8)) {
            return false;
        }
        if (this.f11750e != c2426a.f11750e) {
            return false;
        }
        if ((this.f11746a & 16) != (c2426a.f11746a & 16)) {
            return false;
        }
        if (this.f11751f != c2426a.f11751f) {
            return false;
        }
        if ((this.f11746a & 32) != (c2426a.f11746a & 32)) {
            return false;
        }
        if (this.f11752g != c2426a.f11752g) {
            return false;
        }
        if ((this.f11746a & 64) != (c2426a.f11746a & 64)) {
            return false;
        }
        if (this.f11753h != c2426a.f11753h) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c2426a.aO);
        }
        if (c2426a.aO == null || c2426a.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f11747b) * 31) + this.f11748c) * 31) + this.f11749d) * 31) + this.f11750e) * 31) + this.f11751f) * 31) + this.f11752g) * 31) + this.f11753h) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11746a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11747b);
        }
        if ((this.f11746a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11748c);
        }
        if ((this.f11746a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f11749d);
        }
        if ((this.f11746a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f11750e);
        }
        if ((this.f11746a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f11751f);
        }
        if ((this.f11746a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f11752g);
        }
        if ((this.f11746a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f11753h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11746a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f11747b);
        }
        if ((this.f11746a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f11748c);
        }
        if ((this.f11746a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f11749d);
        }
        if ((this.f11746a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f11750e);
        }
        if ((this.f11746a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f11751f);
        }
        if ((this.f11746a & 32) != 0) {
            b += CodedOutputByteBufferNano.d(6, this.f11752g);
        }
        if ((this.f11746a & 64) != 0) {
            return b + CodedOutputByteBufferNano.d(7, this.f11753h);
        }
        return b;
    }

    private final C2426a m12160b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f11746a |= 1;
                    o = aVar.o();
                    try {
                        this.f11747b = C2426a.m12159a(aVar.i());
                        this.f11746a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 16:
                    this.f11746a |= 2;
                    o = aVar.o();
                    try {
                        this.f11748c = C2426a.m12159a(aVar.i());
                        this.f11746a |= 2;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 24:
                    this.f11746a |= 4;
                    o = aVar.o();
                    try {
                        this.f11749d = C2426a.m12159a(aVar.i());
                        this.f11746a |= 4;
                        continue;
                    } catch (IllegalArgumentException e3) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 32:
                    this.f11746a |= 8;
                    o = aVar.o();
                    try {
                        this.f11750e = C2426a.m12159a(aVar.i());
                        this.f11746a |= 8;
                        continue;
                    } catch (IllegalArgumentException e4) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 40:
                    this.f11746a |= 16;
                    o = aVar.o();
                    try {
                        this.f11751f = C2426a.m12159a(aVar.i());
                        this.f11746a |= 16;
                        continue;
                    } catch (IllegalArgumentException e5) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 48:
                    this.f11746a |= 32;
                    o = aVar.o();
                    try {
                        this.f11752g = C2426a.m12159a(aVar.i());
                        this.f11746a |= 32;
                        continue;
                    } catch (IllegalArgumentException e6) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 56:
                    this.f11746a |= 64;
                    o = aVar.o();
                    try {
                        this.f11753h = C2426a.m12159a(aVar.i());
                        this.f11746a |= 64;
                        continue;
                    } catch (IllegalArgumentException e7) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m12160b(aVar);
    }
}
