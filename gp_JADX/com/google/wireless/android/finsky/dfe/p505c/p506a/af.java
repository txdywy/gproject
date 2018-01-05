package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class af extends b {
    public static volatile af[] f37050a;
    public int f37051b;
    public String f37052c;
    public cz f37053d;

    public static af[] m35079d() {
        if (f37050a == null) {
            synchronized (C7219h.f35465b) {
                if (f37050a == null) {
                    f37050a = new af[0];
                }
            }
        }
        return f37050a;
    }

    public af() {
        this.f37051b = 0;
        this.f37052c = "";
        this.f37053d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35081a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37051b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37052c);
        }
        if (this.f37053d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37053d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35082b() {
        int b = super.b();
        if ((this.f37051b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37052c);
        }
        if (this.f37053d != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37053d);
        }
        return b;
    }

    public final /* synthetic */ i m35080a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37052c = c7213a.m33564f();
                    this.f37051b |= 1;
                    continue;
                case 18:
                    if (this.f37053d == null) {
                        this.f37053d = new cz();
                    }
                    c7213a.m33552a(this.f37053d);
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
