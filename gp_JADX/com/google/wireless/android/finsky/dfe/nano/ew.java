package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ew extends b {
    public static volatile ew[] f38855a;
    public int f38856b;
    public String f38857c;
    public String f38858d;
    public boolean f38859e;
    public long f38860f;

    public static ew[] m36372d() {
        if (f38855a == null) {
            synchronized (C7219h.f35465b) {
                if (f38855a == null) {
                    f38855a = new ew[0];
                }
            }
        }
        return f38855a;
    }

    public final boolean m36377e() {
        return (this.f38856b & 2) != 0;
    }

    public final boolean m36378f() {
        return (this.f38856b & 4) != 0;
    }

    public final boolean m36379g() {
        return (this.f38856b & 8) != 0;
    }

    public final ew m36374a(long j) {
        this.f38856b |= 8;
        this.f38860f = j;
        return this;
    }

    public ew() {
        this.f38856b = 0;
        this.f38857c = "";
        this.f38858d = "";
        this.f38859e = false;
        this.f38860f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36375a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38856b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38857c);
        }
        if ((this.f38856b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38858d);
        }
        if ((this.f38856b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f38859e);
        }
        if ((this.f38856b & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f38860f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36376b() {
        int b = super.b();
        if ((this.f38856b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38857c);
        }
        if ((this.f38856b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38858d);
        }
        if ((this.f38856b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f38856b & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(4, this.f38860f);
        }
        return b;
    }

    public final /* synthetic */ i m36373a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38857c = c7213a.m33564f();
                    this.f38856b |= 1;
                    continue;
                case 18:
                    this.f38858d = c7213a.m33564f();
                    this.f38856b |= 2;
                    continue;
                case 24:
                    this.f38859e = c7213a.m33563e();
                    this.f38856b |= 4;
                    continue;
                case 32:
                    this.f38860f = c7213a.m33568j();
                    this.f38856b |= 8;
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
