package com.google.wireless.android.finsky.dfe.p498b.p499a.p501b.p502a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7406b extends b {
    public int f36976a;
    public long f36977b;
    public long f36978c;
    public long f36979d;

    public C7406b() {
        this.f36976a = 0;
        this.f36977b = 0;
        this.f36978c = 0;
        this.f36979d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35044a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36976a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36977b);
        }
        if ((this.f36976a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36978c);
        }
        if ((this.f36976a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36979d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35045b() {
        int b = super.b();
        if ((this.f36976a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36977b);
        }
        if ((this.f36976a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36978c);
        }
        if ((this.f36976a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f36979d);
        }
        return b;
    }

    public final /* synthetic */ i m35043a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36977b = c7213a.m33568j();
                    this.f36976a |= 1;
                    continue;
                case 16:
                    this.f36978c = c7213a.m33568j();
                    this.f36976a |= 2;
                    continue;
                case 24:
                    this.f36979d = c7213a.m33568j();
                    this.f36976a |= 4;
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
