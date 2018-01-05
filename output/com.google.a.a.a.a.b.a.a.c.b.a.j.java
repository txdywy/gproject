package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.aj;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.j extends com.google.protobuf.nano.b
{

    public static volatile j[] a;
    public long b;
    public String c;
    public com.google.a.a.a.a.b.a.b.a.ae d;
    public com.google.a.a.a.a.b.a.b.a.ae e;
    public byte[] f;
    public com.google.a.a.a.a.b.a.b.a.aj g;
    public boolean h;

    j() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = com.google.protobuf.nano.l.l;
        this.g = 0;
        this.h = 0;
        this.aP = -1;
    }

    public static j[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.j.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.j.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.j.a = new j[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.j.a;
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
            case 34:
  4:            goto 28;
            case 40:
  4:            goto 45;
            case 50:
  4:            goto 52;
            case 58:
  4:            goto 69;
            case 64:
  4:            goto 86;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 20:    goto 0;
 25:    this.f = p0.g();
 27:    goto 0;
 30:    if (this.g == 0)
 37:        this.g = new com.google.a.a.a.a.b.a.b.a.aj();
 41:    p0.a(this.g);
 44:    goto 0;
 49:    this.h = p0.e();
 51:    goto 0;
 54:    if (this.d == 0)
 61:        this.d = new com.google.a.a.a.a.b.a.b.a.ae();
 65:    p0.a(this.d);
 68:    goto 0;
 71:    if (this.e == 0)
 78:        this.e = new com.google.a.a.a.a.b.a.b.a.ae();
 82:    p0.a(this.e);
 85:    goto 0;
 90:    this.b = p0.j();
 92:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (!Arrays.equals(this.f, com.google.protobuf.nano.l.l))
            p0.a(3, this.f);
        if (this.g != 0)
            p0.b(4, this.g);
        if (this.h != 0)
            p0.a(5, this.h);
        if (this.d != 0)
            p0.b(6, this.d);
        if (this.e != 0)
            p0.b(7, this.e);
        if (this.b != 0)
            p0.b(8, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (!Arrays.equals(this.f, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5) + 1;
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.e);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(8, this.b);
        return v0;
    }

}
