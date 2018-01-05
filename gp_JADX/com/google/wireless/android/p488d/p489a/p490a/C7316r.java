package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7316r extends b {
    public static volatile C7316r[] f36309a;
    public String f36310b;
    public int f36311c;

    public static C7316r[] m34585d() {
        if (f36309a == null) {
            synchronized (C7219h.f35465b) {
                if (f36309a == null) {
                    f36309a = new C7316r[0];
                }
            }
        }
        return f36309a;
    }

    public C7316r() {
        this.f36310b = "";
        this.f36311c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34587a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36310b == null || this.f36310b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36310b);
        }
        if (this.f36311c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36311c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34588b() {
        int b = super.b();
        if (!(this.f36310b == null || this.f36310b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36310b);
        }
        if (this.f36311c != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36311c);
        }
        return b;
    }

    public final /* synthetic */ i m34586a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36310b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f36311c = c7213a.m33567i();
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
