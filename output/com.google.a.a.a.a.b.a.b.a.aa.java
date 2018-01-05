package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.aa extends com.google.protobuf.nano.b
{

    public ab[] a;
    public String b;
    public boolean c;

    aa() {
        com.google.protobuf.nano.b();
        this.a = com.google.a.a.a.a.b.a.b.a.ab.a();
        this.b = "";
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
  5:            goto 78;
            case 24:
  5:            goto 85;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.a.length;
 27:    v2 = new ab[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.ab();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.ab();
 72:    p0.a(v2[v0]);
 75:    this.a = v2;
 77:    goto 1;
 82:    this.b = p0.f();
 84:    goto 1;
 89:    this.c = p0.e();
 91:    goto 1;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    p0.b(1, this.a[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0 && !this.b.equals(""))
            p0.a(2, this.b);
        if (this.c != 0)
            p0.a(3, this.c);
        super.a(p0);
    }

    protected final int b() {
        v1 = super.b();
        if (this.a != 0 && this.a.length > 0) {
            v0 = 0;
            while (v0 < this.a.length) {
                if (this.a[v0] != 0)
                    v1 = v1 + CodedOutputByteBufferNano.d(1, this.a[v0]);
                v0 = v0 + 1;
            }
        }
        if (this.b != 0 && !this.b.equals(""))
            v1 = v1 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0)
            v1 = v1 + CodedOutputByteBufferNano.d(3) + 1;
        return v1;
    }

}
