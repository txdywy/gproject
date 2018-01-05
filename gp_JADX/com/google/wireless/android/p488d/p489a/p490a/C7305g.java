package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7305g extends b {
    public static volatile C7305g[] f36255a;
    public String f36256b;
    public int f36257c;
    public String f36258d;

    public static C7305g[] m34543d() {
        if (f36255a == null) {
            synchronized (C7219h.f35465b) {
                if (f36255a == null) {
                    f36255a = new C7305g[0];
                }
            }
        }
        return f36255a;
    }

    public C7305g() {
        this.f36256b = "";
        this.f36257c = 0;
        this.f36258d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34545a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36256b == null || this.f36256b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36256b);
        }
        if (this.f36257c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36257c);
        }
        if (!(this.f36258d == null || this.f36258d.equals(""))) {
            codedOutputByteBufferNano.m33521a(3, this.f36258d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34546b() {
        int b = super.b();
        if (!(this.f36256b == null || this.f36256b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36256b);
        }
        if (this.f36257c != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36257c);
        }
        if (this.f36258d == null || this.f36258d.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(3, this.f36258d);
    }

    public final /* synthetic */ i m34544a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36256b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f36257c = c7213a.m33567i();
                    continue;
                case 26:
                    this.f36258d = c7213a.m33564f();
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
