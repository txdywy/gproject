package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7315q extends b {
    public static volatile C7315q[] f36305a;
    public String f36306b;
    public int f36307c;
    public int f36308d;

    public static C7315q[] m34581d() {
        if (f36305a == null) {
            synchronized (C7219h.f35465b) {
                if (f36305a == null) {
                    f36305a = new C7315q[0];
                }
            }
        }
        return f36305a;
    }

    public C7315q() {
        this.f36306b = "";
        this.f36307c = 0;
        this.f36308d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34583a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36306b == null || this.f36306b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36306b);
        }
        if (this.f36307c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36307c);
        }
        if (this.f36308d != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f36308d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34584b() {
        int b = super.b();
        if (!(this.f36306b == null || this.f36306b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36306b);
        }
        if (this.f36307c != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36307c);
        }
        if (this.f36308d != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f36308d);
        }
        return b;
    }

    public final /* synthetic */ i m34582a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36306b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f36307c = c7213a.m33567i();
                    continue;
                case 24:
                    this.f36308d = c7213a.m33567i();
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
