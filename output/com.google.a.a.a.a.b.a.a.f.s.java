package com.google.a.a.a.a.b.a.a.f;

import com.google.a.a.a.a.b.a.a.d.a.a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.f.s extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public m[] b;
    public com.google.a.a.a.a.b.a.a.d.a.a c;

    s() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.a.a.a.a.b.a.a.f.m.a();
        this.c = 0;
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
  5:            goto 32;
            case 26:
  5:            goto 95;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 17:    if (this.a == 0)
 24:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 28:    p0.a(this.a);
 31:    goto 1;
 40:    if (this.b == 0)
 42:        v0 = 0;
        else
 78:        v0 = this.b.length;
 44:    v2 = new m[com.google.protobuf.nano.l.a(p0, 18) + v0];
 46:    if (v0 != 0)
 50:        System.arraycopy(this.b, 0, v2, 0, v0);
 53:    while (v0 < v2.length - 1) {
 63:        v2[v0] = new com.google.a.a.a.a.b.a.a.f.m();
 67:        p0.a(v2[v0]);
 70:        p0.a();
 73:        v0 = v0 + 1;
        }
 75:    goto 80;
 85:    v2[v0] = new com.google.a.a.a.a.b.a.a.f.m();
 89:    p0.a(v2[v0]);
 92:    this.b = v2;
 94:    goto 1;
 97:    if (this.c == 0)
104:        this.c = new com.google.a.a.a.a.b.a.a.d.a.a();
108:    p0.a(this.c);
111:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.b(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.b(2, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.c != 0)
            p0.b(3, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0 && this.b.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(2, this.b[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.c);
        return v0;
    }

}
