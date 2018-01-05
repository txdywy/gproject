package com.google.android.finsky.cv.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.e;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;
import java.util.Arrays;

public final class com.google.android.finsky.cv.a.ak extends com.google.protobuf.nano.b
{

    public int a;
    public byte[] b;
    public byte[] c;
    public String d;

    ak() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = com.google.protobuf.nano.l.l;
        this.c = com.google.protobuf.nano.l.l;
        this.d = "";
        this.aO = 0;
        this.aP = -1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 10:
  4:            goto 14;
            case 18:
  4:            goto 27;
            case 26:
  4:            goto 40;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    this.b = p0.g();
 24:    this.a = this.a | 1;
 26:    goto 0;
 31:    this.c = p0.g();
 37:    this.a = this.a | 2;
 39:    goto 0;
 44:    this.d = p0.f();
 50:    this.a = this.a | 4;
 52:    goto 0;
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a & 1)
            p0.a(1, this.b);
        if (this.a & 2)
            p0.a(2, this.c);
        if (this.a & 4)
            p0.a(3, this.d);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a & 1)
            v0 = v0 + CodedOutputByteBufferNano.b(1, this.b);
        if (this.a & 2)
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.c);
        if (this.a & 4)
            v0 = v0 + CodedOutputByteBufferNano.b(3, this.d);
        return v0;
    }

    public final boolean equals(Object p0) {
        v0 = 1;
        if (p0 != this) {
            if (!(p0 instanceof com.google.android.finsky.cv.a.ak))
                v0 = 0;
            else {
                p0 = (com.google.android.finsky.cv.a.ak)p0;
                if ((this.a & 1) != (p0.a & 1))
                    v0 = 0;
                else if (!Arrays.equals(this.b, p0.b))
                    v0 = 0;
                else if ((this.a & 2) != (p0.a & 2))
                    v0 = 0;
                else if (!Arrays.equals(this.c, p0.c))
                    v0 = 0;
                else if ((this.a & 4) != (p0.a & 4))
                    v0 = 0;
                else if (!this.d.equals(p0.d))
                    v0 = 0;
                else if (this.aO == 0 || this.aO.b()) {
                    if (p0.aO != 0 && !p0.aO.b())
                        v0 = 0;
                }
                else
                    v0 = this.aO.equals(p0.aO);
            }
        }
        return v0;
    }

    public final int hashCode() {
        if (this.aO == 0 || this.aO.b())
            v0 = 0;
        else
            v0 = this.aO.hashCode();
        return v0 + ((((this.getClass().getName().hashCode() + 527) * 31 + Arrays.hashCode(this.b)) * 31 + Arrays.hashCode(this.c)) * 31 + this.d.hashCode()) * 31;
    }

}
