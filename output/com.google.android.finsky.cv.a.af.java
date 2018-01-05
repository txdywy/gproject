package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.cv.a.af extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    public String f;
    public int g;
    public String h;
    public String i;
    public String j;
    public String k;
    public com.google.android.finsky.cv.a.j l;
    public String m;
    public com.google.android.finsky.cv.a.go n;
    public String o;

    af() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = "";
        this.g = 0;
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = 0;
        this.m = "";
        this.n = 0;
        this.o = "";
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cv.a.af b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 34:
  4:            goto 14;
            case 42:
  4:            goto 27;
            case 50:
  4:            goto 40;
            case 56:
  4:            goto 53;
            case 138:
  4:            goto 66;
            case 216:
  4:            goto 79;
            case 226:
  4:            goto 142;
            case 234:
  4:            goto 156;
            case 242:
  4:            goto 170;
            case 250:
  4:            goto 184;
            case 258:
  4:            goto 198;
            case 266:
  4:            goto 216;
            case 274:
  4:            goto 230;
            case 282:
  4:            goto 248;
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
 44:    this.d = p0.f();
 50:    this.a = this.a | 4;
 52:    goto 0;
 57:    this.e = p0.i();
 63:    this.a = this.a | 8;
 65:    goto 0;
 70:    this.f = p0.f();
 76:    this.a = this.a | 16;
 78:    goto 0;
 83:    this.a = this.a | 32;
 89:    try {
 89:        v2 = p0.i();
 93:        switch (v2) {
                case 0:
132:                try {
132:                    this.g = v2;
138:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
263:                break;
                case 1:
132:                try {
132:                    this.g = v2;
138:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
263:                break;
                case 2:
132:                try {
132:                    this.g = v2;
138:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
263:                break;
                case 3:
132:                try {
132:                    this.g = v2;
138:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
263:                break;
                case 4:
132:                try {
132:                    this.g = v2;
138:                    this.a = this.a | 32;
                    }
                    catch (IllegalArgumentException ex) {
124:                    p0.e(p0.o());
127:                    this.a(p0, v0);
                    }
263:                break;
                default:
122:                throw new IllegalArgumentException(40 + v2 + " is not a valid enum BookType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
124:    p0.e(p0.o());
127:    this.a(p0, v0);
130:    goto 0;
146:    this.h = p0.f();
152:    this.a = this.a | 64;
154:    goto 0;
160:    this.i = p0.f();
166:    this.a = this.a | 128;
168:    goto 0;
174:    this.j = p0.f();
180:    this.a = this.a | 256;
182:    goto 0;
188:    this.k = p0.f();
194:    this.a = this.a | 512;
196:    goto 0;
200:    if (this.l == 0)
207:        this.l = new com.google.android.finsky.cv.a.j();
211:    p0.a(this.l);
214:    goto 0;
220:    this.m = p0.f();
226:    this.a = this.a | 1024;
228:    goto 0;
232:    if (this.n == 0)
239:        this.n = new com.google.android.finsky.cv.a.go();
243:    p0.a(this.n);
246:    goto 0;
252:    this.o = p0.f();
258:    this.a = this.a | 2048;
260:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(4, this.b);
        if (this.a & 2)
            p0.a(5, this.c);
        if (this.a & 4)
            p0.a(6, this.d);
        if (this.a & 8)
            p0.a(7, this.e);
        if (this.a & 16)
            p0.a(17, this.f);
        if (this.a & 32)
            p0.a(27, this.g);
        if (this.a & 64)
            p0.a(28, this.h);
        if (this.a & 128)
            p0.a(29, this.i);
        if (this.a & 256)
            p0.a(30, this.j);
        if (this.a & 512)
            p0.a(31, this.k);
        if (this.l != 0)
            p0.b(32, this.l);
        if (this.a & 1024)
            p0.a(33, this.m);
        if (this.n != 0)
            p0.b(34, this.n);
        if (this.a & 2048)
            p0.a(35, this.o);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.d);
        if (this.a & 8)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.e);
        if (this.a & 16)
            v0 = v0 + CodedOutputByteBufferNano.b(17, this.f);
        if (this.a & 32)
            v0 = v0 + CodedOutputByteBufferNano.d(27, this.g);
        if (this.a & 64)
            v0 = v0 + CodedOutputByteBufferNano.b(28, this.h);
        if (this.a & 128)
            v0 = v0 + CodedOutputByteBufferNano.b(29, this.i);
        if (this.a & 256)
            v0 = v0 + CodedOutputByteBufferNano.b(30, this.j);
        if (this.a & 512)
            v0 = v0 + CodedOutputByteBufferNano.b(31, this.k);
        if (this.l != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(32, this.l);
        if (this.a & 1024)
            v0 = v0 + CodedOutputByteBufferNano.b(33, this.m);
        if (this.n != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(34, this.n);
        if (this.a & 2048)
            v0 = v0 + CodedOutputByteBufferNano.b(35, this.o);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.af))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.af)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!this.b.equals(p0.b))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!this.c.equals(p0.c))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if ((this.a & 8) != (p0.a & 8))
                    v0 = 0;
                else if (this.e != p0.e)
                    v0 = 0;
                else if ((this.a & 16) != (p0.a & 16))
                    v0 = 0;
                else if (!this.f.equals(p0.f))
                    v0 = 0;
                else if ((this.a & 32) != (p0.a & 32))
                    v0 = 0;
                else if (this.g != p0.g)
                    v0 = 0;
                else if ((this.a & 64) != (p0.a & 64))
                    v0 = 0;
                else if (!this.h.equals(p0.h))
                    v0 = 0;
                else if ((this.a & 128) != (p0.a & 128))
                    v0 = 0;
                else if (!this.i.equals(p0.i))
                    v0 = 0;
                else if ((this.a & 256) != (p0.a & 256))
                    v0 = 0;
                else if (!this.j.equals(p0.j))
                    v0 = 0;
                else if ((this.a & 512) != (p0.a & 512))
                    v0 = 0;
                else if (!this.k.equals(p0.k))
                    v0 = 0;
                else if (this.l == 0) {
                    if (p0.l != 0)
                        v0 = 0;
                    else if ((this.a & 1024) != (p0.a & 1024))
                        v0 = 0;
                    else if (!this.m.equals(p0.m))
                        v0 = 0;
                    else if (this.n == 0) {
                        if (p0.n != 0)
                            v0 = 0;
                        else if ((this.a & 2048) != (p0.a & 2048))
                            v0 = 0;
                        else if (!this.o.equals(p0.o))
                            v0 = 0;
                        else if (this.aO == 0 || this.aO.b()) {
                            if (p0.aO != 0 && !p0.aO.b())
                                v0 = 0;
                        }
                        else
                            v0 = this.aO.equals(p0.aO);
                    }
                    else if (!this.n.equals(p0.n))
                        v0 = 0;
                    else if ((this.a & 2048) != (p0.a & 2048))
                        v0 = 0;
                    else if (!this.o.equals(p0.o))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.l.equals(p0.l))
                    v0 = 0;
                else if ((this.a & 1024) != (p0.a & 1024))
                    v0 = 0;
                else if (!this.m.equals(p0.m))
                    v0 = 0;
                else if (this.n == 0) {
                    if (p0.n != 0)
                        v0 = 0;
                    else if ((this.a & 2048) != (p0.a & 2048))
                        v0 = 0;
                    else if (!this.o.equals(p0.o))
                        v0 = 0;
                    else if (this.aO == 0 || this.aO.b()) {
                        if (p0.aO != 0 && !p0.aO.b())
                            v0 = 0;
                    }
                    else
                        v0 = this.aO.equals(p0.aO);
                }
                else if (!this.n.equals(p0.n))
                    v0 = 0;
                else if ((this.a & 2048) != (p0.a & 2048))
                    v0 = 0;
                else if (!this.o.equals(p0.o))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (p0.aO != 0 && !p0.aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(p0.aO);
            }
        }
        return v0;
    }

    public final int hashCode() {
        v1 = 0;
        if (this.l == 0)
            v0 = 0;
        else
            v0 = this.l.hashCode();
        v3 = ((v0 + (((((((((((this.getClass().getName().hashCode() + 527) * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e) * 31 + this.f.hashCode()) * 31 + this.g) * 31 + this.h.hashCode()) * 31 + this.i.hashCode()) * 31 + this.j.hashCode()) * 31 + this.k.hashCode()) * 31) * 31 + this.m.hashCode()) * 31;
        if (this.n == 0)
            v0 = 0;
        else
            v0 = this.n.hashCode();
        if (this.aO != 0 && !this.aO.b())
            v1 = this.aO.hashCode();
        return ((v0 + v3) * 31 + this.o.hashCode()) * 31 + v1;
    }

}
