package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a.C0799a;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0822s extends C0758b {
    public C0811h f5209a;
    public C0816m[] f5210b;
    public C0799a f5211c;

    public C0822s() {
        this.f5209a = null;
        this.f5210b = C0816m.m5164a();
        this.f5211c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5209a != null) {
            codedOutputByteBufferNano.b(1, this.f5209a);
        }
        if (this.f5210b != null && this.f5210b.length > 0) {
            for (C0757i c0757i : this.f5210b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f5211c != null) {
            codedOutputByteBufferNano.b(3, this.f5211c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5209a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5209a);
        }
        if (this.f5210b != null && this.f5210b.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5210b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if (this.f5211c != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f5211c);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5209a == null) {
                        this.f5209a = new C0811h();
                    }
                    aVar.a(this.f5209a);
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f5210b == null ? 0 : this.f5210b.length;
                    Object obj = new C0816m[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5210b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0816m();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0816m();
                    aVar.a(obj[a]);
                    this.f5210b = obj;
                    continue;
                case 26:
                    if (this.f5211c == null) {
                        this.f5211c = new C0799a();
                    }
                    aVar.a(this.f5211c);
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
