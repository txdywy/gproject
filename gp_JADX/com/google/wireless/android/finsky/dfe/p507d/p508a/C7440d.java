package com.google.wireless.android.finsky.dfe.p507d.p508a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7440d extends b {
    public static volatile C7440d[] f37733a;
    public int f37734b;
    public String f37735c;
    public int f37736d;

    public static C7440d[] m35544d() {
        if (f37733a == null) {
            synchronized (C7219h.f35465b) {
                if (f37733a == null) {
                    f37733a = new C7440d[0];
                }
            }
        }
        return f37733a;
    }

    public C7440d() {
        this.f37734b = 0;
        this.f37735c = "";
        this.f37736d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35546a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37734b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37735c);
        }
        if ((this.f37734b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37736d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35547b() {
        int b = super.b();
        if ((this.f37734b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37735c);
        }
        if ((this.f37734b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f37736d);
        }
        return b;
    }

    public final /* synthetic */ i m35545a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37735c = c7213a.m33564f();
                    this.f37734b |= 1;
                    continue;
                case 16:
                    this.f37736d = c7213a.m33567i();
                    this.f37734b |= 2;
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
