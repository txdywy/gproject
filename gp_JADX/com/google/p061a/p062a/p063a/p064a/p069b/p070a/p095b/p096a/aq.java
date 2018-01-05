package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class aq extends C0758b {
    public static volatile aq[] f5386a;
    public String f5387b;
    public String f5388c;
    public ae f5389d;
    public long f5390e;
    public ae f5391f;
    public ad f5392g;

    public static aq[] m5323a() {
        if (f5386a == null) {
            synchronized (h.b) {
                if (f5386a == null) {
                    f5386a = new aq[0];
                }
            }
        }
        return f5386a;
    }

    public aq() {
        this.f5387b = "";
        this.f5388c = "";
        this.f5389d = null;
        this.f5390e = 0;
        this.f5391f = null;
        this.f5392g = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5387b == null || this.f5387b.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5387b);
        }
        if (!(this.f5388c == null || this.f5388c.equals(""))) {
            codedOutputByteBufferNano.a(2, this.f5388c);
        }
        if (this.f5391f != null) {
            codedOutputByteBufferNano.b(4, this.f5391f);
        }
        if (this.f5390e != 0) {
            codedOutputByteBufferNano.b(5, this.f5390e);
        }
        if (this.f5392g != null) {
            codedOutputByteBufferNano.b(6, this.f5392g);
        }
        if (this.f5389d != null) {
            codedOutputByteBufferNano.b(8, this.f5389d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5387b == null || this.f5387b.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5387b);
        }
        if (!(this.f5388c == null || this.f5388c.equals(""))) {
            b += CodedOutputByteBufferNano.b(2, this.f5388c);
        }
        if (this.f5391f != null) {
            b += CodedOutputByteBufferNano.d(4, this.f5391f);
        }
        if (this.f5390e != 0) {
            b += CodedOutputByteBufferNano.f(5, this.f5390e);
        }
        if (this.f5392g != null) {
            b += CodedOutputByteBufferNano.d(6, this.f5392g);
        }
        if (this.f5389d != null) {
            return b + CodedOutputByteBufferNano.d(8, this.f5389d);
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
                    this.f5387b = aVar.f();
                    continue;
                case 18:
                    this.f5388c = aVar.f();
                    continue;
                case 34:
                    if (this.f5391f == null) {
                        this.f5391f = new ae();
                    }
                    aVar.a(this.f5391f);
                    continue;
                case 40:
                    this.f5390e = aVar.j();
                    continue;
                case 50:
                    if (this.f5392g == null) {
                        this.f5392g = new ad();
                    }
                    aVar.a(this.f5392g);
                    continue;
                case 66:
                    if (this.f5389d == null) {
                        this.f5389d = new ae();
                    }
                    aVar.a(this.f5389d);
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
