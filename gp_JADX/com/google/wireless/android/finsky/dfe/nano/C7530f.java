package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7530f extends b {
    public cv f38881a;

    public C7530f() {
        this.f38881a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36391a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38881a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38881a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36392b() {
        int b = super.b();
        if (this.f38881a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38881a);
        }
        return b;
    }

    public final /* synthetic */ i m36390a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38881a == null) {
                        this.f38881a = new cv();
                    }
                    c7213a.m33552a(this.f38881a);
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
