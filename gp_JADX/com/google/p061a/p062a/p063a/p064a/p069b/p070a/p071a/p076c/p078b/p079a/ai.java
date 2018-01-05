package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class ai extends C0758b {
    public at f4890a;
    public at f4891b;
    public at[] f4892c;
    public String f4893d;
    public int f4894e;
    public String f4895f;
    public byte[] f4896g;

    public ai() {
        this.f4890a = null;
        this.f4891b = null;
        this.f4892c = at.m5344a();
        this.f4893d = "";
        this.f4894e = 0;
        this.f4895f = "";
        this.f4896g = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4890a != null) {
            codedOutputByteBufferNano.b(1, this.f4890a);
        }
        if (this.f4891b != null) {
            codedOutputByteBufferNano.b(2, this.f4891b);
        }
        if (this.f4894e != 0) {
            codedOutputByteBufferNano.a(3, this.f4894e);
        }
        if (!(this.f4895f == null || this.f4895f.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f4895f);
        }
        if (!(this.f4893d == null || this.f4893d.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f4893d);
        }
        if (!Arrays.equals(this.f4896g, l.l)) {
            codedOutputByteBufferNano.a(7, this.f4896g);
        }
        if (this.f4892c != null && this.f4892c.length > 0) {
            for (C0757i c0757i : this.f4892c) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(8, c0757i);
                }
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4890a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4890a);
        }
        if (this.f4891b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f4891b);
        }
        if (this.f4894e != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f4894e);
        }
        if (!(this.f4895f == null || this.f4895f.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f4895f);
        }
        if (!(this.f4893d == null || this.f4893d.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f4893d);
        }
        if (!Arrays.equals(this.f4896g, l.l)) {
            b += CodedOutputByteBufferNano.b(7, this.f4896g);
        }
        if (this.f4892c == null || this.f4892c.length <= 0) {
            return b;
        }
        int i = b;
        for (C0757i c0757i : this.f4892c) {
            if (c0757i != null) {
                i += CodedOutputByteBufferNano.d(8, c0757i);
            }
        }
        return i;
    }

    private final ai m5004b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f4890a == null) {
                        this.f4890a = new at();
                    }
                    aVar.a(this.f4890a);
                    continue;
                case 18:
                    if (this.f4891b == null) {
                        this.f4891b = new at();
                    }
                    aVar.a(this.f4891b);
                    continue;
                case 24:
                    o = aVar.o();
                    try {
                        this.f4894e = af.m4996a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 34:
                    this.f4895f = aVar.f();
                    continue;
                case 42:
                    this.f4893d = aVar.f();
                    continue;
                case 58:
                    this.f4896g = aVar.g();
                    continue;
                case 66:
                    o = l.a(aVar, 66);
                    a = this.f4892c == null ? 0 : this.f4892c.length;
                    Object obj = new at[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f4892c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new at();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new at();
                    aVar.a(obj[a]);
                    this.f4892c = obj;
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
        return m5004b(aVar);
    }
}
