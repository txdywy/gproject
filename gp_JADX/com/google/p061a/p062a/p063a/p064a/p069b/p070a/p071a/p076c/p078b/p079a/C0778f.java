package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0778f extends C0758b {
    public String f4917a;
    public byte[] f4918b;
    public at f4919c;

    public C0778f() {
        this.f4917a = "";
        this.f4918b = l.l;
        this.f4919c = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f4917a == null || this.f4917a.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f4917a);
        }
        if (!Arrays.equals(this.f4918b, l.l)) {
            codedOutputByteBufferNano.a(2, this.f4918b);
        }
        if (this.f4919c != null) {
            codedOutputByteBufferNano.b(4, this.f4919c);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f4917a == null || this.f4917a.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f4917a);
        }
        if (!Arrays.equals(this.f4918b, l.l)) {
            b += CodedOutputByteBufferNano.b(2, this.f4918b);
        }
        if (this.f4919c != null) {
            return b + CodedOutputByteBufferNano.d(4, this.f4919c);
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
                    this.f4917a = aVar.f();
                    continue;
                case 18:
                    this.f4918b = aVar.g();
                    continue;
                case 34:
                    if (this.f4919c == null) {
                        this.f4919c = new at();
                    }
                    aVar.a(this.f4919c);
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
