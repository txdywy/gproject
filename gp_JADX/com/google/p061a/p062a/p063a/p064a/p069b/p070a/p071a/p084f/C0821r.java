package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0821r extends C0758b {
    public static volatile C0821r[] f5205b;
    public int f5206a;
    public C0823t f5207c;
    public C0817n f5208d;

    public static C0821r[] m5195a() {
        if (f5205b == null) {
            synchronized (h.b) {
                if (f5205b == null) {
                    f5205b = new C0821r[0];
                }
            }
        }
        return f5205b;
    }

    public C0821r() {
        this.f5206a = -1;
        this.f5206a = -1;
        this.f5207c = null;
        this.f5206a = -1;
        this.f5208d = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5206a == 0) {
            codedOutputByteBufferNano.b(1, this.f5207c);
        }
        if (this.f5206a == 1) {
            codedOutputByteBufferNano.b(2, this.f5208d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5206a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5207c);
        }
        if (this.f5206a == 1) {
            return b + CodedOutputByteBufferNano.d(2, this.f5208d);
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
                    if (this.f5207c == null) {
                        this.f5207c = new C0823t();
                    }
                    aVar.a(this.f5207c);
                    this.f5206a = 0;
                    continue;
                case 18:
                    if (this.f5208d == null) {
                        this.f5208d = new C0817n();
                    }
                    aVar.a(this.f5208d);
                    this.f5206a = 1;
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
