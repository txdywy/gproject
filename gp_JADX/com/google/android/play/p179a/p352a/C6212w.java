package com.google.android.play.p179a.p352a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C6212w extends C0758b {
    public int f31062a;
    public String f31063b;
    public int f31064c;
    public int f31065d;

    public static int m28680a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum QosTier");
        }
    }

    public C6212w() {
        this.f31062a = 0;
        this.f31063b = "";
        this.f31064c = 0;
        this.f31065d = -1;
        this.aO = null;
        this.aP = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6212w)) {
            return false;
        }
        C6212w c6212w = (C6212w) obj;
        if ((this.f31062a & 1) != (c6212w.f31062a & 1)) {
            return false;
        }
        if (!this.f31063b.equals(c6212w.f31063b)) {
            return false;
        }
        if ((this.f31062a & 2) != (c6212w.f31062a & 2)) {
            return false;
        }
        if (this.f31064c != c6212w.f31064c) {
            return false;
        }
        if ((this.f31062a & 4) != (c6212w.f31062a & 4)) {
            return false;
        }
        if (this.f31065d != c6212w.f31065d) {
            return false;
        }
        if (this.aO != null && !this.aO.b()) {
            return this.aO.equals(c6212w.aO);
        }
        if (c6212w.aO == null || c6212w.aO.b()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + this.f31063b.hashCode()) * 31) + this.f31064c) * 31) + this.f31065d) * 31;
        if (this.aO == null || this.aO.b()) {
            i = 0;
        } else {
            i = this.aO.hashCode();
        }
        return i + hashCode;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f31062a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f31063b);
        }
        if ((this.f31062a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f31064c);
        }
        if ((this.f31062a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f31065d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f31062a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f31063b);
        }
        if ((this.f31062a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(2, this.f31064c);
        }
        if ((this.f31062a & 4) != 0) {
            return b + CodedOutputByteBufferNano.d(3, this.f31065d);
        }
        return b;
    }

    private final C6212w m28681b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31063b = aVar.f();
                    this.f31062a |= 1;
                    continue;
                case 16:
                    this.f31062a |= 2;
                    o = aVar.o();
                    try {
                        this.f31064c = C6212w.m28680a(aVar.i());
                        this.f31062a |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 24:
                    this.f31062a |= 4;
                    o = aVar.o();
                    try {
                        this.f31065d = C6207r.m28661a(aVar.i());
                        this.f31062a |= 4;
                        continue;
                    } catch (IllegalArgumentException e2) {
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
        return m28681b(aVar);
    }
}
