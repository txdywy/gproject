package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class br extends b {
    public int f38478a;
    public String f38479b;
    public String f38480c;

    public br() {
        this.f38478a = 0;
        this.f38479b = "";
        this.f38480c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36107a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38478a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38479b);
        }
        if ((this.f38478a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38480c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36108b() {
        int b = super.b();
        if ((this.f38478a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38479b);
        }
        if ((this.f38478a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38480c);
        }
        return b;
    }

    public final /* synthetic */ i m36106a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38479b = c7213a.m33564f();
                    this.f38478a |= 1;
                    continue;
                case 18:
                    this.f38480c = c7213a.m33564f();
                    this.f38478a |= 2;
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
