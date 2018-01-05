package com.google.android.finsky.verifier.p259a.p260a;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;

public final class C4704h extends C0758b {
    public int f24198a;
    public byte[] f24199b;
    public byte[] f24200c;
    public byte[] f24201d;

    public final C4704h m21900a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException();
        }
        this.f24198a |= 1;
        this.f24199b = bArr;
        return this;
    }

    public C4704h() {
        this.f24198a = 0;
        this.f24199b = l.l;
        this.f24200c = l.l;
        this.f24201d = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f24198a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f24199b);
        }
        if ((this.f24198a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f24200c);
        }
        if ((this.f24198a & 4) != 0) {
            codedOutputByteBufferNano.a(3, this.f24201d);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f24198a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f24199b);
        }
        if ((this.f24198a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f24200c);
        }
        if ((this.f24198a & 4) != 0) {
            return b + CodedOutputByteBufferNano.b(3, this.f24201d);
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
                    this.f24199b = aVar.g();
                    this.f24198a |= 1;
                    continue;
                case 18:
                    this.f24200c = aVar.g();
                    this.f24198a |= 2;
                    continue;
                case 26:
                    this.f24201d = aVar.g();
                    this.f24198a |= 4;
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
