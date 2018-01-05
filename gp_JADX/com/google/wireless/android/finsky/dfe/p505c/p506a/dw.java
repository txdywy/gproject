package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dw extends b {
    public static volatile dw[] f37505a;
    public int f37506b;
    public int f37507c;
    public String f37508d;

    public static dw[] m35412d() {
        if (f37505a == null) {
            synchronized (C7219h.f35465b) {
                if (f37505a == null) {
                    f37505a = new dw[0];
                }
            }
        }
        return f37505a;
    }

    public dw() {
        this.f37506b = 0;
        this.f37507c = 0;
        this.f37508d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35414a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37506b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37507c);
        }
        if ((this.f37506b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37508d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35415b() {
        int b = super.b();
        if ((this.f37506b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37507c);
        }
        if ((this.f37506b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f37508d);
        }
        return b;
    }

    public final /* synthetic */ i m35413a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37507c = c7213a.m33567i();
                    this.f37506b |= 1;
                    continue;
                case 18:
                    this.f37508d = c7213a.m33564f();
                    this.f37506b |= 2;
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
