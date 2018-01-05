package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bc extends b {
    public int f37165a;
    public long f37166b;
    public byte[] f37167c;
    public String f37168d;
    public byte[] f37169e;

    public bc() {
        this.f37165a = 0;
        this.f37166b = 0;
        this.f37167c = C7222l.f35479l;
        this.f37168d = "";
        this.f37169e = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35164a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37165a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f37166b);
        }
        if ((this.f37165a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f37167c);
        }
        if ((this.f37165a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37168d);
        }
        if ((this.f37165a & 8) != 0) {
            codedOutputByteBufferNano.m33523a(5, this.f37169e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35165b() {
        int b = super.b();
        if ((this.f37165a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f37166b);
        }
        if ((this.f37165a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f37167c);
        }
        if ((this.f37165a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37168d);
        }
        if ((this.f37165a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(5, this.f37169e);
        }
        return b;
    }

    public final /* synthetic */ i m35163a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37166b = c7213a.m33568j();
                    this.f37165a |= 1;
                    continue;
                case 26:
                    this.f37167c = c7213a.m33565g();
                    this.f37165a |= 2;
                    continue;
                case 34:
                    this.f37168d = c7213a.m33564f();
                    this.f37165a |= 4;
                    continue;
                case 42:
                    this.f37169e = c7213a.m33565g();
                    this.f37165a |= 8;
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
