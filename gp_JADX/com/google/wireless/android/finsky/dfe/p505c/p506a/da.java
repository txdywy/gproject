package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class da extends b {
    public int f37392a;
    public float f37393b;
    public float f37394c;
    public float f37395d;
    public float f37396e;
    public String f37397f;

    public da() {
        this.f37392a = 0;
        this.f37393b = 0.0f;
        this.f37394c = 0.0f;
        this.f37395d = 0.0f;
        this.f37396e = 0.0f;
        this.f37397f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35342a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37392a & 1) != 0) {
            codedOutputByteBufferNano.m33517a(1, this.f37393b);
        }
        if ((this.f37392a & 2) != 0) {
            codedOutputByteBufferNano.m33517a(2, this.f37394c);
        }
        if ((this.f37392a & 4) != 0) {
            codedOutputByteBufferNano.m33517a(3, this.f37395d);
        }
        if ((this.f37392a & 8) != 0) {
            codedOutputByteBufferNano.m33517a(4, this.f37396e);
        }
        if ((this.f37392a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37397f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35343b() {
        int b = super.b();
        if ((this.f37392a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 4;
        }
        if ((this.f37392a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 4;
        }
        if ((this.f37392a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 4;
        }
        if ((this.f37392a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 4;
        }
        if ((this.f37392a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f37397f);
        }
        return b;
    }

    public final /* synthetic */ i m35341a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f37393b = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37392a |= 1;
                    continue;
                case 21:
                    this.f37394c = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37392a |= 2;
                    continue;
                case 29:
                    this.f37395d = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37392a |= 4;
                    continue;
                case 37:
                    this.f37396e = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37392a |= 8;
                    continue;
                case 42:
                    this.f37397f = c7213a.m33564f();
                    this.f37392a |= 16;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
