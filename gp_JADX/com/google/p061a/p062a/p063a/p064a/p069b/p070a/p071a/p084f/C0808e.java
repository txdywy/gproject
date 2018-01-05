package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0808e extends C0758b {
    public String f5128a;
    public byte[] f5129b;
    public String f5130c;

    public C0808e() {
        this.f5128a = "";
        this.f5129b = l.l;
        this.f5130c = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5128a == null || this.f5128a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5128a);
        }
        if (!Arrays.equals(this.f5129b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f5129b);
        }
        if (!(this.f5130c == null || this.f5130c.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5130c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5128a == null || this.f5128a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5128a);
        }
        if (!Arrays.equals(this.f5129b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f5129b);
        }
        if (this.f5130c == null || this.f5130c.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(3, this.f5130c);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5128a = aVar.f();
                    continue;
                case 18:
                    this.f5129b = aVar.g();
                    continue;
                case 26:
                    this.f5130c = aVar.f();
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
