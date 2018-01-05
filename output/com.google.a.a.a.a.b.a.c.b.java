package com.google.a.a.a.a.b.a.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.c.b extends com.google.protobuf.nano.b
{

    public static volatile b[] a;
    public String b;
    public int c;
    public int d;

    b() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = 0;
        this.d = -1;
        this.aP = -1;
    }

    public static b[] a() {
        if (com.google.a.a.a.a.b.a.c.b.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.c.b.a == 0)
                    com.google.a.a.a.a.b.a.c.b.a = new b[0];
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
        return com.google.a.a.a.a.b.a.c.b.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 16:
  4:            goto 21;
            case 24:
  4:            goto 28;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 20:    goto 0;
 25:    this.c = p0.i();
 27:    goto 0;
 32:    this.d = p0.i();
 34:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && !this.b.equals(""))
            p0.a(1, this.b);
        if (this.c != 0)
            p0.a(2, this.c);
        if (this.d != -1)
            p0.a(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.d != -1)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.d);
        return v0;
    }

}
