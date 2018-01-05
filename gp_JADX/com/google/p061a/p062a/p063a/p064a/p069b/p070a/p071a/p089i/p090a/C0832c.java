package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p089i.p090a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C0832c extends C0758b {
    public boolean f5281a;
    public C0833d[] f5282b;

    public C0832c() {
        this.f5281a = false;
        this.f5282b = C0833d.m5242a();
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5282b != null && this.f5282b.length > 0) {
            for (C0757i c0757i : this.f5282b) {
                if (c0757i != null) {
                    codedOutputByteBufferNano.b(2, c0757i);
                }
            }
        }
        if (this.f5281a) {
            codedOutputByteBufferNano.a(3, this.f5281a);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5282b != null && this.f5282b.length > 0) {
            for (C0757i c0757i : this.f5282b) {
                if (c0757i != null) {
                    b += CodedOutputByteBufferNano.d(2, c0757i);
                }
            }
        }
        if (this.f5281a) {
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
                case 18:
                    int a2 = l.a(aVar, 18);
                    a = this.f5282b == null ? 0 : this.f5282b.length;
                    Object obj = new C0833d[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f5282b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C0833d();
                        aVar.a(obj[a]);
                        aVar.a();
                        a++;
                    }
                    obj[a] = new C0833d();
                    aVar.a(obj[a]);
                    this.f5282b = obj;
                    continue;
                case 24:
                    this.f5281a = aVar.e();
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
