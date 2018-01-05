package com.google.p061a.p062a.p063a.p064a.p069b.p098b.p099a;

import com.google.h.c.c.b.d.c;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0867e;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0868f;
import com.google.p061a.p062a.p063a.p064a.p069b.p070a.p097c.C0870h;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C0877g extends C0758b {
    public C0870h f5590a;
    public C0867e f5591b;
    public C0868f f5592c;
    public int f5593d;
    public C0874d f5594e;

    public C0877g() {
        this.f5590a = null;
        this.f5591b = null;
        this.f5592c = null;
        this.f5593d = 0;
        this.f5594e = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f5590a != null) {
            codedOutputByteBufferNano.b(1, this.f5590a);
        }
        if (this.f5591b != null) {
            codedOutputByteBufferNano.b(2, this.f5591b);
        }
        if (this.f5594e != null) {
            codedOutputByteBufferNano.b(3, this.f5594e);
        }
        if (this.f5592c != null) {
            codedOutputByteBufferNano.b(4, this.f5592c);
        }
        if (this.f5593d != 0) {
            codedOutputByteBufferNano.a(5, this.f5593d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (this.f5590a != null) {
            b += CodedOutputByteBufferNano.d(1, this.f5590a);
        }
        if (this.f5591b != null) {
            b += CodedOutputByteBufferNano.d(2, this.f5591b);
        }
        if (this.f5594e != null) {
            b += CodedOutputByteBufferNano.d(3, this.f5594e);
        }
        if (this.f5592c != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5592c);
        }
        if (this.f5593d != 0) {
            return b + CodedOutputByteBufferNano.d(5, this.f5593d);
        }
        return b;
    }

    private final C0877g m5494b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f5590a == null) {
                        this.f5590a = new C0870h();
                    }
                    aVar.a(this.f5590a);
                    continue;
                case 18:
                    if (this.f5591b == null) {
                        this.f5591b = new C0867e();
                    }
                    aVar.a(this.f5591b);
                    continue;
                case 26:
                    if (this.f5594e == null) {
                        this.f5594e = new C0874d();
                    }
                    aVar.a(this.f5594e);
                    continue;
                case 34:
                    if (this.f5592c == null) {
                        this.f5592c = new C0868f();
                    }
                    aVar.a(this.f5592c);
                    continue;
                case 40:
                    int o = aVar.o();
                    try {
                        this.f5593d = c.a(aVar.i());
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
        return m5494b(aVar);
    }
}
