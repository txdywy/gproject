package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p080d.p081a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0801c extends C0758b {
    public C0799a f5073a;
    public C0800b[] f5074b;
    public long f5075c;

    public C0801c() {
        this.f5073a = null;
        this.f5074b = C0800b.m5105a();
        this.f5075c = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5073a != null) {
            codedOutputByteBufferNano.b(1, this.f5073a);
        }
        if (this.f5074b != null && this.f5074b.length > 0) {
            for (C0757i c0757i : this.f5074b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f5075c != 0) {
            codedOutputByteBufferNano.b(3, this.f5075c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5073a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5073a);
        }
        if (this.f5074b != null && this.f5074b.length > 0) {
            int i = b;
            for (C0757i c0757i : this.f5074b) {
                if (c0757i != null) {
                    i += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
            b = i;
        }
        if (this.f5075c != 0) {
            return b + CodedOutputByteBufferNano.f(3, this.f5075c);
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
                    if (this.f5073a == null) {
                        this.f5073a = new C0799a();
                    }
                    aVar.a(this.f5073a);
                    continue;
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f5074b == null ? 0 : this.f5074b.length;
                    Object obj = new C0800b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5074b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0800b();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0800b();
                    aVar.a(obj[a]);
                    this.f5074b = obj;
                    continue;
                case 24:
                    this.f5075c = aVar.j();
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
