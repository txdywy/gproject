package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public static volatile ae[] f37783a;
    public int f37784b;
    public String f37785c;
    public int f37786d;
    public int f37787e;
    public boolean f37788f;
    public String f37789g;

    public static ae[] m35591d() {
        if (f37783a == null) {
            synchronized (C7219h.f35465b) {
                if (f37783a == null) {
                    f37783a = new ae[0];
                }
            }
        }
        return f37783a;
    }

    public final ae m35593a(int i) {
        this.f37784b |= 2;
        this.f37786d = i;
        return this;
    }

    public final ae m35596b(int i) {
        this.f37784b |= 4;
        this.f37787e = i;
        return this;
    }

    public ae() {
        this.f37784b = 0;
        this.f37785c = "";
        this.f37786d = 0;
        this.f37787e = 0;
        this.f37788f = false;
        this.f37789g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35594a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37784b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37785c);
        }
        if ((this.f37784b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37786d);
        }
        if ((this.f37784b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37787e);
        }
        if ((this.f37784b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f37788f);
        }
        if ((this.f37784b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37789g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35595b() {
        int b = super.b();
        if ((this.f37784b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37785c);
        }
        if ((this.f37784b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37786d);
        }
        if ((this.f37784b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37787e);
        }
        if ((this.f37784b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f37784b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f37789g);
        }
        return b;
    }

    public final /* synthetic */ i m35592a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37785c = c7213a.m33564f();
                    this.f37784b |= 1;
                    continue;
                case 16:
                    this.f37786d = c7213a.m33567i();
                    this.f37784b |= 2;
                    continue;
                case 24:
                    this.f37787e = c7213a.m33567i();
                    this.f37784b |= 4;
                    continue;
                case 32:
                    this.f37788f = c7213a.m33563e();
                    this.f37784b |= 8;
                    continue;
                case 50:
                    this.f37789g = c7213a.m33564f();
                    this.f37784b |= 16;
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
