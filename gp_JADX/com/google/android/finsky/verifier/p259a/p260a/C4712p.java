package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.l;

public final class C4712p extends C0758b {
    public static volatile C4712p[] f24230a;
    public int f24231b;
    public int f24232c;
    public C4713q f24233d;
    public byte[] f24234e;
    public byte[] f24235f;
    public boolean f24236g;
    public boolean f24237h;
    public boolean f24238i;
    public String[] f24239j;

    public static int m21930a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 3:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum Verdict");
        }
    }

    public static C4712p[] cr_() {
        if (f24230a == null) {
            synchronized (h.b) {
                if (f24230a == null) {
                    f24230a = new C4712p[0];
                }
            }
        }
        return f24230a;
    }

    public C4712p() {
        this.f24231b = 0;
        this.f24232c = 0;
        this.f24233d = null;
        this.f24234e = l.l;
        this.f24235f = l.l;
        this.f24236g = false;
        this.f24237h = false;
        this.f24238i = false;
        this.f24239j = l.j;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.a(1, this.f24232c);
        if (this.f24233d != null) {
            codedOutputByteBufferNano.b(2, this.f24233d);
        }
        if ((this.f24231b & 1) != 0) {
            codedOutputByteBufferNano.a(3, this.f24234e);
        }
        if ((this.f24231b & 2) != 0) {
            codedOutputByteBufferNano.a(4, this.f24235f);
        }
        if ((this.f24231b & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f24236g);
        }
        if ((this.f24231b & 8) != 0) {
            codedOutputByteBufferNano.a(7, this.f24237h);
        }
        if ((this.f24231b & 16) != 0) {
            codedOutputByteBufferNano.a(8, this.f24238i);
        }
        if (this.f24239j != null && this.f24239j.length > 0) {
            for (String str : this.f24239j) {
                if (str != null) {
                    codedOutputByteBufferNano.a(9, str);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b() + CodedOutputByteBufferNano.d(1, this.f24232c);
        if (this.f24233d != null) {
            b += CodedOutputByteBufferNano.d(2, this.f24233d);
        }
        if ((this.f24231b & 1) != 0) {
            b += CodedOutputByteBufferNano.b(3, this.f24234e);
        }
        if ((this.f24231b & 2) != 0) {
            b += CodedOutputByteBufferNano.b(4, this.f24235f);
        }
        if ((this.f24231b & 4) != 0) {
            b += CodedOutputByteBufferNano.d(5) + 1;
        }
        if ((this.f24231b & 8) != 0) {
            b += CodedOutputByteBufferNano.d(7) + 1;
        }
        if ((this.f24231b & 16) != 0) {
            b += CodedOutputByteBufferNano.d(8) + 1;
        }
        if (this.f24239j == null || this.f24239j.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f24239j.length) {
            String str = this.f24239j[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private final C4712p m21931b(a aVar) {
        while (true) {
            int a = aVar.a();
            int o;
            switch (a) {
                case 0:
                    break;
                case 8:
                    o = aVar.o();
                    try {
                        this.f24232c = C4712p.m21930a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 18:
                    if (this.f24233d == null) {
                        this.f24233d = new C4713q();
                    }
                    aVar.a(this.f24233d);
                    continue;
                case 26:
                    this.f24234e = aVar.g();
                    this.f24231b |= 1;
                    continue;
                case 34:
                    this.f24235f = aVar.g();
                    this.f24231b |= 2;
                    continue;
                case 40:
                    this.f24236g = aVar.e();
                    this.f24231b |= 4;
                    continue;
                case 56:
                    this.f24237h = aVar.e();
                    this.f24231b |= 8;
                    continue;
                case 64:
                    this.f24238i = aVar.e();
                    this.f24231b |= 16;
                    continue;
                case 74:
                    o = l.a(aVar, 74);
                    a = this.f24239j == null ? 0 : this.f24239j.length;
                    Object obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24239j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = aVar.f();
                        aVar.a();
                        a++;
                    }
                    obj[a] = aVar.f();
                    this.f24239j = obj;
                    continue;
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
        return m21931b(aVar);
    }
}
