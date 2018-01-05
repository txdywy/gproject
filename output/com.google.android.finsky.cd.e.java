package com.google.android.finsky.cd;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.android.finsky.cd.e extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public String c;
    public c[] d;

    e() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = com.google.android.finsky.cd.c.an_();
        this.aO = 0;
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
  5:            goto 28;
            case 26:
  5:            goto 41;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 19:    this.b = p0.f();
 25:    this.a = this.a | 1;
 27:    goto 1;
 32:    this.c = p0.f();
 38:    this.a = this.a | 2;
 40:    goto 1;
 49:    if (this.d == 0)
 51:        v0 = 0;
        else
 87:        v0 = this.d.length;
 53:    v2 = new c[com.google.protobuf.nano.l.a(p0, 26) + v0];
 55:    if (v0 != 0)
 59:        System.arraycopy(this.d, 0, v2, 0, v0);
 62:    while (v0 < v2.length - 1) {
 72:        v2[v0] = new com.google.android.finsky.cd.c();
 76:        p0.a(v2[v0]);
 79:        p0.a();
 82:        v0 = v0 + 1;
        }
 84:    goto 89;
 94:    v2[v0] = new com.google.android.finsky.cd.c();
 98:    p0.a(v2[v0]);
101:    this.d = v2;
103:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    p0.b(3, this.d[v0]);
                v0 = v0 + 1;
            }
        }
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.d != 0 && this.d.length > 0) {
            v1 = v0;
            v0 = 0;
            while (v0 < this.d.length) {
                if (this.d[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(3, this.d[v0]);
                v0 = v0 + 1;
            }
            v0 = v1;
        }
        return v0;
    }

}
