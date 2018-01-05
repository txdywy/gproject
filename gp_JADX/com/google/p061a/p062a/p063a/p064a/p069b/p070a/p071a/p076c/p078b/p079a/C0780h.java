package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0780h extends C0758b {
    public String f4928a;
    public byte[] f4929b;
    public String f4930c;

    public C0780h() {
        this.f4928a = "";
        this.f4929b = l.l;
        this.f4930c = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4928a == null || this.f4928a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4928a);
        }
        if (!Arrays.equals(this.f4929b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f4929b);
        }
        if (!(this.f4930c == null || this.f4930c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f4930c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4928a == null || this.f4928a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4928a);
        }
        if (!Arrays.equals(this.f4929b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f4929b);
        }
        if (this.f4930c == null || this.f4930c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(3, this.f4930c);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f4928a = aVar.f();
                    continue;
                case 18:
                    this.f4929b = aVar.g();
                    continue;
                case 26:
                    this.f4930c = aVar.f();
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
