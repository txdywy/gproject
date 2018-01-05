package com.google.p061a.p062a.p063a.p064a.p069b.p070a.p095b.p096a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.h;

public final class ad extends C0758b {
    public static volatile ad[] f5313a;
    public long f5314b;
    public String f5315c;
    public C0837a f5316d;
    public int f5317e;
    public int f5318f;
    public String f5319g;
    public boolean f5320h;

    public static ad[] m5268a() {
        if (f5313a == null) {
            synchronized (h.b) {
                if (f5313a == null) {
                    f5313a = new ad[0];
                }
            }
        }
        return f5313a;
    }

    public ad() {
        this.f5314b = 0;
        this.f5315c = "";
        this.f5316d = null;
        this.f5317e = 0;
        this.f5318f = 0;
        this.f5319g = "";
        this.f5320h = false;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f5315c == null || this.f5315c.equals(""))) {
            codedOutputByteBufferNano.a(1, this.f5315c);
        }
        if (!(this.f5319g == null || this.f5319g.equals(""))) {
            codedOutputByteBufferNano.a(3, this.f5319g);
        }
        if (this.f5317e != 0) {
            codedOutputByteBufferNano.a(4, this.f5317e);
        }
        if (this.f5318f != 0) {
            codedOutputByteBufferNano.a(5, this.f5318f);
        }
        if (this.f5320h) {
            codedOutputByteBufferNano.a(6, this.f5320h);
        }
        if (this.f5314b != 0) {
            codedOutputByteBufferNano.b(7, this.f5314b);
        }
        if (this.f5316d != null) {
            codedOutputByteBufferNano.b(8, this.f5316d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if (!(this.f5315c == null || this.f5315c.equals(""))) {
            b += CodedOutputByteBufferNano.b(1, this.f5315c);
        }
        if (!(this.f5319g == null || this.f5319g.equals(""))) {
            b += CodedOutputByteBufferNano.b(3, this.f5319g);
        }
        if (this.f5317e != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f5317e);
        }
        if (this.f5318f != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f5318f);
        }
        if (this.f5320h) {
            b += CodedOutputByteBufferNano.d(6) + 1;
        }
        if (this.f5314b != 0) {
            b += CodedOutputByteBufferNano.f(7, this.f5314b);
        }
        if (this.f5316d != null) {
            return b + CodedOutputByteBufferNano.d(8, this.f5316d);
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
                    this.f5315c = aVar.f();
                    continue;
                case 26:
                    this.f5319g = aVar.f();
                    continue;
                case 32:
                    this.f5317e = aVar.i();
                    continue;
                case 40:
                    this.f5318f = aVar.i();
                    continue;
                case 48:
                    this.f5320h = aVar.e();
                    continue;
                case 56:
                    this.f5314b = aVar.j();
                    continue;
                case 66:
                    if (this.f5316d == null) {
                        this.f5316d = new C0837a();
                    }
                    aVar.a(this.f5316d);
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
