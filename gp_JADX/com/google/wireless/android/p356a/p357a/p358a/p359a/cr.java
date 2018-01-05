package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cr extends b {
    public static volatile cr[] f36003a;
    public int f36004b;
    public String f36005c;
    public long f36006d;

    public static cr[] m34359d() {
        if (f36003a == null) {
            synchronized (C7219h.f35465b) {
                if (f36003a == null) {
                    f36003a = new cr[0];
                }
            }
        }
        return f36003a;
    }

    public cr() {
        this.f36004b = 0;
        this.f36005c = "";
        this.f36006d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34361a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36004b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36005c);
        }
        if ((this.f36004b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36006d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34362b() {
        int b = super.b();
        if ((this.f36004b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36005c);
        }
        if ((this.f36004b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f36006d);
        }
        return b;
    }

    public final /* synthetic */ i m34360a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36005c = c7213a.m33564f();
                    this.f36004b |= 1;
                    continue;
                case 16:
                    this.f36006d = c7213a.m33568j();
                    this.f36004b |= 2;
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
