package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p076c.p078b.p079a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0806c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0813j;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0787o extends C0758b {
    public static volatile C0787o[] f4963b;
    public int f4964a;
    public at f4965c;
    public C0806c f4966d;
    public C0813j f4967e;

    public static C0787o[] m5053a() {
        if (f4963b == null) {
            synchronized (h.b) {
                if (f4963b == null) {
                    f4963b = new C0787o[0];
                }
            }
        }
        return f4963b;
    }

    public C0787o() {
        this.f4964a = -1;
        this.f4964a = -1;
        this.f4965c = null;
        this.f4964a = -1;
        this.f4966d = null;
        this.f4964a = -1;
        this.f4967e = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4964a == 0) {
            codedOutputByteBufferNano.b(1, this.f4965c);
        }
        if (this.f4964a == 1) {
            codedOutputByteBufferNano.b(2, this.f4966d);
        }
        if (this.f4964a == 2) {
            codedOutputByteBufferNano.b(3, this.f4967e);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f4964a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f4965c);
        }
        if (this.f4964a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f4966d);
        }
        if (this.f4964a == 2) {
            return b + CodedOutputByteBufferNano.d(3, this.f4967e);
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
                    if (this.f4965c == null) {
                        this.f4965c = new at();
                    }
                    aVar.a(this.f4965c);
                    this.f4964a = 0;
                    continue;
                case 18:
                    if (this.f4966d == null) {
                        this.f4966d = new C0806c();
                    }
                    aVar.a(this.f4966d);
                    this.f4964a = 1;
                    continue;
                case 26:
                    if (this.f4967e == null) {
                        this.f4967e = new C0813j();
                    }
                    aVar.a(this.f4967e);
                    this.f4964a = 2;
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
