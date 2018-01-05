package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7356l extends b {
    public static volatile C7356l[] f36772a;
    public String f36773b;
    public String f36774c;

    public static C7356l[] m34867d() {
        if (f36772a == null) {
            synchronized (C7219h.f35465b) {
                if (f36772a == null) {
                    f36772a = new C7356l[0];
                }
            }
        }
        return f36772a;
    }

    public C7356l() {
        this.f36773b = "";
        this.f36774c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34869a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33521a(1, this.f36773b);
        codedOutputByteBufferNano.m33521a(2, this.f36774c);
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34870b() {
        return (super.b() + CodedOutputByteBufferNano.m33493b(1, this.f36773b)) + CodedOutputByteBufferNano.m33493b(2, this.f36774c);
    }

    public final /* synthetic */ i m34868a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36773b = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36774c = c7213a.m33564f();
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
