package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7369y extends b {
    public static volatile C7369y[] f36837b;
    public int f36838a;
    public int f36839c;
    public String f36840d;
    public String f36841e;
    public boolean f36842f;
    public long f36843g;

    public static C7369y[] m34912d() {
        if (f36837b == null) {
            synchronized (C7219h.f35465b) {
                if (f36837b == null) {
                    f36837b = new C7369y[0];
                }
            }
        }
        return f36837b;
    }

    public C7369y() {
        this.f36838a = -1;
        this.f36839c = 0;
        this.f36840d = "";
        this.f36838a = -1;
        this.f36841e = "";
        this.f36838a = -1;
        this.f36842f = false;
        this.f36838a = -1;
        this.f36843g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34914a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36839c & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36840d);
        }
        if (this.f36838a == 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36841e);
        }
        if (this.f36838a == 1) {
            codedOutputByteBufferNano.m33522a(3, this.f36842f);
        }
        if (this.f36838a == 2) {
            codedOutputByteBufferNano.m33531b(4, this.f36843g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34915b() {
        int b = super.b();
        if ((this.f36839c & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36840d);
        }
        if (this.f36838a == 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36841e);
        }
        if (this.f36838a == 1) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f36838a == 2) {
            return b + CodedOutputByteBufferNano.m33508f(4, this.f36843g);
        }
        return b;
    }

    public final /* synthetic */ i m34913a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36840d = c7213a.m33564f();
                    this.f36839c |= 1;
                    continue;
                case 18:
                    this.f36841e = c7213a.m33564f();
                    this.f36838a = 0;
                    continue;
                case 24:
                    this.f36842f = c7213a.m33563e();
                    this.f36838a = 1;
                    continue;
                case 32:
                    this.f36843g = c7213a.m33568j();
                    this.f36838a = 2;
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
