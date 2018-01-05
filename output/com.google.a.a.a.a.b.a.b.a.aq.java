package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.aq extends com.google.protobuf.nano.b
{

    public static volatile aq[] a;
    public String b;
    public String c;
    public com.google.a.a.a.a.b.a.b.a.ae d;
    public long e;
    public com.google.a.a.a.a.b.a.b.a.ae f;
    public com.google.a.a.a.a.b.a.b.a.ad g;

    aq() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.aP = -1;
    }

    public static aq[] a() {
        if (com.google.a.a.a.a.b.a.b.a.aq.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.aq.a == 0)
                    com.google.a.a.a.a.b.a.b.a.aq.a = new aq[0];
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
        return com.google.a.a.a.a.b.a.b.a.aq.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 21;
            case 34:
  4:            goto 28;
            case 40:
  4:            goto 45;
            case 50:
  4:            goto 52;
            case 66:
  4:            goto 69;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 20:    goto 0;
 25:    this.c = p0.f();
 27:    goto 0;
 30:    if (this.f == 0)
 37:        this.f = new com.google.a.a.a.a.b.a.b.a.ae();
 41:    p0.a(this.f);
 44:    goto 0;
 49:    this.e = p0.j();
 51:    goto 0;
 54:    if (this.g == 0)
 61:        this.g = new com.google.a.a.a.a.b.a.b.a.ad();
 65:    p0.a(this.g);
 68:    goto 0;
 71:    if (this.d == 0)
 78:        this.d = new com.google.a.a.a.a.b.a.b.a.ae();
 82:    p0.a(this.d);
 85:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && !this.b.equals(""))
            p0.a(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(2, this.c);
        if (this.f != 0)
            p0.b(4, this.f);
        if (this.e != 0)
            p0.b(5, this.e);
        if (this.g != 0)
            p0.b(6, this.g);
        if (this.d != 0)
            p0.b(8, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.f);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(5, this.e);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.g);
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.d);
        return v0;
    }

}
