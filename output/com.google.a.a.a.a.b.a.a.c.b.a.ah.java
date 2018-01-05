package com.google.a.a.a.a.b.a.a.c.b.a;

import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.b.a.al;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.c.b.a.ah extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public int b;
    public byte[] c;
    public String d;
    public com.google.a.a.a.a.b.a.b.a.al e;
    public com.google.a.a.a.a.b.a.b.a.al f;
    public String g;
    public com.google.a.a.a.a.b.a.a.d.a.a h;
    public al[] i;
    public com.google.a.a.a.a.b.a.a.c.b.a.ag j;

    ah() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = 0;
        this.c = com.google.protobuf.nano.l.l;
        this.d = "";
        this.e = 0;
        this.f = 0;
        this.g = "";
        this.h = 0;
        this.i = com.google.a.a.a.a.b.a.b.a.al.a();
        this.j = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.c.b.a.ah b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 16:
  5:            goto 15;
            case 34:
  5:            goto 38;
            case 42:
  5:            goto 45;
            case 50:
  5:            goto 62;
            case 58:
  5:            goto 79;
            case 66:
  5:            goto 86;
            case 82:
  5:            goto 103;
            case 90:
  5:            goto 110;
            case 98:
  5:            goto 127;
            case 106:
  5:            goto 145;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    try {
 27:        this.b = com.google.a.a.a.a.b.a.a.c.b.a.af.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 31:        p0.e(p0.o());
 34:        this.a(p0, v0);
        }
 29:    goto 1;
 42:    this.c = p0.g();
 44:    goto 1;
 47:    if (this.e == 0)
 54:        this.e = new com.google.a.a.a.a.b.a.b.a.al();
 58:    p0.a(this.e);
 61:    goto 1;
 64:    if (this.f == 0)
 71:        this.f = new com.google.a.a.a.a.b.a.b.a.al();
 75:    p0.a(this.f);
 78:    goto 1;
 83:    this.g = p0.f();
 85:    goto 1;
 88:    if (this.h == 0)
 95:        this.h = new com.google.a.a.a.a.b.a.a.d.a.a();
 99:    p0.a(this.h);
102:    goto 1;
107:    this.d = p0.f();
109:    goto 1;
112:    if (this.a == 0)
119:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
123:    p0.a(this.a);
126:    goto 1;
129:    if (this.j == 0)
136:        this.j = new com.google.a.a.a.a.b.a.a.c.b.a.ag();
140:    p0.a(this.j);
143:    goto 1;
153:    if (this.i == 0)
155:        v0 = 0;
        else
191:        v0 = this.i.length;
157:    v2 = new al[com.google.protobuf.nano.l.a(p0, 106) + v0];
159:    if (v0 != 0)
163:        System.arraycopy(this.i, 0, v2, 0, v0);
166:    while (v0 < v2.length - 1) {
176:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.al();
180:        p0.a(v2[v0]);
183:        p0.a();
186:        v0 = v0 + 1;
        }
188:    goto 193;
198:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.al();
202:    p0.a(v2[v0]);
205:    this.i = v2;
207:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0)
            p0.a(2, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(4, this.c);
        if (this.e != 0)
            p0.b(5, this.e);
        if (this.f != 0)
            p0.b(6, this.f);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(7, this.g);
        if (this.h != 0)
            p0.b(8, this.h);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(10, this.d);
        if (this.a != 0)
            p0.b(11, this.a);
        if (this.j != 0)
            p0.b(12, this.j);
        if (this.i != 0 && this.i.length > 0) {
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    p0.b(13, this.i[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.c);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.e);
        if (this.f != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.f);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.g);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.h);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(10, this.d);
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.a);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.j);
        if (this.i != 0 && this.i.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.i.length) {
                if (this.i[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(13, this.i[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

}
