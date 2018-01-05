package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.es;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7347c extends b {
    public int f36728a;
    public int f36729b;
    public String f36730c;
    public String f36731d;
    public es f36732e;

    public C7347c() {
        this.f36728a = 0;
        this.f36729b = 0;
        this.f36730c = "";
        this.f36731d = "";
        this.f36732e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34830a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36728a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36729b);
        }
        if ((this.f36728a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36730c);
        }
        if ((this.f36728a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36731d);
        }
        if (this.f36732e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36732e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34831b() {
        int b = super.b();
        if ((this.f36728a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36729b);
        }
        if ((this.f36728a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36730c);
        }
        if ((this.f36728a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36731d);
        }
        if (this.f36732e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f36732e);
        }
        return b;
    }

    public final /* synthetic */ i m34829a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36729b = c7213a.m33567i();
                    this.f36728a |= 1;
                    continue;
                case 18:
                    this.f36730c = c7213a.m33564f();
                    this.f36728a |= 2;
                    continue;
                case 26:
                    this.f36731d = c7213a.m33564f();
                    this.f36728a |= 4;
                    continue;
                case 34:
                    if (this.f36732e == null) {
                        this.f36732e = new es();
                    }
                    c7213a.m33552a(this.f36732e);
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
