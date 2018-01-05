package com.google.wireless.android.finsky.dfe.p521k.p522a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7520b extends b {
    public static volatile C7520b[] f38259a;
    public int f38260b;
    public String f38261c;
    public String f38262d;

    public static C7520b[] m35944d() {
        if (f38259a == null) {
            synchronized (C7219h.f35465b) {
                if (f38259a == null) {
                    f38259a = new C7520b[0];
                }
            }
        }
        return f38259a;
    }

    public C7520b() {
        this.f38260b = 0;
        this.f38261c = "";
        this.f38262d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35946a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38260b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38261c);
        }
        if ((this.f38260b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38262d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35947b() {
        int b = super.b();
        if ((this.f38260b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38261c);
        }
        if ((this.f38260b & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f38262d);
        }
        return b;
    }

    public final /* synthetic */ i m35945a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38261c = c7213a.m33564f();
                    this.f38260b |= 1;
                    continue;
                case 18:
                    this.f38262d = c7213a.m33564f();
                    this.f38260b |= 2;
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
