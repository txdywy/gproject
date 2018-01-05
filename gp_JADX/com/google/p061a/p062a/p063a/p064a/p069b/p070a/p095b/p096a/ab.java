package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ab extends C0758b {
    public static volatile ab[] f5309a;
    public String f5310b;
    public String f5311c;
    public String f5312d;

    public static ab[] m5264a() {
        if (f5309a == null) {
            synchronized (h.b) {
                if (f5309a == null) {
                    f5309a = new ab[0];
                }
            }
        }
        return f5309a;
    }

    public ab() {
        this.f5310b = "";
        this.f5311c = "";
        this.f5312d = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5310b == null || this.f5310b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5310b);
        }
        if (!(this.f5311c == null || this.f5311c.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5311c);
        }
        if (!(this.f5312d == null || this.f5312d.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5312d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5310b == null || this.f5310b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5310b);
        }
        if (!(this.f5311c == null || this.f5311c.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5311c);
        }
        if (this.f5312d == null || this.f5312d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(3, this.f5312d);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f5310b = aVar.f();
                    continue;
                case 18:
                    this.f5311c = aVar.f();
                    continue;
                case 26:
                    this.f5312d = aVar.f();
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
