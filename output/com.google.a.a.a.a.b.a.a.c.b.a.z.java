package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.f.c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.z extends com.google.protobuf.nano.b
{

    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public com.google.a.a.a.a.b.a.a.f.c g;
    public String h;
    public ac[] i;
    public byte[] j;
    public String k;

    z() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = "";
        this.i = com.google.a.a.a.a.b.a.a.c.b.a.ac.a();
        this.j = com.google.protobuf.nano.l.l;
        this.k = "";
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
            case 24:
  5:            goto 29;
            case 32:
  5:            goto 36;
            case 50:
  5:            goto 43;
            case 74:
  5:            goto 50;
            case 82:
  5:            goto 57;
            case 90:
  5:            goto 74;
            case 98:
  5:            goto 81;
            case 106:
  5:            goto 88;
            case 114:
  5:            goto 95;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.c = p0.f();
 21:    goto 1;
 26:    this.d = p0.f();
 28:    goto 1;
 33:    this.e = p0.i();
 35:    goto 1;
 40:    this.f = p0.i();
 42:    goto 1;
 47:    this.h = p0.f();
 49:    goto 1;
 54:    this.b = p0.f();
 56:    goto 1;
 59:    if (this.g == 0)
 66:        this.g = new com.google.a.a.a.a.b.a.a.f.c();
 70:    p0.a(this.g);
 73:    goto 1;
 78:    this.j = p0.g();
 80:    goto 1;
 85:    this.k = p0.f();
 87:    goto 1;
 92:    this.a = p0.f();
 94:    goto 1;
103:    if (this.i == 0)
105:        v0 = 0;
        else
141:        v0 = this.i.length;
107:    v2 = new ac[com.google.protobuf.nano.l.a(p0, 114) + v0];
109:    if (v0 != 0)
113:        System.arraycopy(this.i, 0, v2, 0, v0);
116:    while (v0 < v2.length - 1) {
126:        v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.ac();
130:        p0.a(v2[v0]);
133:        p0.a();
136:        v0 = v0 + 1;
        }
138:    goto 143;
148:    v2[v0] = new com.google.a.a.a.a.b.a.a.c.b.a.ac();
152:    p0.a(v2[v0]);
155:    this.i = v2;
157:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.c != 0 && !this.c.equals(""))
            p0.a(1, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(2, this.d);
        if (this.e != 0)
            p0.a(3, this.e);
        if (this.f != 0)
            p0.a(4, this.f);
        if (this.h != 0 && !this.h.equals(""))
            p0.a(6, this.h);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(9, this.b);
        if (this.g != 0)
            p0.b(10, this.g);
        if (!Arrays.equals(this.j, com.google.protobuf.nano.l.l))
            p0.a(11, this.j);
        if (this.k != 0 && !this.k.equals(""))
            p0.a(12, this.k);
        if (this.a != 0 && !this.a.equals(""))
            p0.a(13, this.a);
        if (this.i != 0 && this.i.length > 0) {
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    p0.b(14, this.i[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.f);
        if (this.h != 0 && !this.h.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.h);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(9, this.b);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10, this.g);
        if (!Arrays.equals(this.j, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(11, this.j);
        if (this.k != 0 && !this.k.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(12, this.k);
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(13, this.a);
        if (this.i != 0 && this.i.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(14, this.i[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

}
