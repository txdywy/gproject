package com.google.a.a.a.a.b.a.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.c.f extends com.google.protobuf.nano.b
{

    public String[] a;
    public String[] b;

    f() {
        com.google.protobuf.nano.b();
        this.a = com.google.protobuf.nano.l.j;
        this.b = com.google.protobuf.nano.l.j;
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
  5:            goto 66;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 55:        v0 = this.a.length;
 27:    v2 = new String[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 45:        v2[v0] = p0.f();
 47:        p0.a();
 50:        v0 = v0 + 1;
        }
 52:    goto 57;
 61:    v2[v0] = p0.f();
 63:    this.a = v2;
 65:    goto 1;
 74:    if (this.b == 0)
 76:        v0 = 0;
        else
106:        v0 = this.b.length;
 78:    v2 = new String[com.google.protobuf.nano.l.a(p0, 18) + v0];
 80:    if (v0 != 0)
 84:        System.arraycopy(this.b, 0, v2, 0, v0);
 87:    while (v0 < v2.length - 1) {
 96:        v2[v0] = p0.f();
 98:        p0.a();
101:        v0 = v0 + 1;
        }
103:    goto 108;
112:    v2[v0] = p0.f();
114:    this.b = v2;
116:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        v1 = 0;
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    p0.a(1, this.a[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0 && this.b.length > 0)
            while (v1 < this.b.length) {
                if (this.b[v1] != 0)
                    p0.a(2, this.b[v1]);
                v1 = v1 + 1;
            }
        super.a(p0);
    }

    protected final int b() {
        v1 = 0;
        v4 = super.b();
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            v2 = 0;
            v3 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0) {
                    v3 = v3 + 1;
                    v2 = v2 + CodedOutputByteBufferNano.b(this.a[v0]);
                }
                v0 = v0 + 1;
            }
            v0 = v4 + v2 + v3 * 1;
        }
        else
            v0 = v4;
        if (this.b != 0 && this.b.length > 0) {
            v2 = 0;
            v3 = 0;
            while (v1 < this.b.length) {
                if (this.b[v1] != 0) {
                    v3 = v3 + 1;
                    v2 = v2 + CodedOutputByteBufferNano.b(this.b[v1]);
                }
                v1 = v1 + 1;
            }
            v0 = v0 + v2 + v3 * 1;
        }
        return v0;
    }

}
