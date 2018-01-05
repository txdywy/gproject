package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.t extends com.google.protobuf.nano.b
{

    public static volatile t[] a;
    public v[] b;
    public String c;

    t() {
        com.google.protobuf.nano.b();
        this.b = com.google.a.a.a.a.b.a.a.c.b.a.v.a();
        this.c = "";
        this.aP = -1;
    }

    public static t[] a() {
        if (com.google.a.a.a.a.b.a.a.c.b.a.t.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.c.b.a.t.a == 0)
                    com.google.a.a.a.a.b.a.a.c.b.a.t.a = new t[0];
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
        return com.google.a.a.a.a.b.a.a.c.b.a.t.a;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 78;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.b == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.b.length;
 27:    v2 = new v[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.b, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.v();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.v();
 72:    p0.a(v2[v0]);
 75:    this.b = v2;
 77:    goto 1;
 82:    this.c = p0.f();
 84:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.c != 0 && !this.c.equals(""))
            p0.a(2, this.c);
        super.a(p0);
    }

    protected final int b() {
        v1 = super.b();
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(1, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.c != 0 && !this.c.equals(""))
            v1 = v1 + CodedOutputByteBufferNano.b(2, this.c);
        return v1;
    }

}
