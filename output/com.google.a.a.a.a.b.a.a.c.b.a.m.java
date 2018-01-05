package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.b.a.at;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.m extends com.google.protobuf.nano.b
{

    public String a;
    public byte[] b;
    public String c;
    public at[] d;

    m() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = com.google.protobuf.nano.l.l;
        this.c = "";
        this.d = com.google.a.a.a.a.b.a.b.a.at.a();
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
  5:            goto 36;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.f();
 21:    goto 1;
 26:    this.b = p0.g();
 28:    goto 1;
 33:    this.c = p0.f();
 35:    goto 1;
 44:    if (this.d == 0)
 46:        v0 = 0;
        else
 82:        v0 = this.d.length;
 48:    v2 = new at[com.google.protobuf.nano.l.a(p0, 34) + v0];
 50:    if (v0 != 0)
 54:        System.arraycopy(this.d, 0, v2, 0, v0);
 57:    while (v0 < v2.length - 1) {
 67:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
 71:        p0.a(v2[v0]);
 74:        p0.a();
 77:        v0 = v0 + 1;
        }
 79:    goto 84;
 89:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
 93:    p0.a(v2[v0]);
 96:    this.d = v2;
 98:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            p0.a(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(4, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (!Arrays.equals(this.b, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(4, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

}
