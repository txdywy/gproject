package com.google.a.a.a.a.b.a.a.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.d.a.b extends com.google.protobuf.nano.b
{

    public static volatile b[] a;
    public String b;
    public com.google.a.a.a.a.b.a.a.d.a.a c;

    b() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = 0;
        this.aP = -1;
    }

    public static b[] a() {
        if (com.google.a.a.a.a.b.a.a.d.a.b.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.d.a.b.a == 0)
                    com.google.a.a.a.a.b.a.a.d.a.b.a = new b[0];
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
        return com.google.a.a.a.a.b.a.a.d.a.b.a;
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
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.f();
 20:    goto 0;
 23:    if (this.c == 0)
 30:        this.c = new com.google.a.a.a.a.b.a.a.d.a.a();
 34:    p0.a(this.c);
 37:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && !this.b.equals(""))
            p0.a(1, this.b);
        if (this.c != 0)
            p0.b(2, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        return v0;
    }

}
