package com.google.a.a.a.a.b.a.a.d.a;

import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.d.a.a extends com.google.protobuf.nano.b
{

    public static volatile a[] a;
    public long b;
    public com.google.a.a.a.a.b.a.b.a.ae c;
    public String d;
    public boolean e;
    public com.google.a.a.a.a.b.a.b.a.ae f;
    public String g;

    a() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.aP = -1;
    }

    public static a[] a() {
        if (com.google.a.a.a.a.b.a.a.d.a.a.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.d.a.a.a == 0)
                    com.google.a.a.a.a.b.a.a.d.a.a.a = new a[0];
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
        return com.google.a.a.a.a.b.a.a.d.a.a.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 18:
  4:            goto 14;
            case 26:
  4:            goto 21;
            case 42:
  4:            goto 28;
            case 48:
  4:            goto 45;
            case 56:
  4:            goto 52;
            case 66:
  4:            goto 59;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.d = p0.f();
 20:    goto 0;
 25:    this.g = p0.f();
 27:    goto 0;
 30:    if (this.c == 0)
 37:        this.c = new com.google.a.a.a.a.b.a.b.a.ae();
 41:    p0.a(this.c);
 44:    goto 0;
 49:    this.e = p0.e();
 51:    goto 0;
 56:    this.b = p0.j();
 58:    goto 0;
 61:    if (this.f == 0)
 68:        this.f = new com.google.a.a.a.a.b.a.b.a.ae();
 72:    p0.a(this.f);
 75:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.d != 0 && !this.d.equals(""))
            p0.a(2, this.d);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(3, this.g);
        if (this.c != 0)
            p0.b(5, this.c);
        if (this.e != 0)
            p0.a(6, this.e);
        if (this.b != 0)
            p0.b(7, this.b);
        if (this.f != 0)
            p0.b(8, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.g);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.c);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(7, this.b);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.f);
        return v0;
    }

}
