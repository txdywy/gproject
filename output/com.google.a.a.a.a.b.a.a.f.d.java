package com.google.a.a.a.a.b.a.a.f;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.a.f.d extends com.google.protobuf.nano.b
{

    public com.google.a.a.a.a.b.a.a.f.h a;
    public String[] b;
    public String c;

    d() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.protobuf.nano.l.j;
        this.c = "";
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 18:
  5:            goto 15;
            case 26:
  5:            goto 66;
            case 58:
  5:            goto 73;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.b == 0)
 25:        v0 = 0;
        else
 55:        v0 = this.b.length;
 27:    v2 = new String[com.google.protobuf.nano.l.a(p0, 18) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.b, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 45:        v2[v0] = p0.f();
 47:        p0.a();
 50:        v0 = v0 + 1;
        }
 52:    goto 57;
 61:    v2[v0] = p0.f();
 63:    this.b = v2;
 65:    goto 1;
 70:    this.c = p0.f();
 72:    goto 1;
 75:    if (this.a == 0)
 82:        this.a = new com.google.a.a.a.a.b.a.a.f.h();
 86:    p0.a(this.a);
 89:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b != 0 && this.b.length > 0) {
            v0 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0)
                    p0.a(2, this.b[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.a != 0)
            p0.b(7, this.a);
        super.a(p0);
    }

    protected final int b() {
        v0 = 0;
        v3 = super.b();
        if (this.b != 0 && this.b.length > 0) {
            v1 = 0;
            v2 = 0;
            while (v0 < this.b.length) {
                if (this.b[v0] != 0) {
                    v2 = v2 + 1;
                    v1 = v1 + CodedOutputByteBufferNano.b(this.b[v0]);
                }
                v0 = v0 + 1;
            }
            v0 = v3 + v1 + v2 * 1;
        }
        else
            v0 = v3;
        if (this.c != 0 && !this.c.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(7, this.a);
        return v0;
    }

}
