package com.google.android.finsky.cd;

import com.google.android.finsky.d.a.a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.a.a.a.a.ce;

protected final class com.google.android.finsky.cd.f extends com.google.protobuf.nano.b
{

    public int a;
    public int b;
    public String c;
    public com.google.android.finsky.cd.h d;
    public com.google.android.finsky.d.a.a e;
    public long f;
    public int g;

    f() {
        com.google.protobuf.nano.b();
        this.a = -1;
        this.b = 0;
        this.c = "";
        this.a = -1;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.aO = 0;
        this.aP = -1;
    }

    private final com.google.android.finsky.cd.f b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 26:
  4:            goto 47;
            case 32:
  4:            goto 64;
            case 40:
  4:            goto 77;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.c = p0.f();
 24:    this.b = this.b | 1;
 26:    goto 0;
 29:    if (this.d == 0)
 36:        this.d = new com.google.android.finsky.cd.h();
 40:    p0.a(this.d);
 44:    this.a = 0;
 46:    goto 0;
 49:    if (this.e == 0)
 56:        this.e = new com.google.android.finsky.d.a.a();
 60:    p0.a(this.e);
 63:    goto 0;
 68:    this.f = p0.j();
 74:    this.b = this.b | 2;
 76:    goto 0;
 81:    this.b = this.b | 4;
 87:    try {
 95:        this.g = com.google.wireless.android.a.a.a.a.ce.a(p0.i());
101:        this.b = this.b | 4;
        }
        catch (IllegalArgumentException ex) {
105:        p0.e(p0.o());
108:        this.a(p0, v0);
        }
103:    goto 0;
    }

    public final com.google.android.finsky.cd.f a(com.google.android.finsky.cd.h p0) {
        this.a = -1;
        this.a = 0;
        this.d = p0;
        return this;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.b & 1)
            p0.a(1, this.c);
        if (this.a == 0)
            p0.b(2, this.d);
        if (this.e != 0)
            p0.b(3, this.e);
        if (this.b & 2)
            p0.b(4, this.f);
        if (this.b & 4)
            p0.a(5, this.g);
        super.a(p0);
    }

    public final com.google.android.finsky.cd.h ao_() {
        if (this.a == 0)
            v0 = this.d;
        else
            v0 = 0;
        return v0;
    }

    protected final int b() {
        v0 = super.b();
        if (this.b & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.c);
        if (this.a == 0)
            v0 = v0 + CodedOutputByteBufferNano.d(2, this.d);
        if (this.e != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.e);
        if (this.b & 2)
            v0 = v0 + CodedOutputByteBufferNano.f(4, this.f);
        if (this.b & 4)
            v0 = v0 + CodedOutputByteBufferNano.d(5, this.g);
        return v0;
    }

}
