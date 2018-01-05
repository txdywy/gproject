package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7517i extends b {
    public int f38237a;
    public C7513e f38238b;
    public byte[] f38239c;

    public C7517i() {
        this.f38237a = 0;
        this.f38238b = null;
        this.f38239c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35932a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38238b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38238b);
        }
        if ((this.f38237a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f38239c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35933b() {
        int b = super.b();
        if (this.f38238b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38238b);
        }
        if ((this.f38237a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f38239c);
        }
        return b;
    }

    public final /* synthetic */ i m35931a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38238b == null) {
                        this.f38238b = new C7513e();
                    }
                    c7213a.m33552a(this.f38238b);
                    continue;
                case 18:
                    this.f38239c = c7213a.m33565g();
                    this.f38237a |= 1;
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
