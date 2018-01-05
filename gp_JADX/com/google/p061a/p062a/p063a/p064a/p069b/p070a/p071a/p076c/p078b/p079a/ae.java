package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class ae extends C0758b {
    public String f4872a;
    public byte[] f4873b;
    public String f4874c;
    public String f4875d;
    public String f4876e;

    public ae() {
        this.f4872a = "";
        this.f4873b = l.l;
        this.f4874c = "";
        this.f4875d = "";
        this.f4876e = "";
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4874c == null || this.f4874c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4874c);
        }
        if (!(this.f4872a == null || this.f4872a.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f4872a);
        }
        if (!Arrays.equals(this.f4873b, l.l)) {
            codedOutputByteBufferNano.a(3, this.f4873b);
        }
        if (!(this.f4875d == null || this.f4875d.equals(""))) {
            codedOutputByteBufferNano.a(4, this.f4875d);
        }
        if (!(this.f4876e == null || this.f4876e.equals(""))) {
            codedOutputByteBufferNano.a(5, this.f4876e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4874c == null || this.f4874c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4874c);
        }
        if (!(this.f4872a == null || this.f4872a.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f4872a);
        }
        if (!Arrays.equals(this.f4873b, l.l)) {
            b += CodedOutputByteBufferNano.b(3, this.f4873b);
        }
        if (!(this.f4875d == null || this.f4875d.equals(""))) {
            b += CodedOutputByteBufferNano.b(4, this.f4875d);
        }
        if (this.f4876e == null || this.f4876e.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(5, this.f4876e);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f4874c = aVar.f();
                    continue;
                case 18:
                    this.f4872a = aVar.f();
                    continue;
                case 26:
                    this.f4873b = aVar.g();
                    continue;
                case 34:
                    this.f4875d = aVar.f();
                    continue;
                case 42:
                    this.f4876e = aVar.f();
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
