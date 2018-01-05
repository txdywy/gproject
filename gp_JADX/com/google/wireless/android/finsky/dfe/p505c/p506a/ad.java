package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public static volatile ad[] f37037a;
    public int f37038b;
    public String f37039c;
    public String f37040d;

    public static ad[] m35072d() {
        if (f37037a == null) {
            synchronized (C7219h.f35465b) {
                if (f37037a == null) {
                    f37037a = new ad[0];
                }
            }
        }
        return f37037a;
    }

    public ad() {
        this.f37038b = 0;
        this.f37039c = "";
        this.f37040d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35074a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37038b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37039c);
        }
        if ((this.f37038b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37040d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35075b() {
        int b = super.b();
        if ((this.f37038b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37039c);
        }
        if ((this.f37038b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f37040d);
        }
        return b;
    }

    public final /* synthetic */ i m35073a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37039c = c7213a.m33564f();
                    this.f37038b |= 1;
                    continue;
                case 18:
                    this.f37040d = c7213a.m33564f();
                    this.f37038b |= 2;
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
