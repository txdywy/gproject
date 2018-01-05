package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bf extends b {
    public static volatile bf[] f37173a;
    public int f37174b;
    public String f37175c;
    public ba f37176d;

    public static bf[] m35172d() {
        if (f37173a == null) {
            synchronized (C7219h.f35465b) {
                if (f37173a == null) {
                    f37173a = new bf[0];
                }
            }
        }
        return f37173a;
    }

    public bf() {
        this.f37174b = 0;
        this.f37175c = "";
        this.f37176d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35174a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37174b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37175c);
        }
        if (this.f37176d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37176d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35175b() {
        int b = super.b();
        if ((this.f37174b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37175c);
        }
        if (this.f37176d != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37176d);
        }
        return b;
    }

    public final /* synthetic */ i m35173a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37175c = c7213a.m33564f();
                    this.f37174b |= 1;
                    continue;
                case 18:
                    if (this.f37176d == null) {
                        this.f37176d = new ba();
                    }
                    c7213a.m33552a(this.f37176d);
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
