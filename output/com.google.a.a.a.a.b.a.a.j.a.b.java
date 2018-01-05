package com.google.a.a.a.a.b.a.a.j.a;

import com.google.a.a.a.a.b.a.b.a.at;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.j.a.b extends com.google.protobuf.nano.b
{

    public String a;
    public long b;
    public byte[] c;
    public at[] d;

    b() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = 0;
        this.c = com.google.protobuf.nano.l.l;
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
            case 26:
  5:            goto 22;
            case 34:
  5:            goto 85;
            case 48:
  5:            goto 92;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.f();
 21:    goto 1;
 30:    if (this.d == 0)
 32:        v0 = 0;
        else
 68:        v0 = this.d.length;
 34:    v2 = new at[com.google.protobuf.nano.l.a(p0, 26) + v0];
 36:    if (v0 != 0)
 40:        System.arraycopy(this.d, 0, v2, 0, v0);
 43:    while (v0 < v2.length - 1) {
 53:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
 57:        p0.a(v2[v0]);
 60:        p0.a();
 63:        v0 = v0 + 1;
        }
 65:    goto 70;
 75:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
 79:    p0.a(v2[v0]);
 82:    this.d = v2;
 84:    goto 1;
 89:    this.c = p0.g();
 91:    goto 1;
 96:    this.b = p0.j();
 98:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(4, this.c);
        if (this.b != 0)
            p0.b(6, this.b);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
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
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.c);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(6, this.b);
        return v0;
    }

}
