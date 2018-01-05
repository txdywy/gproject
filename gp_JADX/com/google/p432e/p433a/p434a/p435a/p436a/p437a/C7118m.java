package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import java.util.Arrays;

public final class C7118m extends b {
    public C7120o f34821a;
    public C7119n f34822b;
    public long f34823c;
    public byte[] f34824d;
    public C7112g f34825e;

    public C7118m() {
        this.f34821a = null;
        this.f34822b = null;
        this.f34823c = 0;
        this.f34824d = C7222l.f35479l;
        this.f34825e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32334a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34821a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34821a);
        }
        if (this.f34822b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f34822b);
        }
        if (!Arrays.equals(this.f34824d, C7222l.f35479l)) {
            codedOutputByteBufferNano.m33523a(3, this.f34824d);
        }
        if (this.f34823c != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f34823c);
        }
        if (this.f34825e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f34825e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32335b() {
        int b = super.b();
        if (this.f34821a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34821a);
        }
        if (this.f34822b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f34822b);
        }
        if (!Arrays.equals(this.f34824d, C7222l.f35479l)) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f34824d);
        }
        if (this.f34823c != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f34823c);
        }
        if (this.f34825e != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f34825e);
        }
        return b;
    }

    public final /* synthetic */ i m32333a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34821a == null) {
                        this.f34821a = new C7120o();
                    }
                    c7213a.m33552a(this.f34821a);
                    continue;
                case 18:
                    if (this.f34822b == null) {
                        this.f34822b = new C7119n();
                    }
                    c7213a.m33552a(this.f34822b);
                    continue;
                case 26:
                    this.f34824d = c7213a.m33565g();
                    continue;
                case 32:
                    this.f34823c = c7213a.m33568j();
                    continue;
                case 42:
                    if (this.f34825e == null) {
                        this.f34825e = new C7112g();
                    }
                    c7213a.m33552a(this.f34825e);
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
