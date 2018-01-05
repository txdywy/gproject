package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.ak;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0818o extends C0758b {
    public C0811h f5193a;
    public C0819p[] f5194b;
    public ak[] f5195c;
    public C0799a f5196d;

    public C0818o() {
        this.f5193a = null;
        this.f5194b = C0819p.m5186a();
        this.f5195c = ak.m5293a();
        this.f5196d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f5193a != null) {
            codedOutputByteBufferNano.b(1, this.f5193a);
        }
        if (this.f5194b != null && this.f5194b.length > 0) {
            for (C0757i c0757i : this.f5194b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f5196d != null) {
            codedOutputByteBufferNano.b(3, this.f5196d);
        }
        if (this.f5195c != null && this.f5195c.length > 0) {
            while (i < this.f5195c.length) {
                C0757i c0757i2 = this.f5195c[i];
                if (c0757i2 != null) {
                    codedOutputByteBufferNano.b(7, c0757i2);
                }
                i++;
            }
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int i = 0;
        int b = super.mo1128b();
        if (this.f5193a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5193a);
        }
        if (this.f5194b != null && this.f5194b.length > 0) {
            int i2 = b;
            for (C0757i c0757i : this.f5194b) {
                if (c0757i != null) {
                    i2 += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i2;
        }
        if (this.f5196d != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5196d);
        }
        if (this.f5195c != null && this.f5195c.length > 0) {
            while (i < this.f5195c.length) {
                C0757i c0757i2 = this.f5195c[i];
                if (c0757i2 != null) {
                    b += CodedOutputByteBufferNano.d(7, c0757i2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5193a == null) {
                        this.f5193a = new C0811h();
                    }
                    aVar.a(this.f5193a);
                    continue;
                case 18:
                    a2 = l.a(aVar, 18);
                    a = this.f5194b == null ? 0 : this.f5194b.length;
                    obj = new C0819p[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5194b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0819p();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0819p();
                    aVar.a(obj[a]);
                    this.f5194b = obj;
                    continue;
                case 26:
                    if (this.f5196d == null) {
                        this.f5196d = new C0799a();
                    }
                    aVar.a(this.f5196d);
                    continue;
                case 58:
                    a2 = l.a(aVar, 58);
                    a = this.f5195c == null ? 0 : this.f5195c.length;
                    obj = new ak[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5195c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ak();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ak();
                    aVar.a(obj[a]);
                    this.f5195c = obj;
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
}
