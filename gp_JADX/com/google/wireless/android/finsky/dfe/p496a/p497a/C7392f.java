package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7392f extends b {
    public int f36936a;
    public String f36937b;
    public boolean f36938c;

    public final C7392f m34998a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f36936a |= 1;
        this.f36937b = str;
        return this;
    }

    public final C7392f m34999a(boolean z) {
        this.f36936a |= 2;
        this.f36938c = z;
        return this;
    }

    public C7392f() {
        this.f36936a = 0;
        this.f36937b = "";
        this.f36938c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35000a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36936a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36937b);
        }
        if ((this.f36936a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36938c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35001b() {
        int b = super.b();
        if ((this.f36936a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36937b);
        }
        if ((this.f36936a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34997a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36937b = c7213a.m33564f();
                    this.f36936a |= 1;
                    continue;
                case 16:
                    this.f36938c = c7213a.m33563e();
                    this.f36936a |= 2;
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
