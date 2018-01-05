package com.google.a.a.a.a.b.a.a.f;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.f.q extends com.google.protobuf.nano.b
{

    public String a;
    public byte[] b;
    public r[] c;
    public String d;

    q() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = com.google.protobuf.nano.l.l;
        this.c = com.google.a.a.a.a.b.a.a.f.r.a();
        this.d = "";
        this.aP = -1;
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
 19:    this.a = p0.f();
 21:    goto 1;
 26:    this.b = p0.g();
 28:    goto 1;
 37:    if (this.c == 0)
 39:        v0 = 0;
        else
 75:        v0 = this.c.length;
 41:    v2 = new r[com.google.protobuf.nano.l.a(p0, 26) + v0];
 43:    if (v0 != 0)
 47:        System.arraycopy(this.c, 0, v2, 0, v0);
 50:    while (v0 < v2.length - 1) {
 60:        v2[v0] = new com.google.a.a.a.a.b.a.a.f.r();
 64:        p0.a(v2[v0]);
 67:        p0.a();
 70:        v0 = v0 + 1;
        }
 72:    goto 77;
 82:    v2[v0] = new com.google.a.a.a.a.b.a.a.f.r();
 86:    p0.a(v2[v0]);
 89:    this.c = v2;
 91:    goto 1;
 96:    this.d = p0.f();
 98:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            p0.a(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(3, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0 && !this.d.equals(""))
            p0.a(4, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0 && this.c.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(3, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.d);
        return v0;
    }

}
