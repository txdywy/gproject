package com.google.android.finsky.cd;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.android.finsky.cd.d extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public com.google.android.finsky.cv.a.bd c;
    public String d;

    d() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.a = -1;
        this.b = 0;
        this.a = -1;
        this.c = 0;
        this.a = -1;
        this.d = "";
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 24;
            case 26:
  4:            goto 44;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.i();
 21:    this.a = 0;
 23:    goto 0;
 26:    if (this.c == 0)
 33:        this.c = new com.google.android.finsky.cv.a.bd();
 37:    p0.a(this.c);
 41:    this.a = 1;
 43:    goto 0;
 48:    this.d = p0.f();
 51:    this.a = 2;
 53:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a == 0)
            p0.a(1, this.b);
        if (this.a == 1)
            p0.b(2, this.c);
        if (this.a == 2)
            p0.a(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.b);
        if (this.a == 1)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.c);
        if (this.a == 2)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        return v0;
    }

}
