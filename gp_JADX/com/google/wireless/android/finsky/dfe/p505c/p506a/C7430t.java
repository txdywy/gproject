package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7430t extends b {
    public static volatile C7430t[] f37672a;
    public cr f37673b;
    public dm f37674c;
    public ct f37675d;
    public bn f37676e;

    public static C7430t[] m35505d() {
        if (f37672a == null) {
            synchronized (C7219h.f35465b) {
                if (f37672a == null) {
                    f37672a = new C7430t[0];
                }
            }
        }
        return f37672a;
    }

    public C7430t() {
        this.f37673b = null;
        this.f37674c = null;
        this.f37675d = null;
        this.f37676e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35507a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37673b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37673b);
        }
        if (this.f37676e != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37676e);
        }
        if (this.f37675d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37675d);
        }
        if (this.f37674c != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37674c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35508b() {
        int b = super.b();
        if (this.f37673b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37673b);
        }
        if (this.f37676e != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37676e);
        }
        if (this.f37675d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37675d);
        }
        if (this.f37674c != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37674c);
        }
        return b;
    }

    public final /* synthetic */ i m35506a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37673b == null) {
                        this.f37673b = new cr();
                    }
                    c7213a.m33552a(this.f37673b);
                    continue;
                case 18:
                    if (this.f37676e == null) {
                        this.f37676e = new bn();
                    }
                    c7213a.m33552a(this.f37676e);
                    continue;
                case 26:
                    if (this.f37675d == null) {
                        this.f37675d = new ct();
                    }
                    c7213a.m33552a(this.f37675d);
                    continue;
                case 34:
                    if (this.f37674c == null) {
                        this.f37674c = new dm();
                    }
                    c7213a.m33552a(this.f37674c);
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
