package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cm extends b {
    public static volatile cm[] f37317a;
    public int f37318b;
    public String f37319c;
    public String f37320d;

    public static cm[] m35283d() {
        if (f37317a == null) {
            synchronized (C7219h.f35465b) {
                if (f37317a == null) {
                    f37317a = new cm[0];
                }
            }
        }
        return f37317a;
    }

    public cm() {
        this.f37318b = 0;
        this.f37319c = "";
        this.f37320d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35285a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37318b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37319c);
        }
        if ((this.f37318b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37320d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35286b() {
        int b = super.b();
        if ((this.f37318b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37319c);
        }
        if ((this.f37318b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f37320d);
        }
        return b;
    }

    public final /* synthetic */ i m35284a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37319c = c7213a.m33564f();
                    this.f37318b |= 1;
                    continue;
                case 18:
                    this.f37320d = c7213a.m33564f();
                    this.f37318b |= 2;
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
