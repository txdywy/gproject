package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.s extends com.google.protobuf.nano.b
{

    public static volatile s[] a;
    public String b;
    public byte[] c;
    public o[] d;
    public String e;

    s() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = com.google.protobuf.nano.l.l;
        this.d = com.google.a.a.a.a.b.a.a.c.b.a.o.a();
        this.e = "";
        this.aP = -1;
    }

    public static s[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.s.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.s.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.s.a = new s[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.s.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 22;
            case 26:
  5:            goto 29;
            case 34:
  5:            goto 92;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 21:    goto 1;
 26:    this.c = p0.g();
 28:    goto 1;
 37:    if (this.d == 0)
 39:        v0 = 0;
        else
 75:        v0 = this.d.length;
 41:    v2 = new o[com.google.protobuf.nano.l.a(p0, 26) + v0];
 43:    if (v0 != 0)
 47:        System.arraycopy(this.d, 0, v2, 0, v0);
 50:    while (v0 < v2.length - 1) {
 60:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.o();
 64:        p0.a(v2[v0]);
 67:        p0.a();
 70:        v0 = v0 + 1;
        }
 72:    goto 77;
 82:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.o();
 86:    p0.a(v2[v0]);
 89:    this.d = v2;
 91:    goto 1;
 96:    this.e = p0.f();
 98:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && !this.b.equals(""))
            p0.a(1, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 0 && !this.e.equals(""))
            p0.a(4, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(3, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        return v0;
    }

}
