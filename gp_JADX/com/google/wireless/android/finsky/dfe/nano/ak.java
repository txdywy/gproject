package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7331m;

public final class ak extends b {
    public int f38354a;
    public am f38355b;
    public an f38356c;
    public C7331m f38357d;
    public byte[] f38358e;
    public String f38359f;

    public ak() {
        this.f38354a = 0;
        this.f38355b = null;
        this.f38356c = null;
        this.f38357d = null;
        this.f38358e = C7222l.f35479l;
        this.f38359f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36000a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38355b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38355b);
        }
        if (this.f38356c != null) {
            codedOutputByteBufferNano.m33532b(39, this.f38356c);
        }
        if (this.f38357d != null) {
            codedOutputByteBufferNano.m33532b(49, this.f38357d);
        }
        if ((this.f38354a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(54, this.f38358e);
        }
        if ((this.f38354a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(55, this.f38359f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36001b() {
        int b = super.b();
        if (this.f38355b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38355b);
        }
        if (this.f38356c != null) {
            b += CodedOutputByteBufferNano.m33503d(39, this.f38356c);
        }
        if (this.f38357d != null) {
            b += CodedOutputByteBufferNano.m33503d(49, this.f38357d);
        }
        if ((this.f38354a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(54, this.f38358e);
        }
        if ((this.f38354a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(55, this.f38359f);
        }
        return b;
    }

    public final /* synthetic */ i m35999a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38355b == null) {
                        this.f38355b = new am();
                    }
                    c7213a.m33552a(this.f38355b);
                    continue;
                case 314:
                    if (this.f38356c == null) {
                        this.f38356c = new an();
                    }
                    c7213a.m33552a(this.f38356c);
                    continue;
                case 394:
                    if (this.f38357d == null) {
                        this.f38357d = new C7331m();
                    }
                    c7213a.m33552a(this.f38357d);
                    continue;
                case 434:
                    this.f38358e = c7213a.m33565g();
                    this.f38354a |= 1;
                    continue;
                case 442:
                    this.f38359f = c7213a.m33564f();
                    this.f38354a |= 2;
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
