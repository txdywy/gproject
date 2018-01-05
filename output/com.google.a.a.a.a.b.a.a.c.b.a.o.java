package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.f.c;
import com.google.a.a.a.a.b.a.a.f.j;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.o extends com.google.protobuf.nano.b
{

    public static volatile o[] b;
    public int a;
    public com.google.a.a.a.a.b.a.b.a.at c;
    public com.google.a.a.a.a.b.a.a.f.c d;
    public com.google.a.a.a.a.b.a.a.f.j e;

    o() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.c = 0;
        this.a = -1;
        this.d = 0;
        this.a = -1;
        this.e = 0;
        this.aP = -1;
    }

    public static o[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.o.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.o.b == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.o.b = new o[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.o.b;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 34;
            case 26:
  4:            goto 54;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.c == 0)
 23:        this.c = new com.google.a.a.a.a.b.a.b.a.at();
 27:    p0.a(this.c);
 31:    this.a = 0;
 33:    goto 0;
 36:    if (this.d == 0)
 43:        this.d = new com.google.a.a.a.a.b.a.a.f.c();
 47:    p0.a(this.d);
 51:    this.a = 1;
 53:    goto 0;
 56:    if (this.e == 0)
 63:        this.e = new com.google.a.a.a.a.b.a.a.f.j();
 67:    p0.a(this.e);
 71:    this.a = 2;
 73:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(1, this.c);
        if (this.a == 1)
            p0.b(2, this.d);
        if (this.a == 2)
            p0.b(3, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        return v0;
    }

}
