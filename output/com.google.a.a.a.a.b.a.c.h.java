package com.google.a.a.a.a.b.a.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.c.h extends com.google.protobuf.nano.b
{

    public String a;
    public int b;
    public g[] c;
    public String d;
    public String e;
    public byte[] f;

    h() {
        com.google.protobuf.nano.b();
        this.a = "";
        this.b = 1;
        this.c = com.google.a.a.a.a.b.a.c.g.a();
        this.d = "";
        this.e = "";
        this.f = com.google.protobuf.nano.l.l;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.c.h b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 22;
            case 26:
  5:            goto 85;
            case 34:
  5:            goto 92;
            case 40:
  5:            goto 99;
            case 50:
  5:            goto 150;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.a = p0.f();
 21:    goto 1;
 30:    if (this.c == 0)
 32:        v0 = 0;
        else
 68:        v0 = this.c.length;
 34:    v2 = new g[com.google.protobuf.nano.l.a(p0, 18) + v0];
 36:    if (v0 != 0)
 40:        System.arraycopy(this.c, 0, v2, 0, v0);
 43:    while (v0 < v2.length - 1) {
 53:        v2[v0] = new com.google.a.a.a.a.b.a.c.g();
 57:        p0.a(v2[v0]);
 60:        p0.a();
 63:        v0 = v0 + 1;
        }
 65:    goto 70;
 75:    v2[v0] = new com.google.a.a.a.a.b.a.c.g();
 79:    p0.a(v2[v0]);
 82:    this.c = v2;
 84:    goto 1;
 89:    this.d = p0.f();
 91:    goto 1;
 96:    this.e = p0.f();
 98:    goto 1;
103:    try {
103:        v3 = p0.i();
107:        switch (v3) {
                case 1:
146:                try {
146:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
138:                    p0.e(p0.o());
141:                    this.a(p0, v0);
                    }
159:                break;
                case 2:
146:                try {
146:                    this.b = v3;
                    }
                    catch (IllegalArgumentException ex) {
138:                    p0.e(p0.o());
141:                    this.a(p0, v0);
                    }
159:                break;
                default:
136:                throw new IllegalArgumentException(43 + v3 + " is not a valid enum ErrorAction");
            }
        }
        catch (IllegalArgumentException ex) {
        }
138:    p0.e(p0.o());
141:    this.a(p0, v0);
144:    goto 1;
154:    this.f = p0.g();
156:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && !this.a.equals(""))
            p0.a(1, this.a);
        if (this.c != 0 && this.c.length > 0) {
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    p0.b(2, this.c[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.d != 0 && !this.d.equals(""))
            p0.a(3, this.d);
        if (this.e != 0 && !this.e.equals(""))
            p0.a(4, this.e);
        if (this.b != 1)
            p0.a(5, this.b);
        if (!Arrays.equals(this.f, com.google.protobuf.nano.l.l))
            p0.a(6, this.f);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0 && !this.a.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.a);
        if (this.c != 0 && this.c.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.c.length) {
                if (this.c[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(2, this.c[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.d != 0 && !this.d.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        if (this.e != 0 && !this.e.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.e);
        if (this.b != 1)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.b);
        if (!Arrays.equals(this.f, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(6, this.f);
        return v0;
    }

}
