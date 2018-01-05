package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7354j extends b {
    public static volatile C7354j[] f36765a;
    public String f36766b;
    public double f36767c;

    public static C7354j[] m34860d() {
        if (f36765a == null) {
            synchronized (C7219h.f35465b) {
                if (f36765a == null) {
                    f36765a = new C7354j[0];
                }
            }
        }
        return f36765a;
    }

    public C7354j() {
        this.f36766b = "";
        this.f36767c = 0.0d;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34862a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33521a(3, this.f36766b);
        codedOutputByteBufferNano.m33516a(4, this.f36767c);
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34863b() {
        return (super.b() + CodedOutputByteBufferNano.m33493b(3, this.f36766b)) + (CodedOutputByteBufferNano.m33501d(4) + 8);
    }

    public final /* synthetic */ i m34861a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 26:
                    this.f36766b = c7213a.m33564f();
                    continue;
                case 33:
                    this.f36767c = Double.longBitsToDouble(c7213a.m33570l());
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
