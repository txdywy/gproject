package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.aj extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.b.a.ad a;
    public String b;
    public com.google.a.a.a.a.b.a.b.a.ae c;
    public ad[] d;
    public int e;

    aj() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.d = com.google.a.a.a.a.b.a.b.a.ad.a();
        this.e = 2;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.b.a.aj b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 26:
  5:            goto 15;
            case 34:
  5:            goto 32;
            case 42:
  5:            goto 39;
            case 50:
  5:            goto 56;
            case 56:
  5:            goto 119;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.b.a.ad();
 28:    p0.a(this.a);
 31:    goto 1;
 36:    this.b = p0.f();
 38:    goto 1;
 41:    if (this.c == 0)
 48:        this.c = new com.google.a.a.a.a.b.a.b.a.ae();
 52:    p0.a(this.c);
 55:    goto 1;
 64:    if (this.d == 0)
 66:        v0 = 0;
        else
102:        v0 = this.d.length;
 68:    v2 = new ad[com.google.protobuf.nano.l.a(p0, 50) + v0];
 70:    if (v0 != 0)
 74:        System.arraycopy(this.d, 0, v2, 0, v0);
 77:    while (v0 < v2.length - 1) {
 87:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
 91:        p0.a(v2[v0]);
 94:        p0.a();
 97:        v0 = v0 + 1;
        }
 99:    goto 104;
109:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ad();
113:    p0.a(v2[v0]);
116:    this.d = v2;
118:    goto 1;
123:    try {
123:        v3 = p0.i();
127:        switch (v3) {
                case 0:
166:                try {
166:                    this.e = v3;
                    }
                    catch (IllegalArgumentException ex) {
158:                    p0.e(p0.o());
161:                    this.a(p0, v0);
                    }
171:                break;
                case 1:
166:                try {
166:                    this.e = v3;
                    }
                    catch (IllegalArgumentException ex) {
158:                    p0.e(p0.o());
161:                    this.a(p0, v0);
                    }
171:                break;
                case 2:
166:                try {
166:                    this.e = v3;
                    }
                    catch (IllegalArgumentException ex) {
158:                    p0.e(p0.o());
161:                    this.a(p0, v0);
                    }
171:                break;
                case 3:
166:                try {
166:                    this.e = v3;
                    }
                    catch (IllegalArgumentException ex) {
158:                    p0.e(p0.o());
161:                    this.a(p0, v0);
                    }
171:                break;
                case 4:
166:                try {
166:                    this.e = v3;
                    }
                    catch (IllegalArgumentException ex) {
158:                    p0.e(p0.o());
161:                    this.a(p0, v0);
                    }
171:                break;
                default:
156:                throw new IllegalArgumentException(45 + v3 + " is not a valid enum ImagePosition");
            }
        }
        catch (IllegalArgumentException ex) {
        }
158:    p0.e(p0.o());
161:    this.a(p0, v0);
164:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(3, this.a);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(4, this.b);
        if (this.c != 0)
            p0.b(5, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(6, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.e != 2)
            p0.a(7, this.e);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.a);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(4, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(6, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.e != 2)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.e);
        return v0;
    }

}
