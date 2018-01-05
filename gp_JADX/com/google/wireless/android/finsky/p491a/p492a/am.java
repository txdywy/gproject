package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class am extends b {
    public static volatile am[] f36370a;
    public int f36371b;
    public String f36372c;
    public boolean f36373d;
    public boolean f36374e;
    public String f36375f;
    public String f36376g;

    public static am[] m34643d() {
        if (f36370a == null) {
            synchronized (C7219h.f35465b) {
                if (f36370a == null) {
                    f36370a = new am[0];
                }
            }
        }
        return f36370a;
    }

    public am() {
        this.f36371b = 0;
        this.f36372c = "";
        this.f36373d = false;
        this.f36374e = false;
        this.f36375f = "";
        this.f36376g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34645a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36371b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36372c);
        }
        if ((this.f36371b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36373d);
        }
        if ((this.f36371b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36374e);
        }
        if ((this.f36371b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36375f);
        }
        if ((this.f36371b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36376g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34646b() {
        int b = super.b();
        if ((this.f36371b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36372c);
        }
        if ((this.f36371b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f36371b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f36371b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36375f);
        }
        if ((this.f36371b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f36376g);
        }
        return b;
    }

    public final /* synthetic */ i m34644a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36372c = c7213a.m33564f();
                    this.f36371b |= 1;
                    continue;
                case 16:
                    this.f36373d = c7213a.m33563e();
                    this.f36371b |= 2;
                    continue;
                case 24:
                    this.f36374e = c7213a.m33563e();
                    this.f36371b |= 4;
                    continue;
                case 34:
                    this.f36375f = c7213a.m33564f();
                    this.f36371b |= 8;
                    continue;
                case 42:
                    this.f36376g = c7213a.m33564f();
                    this.f36371b |= 16;
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
