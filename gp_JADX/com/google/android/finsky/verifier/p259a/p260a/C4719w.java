package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4719w extends C0758b {
    public int f24272a;
    public byte[] f24273b;
    public long f24274c;
    public boolean f24275d;
    public int f24276e;
    public C4720x f24277f;
    public C4720x f24278g;
    public int f24279h;
    public int f24280i;

    public C4719w() {
        this.f24272a = 0;
        this.f24273b = l.l;
        this.f24274c = 0;
        this.f24275d = false;
        this.f24276e = -1;
        this.f24277f = null;
        this.f24278g = null;
        this.f24279h = 0;
        this.f24280i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24272a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24273b);
        }
        if ((this.f24272a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24274c);
        }
        if ((this.f24272a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24275d);
        }
        if ((this.f24272a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24276e);
        }
        if (this.f24277f != null) {
            codedOutputByteBufferNano.b(5, this.f24277f);
        }
        if (this.f24278g != null) {
            codedOutputByteBufferNano.b(6, this.f24278g);
        }
        if ((this.f24272a & 16) != 0) {
            codedOutputByteBufferNano.a(7, this.f24279h);
        }
        if ((this.f24272a & 32) != 0) {
            codedOutputByteBufferNano.a(8, this.f24280i);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24272a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24273b);
        }
        if ((this.f24272a & 2) != 0) {
            b += CodedOutputByteBufferNano.e(2, this.f24274c);
        }
        if ((this.f24272a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f24272a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f24276e);
        }
        if (this.f24277f != null) {
            b += CodedOutputByteBufferNano.d(5, this.f24277f);
        }
        if (this.f24278g != null) {
            b += CodedOutputByteBufferNano.d(6, this.f24278g);
        }
        if ((this.f24272a & 16) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f24279h);
        }
        if ((this.f24272a & 32) != 0) {
            return b + CodedOutputByteBufferNano.d(8, this.f24280i);
        }
        return b;
    }

    private final C4719w m21956b(a aVar) {
        int o;
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24273b = aVar.g();
                    this.f24272a |= 1;
                    continue;
                case 16:
                    this.f24274c = aVar.j();
                    this.f24272a |= 2;
                    continue;
                case 24:
                    this.f24275d = aVar.e();
                    this.f24272a |= 4;
                    continue;
                case 32:
                    this.f24272a |= 8;
                    o = aVar.o();
                    try {
                        this.f24276e = ac.m21857a(aVar.i());
                        this.f24272a |= 8;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 42:
                    if (this.f24277f == null) {
                        this.f24277f = new C4720x();
                    }
                    aVar.a(this.f24277f);
                    continue;
                case 50:
                    if (this.f24278g == null) {
                        this.f24278g = new C4720x();
                    }
                    aVar.a(this.f24278g);
                    continue;
                case 56:
                    this.f24272a |= 16;
                    o = aVar.o();
                    try {
                        this.f24279h = C4712p.m21930a(aVar.i());
                        this.f24272a |= 16;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 64:
                    this.f24272a |= 32;
                    o = aVar.o();
                    try {
                        this.f24280i = C4714r.m21938a(aVar.i());
                        this.f24272a |= 32;
                        continue;
                    } catch (IllegalArgumentException e3) {
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
        return m21956b(aVar);
    }
}
