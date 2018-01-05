package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.ad extends com.google.protobuf.nano.b
{

    public static volatile ad[] a;
    public long b;
    public String c;
    public com.google.a.a.a.a.b.a.b.a.a d;
    public int e;
    public int f;
    public String g;
    public boolean h;

    ad() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = 0;
        this.aP = -1;
    }

    public static ad[] a() {
        if (com.google.a.a.a.a.b.a.b.a.ad.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.ad.a == 0)
                    com.google.a.a.a.a.b.a.b.a.ad.a = new ad[0];
                exit com.google.protobuf.nano.h.b;
            }
            catch (Throwable ex) {
                try {
                    exit com.google.protobuf.nano.h.b;
                }
                catch (Throwable ex) {
                    exit com.google.protobuf.nano.h.b;
                    throw ex;
                }
                throw ex;
            }
        }
        return com.google.a.a.a.a.b.a.b.a.ad.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 26:
  4:            goto 21;
            case 32:
  4:            goto 28;
            case 40:
  4:            goto 35;
            case 48:
  4:            goto 42;
            case 56:
  4:            goto 49;
            case 66:
  4:            goto 56;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 20:    goto 0;
 25:    this.g = p0.f();
 27:    goto 0;
 32:    this.e = p0.i();
 34:    goto 0;
 39:    this.f = p0.i();
 41:    goto 0;
 46:    this.h = p0.e();
 48:    goto 0;
 53:    this.b = p0.j();
 55:    goto 0;
 58:    if (this.d == 0)
 65:        this.d = new com.google.a.a.a.a.b.a.b.a.a();
 69:    p0.a(this.d);
 72:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(3, this.g);
        if (this.e != 0)
            p0.a(4, this.e);
        if (this.f != 0)
            p0.a(5, this.f);
        if (this.h != 0)
            p0.a(6, this.h);
        if (this.b != 0)
            p0.b(7, this.b);
        if (this.d != 0)
            p0.b(8, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.g);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.f);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(7, this.b);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.d);
        return v0;
    }

}
