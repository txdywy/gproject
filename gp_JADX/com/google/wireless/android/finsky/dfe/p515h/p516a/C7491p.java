package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7491p extends b {
    public int f38119a;
    public String f38120b;
    public String f38121c;
    public int f38122d;

    public C7491p() {
        this.f38119a = 0;
        this.f38120b = "";
        this.f38121c = "";
        this.f38122d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35834a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38119a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38120b);
        }
        if ((this.f38119a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38121c);
        }
        if ((this.f38119a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38122d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35835b() {
        int b = super.b();
        if ((this.f38119a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38120b);
        }
        if ((this.f38119a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38121c);
        }
        if ((this.f38119a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f38122d);
        }
        return b;
    }

    public final /* synthetic */ i m35833a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38120b = c7213a.m33564f();
                    this.f38119a |= 1;
                    continue;
                case 26:
                    this.f38121c = c7213a.m33564f();
                    this.f38119a |= 2;
                    continue;
                case 32:
                    this.f38122d = c7213a.m33567i();
                    this.f38119a |= 4;
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
