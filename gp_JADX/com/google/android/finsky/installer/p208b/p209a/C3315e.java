package com.google.android.finsky.installer.p208b.p209a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;

public final class C3315e extends C0758b {
    public int f17150a;
    public long f17151b;
    public C3314d f17152c;
    public int f17153d;
    public C3313c f17154e;
    public int f17155f;
    public C3311a f17156g;

    public final C3315e m16668a(int i) {
        this.f17150a |= 2;
        this.f17153d = i;
        return this;
    }

    public C3315e() {
        this.f17150a = 0;
        this.f17151b = 0;
        this.f17152c = null;
        this.f17153d = 0;
        this.f17154e = null;
        this.f17155f = 0;
        this.f17156g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f17150a & 1) != 0) {
            codedOutputByteBufferNano.b(1, this.f17151b);
        }
        if (this.f17152c != null) {
            codedOutputByteBufferNano.b(2, this.f17152c);
        }
        if ((this.f17150a & 2) != 0) {
            codedOutputByteBufferNano.a(3, this.f17153d);
        }
        if (this.f17154e != null) {
            codedOutputByteBufferNano.b(4, this.f17154e);
        }
        if ((this.f17150a & 4) != 0) {
            codedOutputByteBufferNano.a(5, this.f17155f);
        }
        if (this.f17156g != null) {
            codedOutputByteBufferNano.b(6, this.f17156g);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f17150a & 1) != 0) {
            b += CodedOutputByteBufferNano.f(1, this.f17151b);
        }
        if (this.f17152c != null) {
            b += CodedOutputByteBufferNano.d(2, this.f17152c);
        }
        if ((this.f17150a & 2) != 0) {
            b += CodedOutputByteBufferNano.d(3, this.f17153d);
        }
        if (this.f17154e != null) {
            b += CodedOutputByteBufferNano.d(4, this.f17154e);
        }
        if ((this.f17150a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(5, this.f17155f);
        }
        if (this.f17156g != null) {
            return b + CodedOutputByteBufferNano.d(6, this.f17156g);
        }
        return b;
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f17151b = aVar.j();
                    this.f17150a |= 1;
                    continue;
                case 18:
                    if (this.f17152c == null) {
                        this.f17152c = new C3314d();
                    }
                    aVar.a(this.f17152c);
                    continue;
                case 24:
                    this.f17153d = aVar.i();
                    this.f17150a |= 2;
                    continue;
                case 34:
                    if (this.f17154e == null) {
                        this.f17154e = new C3313c();
                    }
                    aVar.a(this.f17154e);
                    continue;
                case 40:
                    this.f17155f = aVar.i();
                    this.f17150a |= 4;
                    continue;
                case 50:
                    if (this.f17156g == null) {
                        this.f17156g = new C3311a();
                    }
                    aVar.a(this.f17156g);
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
