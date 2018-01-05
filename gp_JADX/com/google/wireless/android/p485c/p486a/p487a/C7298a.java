package com.google.wireless.android.p485c.p486a.p487a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7298a extends b {
    public int f36193a;
    public String f36194b;
    public String f36195c;
    public String f36196d;
    public String f36197e;
    public String f36198f;
    public String f36199g;
    public String f36200h;
    public String f36201i;
    public String f36202j;
    public String f36203k;
    public String f36204l;
    public String f36205m;
    public String f36206n;
    public String f36207o;
    public boolean f36208p;

    public final C7298a m34515a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36193a |= 1;
        this.f36194b = str;
        return this;
    }

    public final C7298a m34518b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36193a |= 8;
        this.f36197e = str;
        return this;
    }

    public final C7298a m34519c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36193a |= 16;
        this.f36198f = str;
        return this;
    }

    public final C7298a m34520d(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36193a |= 32;
        this.f36199g = str;
        return this;
    }

    public final C7298a m34521e(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36193a |= 64;
        this.f36200h = str;
        return this;
    }

    public final C7298a m34522f(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36193a |= 128;
        this.f36201i = str;
        return this;
    }

    public C7298a() {
        this.f36193a = 0;
        this.f36194b = "";
        this.f36195c = "";
        this.f36196d = "";
        this.f36197e = "";
        this.f36198f = "";
        this.f36199g = "";
        this.f36200h = "";
        this.f36201i = "";
        this.f36202j = "";
        this.f36203k = "";
        this.f36204l = "";
        this.f36205m = "";
        this.f36206n = "";
        this.f36207o = "";
        this.f36208p = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34516a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36193a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36194b);
        }
        if ((this.f36193a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36197e);
        }
        if ((this.f36193a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36198f);
        }
        if ((this.f36193a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36199g);
        }
        if ((this.f36193a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f36200h);
        }
        if ((this.f36193a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f36201i);
        }
        if ((this.f36193a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36202j);
        }
        if ((this.f36193a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36203k);
        }
        if ((this.f36193a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f36204l);
        }
        if ((this.f36193a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f36205m);
        }
        if ((this.f36193a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33521a(11, this.f36206n);
        }
        if ((this.f36193a & 16384) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f36208p);
        }
        if ((this.f36193a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f36195c);
        }
        if ((this.f36193a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(14, this.f36196d);
        }
        if ((this.f36193a & 8192) != 0) {
            codedOutputByteBufferNano.m33521a(15, this.f36207o);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34517b() {
        int b = super.b();
        if ((this.f36193a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36194b);
        }
        if ((this.f36193a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36197e);
        }
        if ((this.f36193a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36198f);
        }
        if ((this.f36193a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36199g);
        }
        if ((this.f36193a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f36200h);
        }
        if ((this.f36193a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f36201i);
        }
        if ((this.f36193a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36202j);
        }
        if ((this.f36193a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36203k);
        }
        if ((this.f36193a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f36204l);
        }
        if ((this.f36193a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f36205m);
        }
        if ((this.f36193a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f36206n);
        }
        if ((this.f36193a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33501d(12) + 1;
        }
        if ((this.f36193a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f36195c);
        }
        if ((this.f36193a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f36196d);
        }
        if ((this.f36193a & 8192) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(15, this.f36207o);
        }
        return b;
    }

    public final /* synthetic */ i m34514a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36194b = c7213a.m33564f();
                    this.f36193a |= 1;
                    continue;
                case 18:
                    this.f36197e = c7213a.m33564f();
                    this.f36193a |= 8;
                    continue;
                case 26:
                    this.f36198f = c7213a.m33564f();
                    this.f36193a |= 16;
                    continue;
                case 34:
                    this.f36199g = c7213a.m33564f();
                    this.f36193a |= 32;
                    continue;
                case 42:
                    this.f36200h = c7213a.m33564f();
                    this.f36193a |= 64;
                    continue;
                case 50:
                    this.f36201i = c7213a.m33564f();
                    this.f36193a |= 128;
                    continue;
                case 58:
                    this.f36202j = c7213a.m33564f();
                    this.f36193a |= 256;
                    continue;
                case 66:
                    this.f36203k = c7213a.m33564f();
                    this.f36193a |= 512;
                    continue;
                case 74:
                    this.f36204l = c7213a.m33564f();
                    this.f36193a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 82:
                    this.f36205m = c7213a.m33564f();
                    this.f36193a |= eq.FLAG_MOVED;
                    continue;
                case 90:
                    this.f36206n = c7213a.m33564f();
                    this.f36193a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 96:
                    this.f36208p = c7213a.m33563e();
                    this.f36193a |= 16384;
                    continue;
                case 106:
                    this.f36195c = c7213a.m33564f();
                    this.f36193a |= 2;
                    continue;
                case 114:
                    this.f36196d = c7213a.m33564f();
                    this.f36193a |= 4;
                    continue;
                case 122:
                    this.f36207o = c7213a.m33564f();
                    this.f36193a |= 8192;
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
