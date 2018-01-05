package com.google.a.a.a.a.b.a.a.f;

import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.c;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.a.f.h extends com.google.protobuf.nano.b
{

    public String a;
    public long b;
    public byte[] c;
    public String d;
    public ae[] e;
    public c[] f;
    public int g;

    h() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = 0;
        this.c = com.google.protobuf.nano.l.l;
        this.d = "";
        this.e = com.google.a.a.a.a.b.a.b.a.ae.a();
        this.f = com.google.a.a.a.a.b.a.b.a.c.a();
        this.g = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.a.f.h b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 22;
            case 34:
  5:            goto 29;
            case 42:
  5:            goto 36;
            case 56:
  5:            goto 99;
            case 106:
  5:            goto 106;
            case 112:
  5:            goto 170;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.f();
 21:    goto 1;
 26:    this.c = p0.g();
 28:    goto 1;
 33:    this.d = p0.f();
 35:    goto 1;
 44:    if (this.e == 0)
 46:        v0 = 0;
        else
 82:        v0 = this.e.length;
 48:    v2 = new ae[com.google.protobuf.nano.l.a(p0, 42) + v0];
 50:    if (v0 != 0)
 54:        System.arraycopy(this.e, 0, v2, 0, v0);
 57:    while (v0 < v2.length - 1) {
 67:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ae();
 71:        p0.a(v2[v0]);
 74:        p0.a();
 77:        v0 = v0 + 1;
        }
 79:    goto 84;
 89:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ae();
 93:    p0.a(v2[v0]);
 96:    this.e = v2;
 98:    goto 1;
103:    this.b = p0.j();
105:    goto 1;
114:    if (this.f == 0)
116:        v0 = 0;
        else
152:        v0 = this.f.length;
118:    v2 = new c[com.google.protobuf.nano.l.a(p0, 106) + v0];
120:    if (v0 != 0)
124:        System.arraycopy(this.f, 0, v2, 0, v0);
127:    while (v0 < v2.length - 1) {
137:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.c();
141:        p0.a(v2[v0]);
144:        p0.a();
147:        v0 = v0 + 1;
        }
149:    goto 154;
159:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.c();
163:    p0.a(v2[v0]);
166:    this.f = v2;
168:    goto 1;
174:    try {
174:        v3 = p0.i();
178:        switch (v3) {
                case 0:
222:                break;
                case 1:
207:                throw new IllegalArgumentException(43 + v3 + " is not a valid enum DisplayType");
                case 2:
222:                break;
                case 3:
222:                break;
                default:
207:                throw new IllegalArgumentException(43 + v3 + " is not a valid enum DisplayType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
209:    p0.e(p0.o());
212:    this.a(p0, v0);
215:    goto 1;
217:    try {
217:        this.g = v3;
        }
        catch (IllegalArgumentException ex) {
209:        p0.e(p0.o());
212:        this.a(p0, v0);
        }
219:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(2, this.c);
        if (this.d != 0 && !this.d.equals(""))
            p0.a(4, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    p0.b(5, this.e[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0)
            p0.b(7, this.b);
        if (this.f != 0 && this.f.length > 0)
            while (v1 < this.f.length) {
                if (this.f[v1] != 0)
                    p0.b(13, this.f[v1]);
                v1 = v1 + 1;
            }
        if (this.g != 0)
            p0.a(14, this.g);
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.d);
        if (this.e != 0 && this.e.length > 0) {
            v2 = v0;
            v0 = 0;
            while (v0 < this.e.length) {
                if (this.e[v0] != 0)
                    v2 = v2 + CodedOutputByteBufferNano.d(5, this.e[v0]);
                v0 = v0 + 1;
            }
            v0 = v2;
        }
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(7, this.b);
        if (this.f != 0 && this.f.length > 0)
            while (v1 < this.f.length) {
                if (this.f[v1] != 0)
                    v0 = v0 + CodedOutputByteBufferNano.d(13, this.f[v1]);
                v1 = v1 + 1;
            }
        if (this.g != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(14, this.g);
        return v0;
    }

}
