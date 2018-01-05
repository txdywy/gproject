package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4714r extends C0758b {
    public int f24245a;
    public int f24246b;
    public byte[] f24247c;
    public boolean f24248d;
    public boolean f24249e;
    public boolean f24250f;

    public static int m21938a(int i) {
        switch (i) {
            case 0:
            case 1:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum UserDecision");
        }
    }

    public C4714r() {
        this.f24245a = 0;
        this.f24246b = 0;
        this.f24247c = l.l;
        this.f24248d = false;
        this.f24249e = false;
        this.f24250f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24245a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24246b);
        }
        if ((this.f24245a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24247c);
        }
        if ((this.f24245a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24248d);
        }
        if ((this.f24245a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f24249e);
        }
        if ((this.f24245a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f24250f);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24245a & 1) != 0) {
            b += CodedOutputByteBufferNano.d(1, this.f24246b);
        }
        if ((this.f24245a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f24247c);
        }
        if ((this.f24245a & 4) != 0) {
            b += CodedOutputByteBufferNano.d(3) + 1;
        }
        if ((this.f24245a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4) + 1;
        }
        if ((this.f24245a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.d(5) + 1);
        }
        return b;
    }

    private final C4714r m21939b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24245a |= 1;
                    int o = aVar.o();
                    try {
                        this.f24246b = C4714r.m21938a(aVar.i());
                        this.f24245a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 18:
                    this.f24247c = aVar.g();
                    this.f24245a |= 2;
                    continue;
                case 24:
                    this.f24248d = aVar.e();
                    this.f24245a |= 4;
                    continue;
                case 32:
                    this.f24249e = aVar.e();
                    this.f24245a |= 8;
                    continue;
                case 40:
                    this.f24250f = aVar.e();
                    this.f24245a |= 16;
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

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m21939b(aVar);
    }
}
