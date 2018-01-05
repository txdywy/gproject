package com.google.wireless.android.finsky.dfe.p498b.p503b.p504a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7407a extends b {
    public static volatile C7407a[] f36980a;
    public int f36981b;
    public String f36982c;

    public static C7407a[] m35046d() {
        if (f36980a == null) {
            synchronized (C7219h.f35465b) {
                if (f36980a == null) {
                    f36980a = new C7407a[0];
                }
            }
        }
        return f36980a;
    }

    public C7407a() {
        this.f36981b = 0;
        this.f36982c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35048a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36981b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36982c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35049b() {
        int b = super.b();
        if ((this.f36981b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f36982c);
        }
        return b;
    }

    public final /* synthetic */ i m35047a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36982c = c7213a.m33564f();
                    this.f36981b |= 1;
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
