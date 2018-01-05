package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p072a.p073a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0772e;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0806c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p091j.p092a.C0835b;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0766b extends C0758b {
    public C0772e f4788a;
    public C0806c f4789b;
    public String f4790c;
    public String f4791d;
    public C0835b f4792e;

    public C0766b() {
        this.f4788a = null;
        this.f4789b = null;
        this.f4790c = "";
        this.f4791d = "";
        this.f4792e = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4788a != null) {
            codedOutputByteBufferNano.b(1, this.f4788a);
        }
        if (!(this.f4790c == null || this.f4790c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4790c);
        }
        if (this.f4789b != null) {
            codedOutputByteBufferNano.b(4, this.f4789b);
        }
        if (!(this.f4791d == null || this.f4791d.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f4791d);
        }
        if (this.f4792e != null) {
            codedOutputByteBufferNano.b(6, this.f4792e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4788a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f4788a);
        }
        if (!(this.f4790c == null || this.f4790c.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f4790c);
        }
        if (this.f4789b != null) {
            b += CodedOutputByteBufferNano.d(4, this.f4789b);
        }
        if (!(this.f4791d == null || this.f4791d.equals(""))) {
            b += CodedOutputByteBufferNano.b(5, this.f4791d);
        }
        if (this.f4792e != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f4792e);
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
                    if (this.f4788a == null) {
                        this.f4788a = new C0772e();
                    }
                    aVar.a(this.f4788a);
                    continue;
                case 26:
                    this.f4790c = aVar.f();
                    continue;
                case 34:
                    if (this.f4789b == null) {
                        this.f4789b = new C0806c();
                    }
                    aVar.a(this.f4789b);
                    continue;
                case 42:
                    this.f4791d = aVar.f();
                    continue;
                case 50:
                    if (this.f4792e == null) {
                        this.f4792e = new C0835b();
                    }
                    aVar.a(this.f4792e);
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
