package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7509a extends b {
    public int f38204a;
    public byte[] f38205b;

    public C7509a() {
        this.f38204a = 0;
        this.f38205b = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35898a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38204a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f38205b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35899b() {
        int b = super.b();
        if ((this.f38204a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(1, this.f38205b);
        }
        return b;
    }

    public final /* synthetic */ i m35897a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38205b = c7213a.m33565g();
                    this.f38204a |= 1;
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
