package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0815l extends C0758b {
    public String f5167a;
    public long f5168b;
    public byte[] f5169c;
    public String f5170d;
    public String f5171e;

    public C0815l() {
        this.f5167a = "";
        this.f5168b = 0;
        this.f5169c = l.l;
        this.f5170d = "";
        this.f5171e = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5167a == null || this.f5167a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5167a);
        }
        if (!Arrays.equals(this.f5169c, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5169c);
        }
        if (!(this.f5170d == null || this.f5170d.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5170d);
        }
        if (!(this.f5171e == null || this.f5171e.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f5171e);
        }
        if (this.f5168b != 0) {
            codedOutputByteBufferNano.b(5, this.f5168b);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5167a == null || this.f5167a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5167a);
        }
        if (!Arrays.equals(this.f5169c, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5169c);
        }
        if (!(this.f5170d == null || this.f5170d.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5170d);
        }
        if (!(this.f5171e == null || this.f5171e.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f5171e);
        }
        if (this.f5168b != 0) {
            return b + CodedOutputByteBufferNano.f(5, this.f5168b);
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
                    this.f5167a = aVar.f();
                    continue;
                case 18:
                    this.f5169c = aVar.g();
                    continue;
                case 26:
                    this.f5170d = aVar.f();
                    continue;
                case 34:
                    this.f5171e = aVar.f();
                    continue;
                case 40:
                    this.f5168b = aVar.j();
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
