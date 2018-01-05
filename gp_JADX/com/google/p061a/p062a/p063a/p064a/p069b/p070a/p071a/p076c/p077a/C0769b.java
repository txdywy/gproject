package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0775c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0779g;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0769b extends C0758b {
    public int f4797a;
    public C0811h f4798b;
    public C0775c f4799c;
    public C0779g f4800d;

    public C0769b() {
        this.f4797a = -1;
        this.f4798b = null;
        this.f4797a = -1;
        this.f4799c = null;
        this.f4797a = -1;
        this.f4800d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4797a == 0) {
            codedOutputByteBufferNano.b(1, this.f4799c);
        }
        if (this.f4797a == 1) {
            codedOutputByteBufferNano.b(2, this.f4800d);
        }
        if (this.f4798b != null) {
            codedOutputByteBufferNano.b(3, this.f4798b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4797a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4799c);
        }
        if (this.f4797a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f4800d);
        }
        if (this.f4798b != null) {
            return b + CodedOutputByteBufferNano.d(3, this.f4798b);
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
                    if (this.f4799c == null) {
                        this.f4799c = new C0775c();
                    }
                    aVar.a(this.f4799c);
                    this.f4797a = 0;
                    continue;
                case 18:
                    if (this.f4800d == null) {
                        this.f4800d = new C0779g();
                    }
                    aVar.a(this.f4800d);
                    this.f4797a = 1;
                    continue;
                case 26:
                    if (this.f4798b == null) {
                        this.f4798b = new C0811h();
                    }
                    aVar.a(this.f4798b);
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
