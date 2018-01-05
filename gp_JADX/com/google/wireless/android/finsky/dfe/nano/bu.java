package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bu extends b {
    public static volatile bu[] f38484a;
    public cv f38485b;

    public static bu[] m36113d() {
        if (f38484a == null) {
            synchronized (C7219h.f35465b) {
                if (f38484a == null) {
                    f38484a = new bu[0];
                }
            }
        }
        return f38484a;
    }

    public bu() {
        this.f38485b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36115a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38485b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38485b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36116b() {
        int b = super.b();
        if (this.f38485b != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38485b);
        }
        return b;
    }

    public final /* synthetic */ i m36114a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38485b == null) {
                        this.f38485b = new cv();
                    }
                    c7213a.m33552a(this.f38485b);
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
