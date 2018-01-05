package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cq extends b {
    public static volatile cq[] f35999a;
    public int f36000b;
    public String f36001c;
    public int f36002d;

    public static cq[] m34355d() {
        if (f35999a == null) {
            synchronized (C7219h.f35465b) {
                if (f35999a == null) {
                    f35999a = new cq[0];
                }
            }
        }
        return f35999a;
    }

    public cq() {
        this.f36000b = 0;
        this.f36001c = "";
        this.f36002d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34357a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36000b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36001c);
        }
        if ((this.f36000b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36002d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34358b() {
        int b = super.b();
        if ((this.f36000b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36001c);
        }
        if ((this.f36000b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36002d);
        }
        return b;
    }

    public final /* synthetic */ i m34356a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36001c = c7213a.m33564f();
                    this.f36000b |= 1;
                    continue;
                case 16:
                    this.f36002d = c7213a.m33567i();
                    this.f36000b |= 2;
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
