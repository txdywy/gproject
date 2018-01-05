package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class de extends b {
    public static volatile de[] f37413a;
    public int f37414b;
    public String f37415c;
    public boolean f37416d;
    public dm f37417e;
    public df f37418f;
    public boolean f37419g;

    public static de[] m35353d() {
        if (f37413a == null) {
            synchronized (C7219h.f35465b) {
                if (f37413a == null) {
                    f37413a = new de[0];
                }
            }
        }
        return f37413a;
    }

    public final de m35355a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f37414b |= 1;
        this.f37415c = str;
        return this;
    }

    public de() {
        this.f37414b = 0;
        this.f37415c = "";
        this.f37416d = false;
        this.f37417e = null;
        this.f37418f = null;
        this.f37419g = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35356a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37414b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37415c);
        }
        if ((this.f37414b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f37416d);
        }
        if (this.f37417e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37417e);
        }
        if (this.f37418f != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37418f);
        }
        if ((this.f37414b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37419g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35357b() {
        int b = super.b();
        if ((this.f37414b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37415c);
        }
        if ((this.f37414b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f37417e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37417e);
        }
        if (this.f37418f != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37418f);
        }
        if ((this.f37414b & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35354a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37415c = c7213a.m33564f();
                    this.f37414b |= 1;
                    continue;
                case 16:
                    this.f37416d = c7213a.m33563e();
                    this.f37414b |= 2;
                    continue;
                case 26:
                    if (this.f37417e == null) {
                        this.f37417e = new dm();
                    }
                    c7213a.m33552a(this.f37417e);
                    continue;
                case 34:
                    if (this.f37418f == null) {
                        this.f37418f = new df();
                    }
                    c7213a.m33552a(this.f37418f);
                    continue;
                case 40:
                    this.f37419g = c7213a.m33563e();
                    this.f37414b |= 4;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
