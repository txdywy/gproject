package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p089i.p090a;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f.C0811h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0830a extends C0758b {
    public C0811h f5274a;
    public String f5275b;
    public boolean f5276c;
    public int f5277d;

    public C0830a() {
        this.f5274a = null;
        this.f5275b = "";
        this.f5276c = false;
        this.f5277d = 0;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5274a != null) {
            codedOutputByteBufferNano.b(1, this.f5274a);
        }
        if (!(this.f5275b == null || this.f5275b.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5275b);
        }
        if (this.f5276c) {
            codedOutputByteBufferNano.a(3, this.f5276c);
        }
        if (this.f5277d != 0) {
            codedOutputByteBufferNano.a(4, this.f5277d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5274a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5274a);
        }
        if (!(this.f5275b == null || this.f5275b.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5275b);
        }
        if (this.f5276c) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if (this.f5277d != 0) {
            return b + CodedOutputByteBufferNano.d(4, this.f5277d);
        }
        return b;
    }

    private final C0830a m5231b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5274a == null) {
                        this.f5274a = new C0811h();
                    }
                    aVar.a(this.f5274a);
                    continue;
                case 18:
                    this.f5275b = aVar.f();
                    continue;
                case 24:
                    this.f5276c = aVar.e();
                    continue;
                case 32:
                    int o = aVar.o();
                    try {
                        this.f5277d = C0833d.m5241a(aVar.i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m5231b(aVar);
    }
}
