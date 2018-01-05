package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

protected final class com.google.a.a.a.a.b.a.b.a.am extends com.google.protobuf.nano.b
{

    public int a;
    public String b;
    public int c;

    am() {
        com.google.protobuf.nano.b();
        this.a = 0;
        this.b = "";
        this.c = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.b.a.am b(com.google.protobuf.nano.a p0) {
  0:    v0 = p0.a();
  4:    switch (v0) {
            case 0:
  4:            goto 13;
            case 8:
  4:            goto 14;
            case 18:
  4:            goto 37;
            case 24:
  4:            goto 44;
            default:
        }
 11:    if (super.a(p0, v0)) goto 0;
 13:    return this;
 18:    try {
 26:        this.a = com.google.a.a.a.a.b.a.b.a.at.a(p0.i());
        }
        catch (IllegalArgumentException ex) {
 30:        p0.e(p0.o());
 33:        this.a(p0, v0);
        }
 28:    goto 0;
 41:    this.b = p0.f();
 43:    goto 0;
 48:    try {
 48:        v2 = p0.i();
 52:        switch (v2) {
                case 0:
 90:                try {
 90:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 83:                    p0.e(p0.o());
 86:                    this.a(p0, v0);
                    }
 96:                break;
                case 1:
 90:                try {
 90:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 83:                    p0.e(p0.o());
 86:                    this.a(p0, v0);
                    }
 96:                break;
                case 2:
 90:                try {
 90:                    this.c = v2;
                    }
                    catch (IllegalArgumentException ex) {
 83:                    p0.e(p0.o());
 86:                    this.a(p0, v0);
                    }
 96:                break;
                default:
 81:                throw new IllegalArgumentException(43 + v2 + " is not a valid enum DisplayType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
 83:    p0.e(p0.o());
 86:    this.a(p0, v0);
 89:    goto 0;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
    }

    public final void a(CodedOutputByteBufferNano p0) {
        if (this.a != 0)
            p0.a(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            p0.a(2, this.b);
        if (this.c != 0)
            p0.a(3, this.c);
        super.a(p0);
    }

    protected final int b() {
        v0 = super.b();
        if (this.a != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(1, this.a);
        if (this.b != 0 && !this.b.equals(""))
            v0 = v0 + CodedOutputByteBufferNano.b(2, this.b);
        if (this.c != 0)
            v0 = v0 + CodedOutputByteBufferNano.d(3, this.c);
        return v0;
    }

}
