package com.google.android.finsky.cd;

import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.C0758b;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.l;
import com.google.wireless.android.a.a.a.a.ce;

public final class C2259b extends C0758b {
    public int f11205a;
    public String f11206b;
    public String f11207c;
    public long f11208d;
    public int f11209e;
    public String f11210f;
    public String f11211g;
    public int f11212h;
    public C2261d f11213i;
    public C2262e f11214j;
    public C2262e f11215k;
    public C2258a f11216l;
    public C2258a f11217m;
    public int f11218n;
    public byte[] f11219o;

    public final boolean am_() {
        return (this.f11205a & 2) != 0;
    }

    public C2259b() {
        this.f11205a = 0;
        this.f11206b = "";
        this.f11207c = "";
        this.f11208d = 0;
        this.f11209e = 1;
        this.f11210f = "";
        this.f11211g = "";
        this.f11212h = 0;
        this.f11213i = null;
        this.f11214j = null;
        this.f11215k = null;
        this.f11216l = null;
        this.f11217m = null;
        this.f11218n = 0;
        this.f11219o = l.l;
        this.aO = null;
        this.aP = -1;
    }

    public final void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f11205a & 1) != 0) {
            codedOutputByteBufferNano.a(1, this.f11206b);
        }
        if ((this.f11205a & 2) != 0) {
            codedOutputByteBufferNano.a(2, this.f11207c);
        }
        if ((this.f11205a & 4) != 0) {
            codedOutputByteBufferNano.b(3, this.f11208d);
        }
        if ((this.f11205a & 8) != 0) {
            codedOutputByteBufferNano.a(4, this.f11209e);
        }
        if ((this.f11205a & 16) != 0) {
            codedOutputByteBufferNano.a(5, this.f11210f);
        }
        if ((this.f11205a & 32) != 0) {
            codedOutputByteBufferNano.a(6, this.f11211g);
        }
        if ((this.f11205a & 64) != 0) {
            codedOutputByteBufferNano.a(7, this.f11212h);
        }
        if (this.f11213i != null) {
            codedOutputByteBufferNano.b(8, this.f11213i);
        }
        if (this.f11214j != null) {
            codedOutputByteBufferNano.b(9, this.f11214j);
        }
        if (this.f11215k != null) {
            codedOutputByteBufferNano.b(10, this.f11215k);
        }
        if (this.f11216l != null) {
            codedOutputByteBufferNano.b(11, this.f11216l);
        }
        if (this.f11217m != null) {
            codedOutputByteBufferNano.b(12, this.f11217m);
        }
        if ((this.f11205a & 128) != 0) {
            codedOutputByteBufferNano.a(13, this.f11218n);
        }
        if ((this.f11205a & 256) != 0) {
            codedOutputByteBufferNano.a(14, this.f11219o);
        }
        super.mo1127a(codedOutputByteBufferNano);
    }

    protected final int mo1128b() {
        int b = super.mo1128b();
        if ((this.f11205a & 1) != 0) {
            b += CodedOutputByteBufferNano.b(1, this.f11206b);
        }
        if ((this.f11205a & 2) != 0) {
            b += CodedOutputByteBufferNano.b(2, this.f11207c);
        }
        if ((this.f11205a & 4) != 0) {
            b += CodedOutputByteBufferNano.f(3, this.f11208d);
        }
        if ((this.f11205a & 8) != 0) {
            b += CodedOutputByteBufferNano.d(4, this.f11209e);
        }
        if ((this.f11205a & 16) != 0) {
            b += CodedOutputByteBufferNano.b(5, this.f11210f);
        }
        if ((this.f11205a & 32) != 0) {
            b += CodedOutputByteBufferNano.b(6, this.f11211g);
        }
        if ((this.f11205a & 64) != 0) {
            b += CodedOutputByteBufferNano.d(7, this.f11212h);
        }
        if (this.f11213i != null) {
            b += CodedOutputByteBufferNano.d(8, this.f11213i);
        }
        if (this.f11214j != null) {
            b += CodedOutputByteBufferNano.d(9, this.f11214j);
        }
        if (this.f11215k != null) {
            b += CodedOutputByteBufferNano.d(10, this.f11215k);
        }
        if (this.f11216l != null) {
            b += CodedOutputByteBufferNano.d(11, this.f11216l);
        }
        if (this.f11217m != null) {
            b += CodedOutputByteBufferNano.d(12, this.f11217m);
        }
        if ((this.f11205a & 128) != 0) {
            b += CodedOutputByteBufferNano.d(13, this.f11218n);
        }
        if ((this.f11205a & 256) != 0) {
            return b + CodedOutputByteBufferNano.b(14, this.f11219o);
        }
        return b;
    }

    private final C2259b m11692b(a aVar) {
        while (true) {
            int a = aVar.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f11206b = aVar.f();
                    this.f11205a |= 1;
                    continue;
                case 18:
                    this.f11207c = aVar.f();
                    this.f11205a |= 2;
                    continue;
                case 24:
                    this.f11208d = aVar.j();
                    this.f11205a |= 4;
                    continue;
                case 32:
                    this.f11209e = aVar.i();
                    this.f11205a |= 8;
                    continue;
                case 42:
                    this.f11210f = aVar.f();
                    this.f11205a |= 16;
                    continue;
                case 50:
                    this.f11211g = aVar.f();
                    this.f11205a |= 32;
                    continue;
                case 56:
                    this.f11212h = aVar.i();
                    this.f11205a |= 64;
                    continue;
                case 66:
                    if (this.f11213i == null) {
                        this.f11213i = new C2261d();
                    }
                    aVar.a(this.f11213i);
                    continue;
                case 74:
                    if (this.f11214j == null) {
                        this.f11214j = new C2262e();
                    }
                    aVar.a(this.f11214j);
                    continue;
                case 82:
                    if (this.f11215k == null) {
                        this.f11215k = new C2262e();
                    }
                    aVar.a(this.f11215k);
                    continue;
                case 90:
                    if (this.f11216l == null) {
                        this.f11216l = new C2258a();
                    }
                    aVar.a(this.f11216l);
                    continue;
                case 98:
                    if (this.f11217m == null) {
                        this.f11217m = new C2258a();
                    }
                    aVar.a(this.f11217m);
                    continue;
                case 104:
                    this.f11205a |= 128;
                    int o = aVar.o();
                    try {
                        this.f11218n = ce.a(aVar.i());
                        this.f11205a |= 128;
                        continue;
                    } catch (IllegalArgumentException e) {
                        aVar.e(o);
                        m4918a(aVar, a);
                        break;
                    }
                case 114:
                    this.f11219o = aVar.g();
                    this.f11205a |= 256;
                    continue;
                default:
                    if (!super.m4918a(aVar, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ C0757i mo1131a(a aVar) {
        return m11692b(aVar);
    }
}
