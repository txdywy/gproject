package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

protected final class com.google.a.a.a.a.b.a.b.a.r extends com.google.protobuf.nano.b
{

    public long[] a;
    public boolean b;
    public byte[] c;

    r() {
        com.google.protobuf.nano.b();
        this.a = com.google.protobuf.nano.l.f;
        this.b = 0;
        this.c = com.google.protobuf.nano.l.l;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 8:
  5:            goto 15;
            case 10:
  5:            goto 66;
            case 16:
  5:            goto 132;
            case 42:
  5:            goto 140;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 55:        v0 = this.a.length;
 27:    v2 = new long[com.google.protobuf.nano.l.a(p0, 8) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 45:        v2[v0] = p0.j();
 47:        p0.a();
 50:        v0 = v0 + 1;
        }
 52:    goto 57;
 61:    v2[v0] = p0.j();
 63:    this.a = v2;
 65:    goto 1;
 78:    v0 = 0;
 79:    while (p0.m() > 0) {
 85:        p0.j();
 88:        v0 = v0 + 1;
        }
 91:    p0.e(p0.o());
 96:    if (this.a == 0)
 98:        v2 = 0;
        else
123:        v2 = this.a.length;
100:    v0 = new long[v0 + v2];
102:    if (v2 != 0)
106:        System.arraycopy(this.a, 0, v0, 0, v2);
109:    while (v2 < v0.length) {
116:        v0[v2] = p0.j();
118:        v2 = v2 + 1;
        }
120:    goto 125;
125:    this.a = v0;
127:    p0.d(p0.c(p0.i()));
130:    goto 1;
136:    this.b = p0.e();
138:    goto 1;
144:    this.c = p0.g();
146:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            v2 = 0;
            while (v0 < this.a.length) {
                v2 = v2 + CodedOutputByteBufferNano.c(this.a[v0]);
                v0 = v0 + 1;
            }
            p0.e(10);
            p0.e(v2);
            while (v1 < this.a.length) {
                p0.b(this.a[v1]);
                v1 = v1 + 1;
            }
        }
        if (this.b != 0)
            p0.a(2, this.b);
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            p0.a(5, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = 0;
        v2 = super.b();
        if (this.a != 0 && this.a.length > 0) {
            v1 = 0;
            while (v0 < this.a.length) {
                v1 = v1 + CodedOutputByteBufferNano.c(this.a[v0]);
                v0 = v0 + 1;
            }
            v0 = v2 + v1 + 1 + CodedOutputByteBufferNano.f(v1);
        }
        else
            v0 = v2;
        if (this.b != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2) + 1;
        if (!Arrays.equals(this.c, com.google.protobuf.nano.l.l))
            v0 = v0 + CodedOutputByteBufferNano.b(5, this.c);
        return v0;
    }

}
