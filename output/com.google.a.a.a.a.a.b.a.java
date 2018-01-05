package com.google.a.a.a.a.a.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.a.b.a extends com.google.protobuf.nano.b
{

    public static volatile a[] a;
    public String b;
    public String c;
    public b[] d;

    a() {
        com.google.protobuf.nano.b();
        this.b = "";
        this.c = "";
        this.d = com.google.a.a.a.a.a.b.b.a();
        this.aP = -1;
    }

    public static a[] a() {
        if (com.google.a.a.a.a.a.b.a.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.a.b.a.a == 0)
                    com.google.a.a.a.a.a.b.a.a = new a[0];
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
        return com.google.a.a.a.a.a.b.a.a;
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
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 21:    goto 1;
 26:    this.c = p0.f();
 28:    goto 1;
 37:    if (this.d == 0)
 39:        v0 = 0;
        else
 75:        v0 = this.d.length;
 41:    v2 = new b[com.google.protobuf.nano.l.a(p0, 26) + v0];
 43:    if (v0 != 0)
 47:        System.arraycopy(this.d, 0, v2, 0, v0);
 50:    while (v0 < v2.length - 1) {
 60:        v2[v0] = new com.google.a.a.a.a.a.b.b();
 64:        p0.a(v2[v0]);
 67:        p0.a();
 70:        v0 = v0 + 1;
        }
 72:    goto 77;
 82:    v2[v0] = new com.google.a.a.a.a.a.b.b();
 86:    p0.a(v2[v0]);
 89:    this.d = v2;
 91:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && !this.b.equals(""))
            p0.a(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.c != 0 && !this.c.equals(""))
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
        return v0;
    }

}
