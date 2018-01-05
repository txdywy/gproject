package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0775c extends C0758b {
    public int f4903a;
    public C0781i f4904b;
    public C0777e f4905c;
    public C0784l f4906d;

    public C0775c() {
        this.f4903a = -1;
        this.f4903a = -1;
        this.f4904b = null;
        this.f4903a = -1;
        this.f4905c = null;
        this.f4903a = -1;
        this.f4906d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4903a == 0) {
            codedOutputByteBufferNano.b(1, this.f4904b);
        }
        if (this.f4903a == 1) {
            codedOutputByteBufferNano.b(2, this.f4905c);
        }
        if (this.f4903a == 2) {
            codedOutputByteBufferNano.b(3, this.f4906d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4903a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4904b);
        }
        if (this.f4903a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f4905c);
        }
        if (this.f4903a == 2) {
            return b + CodedOutputByteBufferNano.d(3, this.f4906d);
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
                    if (this.f4904b == null) {
                        this.f4904b = new C0781i();
                    }
                    aVar.a(this.f4904b);
                    this.f4903a = 0;
                    continue;
                case 18:
                    if (this.f4905c == null) {
                        this.f4905c = new C0777e();
                    }
                    aVar.a(this.f4905c);
                    this.f4903a = 1;
                    continue;
                case 26:
                    if (this.f4906d == null) {
                        this.f4906d = new C0784l();
                    }
                    aVar.a(this.f4906d);
                    this.f4903a = 2;
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
