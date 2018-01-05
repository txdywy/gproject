package com.google.a.a.a.a.b.a.a.h.a;

import com.google.a.a.a.a.b.a.a.f.q;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.h.a.e extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public byte[] c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public com.google.a.a.a.a.b.a.a.f.q j;
    public a[] k;

    e() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.b = "";
        this.c = com.google.protobuf.nano.l.l;
        this.a = -1;
        this.a = -1;
        this.f = "";
        this.g = 0;
        this.h = 0;
        this.i = "";
        this.j = 0;
        this.k = com.google.a.a.a.a.b.a.a.h.a.a.a();
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
  5:            goto 38;
            case 42:
  5:            goto 48;
            case 48:
  5:            goto 55;
            case 58:
  5:            goto 62;
            case 66:
  5:            goto 69;
            case 74:
  5:            goto 86;
            case 80:
  5:            goto 150;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 21:    goto 1;
 26:    this.c = p0.g();
 28:    goto 1;
 33:    this.d = p0.f();
 35:    this.a = 0;
 37:    goto 1;
 42:    this.e = p0.f();
 45:    this.a = 1;
 47:    goto 1;
 52:    this.f = p0.f();
 54:    goto 1;
 59:    this.g = p0.e();
 61:    goto 1;
 66:    this.i = p0.f();
 68:    goto 1;
 71:    if (this.j == 0)
 78:        this.j = new com.google.a.a.a.a.b.a.a.f.q();
 82:    p0.a(this.j);
 85:    goto 1;
 94:    if (this.k == 0)
 96:        v0 = 0;
        else
132:        v0 = this.k.length;
 98:    v2 = new a[com.google.protobuf.nano.l.a(p0, 74) + v0];
100:    if (v0 != 0)
104:        System.arraycopy(this.k, 0, v2, 0, v0);
107:    while (v0 < v2.length - 1) {
117:        v2[v0] = new com.google.a.a.a.a.b.a.a.h.a.a();
121:        p0.a(v2[v0]);
124:        p0.a();
127:        v0 = v0 + 1;
        }
129:    goto 134;
139:    v2[v0] = new com.google.a.a.a.a.b.a.a.h.a.a();
143:    p0.a(v2[v0]);
146:    this.k = v2;
148:    goto 1;
154:    this.h = p0.e();
156:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && !this.b.equals(""))
            p0.a(1, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(2, this.c);
        if (this.a == 0)
            p0.a(3, this.d);
        if (this.a == 1)
            p0.a(4, this.e);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(5, this.f);
        if (this.g != 0)
            p0.a(6, this.g);
        if (this.i != 0 && !this.i.equals(""))
            p0.a(7, this.i);
        if (this.j != 0)
            p0.b(8, this.j);
        if (this.k != 0 && this.k.length > 0) {
            v0 = 0;
            while (v0 < this.k.length) {
                if (this.k[v0] != 0)
                    p0.b(9, this.k[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.h != 0)
            p0.a(10, this.h);
        super.a(p0);
    }

    public final void a(String p0) {
        if (p0 == 0) {
            this.e = 0;
            if (this.a == 1)
                this.a = -1;
        }
        else {
            this.a = -1;
            this.e = p0;
            this.a = 1;
        }
    }

    protected final int b() {
        v0 = super.b();
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.f);
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(6) + 1;
        if (this.i != 0 && !this.i.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(7, this.i);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(8, this.j);
        if (this.k != 0 && this.k.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.k.length) {
                if (this.k[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(9, this.k[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(10) + 1;
        return v0;
    }

}
