package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0783k extends C0758b {
    public String f4942a;
    public byte[] f4943b;
    public byte[] f4944c;

    public C0783k() {
        this.f4942a = "";
        this.f4943b = l.l;
        this.f4944c = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4942a == null || this.f4942a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4942a);
        }
        if (!Arrays.equals(this.f4943b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f4943b);
        }
        if (!Arrays.equals(this.f4944c, l.l)) {
            codedOutputByteBufferNano.a(3, this.f4944c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4942a == null || this.f4942a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4942a);
        }
        if (!Arrays.equals(this.f4943b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f4943b);
        }
        if (Arrays.equals(this.f4944c, l.l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(3, this.f4944c);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f4942a = aVar.f();
                    continue;
                case 18:
                    this.f4943b = aVar.g();
                    continue;
                case 26:
                    this.f4944c = aVar.g();
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
