package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7526c extends b {
    public int f38522a;
    public String f38523b;
    public int f38524c;

    public C7526c() {
        this.f38522a = 0;
        this.f38523b = "";
        this.f38524c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36134a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38522a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38523b);
        }
        if ((this.f38522a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38524c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36135b() {
        int b = super.b();
        if ((this.f38522a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38523b);
        }
        if ((this.f38522a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38524c);
        }
        return b;
    }

    public final /* synthetic */ i m36133a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38523b = c7213a.m33564f();
                    this.f38522a |= 1;
                    continue;
                case 16:
                    this.f38524c = c7213a.m33567i();
                    this.f38522a |= 2;
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
