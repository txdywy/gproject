package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class aa extends C0758b {
    public ab[] f5306a;
    public String f5307b;
    public boolean f5308c;

    public aa() {
        this.f5306a = ab.m5264a();
        this.f5307b = "";
        this.f5308c = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5306a != null && this.f5306a.length > 0) {
            for (C0757i c0757i : this.f5306a) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(1, c0757i);
                }
            }
        }
        if (!(this.f5307b == null || this.f5307b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5307b);
        }
        if (this.f5308c) {
            codedOutputByteBufferNano.a(3, this.f5308c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5306a != null && this.f5306a.length > 0) {
            for (C0757i c0757i : this.f5306a) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(1, c0757i);
                }
            }
        }
        if (!(this.f5307b == null || this.f5307b.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5307b);
        }
        if (this.f5308c) {
            return b + (CodedOutputByteBufferNano.d(3) + 1);
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
                    int a2 = l.a(aVar, 10);
                    a = this.f5306a == null ? 0 : this.f5306a.length;
                    Object obj = new ab[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5306a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ab();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new ab();
                    aVar.a(obj[a]);
                    this.f5306a = obj;
                    continue;
                case 18:
                    this.f5307b = aVar.f();
                    continue;
                case 24:
                    this.f5308c = aVar.e();
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
