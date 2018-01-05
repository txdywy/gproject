package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p072a.p073a.C0766b;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0770c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p077a.C0772e;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a.ab;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class C0875e extends C0758b {
    public int f5581a;
    public C0766b f5582b;
    public C0772e f5583c;
    public ab f5584d;
    public C0770c f5585e;
    public byte[] f5586f;

    public C0875e() {
        this.f5581a = -1;
        this.f5581a = -1;
        this.f5582b = null;
        this.f5581a = -1;
        this.f5583c = null;
        this.f5581a = -1;
        this.f5584d = null;
        this.f5581a = -1;
        this.f5585e = null;
        this.f5586f = l.l;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5581a == 0) {
            codedOutputByteBufferNano.b(1, this.f5582b);
        }
        if (this.f5581a == 1) {
            codedOutputByteBufferNano.b(2, this.f5583c);
        }
        if (this.f5581a == 2) {
            codedOutputByteBufferNano.b(3, this.f5584d);
        }
        if (!Arrays.equals(this.f5586f, l.l)) {
            codedOutputByteBufferNano.a(6, this.f5586f);
        }
        if (this.f5581a == 3) {
            codedOutputByteBufferNano.b(7, this.f5585e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5581a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5582b);
        }
        if (this.f5581a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f5583c);
        }
        if (this.f5581a == 2) {
            b += CodedOutputByteBufferNano.d(3, this.f5584d);
        }
        if (!Arrays.equals(this.f5586f, l.l)) {
            b += CodedOutputByteBufferNano.b(6, this.f5586f);
        }
        if (this.f5581a == 3) {
            return b + CodedOutputByteBufferNano.d(7, this.f5585e);
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
                    if (this.f5582b == null) {
                        this.f5582b = new C0766b();
                    }
                    aVar.a(this.f5582b);
                    this.f5581a = 0;
                    continue;
                case 18:
                    if (this.f5583c == null) {
                        this.f5583c = new C0772e();
                    }
                    aVar.a(this.f5583c);
                    this.f5581a = 1;
                    continue;
                case 26:
                    if (this.f5584d == null) {
                        this.f5584d = new ab();
                    }
                    aVar.a(this.f5584d);
                    this.f5581a = 2;
                    continue;
                case 50:
                    this.f5586f = aVar.g();
                    continue;
                case 58:
                    if (this.f5585e == null) {
                        this.f5585e = new C0770c();
                    }
                    aVar.a(this.f5585e);
                    this.f5581a = 3;
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
