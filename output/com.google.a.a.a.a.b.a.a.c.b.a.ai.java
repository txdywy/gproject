package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.b.a.at;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.ai extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.b.a.at a;
    public com.google.a.a.a.a.b.a.b.a.at b;
    public at[] c;
    public String d;
    public int e;
    public String f;
    public byte[] g;

    ai() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.a.a.a.a.b.a.b.a.at.a();
        this.d = "";
        this.e = 0;
        this.f = "";
        this.g = com.google.protobuf.nano.l.l;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.ai b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 32;
            case 24:
  5:            goto 49;
            case 34:
  5:            goto 72;
            case 42:
  5:            goto 79;
            case 58:
  5:            goto 86;
            case 66:
  5:            goto 93;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.b.a.at();
 28:    p0.a(this.a);
 31:    goto 1;
 34:    if (this.b == 0)
 41:        this.b = new com.google.a.a.a.a.b.a.b.a.at();
 45:    p0.a(this.b);
 48:    goto 1;
 53:    try {
 61:        this.e = com.google.a.a.a.a.b.a.a.c.b.a.af.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 65:        p0.e(p0.o());
 68:        this.a(p0, v0);
        }
 63:    goto 1;
 76:    this.f = p0.f();
 78:    goto 1;
 83:    this.d = p0.f();
 85:    goto 1;
 90:    this.g = p0.g();
 92:    goto 1;
101:    if (this.c == 0)
103:        v0 = 0;
        else
139:        v0 = this.c.length;
105:    v2 = new at[com.google.protobuf.nano.l.a(p0, 66) + v0];
107:    if (v0 != 0)
111:        System.arraycopy(this.c, 0, v2, 0, v0);
114:    while (v0 < v2.length - 1) {
124:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
128:        p0.a(v2[v0]);
131:        p0.a();
134:        v0 = v0 + 1;
        }
136:    goto 141;
146:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.at();
150:    p0.a(v2[v0]);
153:    this.c = v2;
155:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0)
            p0.b(2, this.b);
        if (this.e != 0)
            p0.a(3, this.e);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(4, this.f);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(5, this.d);
        if (!Arrays.equals(this.g, com.google.protobuf.nano.l.l))
            p0.a(7, this.g);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(8, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.f);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.d);
        if (!Arrays.equals(this.g, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.g);
        if (this.c != 0 && this.c.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(8, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

}
