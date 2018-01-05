package com.google.android.finsky.cd;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import com.google.wireless.android.a.a.a.a.ce;

protected final class com.google.android.finsky.cd.b extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public long d;
    public int e;
    public String f;
    public String g;
    public int h;
    public com.google.android.finsky.cd.d i;
    public com.google.android.finsky.cd.e j;
    public com.google.android.finsky.cd.e k;
    public com.google.android.finsky.cd.a l;
    public com.google.android.finsky.cd.a m;
    public int n;
    public byte[] o;

    b() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 1;
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = com.google.protobuf.nano.l.l;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cd.b b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 24:
  4:            goto 40;
            case 32:
  4:            goto 53;
            case 42:
  4:            goto 66;
            case 50:
  4:            goto 79;
            case 56:
  4:            goto 92;
            case 66:
  4:            goto 105;
            case 74:
  4:            goto 122;
            case 82:
  4:            goto 140;
            case 90:
  4:            goto 158;
            case 98:
  4:            goto 176;
            case 104:
  4:            goto 194;
            case 114:
  4:            goto 231;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 24:    this.a = this.a | 1;
 26:    goto 0;
 31:    this.c = p0.f();
 37:    this.a = this.a | 2;
 39:    goto 0;
 44:    this.d = p0.j();
 50:    this.a = this.a | 4;
 52:    goto 0;
 57:    this.e = p0.i();
 63:    this.a = this.a | 8;
 65:    goto 0;
 70:    this.f = p0.f();
 76:    this.a = this.a | 16;
 78:    goto 0;
 83:    this.g = p0.f();
 89:    this.a = this.a | 32;
 91:    goto 0;
 96:    this.h = p0.i();
102:    this.a = this.a | 64;
104:    goto 0;
107:    if (this.i == 0)
114:        this.i = new com.google.android.finsky.cd.d();
118:    p0.a(this.i);
121:    goto 0;
124:    if (this.j == 0)
131:        this.j = new com.google.android.finsky.cd.e();
135:    p0.a(this.j);
138:    goto 0;
142:    if (this.k == 0)
149:        this.k = new com.google.android.finsky.cd.e();
153:    p0.a(this.k);
156:    goto 0;
160:    if (this.l == 0)
167:        this.l = new com.google.android.finsky.cd.a();
171:    p0.a(this.l);
174:    goto 0;
178:    if (this.m == 0)
185:        this.m = new com.google.android.finsky.cd.a();
189:    p0.a(this.m);
192:    goto 0;
198:    this.a = this.a | 128;
204:    try {
212:        this.n = com.google.wireless.android.a.a.a.a.ce.a(p0.i());
218:        this.a = this.a | 128;
        }
        catch (IllegalArgumentException ex) {
223:        p0.e(p0.o());
226:        this.a(p0, v0);
        }
220:    goto 0;
235:    this.o = p0.g();
241:    this.a = this.a | 256;
243:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.a & 4)
            p0.b(3, this.d);
        if (this.a & 8)
            p0.a(4, this.e);
        if (this.a & 16)
            p0.a(5, this.f);
        if (this.a & 32)
            p0.a(6, this.g);
        if (this.a & 64)
            p0.a(7, this.h);
        if (this.i != 0)
            p0.b(8, this.i);
        if (this.j != 0)
            p0.b(9, this.j);
        if (this.k != 0)
            p0.b(10, this.k);
        if (this.l != 0)
            p0.b(11, this.l);
        if (this.m != 0)
            p0.b(12, this.m);
        if (this.a & 128)
            p0.a(13, this.n);
        if (this.a & 256)
            p0.a(14, this.o);
        super.a(p0);
    }

    public final boolean am_() {
        if (this.a & 2)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.f(3, this.d);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.g);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.h);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.i);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(9, this.j);
        if (this.k != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.k);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.l);
        if (this.m != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.m);
        if (this.a & 128)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.n);
        if (this.a & 256)
            v0 = v0 + CodedOutputByteBufferNano.b(14, this.o);
        return v0;
    }

}
