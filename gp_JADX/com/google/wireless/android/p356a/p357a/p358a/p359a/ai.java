package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ai extends b {
    public static volatile ai[] f35617a;
    public int f35618b;
    public String f35619c;
    public long f35620d;

    public static ai[] m34083d() {
        if (f35617a == null) {
            synchronized (C7219h.f35465b) {
                if (f35617a == null) {
                    f35617a = new ai[0];
                }
            }
        }
        return f35617a;
    }

    public ai() {
        this.f35618b = 0;
        this.f35619c = "";
        this.f35620d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34085a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35618b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35619c);
        }
        if ((this.f35618b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35620d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34086b() {
        int b = super.b();
        if ((this.f35618b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35619c);
        }
        if ((this.f35618b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f35620d);
        }
        return b;
    }

    public final /* synthetic */ i m34084a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35619c = c7213a.m33564f();
                    this.f35618b |= 1;
                    continue;
                case 16:
                    this.f35620d = c7213a.m33568j();
                    this.f35618b |= 2;
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
