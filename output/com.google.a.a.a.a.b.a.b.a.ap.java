package com.google.a.a.a.a.b.a.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.protobuf.nano.l;

protected final class com.google.a.a.a.a.b.a.b.a.ap extends com.google.protobuf.nano.b
{

    public aq[] a;
    public String b;
    public String c;
    public int d;

    ap() {
        com.google.protobuf.nano.b();
        this.a = com.google.a.a.a.a.b.a.b.a.aq.a();
        this.b = "";
        this.c = "";
        this.d = 0;
        this.aP = -1;
    }

    private final com.google.a.a.a.a.b.a.b.a.ap b(com.google.protobuf.nano.a p0) {
  1:    v0 = p0.a();
  5:    switch (v0) {
            case 0:
  5:            goto 14;
            case 10:
  5:            goto 15;
            case 18:
  5:            goto 78;
            case 26:
  5:            goto 85;
            case 32:
  5:            goto 92;
            default:
        }
 12:    if (super.a(p0, v0)) goto 1;
 14:    return this;
 23:    if (this.a == 0)
 25:        v0 = 0;
        else
 61:        v0 = this.a.length;
 27:    v2 = new aq[com.google.protobuf.nano.l.a(p0, 10) + v0];
 29:    if (v0 != 0)
 33:        System.arraycopy(this.a, 0, v2, 0, v0);
 36:    while (v0 < v2.length - 1) {
 46:        v2[v0] = new com.google.a.a.a.a.b.a.b.a.aq();
 50:        p0.a(v2[v0]);
 53:        p0.a();
 56:        v0 = v0 + 1;
        }
 58:    goto 63;
 68:    v2[v0] = new com.google.a.a.a.a.b.a.b.a.aq();
 72:    p0.a(v2[v0]);
 75:    this.a = v2;
 77:    goto 1;
 82:    this.b = p0.f();
 84:    goto 1;
 89:    this.c = p0.f();
 91:    goto 1;
 96:    try {
 96:        v3 = p0.i();
100:        switch (v3) {
                case 0:
139:                try {
139:                    this.d = v3;
                    }
                    catch (IllegalArgumentException ex) {
131:                    p0.e(p0.o());
134:                    this.a(p0, v0);
                    }
144:                break;
                case 1:
139:                try {
139:                    this.d = v3;
                    }
                    catch (IllegalArgumentException ex) {
131:                    p0.e(p0.o());
134:                    this.a(p0, v0);
                    }
144:                break;
                case 2:
139:                try {
139:                    this.d = v3;
                    }
                    catch (IllegalArgumentException ex) {
131:                    p0.e(p0.o());
134:                    this.a(p0, v0);
                    }
144:                break;
                case 3:
139:                try {
139:                    this.d = v3;
                    }
                    catch (IllegalArgumentException ex) {
131:                    p0.e(p0.o());
134:                    this.a(p0, v0);
                    }
144:                break;
                default:
129:                throw new IllegalArgumentException(43 + v3 + " is not a valid enum DisplayType");
            }
        }
        catch (IllegalArgumentException ex) {
        }
131:    p0.e(p0.o());
134:    this.a(p0, v0);
137:    goto 1;
    }

    public final com.google.protobuf.nano.i a(com.google.protobuf.nano.a p0) {
        return this.b(p0);
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
        if (this.c != 0 && !this.c.equals(""))
            p0.a(3, this.c);
        if (this.d != 0)
            p0.a(4, this.d);
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
        if (this.c != 0 && !this.c.equals(""))
            v1 = v1 + CodedOutputByteBufferNano.b(3, this.c);
        if (this.d != 0)
            v1 = v1 + CodedOutputByteBufferNano.d(4, this.d);
        return v1;
    }

}
