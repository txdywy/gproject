package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7478c extends b {
    public static volatile C7478c[] f38068a;
    public int f38069b;
    public String f38070c;
    public String f38071d;
    public bd f38072e;

    public static C7478c[] m35782d() {
        if (f38068a == null) {
            synchronized (C7219h.f35465b) {
                if (f38068a == null) {
                    f38068a = new C7478c[0];
                }
            }
        }
        return f38068a;
    }

    public C7478c() {
        this.f38069b = 0;
        this.f38070c = "";
        this.f38071d = "";
        this.f38072e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35784a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38069b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38070c);
        }
        if ((this.f38069b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38071d);
        }
        if (this.f38072e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38072e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35785b() {
        int b = super.b();
        if ((this.f38069b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38070c);
        }
        if ((this.f38069b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38071d);
        }
        if (this.f38072e != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38072e);
        }
        return b;
    }

    public final /* synthetic */ i m35783a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38070c = c7213a.m33564f();
                    this.f38069b |= 1;
                    continue;
                case 18:
                    this.f38071d = c7213a.m33564f();
                    this.f38069b |= 2;
                    continue;
                case 26:
                    if (this.f38072e == null) {
                        this.f38072e = new bd();
                    }
                    c7213a.m33552a(this.f38072e);
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
