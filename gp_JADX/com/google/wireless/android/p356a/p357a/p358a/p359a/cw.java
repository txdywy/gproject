package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class cw extends b {
    public int f36029a;
    public String f36030b;
    public boolean f36031c;
    public long f36032d;
    public long f36033e;
    public int f36034f;
    public String f36035g;
    public int f36036h;
    public int f36037i;
    public int f36038j;
    public float f36039k;
    public float f36040l;

    public cw() {
        this.f36029a = 0;
        this.f36030b = "";
        this.f36031c = false;
        this.f36032d = 0;
        this.f36033e = 0;
        this.f36034f = 0;
        this.f36035g = "";
        this.f36036h = 0;
        this.f36037i = 0;
        this.f36038j = 0;
        this.f36039k = 0.0f;
        this.f36040l = 0.0f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34379a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36029a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36030b);
        }
        if ((this.f36029a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36032d);
        }
        if ((this.f36029a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f36033e);
        }
        if ((this.f36029a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f36034f);
        }
        if ((this.f36029a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36035g);
        }
        if ((this.f36029a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f36036h);
        }
        if ((this.f36029a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f36037i);
        }
        if ((this.f36029a & 256) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f36038j);
        }
        if ((this.f36029a & 512) != 0) {
            codedOutputByteBufferNano.m33517a(10, this.f36039k);
        }
        if ((this.f36029a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33517a(11, this.f36040l);
        }
        if ((this.f36029a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f36031c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34380b() {
        int b = super.b();
        if ((this.f36029a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36030b);
        }
        if ((this.f36029a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f36032d);
        }
        if ((this.f36029a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f36033e);
        }
        if ((this.f36029a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f36034f);
        }
        if ((this.f36029a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36035g);
        }
        if ((this.f36029a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f36036h);
        }
        if ((this.f36029a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f36037i);
        }
        if ((this.f36029a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f36038j);
        }
        if ((this.f36029a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 4;
        }
        if ((this.f36029a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 4;
        }
        if ((this.f36029a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(12) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34378a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    this.f36030b = c7213a.m33564f();
                    this.f36029a |= 1;
                    continue;
                case 24:
                    this.f36032d = c7213a.m33568j();
                    this.f36029a |= 4;
                    continue;
                case 32:
                    this.f36033e = c7213a.m33568j();
                    this.f36029a |= 8;
                    continue;
                case 40:
                    this.f36034f = c7213a.m33567i();
                    this.f36029a |= 16;
                    continue;
                case 50:
                    this.f36035g = c7213a.m33564f();
                    this.f36029a |= 32;
                    continue;
                case 56:
                    this.f36036h = c7213a.m33567i();
                    this.f36029a |= 64;
                    continue;
                case 64:
                    this.f36037i = c7213a.m33567i();
                    this.f36029a |= 128;
                    continue;
                case 72:
                    this.f36038j = c7213a.m33567i();
                    this.f36029a |= 256;
                    continue;
                case 85:
                    this.f36039k = Float.intBitsToFloat(c7213a.m33569k());
                    this.f36029a |= 512;
                    continue;
                case 93:
                    this.f36040l = Float.intBitsToFloat(c7213a.m33569k());
                    this.f36029a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 96:
                    this.f36031c = c7213a.m33563e();
                    this.f36029a |= 2;
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
