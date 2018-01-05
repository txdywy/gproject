package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ag extends b {
    public int f36341a;
    public String f36342b;
    public String f36343c;
    public ac f36344d;
    public C7342x f36345e;
    public C7342x f36346f;

    public ag() {
        this.f36341a = 0;
        this.f36342b = "";
        this.f36343c = "";
        this.f36344d = null;
        this.f36345e = null;
        this.f36346f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34620a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36341a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36342b);
        }
        if ((this.f36341a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36343c);
        }
        if (this.f36344d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36344d);
        }
        if (this.f36345e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36345e);
        }
        if (this.f36346f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36346f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34621b() {
        int b = super.b();
        if ((this.f36341a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36342b);
        }
        if ((this.f36341a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36343c);
        }
        if (this.f36344d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36344d);
        }
        if (this.f36345e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f36345e);
        }
        if (this.f36346f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f36346f);
        }
        return b;
    }

    public final /* synthetic */ i m34619a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36342b = c7213a.m33564f();
                    this.f36341a |= 1;
                    continue;
                case 18:
                    this.f36343c = c7213a.m33564f();
                    this.f36341a |= 2;
                    continue;
                case 26:
                    if (this.f36344d == null) {
                        this.f36344d = new ac();
                    }
                    c7213a.m33552a(this.f36344d);
                    continue;
                case 34:
                    if (this.f36345e == null) {
                        this.f36345e = new C7342x();
                    }
                    c7213a.m33552a(this.f36345e);
                    continue;
                case 42:
                    if (this.f36346f == null) {
                        this.f36346f = new C7342x();
                    }
                    c7213a.m33552a(this.f36346f);
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
