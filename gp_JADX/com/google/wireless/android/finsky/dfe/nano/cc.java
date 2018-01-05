package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cc extends b {
    public static volatile cc[] f38528a;
    public int f38529b;
    public String f38530c;
    public String f38531d;
    public bd f38532e;
    public int f38533f;
    public cd f38534g;
    public byte[] f38535h;
    public boolean f38536i;
    public float f38537j;
    public int f38538k;
    public String f38539l;
    public String f38540m;
    public cg f38541n;
    public ce f38542o;
    public cf f38543p;

    public static cc[] m36140d() {
        if (f38528a == null) {
            synchronized (C7219h.f35465b) {
                if (f38528a == null) {
                    f38528a = new cc[0];
                }
            }
        }
        return f38528a;
    }

    public cc() {
        this.f38529b = 0;
        this.f38530c = "";
        this.f38531d = "";
        this.f38532e = null;
        this.f38533f = 0;
        this.f38534g = null;
        this.f38535h = C7222l.f35479l;
        this.f38536i = false;
        this.f38537j = 0.0f;
        this.f38538k = 0;
        this.f38539l = "";
        this.f38540m = "";
        this.f38541n = null;
        this.f38542o = null;
        this.f38543p = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36142a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38529b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38530c);
        }
        if (this.f38532e != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38532e);
        }
        if ((this.f38529b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38533f);
        }
        if (this.f38534g != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38534g);
        }
        if ((this.f38529b & 8) != 0) {
            codedOutputByteBufferNano.m33523a(5, this.f38535h);
        }
        if ((this.f38529b & 16) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f38536i);
        }
        if ((this.f38529b & 32) != 0) {
            codedOutputByteBufferNano.m33517a(7, this.f38537j);
        }
        if ((this.f38529b & 64) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f38538k);
        }
        if ((this.f38529b & 128) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f38539l);
        }
        if ((this.f38529b & 256) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f38540m);
        }
        if ((this.f38529b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(11, this.f38531d);
        }
        if (this.f38541n != null) {
            codedOutputByteBufferNano.m33532b(12, this.f38541n);
        }
        if (this.f38542o != null) {
            codedOutputByteBufferNano.m33532b(13, this.f38542o);
        }
        if (this.f38543p != null) {
            codedOutputByteBufferNano.m33532b(14, this.f38543p);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36143b() {
        int b = super.b();
        if ((this.f38529b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38530c);
        }
        if (this.f38532e != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38532e);
        }
        if ((this.f38529b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f38533f);
        }
        if (this.f38534g != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38534g);
        }
        if ((this.f38529b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33494b(5, this.f38535h);
        }
        if ((this.f38529b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f38529b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 4;
        }
        if ((this.f38529b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f38538k);
        }
        if ((this.f38529b & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f38539l);
        }
        if ((this.f38529b & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f38540m);
        }
        if ((this.f38529b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f38531d);
        }
        if (this.f38541n != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f38541n);
        }
        if (this.f38542o != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f38542o);
        }
        if (this.f38543p != null) {
            return b + CodedOutputByteBufferNano.m33503d(14, this.f38543p);
        }
        return b;
    }

    public final /* synthetic */ i m36141a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38530c = c7213a.m33564f();
                    this.f38529b |= 1;
                    continue;
                case 18:
                    if (this.f38532e == null) {
                        this.f38532e = new bd();
                    }
                    c7213a.m33552a(this.f38532e);
                    continue;
                case 24:
                    this.f38533f = c7213a.m33567i();
                    this.f38529b |= 4;
                    continue;
                case 34:
                    if (this.f38534g == null) {
                        this.f38534g = new cd();
                    }
                    c7213a.m33552a(this.f38534g);
                    continue;
                case 42:
                    this.f38535h = c7213a.m33565g();
                    this.f38529b |= 8;
                    continue;
                case 48:
                    this.f38536i = c7213a.m33563e();
                    this.f38529b |= 16;
                    continue;
                case 61:
                    this.f38537j = Float.intBitsToFloat(c7213a.m33569k());
                    this.f38529b |= 32;
                    continue;
                case 64:
                    this.f38538k = c7213a.m33567i();
                    this.f38529b |= 64;
                    continue;
                case 74:
                    this.f38539l = c7213a.m33564f();
                    this.f38529b |= 128;
                    continue;
                case 82:
                    this.f38540m = c7213a.m33564f();
                    this.f38529b |= 256;
                    continue;
                case 90:
                    this.f38531d = c7213a.m33564f();
                    this.f38529b |= 2;
                    continue;
                case 98:
                    if (this.f38541n == null) {
                        this.f38541n = new cg();
                    }
                    c7213a.m33552a(this.f38541n);
                    continue;
                case 106:
                    if (this.f38542o == null) {
                        this.f38542o = new ce();
                    }
                    c7213a.m33552a(this.f38542o);
                    continue;
                case 114:
                    if (this.f38543p == null) {
                        this.f38543p = new cf();
                    }
                    c7213a.m33552a(this.f38543p);
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
