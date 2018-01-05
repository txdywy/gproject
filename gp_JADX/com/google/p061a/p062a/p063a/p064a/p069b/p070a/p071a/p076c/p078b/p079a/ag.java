package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class ag extends C0758b {
    public String f4877a;
    public String f4878b;
    public String f4879c;

    public ag() {
        this.f4877a = "";
        this.f4878b = "";
        this.f4879c = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4877a == null || this.f4877a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4877a);
        }
        if (!(this.f4878b == null || this.f4878b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f4878b);
        }
        if (!(this.f4879c == null || this.f4879c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4879c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4877a == null || this.f4877a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4877a);
        }
        if (!(this.f4878b == null || this.f4878b.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f4878b);
        }
        if (this.f4879c == null || this.f4879c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(3, this.f4879c);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f4877a = aVar.f();
                    continue;
                case 18:
                    this.f4878b = aVar.f();
                    continue;
                case 26:
                    this.f4879c = aVar.f();
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
