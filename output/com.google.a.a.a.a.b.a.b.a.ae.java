package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.ae extends com.google.protobuf.nano.b
{

    public static volatile ae[] a;
    public long b;
    public ad[] c;
    public com.google.a.a.a.a.b.a.b.a.ag d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public boolean j;
    public int k;

    ae() {
        com.google.protobuf.nano.b();
        this.b = 0;
        this.c = com.google.a.a.a.a.b.a.b.a.ad.a();
        this.d = 0;
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 1;
        this.aP = -1;
    }

    private static int a(int p0) {
        switch (p0) {
            case 0:
                return p0;
            case 1:
                return p0;
            case 2:
                break;
            case 3:
                return p0;
            case 4:
                return p0;
            case 5:
                return p0;
            case 6:
                return p0;
            case 7:
                return p0;
            case 8:
                return p0;
            case 9:
                return p0;
            case 10:
                break;
            case 11:
                break;
            case 12:
                return p0;
            case 13:
                return p0;
            case 14:
                return p0;
            case 15:
                return p0;
            default:
                break;
        }
        throw new IllegalArgumentException(43 + p0 + " is not a valid enum DisplayType");
    }

    public static ae[] a() {
        if (com.google.a.a.a.a.b.a.b.a.ae.a == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.b.a.ae.a == 0)
                    com.google.a.a.a.a.b.a.b.a.ae.a = new ae[0];
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
        return com.google.a.a.a.a.b.a.b.a.ae.a;
    }

    private final com.google.a.a.a.a.b.a.b.a.ae b(com.google.protobuf.nano.a p0) {
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
            case 32:
  5:            goto 36;
            case 40:
  5:            goto 43;
            case 50:
  5:            goto 66;
            case 90:
  5:            goto 129;
            case 96:
  5:            goto 147;
            case 112:
  5:            goto 172;
            case 120:
  5:            goto 223;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.e = p0.f();
 21:    goto 1;
 26:    this.f = p0.f();
 28:    goto 1;
 33:    this.g = p0.f();
 35:    goto 1;
 40:    this.b = p0.j();
 42:    goto 1;
 47:    try {
 55:        this.h = com.google.a.a.a.a.b.a.b.a.ae.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 59:        p0.e(p0.o());
 62:        this.a(p0, v0);
        }
 57:    goto 1;
 74:    if (this.c == 0)
 76:        v0 = 0;
        else
112:        v0 = this.c.length;
 78:    v2 = new ad[com.google.protobuf.nano.l.a(p0, 50) + v0];
 80:    if (v0 != 0)
 84:        System.arraycopy(this.c, 0, v2, 0, v0);
 87:    while (v0 < v2.length - 1) {
 97:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
101:        p0.a(v2[v0]);
104:        p0.a();
107:        v0 = v0 + 1;
        }
109:    goto 114;
119:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
123:    p0.a(v2[v0]);
126:    this.c = v2;
128:    goto 1;
131:    if (this.d == 0)
138:        this.d = new com.google.a.a.a.a.b.a.b.a.ag();
142:    p0.a(this.d);
145:    goto 1;
151:    try {
159:        this.i = com.google.a.a.a.a.b.a.b.a.ae.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
164:        p0.e(p0.o());
167:        this.a(p0, v0);
        }
161:    goto 1;
176:    try {
176:        v3 = p0.i();
180:        switch (v3) {
                case 0:
219:                try {
219:                    this.k = v3;
                    }
                    catch (IllegalArgumentException ex) {
211:                    p0.e(p0.o());
214:                    this.a(p0, v0);
                    }
234:                break;
                case 1:
219:                try {
219:                    this.k = v3;
                    }
                    catch (IllegalArgumentException ex) {
211:                    p0.e(p0.o());
214:                    this.a(p0, v0);
                    }
234:                break;
                case 2:
219:                try {
219:                    this.k = v3;
                    }
                    catch (IllegalArgumentException ex) {
211:                    p0.e(p0.o());
214:                    this.a(p0, v0);
                    }
234:                break;
                case 3:
219:                try {
219:                    this.k = v3;
                    }
                    catch (IllegalArgumentException ex) {
211:                    p0.e(p0.o());
214:                    this.a(p0, v0);
                    }
234:                break;
                default:
209:                throw new IllegalArgumentException(41 + v3 + " is not a valid enum Alignment");
            }
        }
        catch (IllegalArgumentException ex) {
        }
211:    p0.e(p0.o());
214:    this.a(p0, v0);
217:    goto 1;
227:    this.j = p0.e();
229:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.e != 0 && !this.e.equals(""))
            p0.a(1, this.e);
        if (this.f != 0 && !this.f.equals(""))
            p0.a(2, this.f);
        if (this.g != 0 && !this.g.equals(""))
            p0.a(3, this.g);
        if (this.b != 0)
            p0.b(4, this.b);
        if (this.h != 0)
            p0.a(5, this.h);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(6, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0)
            p0.b(11, this.d);
        if (this.i != 0)
            p0.a(12, this.i);
        if (this.k != 1)
            p0.a(14, this.k);
        if (this.j != 0)
            p0.a(15, this.j);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.e);
        if (this.f != 0 && !this.f.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.f);
        if (this.g != 0 && !this.g.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.g);
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.b);
        if (this.h != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.h);
        if (this.c != 0 && this.c.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(6, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.d != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.d);
        if (this.i != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.i);
        if (this.k != 1)
            v0 = v0 + CodedOutputByteBufferNano.d(14, this.k);
        if (this.j != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(15) + 1;
        return v0;
    }

}
