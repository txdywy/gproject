package com.google.p443h.p447b.p448a.p449a.p450a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7150b extends b {
    public static volatile C7150b[] f34923a;
    public int f34924b;
    public String f34925c;
    public int f34926d;

    public static C7150b[] m32428d() {
        if (f34923a == null) {
            synchronized (C7219h.f35465b) {
                if (f34923a == null) {
                    f34923a = new C7150b[0];
                }
            }
        }
        return f34923a;
    }

    public C7150b() {
        this.f34924b = 0;
        this.f34925c = "";
        this.f34926d = 0;
        this.aP = -1;
    }

    public final void m32430a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34924b != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34924b);
        }
        if (!(this.f34925c == null || this.f34925c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34925c);
        }
        if (this.f34926d != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f34926d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32431b() {
        int b = super.b();
        if (this.f34924b != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34924b);
        }
        if (!(this.f34925c == null || this.f34925c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f34925c);
        }
        if (this.f34926d != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f34926d);
        }
        return b;
    }

    public final /* synthetic */ i m32429a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34924b = c7213a.m33567i();
                    continue;
                case 18:
                    this.f34925c = c7213a.m33564f();
                    continue;
                case 24:
                    this.f34926d = c7213a.m33567i();
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
