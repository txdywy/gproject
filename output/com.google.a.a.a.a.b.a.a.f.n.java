package com.google.a.a.a.a.b.a.a.f;

import com.google.a.a.a.a.b.a.a.e.a.b;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.h;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.a.f.n extends com.google.protobuf.nano.b
{

    public static volatile n[] b;
    public int a;
    public com.google.a.a.a.a.b.a.b.a.at c;
    public com.google.a.a.a.a.b.a.a.f.c d;
    public com.google.a.a.a.a.b.a.a.f.j e;
    public com.google.a.a.a.a.b.a.a.e.a.b f;
    public com.google.a.a.a.a.b.a.a.f.l g;
    public com.google.a.a.a.a.b.a.a.f.e h;

    n() {
        com.google.protobuf.nano.b();
        this.a = -1;
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

    public static n[] a() {
        if (com.google.a.a.a.a.b.a.a.f.n.b == 0) {
            enter com.google.protobuf.nano.h.b;
            try {
                if (com.google.a.a.a.a.b.a.a.f.n.b == 0)
                    com.google.a.a.a.a.b.a.a.f.n.b = new n[0];
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
        return com.google.a.a.a.a.b.a.a.f.n.b;
    }

    public final com.google.a.a.a.a.b.a.a.f.n a(com.google.a.a.a.a.b.a.b.a.at p0) {
        if (p0 == 0) {
            if (this.a == 0)
                this.a = -1;
            this.c = 0;
        }
        else {
            this.a = -1;
            this.a = 0;
            this.c = p0;
        }
        return this;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 34;
            case 26:
  4:            goto 54;
            case 34:
  4:            goto 74;
            case 42:
  4:            goto 94;
            case 50:
  4:            goto 114;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 16:    if (this.c == 0)
 23:        this.c = new com.google.a.a.a.a.b.a.b.a.at();
 27:    p0.a(this.c);
 31:    this.a = 0;
 33:    goto 0;
 36:    if (this.d == 0)
 43:        this.d = new com.google.a.a.a.a.b.a.a.f.c();
 47:    p0.a(this.d);
 51:    this.a = 1;
 53:    goto 0;
 56:    if (this.e == 0)
 63:        this.e = new com.google.a.a.a.a.b.a.a.f.j();
 67:    p0.a(this.e);
 71:    this.a = 2;
 73:    goto 0;
 76:    if (this.f == 0)
 83:        this.f = new com.google.a.a.a.a.b.a.a.e.a.b();
 87:    p0.a(this.f);
 91:    this.a = 3;
 93:    goto 0;
 96:    if (this.g == 0)
103:        this.g = new com.google.a.a.a.a.b.a.a.f.l();
107:    p0.a(this.g);
111:    this.a = 4;
113:    goto 0;
116:    if (this.h == 0)
123:        this.h = new com.google.a.a.a.a.b.a.a.f.e();
127:    p0.a(this.h);
131:    this.a = 5;
133:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.b(1, this.c);
        if (this.a == 1)
            p0.b(2, this.d);
        if (this.a == 2)
            p0.b(3, this.e);
        if (this.a == 3)
            p0.b(4, this.f);
        if (this.a == 4)
            p0.b(5, this.g);
        if (this.a == 5)
            p0.b(6, this.h);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.c);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.a == 3)
            v0 = v0 + CodedOutputByteBufferNano.d(4, this.f);
        if (this.a == 4)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.g);
        if (this.a == 5)
            v0 = v0 + CodedOutputByteBufferNano.d(6, this.h);
        return v0;
    }

}
