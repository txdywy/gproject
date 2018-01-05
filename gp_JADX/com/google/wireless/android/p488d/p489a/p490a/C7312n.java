package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7312n extends b {
    public static volatile C7312n[] f36292a;
    public String f36293b;
    public int f36294c;

    public static C7312n[] m34570d() {
        if (f36292a == null) {
            synchronized (C7219h.f35465b) {
                if (f36292a == null) {
                    f36292a = new C7312n[0];
                }
            }
        }
        return f36292a;
    }

    public C7312n() {
        this.f36293b = "";
        this.f36294c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34572a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36293b == null || this.f36293b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36293b);
        }
        if (this.f36294c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36294c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34573b() {
        int b = super.b();
        if (!(this.f36293b == null || this.f36293b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36293b);
        }
        if (this.f36294c != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36294c);
        }
        return b;
    }

    public final /* synthetic */ i m34571a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36293b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f36294c = c7213a.m33567i();
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
