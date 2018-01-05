package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cy extends b {
    public static volatile cy[] f37379a;
    public int f37380b;
    public String f37381c;
    public cz f37382d;

    public static cy[] m35331d() {
        if (f37379a == null) {
            synchronized (C7219h.f35465b) {
                if (f37379a == null) {
                    f37379a = new cy[0];
                }
            }
        }
        return f37379a;
    }

    public cy() {
        this.f37380b = 0;
        this.f37381c = "";
        this.f37382d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35333a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37380b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37381c);
        }
        if (this.f37382d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37382d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35334b() {
        int b = super.b();
        if ((this.f37380b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37381c);
        }
        if (this.f37382d != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37382d);
        }
        return b;
    }

    public final /* synthetic */ i m35332a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37381c = c7213a.m33564f();
                    this.f37380b |= 1;
                    continue;
                case 18:
                    if (this.f37382d == null) {
                        this.f37382d = new cz();
                    }
                    c7213a.m33552a(this.f37382d);
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
