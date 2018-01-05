package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bi extends b {
    public static volatile bi[] f35800a;
    public int f35801b;
    public int f35802c;
    public long f35803d;
    public int f35804e;
    public int f35805f;
    public int f35806g;

    public static bi[] m34188d() {
        if (f35800a == null) {
            synchronized (C7219h.f35465b) {
                if (f35800a == null) {
                    f35800a = new bi[0];
                }
            }
        }
        return f35800a;
    }

    public bi() {
        this.f35801b = 0;
        this.f35802c = 0;
        this.f35803d = 0;
        this.f35804e = 0;
        this.f35805f = 0;
        this.f35806g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34190a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35801b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35802c);
        }
        if ((this.f35801b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35803d);
        }
        if ((this.f35801b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35804e);
        }
        if ((this.f35801b & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35805f);
        }
        if ((this.f35801b & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35806g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34191b() {
        int b = super.b();
        if ((this.f35801b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35802c);
        }
        if ((this.f35801b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f35803d);
        }
        if ((this.f35801b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35804e);
        }
        if ((this.f35801b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35805f);
        }
        if ((this.f35801b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f35806g);
        }
        return b;
    }

    private final bi m34187b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35801b |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f35802c = bg.m34178a(c7213a.m33567i());
                        this.f35801b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f35803d = c7213a.m33568j();
                    this.f35801b |= 2;
                    continue;
                case 24:
                    this.f35804e = c7213a.m33567i();
                    this.f35801b |= 4;
                    continue;
                case 32:
                    this.f35805f = c7213a.m33567i();
                    this.f35801b |= 8;
                    continue;
                case 40:
                    this.f35806g = c7213a.m33567i();
                    this.f35801b |= 16;
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

    public final /* synthetic */ i m34189a(C7213a c7213a) {
        return m34187b(c7213a);
    }
}
