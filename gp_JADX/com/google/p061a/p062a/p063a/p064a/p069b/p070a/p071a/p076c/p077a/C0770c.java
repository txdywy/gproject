package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0776d;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.C0780h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0770c extends C0758b {
    public int f4801a;
    public C0776d f4802b;
    public C0780h f4803c;
    public byte[] f4804d;

    public C0770c() {
        this.f4801a = -1;
        this.f4801a = -1;
        this.f4802b = null;
        this.f4801a = -1;
        this.f4803c = null;
        this.f4804d = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4801a == 0) {
            codedOutputByteBufferNano.b(1, this.f4802b);
        }
        if (this.f4801a == 1) {
            codedOutputByteBufferNano.b(2, this.f4803c);
        }
        if (!Arrays.equals(this.f4804d, l.l)) {
            codedOutputByteBufferNano.a(3, this.f4804d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4801a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4802b);
        }
        if (this.f4801a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f4803c);
        }
        if (Arrays.equals(this.f4804d, l.l)) {
            return b;
        }
        return b + CodedOutputByteBufferNano.b(3, this.f4804d);
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f4802b == null) {
                        this.f4802b = new C0776d();
                    }
                    aVar.a(this.f4802b);
                    this.f4801a = 0;
                    continue;
                case 18:
                    if (this.f4803c == null) {
                        this.f4803c = new C0780h();
                    }
                    aVar.a(this.f4803c);
                    this.f4801a = 1;
                    continue;
                case 26:
                    this.f4804d = aVar.g();
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
