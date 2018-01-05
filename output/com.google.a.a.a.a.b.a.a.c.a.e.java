package com.google.a.a.a.a.b.a.a.c.a;

import com.google.a.a.a.a.b.a.a.c.b.a.ae;
import com.google.a.a.a.a.b.a.a.c.b.a.ai;
import com.google.a.a.a.a.b.a.a.c.b.a.b;
import com.google.a.a.a.a.b.a.a.c.b.a.q;
import com.google.a.a.a.a.b.a.a.c.b.a.z;
import com.google.a.a.a.a.b.a.a.f.q;
import com.google.a.a.a.a.b.a.a.h.a.e;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.c.a.e extends com.google.protobuf.nano.b
{

    public int a;
    public com.google.a.a.a.a.b.a.a.c.b.a.z b;
    public com.google.a.a.a.a.b.a.a.c.b.a.ae c;
    public com.google.a.a.a.a.b.a.a.c.b.a.ai d;
    public com.google.a.a.a.a.b.a.a.c.b.a.b e;
    public com.google.a.a.a.a.b.a.a.f.q f;
    public com.google.a.a.a.a.b.a.a.c.b.a.q g;
    public com.google.a.a.a.a.b.a.a.h.a.e h;

    e() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.b = 0;
        this.a = -1;
        this.c = 0;
        this.a = -1;
        this.d = 0;
        this.a = -1;
        this.e = 0;
        this.a = -1;
        this.f = 0;
        this.a = -1;
        this.g = 0;
        this.a = -1;
        this.h = 0;
        this.aP = -1;
    }

    public final com.google.a.a.a.a.b.a.a.c.a.e a(com.google.a.a.a.a.b.a.a.h.a.e p0) {
        if (p0 == 0) {
            if (this.a == 6)
                this.a = -1;
            this.h = 0;
        }
        else {
            this.a = -1;
            this.a = 6;
            this.h = p0;
        }
        return this;
    }

    public final com.google.a.a.a.a.b.a.a.f.q a() {
        if (this.a == 4)
            v0 = this.f;
        else
            v0 = 0;
        return v0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 34:
  4:            goto 34;
            case 50:
  4:            goto 54;
            case 58:
  4:            goto 74;
            case 90:
  4:            goto 94;
            case 98:
  4:            goto 114;
            case 106:
  4:            goto 135;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.b == 0)
 23:        this.b = new com.google.a.a.a.a.b.a.a.c.b.a.z();
 27:    p0.a(this.b);
 31:    this.a = 0;
 33:    goto 0;
 36:    if (this.c == 0)
 43:        this.c = new com.google.a.a.a.a.b.a.a.c.b.a.ae();
 47:    p0.a(this.c);
 51:    this.a = 1;
 53:    goto 0;
 56:    if (this.d == 0)
 63:        this.d = new com.google.a.a.a.a.b.a.a.c.b.a.ai();
 67:    p0.a(this.d);
 71:    this.a = 2;
 73:    goto 0;
 76:    if (this.e == 0)
 83:        this.e = new com.google.a.a.a.a.b.a.a.c.b.a.b();
 87:    p0.a(this.e);
 91:    this.a = 3;
 93:    goto 0;
 96:    if (this.f == 0)
103:        this.f = new com.google.a.a.a.a.b.a.a.f.q();
107:    p0.a(this.f);
111:    this.a = 4;
113:    goto 0;
116:    if (this.g == 0)
123:        this.g = new com.google.a.a.a.a.b.a.a.c.b.a.q();
127:    p0.a(this.g);
131:    this.a = 5;
133:    goto 0;
137:    if (this.h == 0)
144:        this.h = new com.google.a.a.a.a.b.a.a.h.a.e();
148:    p0.a(this.h);
152:    this.a = 6;
154:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(1, this.b);
        if (this.a == 1)
            p0.b(4, this.c);
        if (this.a == 2)
            p0.b(6, this.d);
        if (this.a == 3)
            p0.b(7, this.e);
        if (this.a == 4)
            p0.b(11, this.f);
        if (this.a == 5)
            p0.b(12, this.g);
        if (this.a == 6)
            p0.b(13, this.h);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.c);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.d);
        if (this.a == 3)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.e);
        if (this.a == 4)
            v0 = v0 + CodedOutputByteBufferNano.d(11, this.f);
        if (this.a == 5)
            v0 = v0 + CodedOutputByteBufferNano.d(12, this.g);
        if (this.a == 6)
            v0 = v0 + CodedOutputByteBufferNano.d(13, this.h);
        return v0;
    }

}
