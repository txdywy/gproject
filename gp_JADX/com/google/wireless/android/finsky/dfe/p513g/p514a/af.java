package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class af extends b {
    public static volatile af[] f37790a;
    public ac f37791b;
    public ai f37792c;
    public ai f37793d;

    public static af[] m35597d() {
        if (f37790a == null) {
            synchronized (C7219h.f35465b) {
                if (f37790a == null) {
                    f37790a = new af[0];
                }
            }
        }
        return f37790a;
    }

    public af() {
        this.f37791b = null;
        this.f37792c = null;
        this.f37793d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35599a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37791b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37791b);
        }
        if (this.f37792c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37792c);
        }
        if (this.f37793d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37793d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35600b() {
        int b = super.b();
        if (this.f37791b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37791b);
        }
        if (this.f37792c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37792c);
        }
        if (this.f37793d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37793d);
        }
        return b;
    }

    public final /* synthetic */ i m35598a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37791b == null) {
                        this.f37791b = new ac();
                    }
                    c7213a.m33552a(this.f37791b);
                    continue;
                case 18:
                    if (this.f37792c == null) {
                        this.f37792c = new ai();
                    }
                    c7213a.m33552a(this.f37792c);
                    continue;
                case 26:
                    if (this.f37793d == null) {
                        this.f37793d = new ai();
                    }
                    c7213a.m33552a(this.f37793d);
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
