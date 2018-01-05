package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7379i extends b {
    public int f36875a;
    public long f36876b;
    public byte[] f36877c;

    public C7379i() {
        this.f36875a = 0;
        this.f36876b = 0;
        this.f36877c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34952a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36875a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36876b);
        }
        if ((this.f36875a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f36877c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34953b() {
        int b = super.b();
        if ((this.f36875a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36876b);
        }
        if ((this.f36875a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f36877c);
        }
        return b;
    }

    public final /* synthetic */ i m34951a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36876b = c7213a.m33568j();
                    this.f36875a |= 1;
                    continue;
                case 18:
                    this.f36877c = c7213a.m33565g();
                    this.f36875a |= 2;
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
