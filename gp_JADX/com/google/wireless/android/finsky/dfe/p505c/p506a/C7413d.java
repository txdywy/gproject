package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7413d extends b {
    public int f37390a;
    public String f37391b;

    public C7413d() {
        this.f37390a = 0;
        this.f37391b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35339a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37390a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37391b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35340b() {
        int b = super.b();
        if ((this.f37390a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f37391b);
        }
        return b;
    }

    public final /* synthetic */ i m35338a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37391b = c7213a.m33564f();
                    this.f37390a |= 1;
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
