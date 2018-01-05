package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7314p extends b {
    public static volatile C7314p[] f36303a;
    public String f36304b;

    public static C7314p[] m34577d() {
        if (f36303a == null) {
            synchronized (C7219h.f35465b) {
                if (f36303a == null) {
                    f36303a = new C7314p[0];
                }
            }
        }
        return f36303a;
    }

    public C7314p() {
        this.f36304b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34579a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f36304b == null || this.f36304b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f36304b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34580b() {
        int b = super.b();
        if (this.f36304b == null || this.f36304b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(1, this.f36304b);
    }

    public final /* synthetic */ i m34578a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36304b = c7213a.m33564f();
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
