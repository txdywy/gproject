package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p084f;

import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p071a.p082e.p083a.C0803b;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a.at;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class C0817n extends C0758b {
    public static volatile C0817n[] f5185b;
    public int f5186a;
    public at f5187c;
    public C0806c f5188d;
    public C0813j f5189e;
    public C0803b f5190f;
    public C0815l f5191g;
    public C0808e f5192h;

    public static C0817n[] m5178a() {
        if (f5185b == null) {
            synchronized (h.b) {
                if (f5185b == null) {
                    f5185b = new C0817n[0];
                }
            }
        }
        return f5185b;
    }

    public final C0817n m5179a(at atVar) {
        if (atVar == null) {
            if (this.f5186a == 0) {
                this.f5186a = -1;
            }
            this.f5187c = null;
        } else {
            this.f5186a = -1;
            this.f5186a = 0;
            this.f5187c = atVar;
        }
        return this;
    }

    public C0817n() {
        this.f5186a = -1;
        this.f5186a = -1;
        this.f5187c = null;
        this.f5186a = -1;
        this.f5188d = null;
        this.f5186a = -1;
        this.f5189e = null;
        this.f5186a = -1;
        this.f5190f = null;
        this.f5186a = -1;
        this.f5191g = null;
        this.f5186a = -1;
        this.f5192h = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5186a == 0) {
            codedOutputByteBufferNano.b(1, this.f5187c);
        }
        if (this.f5186a == 1) {
            codedOutputByteBufferNano.b(2, this.f5188d);
        }
        if (this.f5186a == 2) {
            codedOutputByteBufferNano.b(3, this.f5189e);
        }
        if (this.f5186a == 3) {
            codedOutputByteBufferNano.b(4, this.f5190f);
        }
        if (this.f5186a == 4) {
            codedOutputByteBufferNano.b(5, this.f5191g);
        }
        if (this.f5186a == 5) {
            codedOutputByteBufferNano.b(6, this.f5192h);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5186a == 0) {
            b += CodedOutputByteBufferNano.d(1, this.f5187c);
        }
        if (this.f5186a == 1) {
            b += CodedOutputByteBufferNano.d(2, this.f5188d);
        }
        if (this.f5186a == 2) {
            b += CodedOutputByteBufferNano.d(3, this.f5189e);
        }
        if (this.f5186a == 3) {
            b += CodedOutputByteBufferNano.d(4, this.f5190f);
        }
        if (this.f5186a == 4) {
            b += CodedOutputByteBufferNano.d(5, this.f5191g);
        }
        if (this.f5186a == 5) {
            return b + CodedOutputByteBufferNano.d(6, this.f5192h);
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
                    if (this.f5187c == null) {
                        this.f5187c = new at();
                    }
                    aVar.a(this.f5187c);
                    this.f5186a = 0;
                    continue;
                case 18:
                    if (this.f5188d == null) {
                        this.f5188d = new C0806c();
                    }
                    aVar.a(this.f5188d);
                    this.f5186a = 1;
                    continue;
                case 26:
                    if (this.f5189e == null) {
                        this.f5189e = new C0813j();
                    }
                    aVar.a(this.f5189e);
                    this.f5186a = 2;
                    continue;
                case 34:
                    if (this.f5190f == null) {
                        this.f5190f = new C0803b();
                    }
                    aVar.a(this.f5190f);
                    this.f5186a = 3;
                    continue;
                case 42:
                    if (this.f5191g == null) {
                        this.f5191g = new C0815l();
                    }
                    aVar.a(this.f5191g);
                    this.f5186a = 4;
                    continue;
                case 50:
                    if (this.f5192h == null) {
                        this.f5192h = new C0808e();
                    }
                    aVar.a(this.f5192h);
                    this.f5186a = 5;
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
