package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7303e extends b {
    public String f36246a;
    public String f36247b;

    public C7303e() {
        this.f36246a = "";
        this.f36247b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34538a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36246a == null || this.f36246a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36246a);
        }
        if (!(this.f36247b == null || this.f36247b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f36247b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34539b() {
        int b = super.b();
        if (!(this.f36246a == null || this.f36246a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36246a);
        }
        if (this.f36247b == null || this.f36247b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(2, this.f36247b);
    }

    public final /* synthetic */ i m34537a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36246a = c7213a.m33564f();
                    continue;
                case 18:
                    this.f36247b = c7213a.m33564f();
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
