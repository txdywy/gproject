package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7515g extends b {
    public int f38231a;
    public byte[] f38232b;

    public C7515g() {
        this.f38231a = 0;
        this.f38232b = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35926a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38231a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f38232b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35927b() {
        int b = super.b();
        if ((this.f38231a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(1, this.f38232b);
        }
        return b;
    }

    public final /* synthetic */ i m35925a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38232b = c7213a.m33565g();
                    this.f38231a |= 1;
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
