package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7542r extends b {
    public int f39194a;
    public C7529e f39195b;
    public C7529e f39196c;
    public String f39197d;
    public String f39198e;
    public String f39199f;
    public C7536l f39200g;

    public C7542r() {
        this.f39194a = 0;
        this.f39195b = null;
        this.f39196c = null;
        this.f39197d = "";
        this.f39198e = "";
        this.f39199f = "";
        this.f39200g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36577a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39195b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39195b);
        }
        if (this.f39196c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39196c);
        }
        if ((this.f39194a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39198e);
        }
        if ((this.f39194a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39199f);
        }
        if (this.f39200g != null) {
            codedOutputByteBufferNano.m33532b(5, this.f39200g);
        }
        if ((this.f39194a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f39197d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36578b() {
        int b = super.b();
        if (this.f39195b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39195b);
        }
        if (this.f39196c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39196c);
        }
        if ((this.f39194a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39198e);
        }
        if ((this.f39194a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f39199f);
        }
        if (this.f39200g != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f39200g);
        }
        if ((this.f39194a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f39197d);
        }
        return b;
    }

    public final /* synthetic */ i m36576a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39195b == null) {
                        this.f39195b = new C7529e();
                    }
                    c7213a.m33552a(this.f39195b);
                    continue;
                case 18:
                    if (this.f39196c == null) {
                        this.f39196c = new C7529e();
                    }
                    c7213a.m33552a(this.f39196c);
                    continue;
                case 26:
                    this.f39198e = c7213a.m33564f();
                    this.f39194a |= 2;
                    continue;
                case 34:
                    this.f39199f = c7213a.m33564f();
                    this.f39194a |= 4;
                    continue;
                case 42:
                    if (this.f39200g == null) {
                        this.f39200g = new C7536l();
                    }
                    c7213a.m33552a(this.f39200g);
                    continue;
                case 50:
                    this.f39197d = c7213a.m33564f();
                    this.f39194a |= 1;
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
