package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7309k extends b {
    public static volatile C7309k[] f36277a;
    public C7313o f36278b;
    public String f36279c;
    public String f36280d;

    public static C7309k[] m34559d() {
        if (f36277a == null) {
            synchronized (C7219h.f35465b) {
                if (f36277a == null) {
                    f36277a = new C7309k[0];
                }
            }
        }
        return f36277a;
    }

    public C7309k() {
        this.f36278b = null;
        this.f36279c = "";
        this.f36280d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34561a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36278b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36278b);
        }
        if (!(this.f36279c == null || this.f36279c.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36279c);
        }
        if (!(this.f36280d == null || this.f36280d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36280d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34562b() {
        int b = super.b();
        if (this.f36278b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36278b);
        }
        if (!(this.f36279c == null || this.f36279c.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36279c);
        }
        if (this.f36280d == null || this.f36280d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(3, this.f36280d);
    }

    public final /* synthetic */ i m34560a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36278b == null) {
                        this.f36278b = new C7313o();
                    }
                    c7213a.m33552a(this.f36278b);
                    continue;
                case 18:
                    this.f36279c = c7213a.m33564f();
                    continue;
                case 26:
                    this.f36280d = c7213a.m33564f();
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
